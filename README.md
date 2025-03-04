
# 🍾 Whiskey Wiki (위스키 위키)
![1. 메인 페이지.gif](exec/시연%20시나리오/1.메인페이지.gif)
## 목차
  - [소개](#소개)
  - [기술 스택](#기술-스택)
  - [기능](#기능)
  - [문서](#문서)
  - [팀원](#팀원)
<br>

  
## 소개
### 개요
위스키 위키는 위스키 입문자를 위한 서비스입니다. <br>
사용자가 위스키 이름을 찾을 수 있도록 돕는 이미지 인식 AI 서비스, 위스키를 온라인으로 저장하고 관리할 수 있는 마이 바(My Bar) 기능, 다양한 위스키 정보를 확인하고 다른 사용자와 소통할 수 있는 기능을 제공합니다.

### 기간 & 팀원
기간 : 2024. 02. 26 - 2024. 04. 04 (6주) <br>
팀원 : 6명
<br>



## 기술 스택

|  |   |
|----|---|
| **FE** | ![](https://img.shields.io/badge/React(10.2.3)-61DAFB?style=flat&logo=react&logoColor=white) ![](https://img.shields.io/badge/Redux(9.1.0)-06B6D4?style=flat&logo=redux&logoColor=white) ![](https://img.shields.io/badge/Node.js(20.11.0)-339933?style=flat&logo=node.js&logoColor=white) ![](https://img.shields.io/badge/npm(10.2.4)-2C8EBB?style=flat&logo=npm&logoColor=white) <br> ![](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=white) ![](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white) ![](https://img.shields.io/badge/CSS-1572B6?style=flat&logo=css3&logoColor=white) |
| **BE** | ![](https://img.shields.io/badge/JAVA_17-F7DF1E?style=flat&logoColor=white) ![](https://img.shields.io/badge/Spring_Boot(3.2.3)-6DB33F?style=flat&logo=springboot&logoColor=white) ![](https://img.shields.io/badge/Python(3.9.13)-3776AB?style=flat&logo=python&logoColor=white) ![](https://img.shields.io/badge/FastApi(0.103.0)-009639?style=flat&logo=fastapi&logoColor=white) <br> ![](https://img.shields.io/badge/MySQL(8.0.29)-4479A1?style=flat&logo=mysql&logoColor=white) ![](https://img.shields.io/badge/Redis(7.2.4)-DC382D?style=flat&logo=redis&logoColor=white) ![](https://img.shields.io/badge/Hibernate(6.4.1)-964B00?style=flat&logo=hibernate&logoColor=white) |
| **AI** | ![](https://img.shields.io/badge/Python(3.9.13)-3776AB?style=flat&logo=python&logoColor=white) ![](https://img.shields.io/badge/Pytorch(2.2.1)-F05032?style=flat&logo=pytorch&logoColor=white) ![](https://img.shields.io/badge/YOLO_v5-F7DF1E?style=flat&logo=yolov5&logoColor=white) ![](https://img.shields.io/badge/Labelme-F05032?style=flat&logo=labelme&logoColor=white) |
| **Infra** | ![](https://img.shields.io/badge/AWS%20EC2-FF9900?style=flat&logo=amazonec2&logoColor=white) ![](https://img.shields.io/badge/Linux(5.15.0_1056_aws)-FF9900?style=flat&logo=amazonec2&logoColor=white) ![](https://img.shields.io/badge/Ubuntu(20.04)-FF9900?style=flat&logo=amazonec2&logoColor=white) <br> ![](https://img.shields.io/badge/Docker(26.0.0)-2496ED?style=flat&logo=docker&logoColor=white) ![](https://img.shields.io/badge/Docker_compose(v2.25.0)-2496ED?style=flat&logo=docker&logoColor=white) ![](https://img.shields.io/badge/Nginx(1.18.0)-009639?style=flat&logo=nginx&logoColor=white) ![](https://img.shields.io/badge/Jenkins(2.440.2)-D24939?style=flat&logo=Jenkins&logoColor=white) |
| **IDE** | ![](https://img.shields.io/badge/VSCode(1.85.1)-3178C6?style=flat&logo=v&logoColor=white) ![](https://img.shields.io/badge/intelliJ_IDEA(2023.3.2)-F23920?style=flat&logo=intellij&logoColor=white) |
| **Tools** | ![](https://img.shields.io/badge/Gitlab-F05032?style=flat&logo=gitlab&logoColor=white) ![](https://img.shields.io/badge/JIRA-2496ED?style=flat&logo=jira&logoColor=white) ![](https://img.shields.io/badge/Notion-000000?style=flat&logo=notion&logoColor=white) ![](https://img.shields.io/badge/MatterMost-0E0F37?style=flat&logo=mattermost&logoColor=white) ![](https://img.shields.io/badge/Figma-CC6699?style=flat&logo=figma&logoColor=white) |


<br>



## 기능
<h3>AI 이미지 인식으로 위스키 정보 찾기</h3>
  
![3. 위스키 AI 인식 및 등록.gif](exec/시연%20시나리오/3.위스키AI인식.gif)

- 사진을 업로드하면 위스키의 이름과 정보를 찾아줍니다.
- 찾은 위스키는 마이 바(My Bar)에 등록할 수 있습니다.
- YOLOv5 모델을 커스텀 데이터셋으로 학습하였습니다.


<h3>나만의 마이바에서 위스키 관리하기</h3>

  ![4. 마이바(My Bar) 이동 및 마이바의 위스키 상태 전환 (빈병으로).gif](exec/시연%20시나리오/4.마이바(MyBar).gif)

  - AI 인식을 통해 찾은 위스키를 개인 바에 저장할 수 있습니다.
  - 다 마신 병은 빈 병 상태로 변경할 수 있습니다.


<h3>다양한 위스키 정보</h3>

  ![5. 위스키 목록 및 상세페이지.gif](exec/시연%20시나리오/5.위스키정보.gif)

  - 알코올 도수, 맛, 가격대, 리뷰, 칵테일 레시피 등을 제공합니다.
  - 이름, 가격 등을 정렬 기준으로 선택할 수 있습니다.


<h3>다른 유저의 마이바 탐색하기</h3>

  ![6. 교환을 위한 지도 (Exchange Map) 및 다른 유저의 마이바 열람.gif](exec/시연%20시나리오/6.지도,다른유저의마이바열람.gif)

  - 나의 위치를 기반으로 다른 유저의 마이바를 탐색할 수 있습니다.
  - Kakao map API를 사용했습니다.


<br>




## 문서

### 포팅 메뉴얼 (exec)
👉 [Porting Guide](https://github.com/Ivvi-a/Whiskey-Wiki/blob/main/exec/%ED%8F%AC%ED%8C%85%20%EB%A9%94%EB%89%B4%EC%96%BC.pdf) <br>
- DB dump files: data.sql / schema.sql

### 와이어프레임 & 목업

👉 [Figma link](https://www.figma.com/file/5JPFZwNMkIZ8hfc880JaEb/Untitled?type=design&node-id=0-1&mode=design&t=rFBealktMFGV35cx-0)

### API 명세서

👉 [Notion link](https://galvanized-citron-903.notion.site/API-efca2cccd96d43af85d259b38291cd82?pvs=4)

### ERD
![](Docs/images/ERD.png)

### 시스템 아키텍처
![](Docs/images/System_Architecture.png)

<br>


## 팀원
|  이지은  |  안윤철  |  임현승  |  장세영  |  조담현  |  조연주  |
| :-----: | :-----: | :-----: | :-----: | :-----: | :-----: |
| ![](Docs/members/이지은.png) | ![](Docs/members/안윤철.png) | ![](Docs/members/임현승.png) | ![](Docs/members/장세영.png) | ![](Docs/members/조담현.png) | ![](Docs/members/조연주.png) |
| PM / Frontend  | Backend / AI | Backend | Frontend | Backend / Infra | Frontend / AI |
