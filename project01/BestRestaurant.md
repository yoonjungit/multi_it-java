# 찐찐맛집

**바로가기**

▶[프로젝트 회고](https://animated-index-cb7.notion.site/1-e278c5b186f44ebeb71ca4f4a7f7ec8b)◀

▶[영상 시연](https://youtube.com/watch?v=zxffvOFQCxQ&feature=shares)◀

***

## 1. 프로젝트 소개

### 1) 기획의도

중요한날 혹은 평소에 음식점 리뷰를 확인할 때 여러 포탈 지도에 나와있는 평점을 비교했던 경험이 있을 것이다. 카카오맵 들어갔다 네이버 들어갔다 구글 지도까지 마지막으로 확인해주고.. 한 곳도 아니고 여러 음식점을 이렇게 일일이 확인하는 것이 여간 번거로운 일이 아니다. 이러한 불편함을 해소하고자 이번 프로젝트를 기획하였다.

### 2) 개발기간, 개발인원

개발기간 : 2023.03.08-13 

개발인원 : 4명

### 3) 사용 기술

해당 프로젝트는 자바 스윙으로 구현하는 것으로 사용 기술 스택은 아래 두개밖에 없다.

- Java8 [설치](https://www.oracle.com/kr/java/technologies/javase/javase8-archive-downloads.html)

- Oracle Database 11g XE [설치](https://www.oracle.com/kr/database/technologies/appdev/xe.html)

그외 DBMS, DB드라이버>

- DBeaver Community 22.3.5 [설치](https://dbeaver.io/download/)

- 오라클 자바 API(JDBC) [설치](https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html) → 오라클 DB 11버전에 맞는 JDBC 설치

### 4) 개발 일정

| 일자 | 내용 |
| --- | --- |
| 1일차 (3.08) | 프로젝트 주제 선정, 프로그램 구현 기능(메뉴) 정하기 및 프로토타입 만들기(카카오 오븐), 역할분담 |
| [2일차 (3.09)](#1-구현-d1-28일차) | DB 설계 (엔티티 정하기, ERD 도출), 프로토타입 기반 기초UI 구현 |
| [3일차 (3.10)](#2-구현-d2-29일차) | 메뉴 UI 완성 및 일부 기능 구현 |
| [4일차 (3.13)](#3-구현-d3-30일차) | 완성 및 파일 합치기(메뉴별 연동) |
- 앱처럼 구성하였으며 총 네개의 메뉴를 정해 팀원 네명이서 각각 한 메뉴씩 맡음.
- 상세 개발일지는

### 5) 구현 기능

| 담당자 | 장유진 | 임윤정(me) | 전지훈 | 채지윤 |
| :---: | :---: | :---: | :---: | :---: |
| 메뉴 | A. 회원가입/로그인/<br>마이페이지 | B. 맛집검색 | C. 맛집랭킹 | D. 맛집 상세페이지 |
| 구현 기능 | - 회원가입<br>- 로그인<br>- 회원정보 수정<br>- 회원 탈퇴<br>- 북마크 모아보기<br>- 나의 한줄평 모아보기 | - 맛집 리스트 전체 보여주기<br>- 맛집 지역별 검색<br>- 맛집 북마크 <br>- 맛집 클릭시 조회수 올리기 및<br>상세페이지 이동 | - 맛집 조회순, 평점순 나열<br>- 시간대별 맛집 랜덤 추천<br>- 맛집 클릭시 조회수 올리기 및<br> 상세페이지 이동 | - 맛집 북마크<br>- 나의 한줄평 작성|

#### (1) 프로토타입

- **A**. 회원가입/로그인/마이페이지

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224480902-f3454ed5-6ebd-4e53-b507-d76421e7206f.png" width=800> </p>


- **B**. 맛집검색 / **C.** 맛집랭킹 / **D.** 맛집 상세페이지

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224481077-2988f326-1078-4fc7-8fcc-45aca95c8134.JPG" width=800> </p>

#### (2) ERD

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224481681-a4761074-dde6-490c-90c5-bd83cec713d2.gif" width=400> </p>

PJ_Restaurant의 *Name*(맛집 이름), PJ_Member의 *ID*(회원 ID)를 각각 PK로 설정 및 다른 테이블에서 외래키로 참조하고 있다.

#### (3) 프로토타입 - 실제 프로그램과 차이

- 회원가입 페이지에 추천인코드 기능이 생겼다 : 어떤 혜택이 있다기 보다는 Random 함수 복습 및 SQL(Update) 구현

- 맛집 검색, 랭킹 페이지에서 sort는 드롭다운이 아닌 버튼 방식 : 제한된 시간안에 끝내기 위해 일단 아는 기능(버튼)으로 구현하기로 했다.

>프로젝트의 한계

- 실제 배포 목적이 아닌 수업 내용(Java - Oracle DB 연결) 복습 목적이므로, 평점, 이미지 등 모든 데이터는 임의로 넣은 데이터다.


## 2. 개발 타임라인

### 1) D-2 (개발 2일차, 수업 28일차)

#### (1) DB 설계

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224481681-a4761074-dde6-490c-90c5-bd83cec713d2.gif" width=400> </p>

총 네개의 테이블로 PJ_RESTAURANT 테이블과 PJ_MEMBER 테이블를 기준으로 각각 Name 과 ID를 기본키로 설정하고 다른 테이블에서 외래키로 참조할 수 있도록 하였다.

### 2) 기초 UI

각자 한 메뉴를 담당하기 때문에 통합된 UI가 필요해 위의 프로토타입을 기반으로 UI를 구성하였다. 

[기초UI](./src/app/uiBase.java)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224481482-0d5ef6cc-d9dd-4502-adf9-0cbe51de7099.png" width=200> </p>

### 2) D-1 (개발 3일차, 수업 29일차)

#### (1) 맛집 검색 메뉴 UI

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224493634-7e920c04-8932-446e-bd64-5bf5ec94583f.gif" width=200> </p>

- 레스토랑 데이터는 임의로 다음과 같이 작성

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224493933-9d19d19c-a94b-4c15-95ee-5bb594a5d286.JPG" width=900> </p>

- 프로토타입 대로 드롭다운 메뉴 구성 시, 기간내 끝내지 못할 것 같아 버튼으로 변경하였다.

- 음식점 리스트를 DAO에서 Select구문 실행 후 배열로 반환 받는데, 이때 각 음식점 이미지 마다 크기 조정 시, 지역별 조회 시 실행은 정상적으로 되지만 다음과 같은 창 나오는 에러  (Delayed model change job has encountered a problem. An internal error has occurred. Index out of bounds)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224493413-3be0c363-1ca8-415b-bd46-e71cfe54a495.png" width=250> </p>

<br>

>Update 23.03.12

- 북마크 버튼 추가. 현재 로그인과 연동이 안되어있어서 임의의 ID로 DB에 추가/삭제

- 코드 리팩터링 : 

    DAO : 오라클 DB Connection 부분 기본 메소드화
    UI : 북마크 이미지 아이콘 만들기, 음식점 판넬 만들기 등 클래스화. 요소(배열, 버튼, 라벨) 이름 바꿈

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224584510-9430c3ee-c51c-408f-890c-04fd732b13cf.gif" width=500> </p>

## 3) D-DAY (개발 4일차, 수업 30일차)

>Update

- 음식점 이미지 클릭 시 상세 페이지 이동 및 조회수 증가

- 상세 페이지 이동 시 현재 창 숨기기 후 상세페이지에서 back 버튼 클릭 시 다시 창 보이기


<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224658930-97cbc10e-020e-40d8-b4b0-f86bd4b0e65d.gif" width=900> </p>

    해운대암소갈비집 클릭 시 상세페이지 이동. 이때 창 숨김 후 상세페이지에서 back버튼 클릭 시 다시 창 보이기
    상세페이지에서 북마크 표시 안된 것은 아직 로그인 연동 x

>Fix 트러블 슈팅 [인덱스 에러](#2-구현-d2-29일차) :

    전역변수였던 지역별 음식점 리스트를 지역변수로 바꾸고 해결. why?
    기존 메소드 : 
    ① 페이지 로딩시 DAO-getResList메소드로 전체 음식점DTO를 리스트를 받아와 각 음식점별 JPanel을 만든 후
    ArrayList<JPanel> resListPanel 로 저장함
    ② 이후 지역버튼 클릭 시 resListPanel리스트를 for문으로 돌려 지역명으로 필터링한 후,
    setBounds로 JPanel위치 조정 후 다시 지역별 리스트 객체에 add.
    이때 객체는 전역변수로 선언되었지만, for문은 위치 재조정 때문에 버튼 클릭 시마다 실행되기 때문에 
    (안그러면 전체 리스트로 다시 돌아갈 때 위치가 다 바뀜) 리스트에 반복적으로 add 됨. 
    여기서 같은 객체가 반복돼서 중복으로 저장되어 리스트 index에러 뜬 것으로 판단.
    따라서 리스트를 지역변수(버튼 클릭시에 새로 생성되는)로 바꾸었다