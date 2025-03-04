
# 🍾 Whiskey Wiki
![1. 메인 페이지.gif](exec/시연%20시나리오/1.메인페이지.gif)
## Index
  - [Introduction](#introduction)
  - [Technical Stacks](#technical-stacks)
  - [Features](#features)
  - [Documentation](#documentation)
  - [Team](#team)
<br>

  
## Introduction
### Overview
Whiskey Wiki is a service for whiskey beginners.<br>
It provides image detection AI service to help users find whiskey names, My Bar feature for online storage and management of whiskey, and functionalities to access various whiskey information and communicate with other users.

### Duration and Team
Duration: 2024. 02. 26 - 2024. 04. 04 (6 weeks)<br>
Team : 6 members  
<br>



## Technical Stacks

|  |   |
|----|---|
| **FE** | ![](https://img.shields.io/badge/React(10.2.3)-61DAFB?style=flat&logo=react&logoColor=white) ![](https://img.shields.io/badge/Redux(9.1.0)-06B6D4?style=flat&logo=redux&logoColor=white) ![](https://img.shields.io/badge/Node.js(20.11.0)-339933?style=flat&logo=node.js&logoColor=white) ![](https://img.shields.io/badge/npm(10.2.4)-2C8EBB?style=flat&logo=npm&logoColor=white) <br> ![](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat&logo=javascript&logoColor=white) ![](https://img.shields.io/badge/HTML5-E34F26?style=flat&logo=html5&logoColor=white) ![](https://img.shields.io/badge/CSS-1572B6?style=flat&logo=css3&logoColor=white) |
| **BE** | ![](https://img.shields.io/badge/JAVA_17-F7DF1E?style=flat&logoColor=white) ![](https://img.shields.io/badge/Spring_Boot(3.2.3)-6DB33F?style=flat&logo=springboot&logoColor=white) ![](https://img.shields.io/badge/Python(3.9.13)-3776AB?style=flat&logo=python&logoColor=white) ![](https://img.shields.io/badge/FastApi(0.103.0)-009639?style=flat&logo=fastapi&logoColor=white) <br> ![](https://img.shields.io/badge/MySQL(8.0.29)-4479A1?style=flat&logo=mysql&logoColor=white) ![](https://img.shields.io/badge/Redis(7.2.4)-DC382D?style=flat&logo=redis&logoColor=white) ![](https://img.shields.io/badge/Hibernate(6.4.1)-964B00?style=flat&logo=hibernate&logoColor=white) |
| **AI** | ![](https://img.shields.io/badge/Python(3.9.13)-3776AB?style=flat&logo=python&logoColor=white) ![](https://img.shields.io/badge/Pytorch(2.2.1)-F05032?style=flat&logo=pytorch&logoColor=white) ![](https://img.shields.io/badge/YOLO_v5-F7DF1E?style=flat&logo=yolov5&logoColor=white) ![](https://img.shields.io/badge/Labelme-F05032?style=flat&logo=labelme&logoColor=white) |
| **Infra** | ![](https://img.shields.io/badge/AWS%20EC2-FF9900?style=flat&logo=amazonec2&logoColor=white) ![](https://img.shields.io/badge/Linux(5.15.0_1056_aws)-FF9900?style=flat&logo=amazonec2&logoColor=white) ![](https://img.shields.io/badge/Ubuntu(20.04)-FF9900?style=flat&logo=amazonec2&logoColor=white) <br> ![](https://img.shields.io/badge/Docker(26.0.0)-2496ED?style=flat&logo=docker&logoColor=white) ![](https://img.shields.io/badge/Docker_compose(v2.25.0)-2496ED?style=flat&logo=docker&logoColor=white) ![](https://img.shields.io/badge/Nginx(1.18.0)-009639?style=flat&logo=nginx&logoColor=white) ![](https://img.shields.io/badge/Jenkins(2.440.2)-D24939?style=flat&logo=Jenkins&logoColor=white) |
| **IDE** | ![](https://img.shields.io/badge/VSCode(1.85.1)-3178C6?style=flat&logo=v&logoColor=white) ![](https://img.shields.io/badge/intelliJ_IDEA(2023.3.2)-F23920?style=flat&logo=intellij&logoColor=white) |
| **Tools** | ![](https://img.shields.io/badge/Gitlab-F05032?style=flat&logo=gitlab&logoColor=white) ![](https://img.shields.io/badge/JIRA-2496ED?style=flat&logo=jira&logoColor=white) ![](https://img.shields.io/badge/Notion-000000?style=flat&logo=notion&logoColor=white) ![](https://img.shields.io/badge/MatterMost-0E0F37?style=flat&logo=mattermost&logoColor=white) ![](https://img.shields.io/badge/Figma-CC6699?style=flat&logo=figma&logoColor=white) |


<br>



## Features
<details>
  <summary><h3>Find Whiskey Names by AI Image Detection</h3></summary> 
  
![3. 위스키 AI 인식 및 등록.gif](exec/시연%20시나리오/3.위스키AI인식.gif)

- Upload a photo to find the whiskey's name and information.
- The found whiskey can be registered in My Bar.
- Utilizes a YOLOv5 model trained on a custom dataset.
</details>

<details>
  <summary><h3>Save Whiskey in My Bar</h3></summary>

  ![4. 마이바(My Bar) 이동 및 마이바의 위스키 상태 전환 (빈병으로).gif](exec/시연%20시나리오/4.마이바(MyBar).gif)

  - A personal bar to save whiskeys found through AI recognition.
  - If you've finished a bottle, you can switch its status to empty.
</details>

<details>
  <summary><h3>Various Whiskey Information</h3></summary>

  ![5. 위스키 목록 및 상세페이지.gif](exec/시연%20시나리오/5.위스키정보.gif)

  - View various whiskeys' alcohol content, flavor profiles, price ranges, reviews, and cocktail recipes.
  - Sort by name, price, and more.
</details>

<details>
  <summary><h3>Explore Other Users' Bars on the Map</h3></summary>

  ![6. 교환을 위한 지도 (Exchange Map) 및 다른 유저의 마이바 열람.gif](exec/시연%20시나리오/6.지도,다른유저의마이바열람.gif)

  - Explore nearby users' My Bars based on your location.
  - Utilizes the Kakao map API.
</details>

<br>




## Documentation

### Porting Guide (exec)
👉 [Porting Guide](https://github.com/Ivvi-a/Whiskey-Wiki/blob/main/exec/%ED%8F%AC%ED%8C%85%20%EB%A9%94%EB%89%B4%EC%96%BC.pdf) <br>
- DB dump files: data.sql / schema.sql

### Wireframes & Mockups

👉 [Figma link](https://www.figma.com/file/5JPFZwNMkIZ8hfc880JaEb/Untitled?type=design&node-id=0-1&mode=design&t=rFBealktMFGV35cx-0)

### API specification

👉 [Notion link](https://galvanized-citron-903.notion.site/API-efca2cccd96d43af85d259b38291cd82?pvs=4)

### ERD
![](Docs/images/ERD.png)

### System Architecture
![](Docs/images/System_Architecture.png)

<br>


## Team
|  이지은  |  안윤철  |  임현승  |  장세영  |  조담현  |  조연주  |
| :-----: | :-----: | :-----: | :-----: | :-----: | :-----: |
| ![](Docs/members/이지은.png) | ![](Docs/members/안윤철.png) | ![](Docs/members/임현승.png) | ![](Docs/members/장세영.png) | ![](Docs/members/조담현.png) | ![](Docs/members/조연주.png) |
| PM / Frontend  | Backend / AI | Backend | Frontend | Backend / Infra | Frontend / AI |
