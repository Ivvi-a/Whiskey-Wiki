package com.ssafy.whiskeywiki.domain.mybar.service.impl;

import com.ssafy.whiskeywiki.domain.cocktail.domain.Favorite;
import com.ssafy.whiskeywiki.domain.cocktail.dto.CocktailDTO;
import com.ssafy.whiskeywiki.domain.cocktail.dto.FavoriteDTO;
import com.ssafy.whiskeywiki.domain.cocktail.repository.CocktailRepository;
import com.ssafy.whiskeywiki.domain.cocktail.repository.FavoriteRepository;
import com.ssafy.whiskeywiki.domain.map.dto.MapDTO;
import com.ssafy.whiskeywiki.domain.mybar.domain.OwnWhiskey;
import com.ssafy.whiskeywiki.domain.mybar.dto.OwnWhiskeyDTO;
import com.ssafy.whiskeywiki.domain.mybar.repository.OwnWhiskeyRepository;
import com.ssafy.whiskeywiki.domain.mybar.service.MyBarService;
import com.ssafy.whiskeywiki.domain.user.domain.User;
import com.ssafy.whiskeywiki.domain.user.repository.UserRepository;
import com.ssafy.whiskeywiki.domain.whiskey.domain.Whiskey;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MyBarServiceImpl implements MyBarService{

    private final FavoriteRepository favoriteRepository;
    private final UserRepository userRepository;
    private final OwnWhiskeyRepository ownWhiskeyRepository;


    @Override
    public List<FavoriteDTO.FavoriteData> userFavoriteList(int userId) {
        Optional<User> user = userRepository.findById(userId);
        List<FavoriteDTO.FavoriteData> resultList = new ArrayList<>();
        if(user.isPresent()){
            List<Favorite> favoriteList = favoriteRepository.findByUser(user.get());

            for(Favorite f : favoriteList){
                int favoriteId = f.getId();
                String cocktailName = f.getCocktail().getCocktailName();
                String recipe = f.getCocktail().getReciepe();
                String detail = f.getCocktail().getDetail();
                FavoriteDTO.FavoriteData favoriteData = new FavoriteDTO.FavoriteData(favoriteId, cocktailName, recipe, detail);

                resultList.add(favoriteData);
            }

        }
        return resultList;
    }

    @Override
    public List<OwnWhiskeyDTO.WhiskeyStatus> userOwnWhiskeyList(int userId) {
        User user = userRepository.getById(userId);

        List<OwnWhiskey> ownWhiskeyList = ownWhiskeyRepository.findByUser(user);

        List<OwnWhiskeyDTO.WhiskeyStatus> whiskeyStatusList = new ArrayList<>();
        for(OwnWhiskey o : ownWhiskeyList){
            OwnWhiskeyDTO.WhiskeyStatus whiskeyStatus = new OwnWhiskeyDTO.WhiskeyStatus(o.getWhiskey().getId(),o.getIsEmpty());
            whiskeyStatusList.add(whiskeyStatus);
        }

        return whiskeyStatusList;
    }

//    @Override
//    public void changeWhiskeyStatus(int userId, int whiskeyId) {
//        List<OwnWhiskey> ownWhiskeyList = ownWhiskeyRepository.findByUser(userRepository.getById(userId));
//        Whiskey whiskey = new Whiskey();
//        for(OwnWhiskey o : ownWhiskeyList){
//            if(o.getWhiskey().getId() == whiskeyId){
//                whiskey = o.getWhiskey();
//            }
//        }
//        //최종적으로 상태를 바꿀 OwnWhiskey 찾기
//        OwnWhiskey ownWhiskey = ownWhiskeyRepository.findByWhiskey(whiskey);
//        ownWhiskey.updateStatus();
//        ownWhiskeyRepository.save(ownWhiskey);
//    }

    //GPT코드
    @Override
    public void changeWhiskeyStatus(int userId, int whiskeyId) {
        // 사용자 조회
        User user = userRepository.getById(userId);
        if (user == null) {
            throw new IllegalArgumentException("User not found with ID: " + userId);
        }

        // 사용자가 소유한 위스키 목록 조회
        List<OwnWhiskey> ownWhiskeyList = ownWhiskeyRepository.findByUser(user);

        // 주어진 whiskeyId에 해당하는 위스키를 소유한 경우 상태 변경
        boolean whiskeyFound = false;
        for (OwnWhiskey ownWhiskey : ownWhiskeyList) {
            if (ownWhiskey.getWhiskey().getId() == whiskeyId) {
                ownWhiskey.updateStatus();
                ownWhiskeyRepository.save(ownWhiskey);
                whiskeyFound = true;
                break;
            }
        }

        // 해당 위스키를 찾지 못한 경우 예외 처리
        if (!whiskeyFound) {
            throw new IllegalArgumentException("Whiskey not found with ID: " + whiskeyId);
        }
    }

    @Override
    public List<MapDTO.OwnWhiskeyStatus> lookAnotherMyBar(int userId) {
        Optional<User> user = userRepository.findById(userId);
        List<MapDTO.OwnWhiskeyStatus> result = new ArrayList<>();

        if(user.isPresent()){
            List<OwnWhiskey> ownWhiskeyList = ownWhiskeyRepository.findByUser(user.get());

            for(OwnWhiskey ownWhiskey : ownWhiskeyList){
                MapDTO.OwnWhiskeyStatus info = new MapDTO.OwnWhiskeyStatus();
                info.setIsEmpty(ownWhiskey.getIsEmpty());
                info.setWhiskeyId(ownWhiskey.getWhiskey().getId());

                result.add(info);
            }
        }

        return result;
    }
}