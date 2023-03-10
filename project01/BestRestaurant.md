# 찐찐맛집

개발기간 : 2023.03.08-2023.03.13 (27일차-30일차)

|27일차|28일차|29일차|30일차|
|:---:|:---:|:---:|:---:|
|[1. 프로그램 기획](#1-프로그램-소개-27일차)|[2. 구현 : DB설계, 기초UI](#2-구현-1단계-28일차)|[3. 맛집검색 메뉴 구현](#3구현-2단계-29일차)||

***

## [1] 프로그램 소개 (27일차)

### 1. 개발 개요

음식점 리뷰를 확인할 때 보통 [네이버 지도](https://map.naver.com/), [카카오맵](https://map.kakao.com/), [구글 지도](https://www.google.co.kr/maps/) 세 플랫폼의 리뷰를 참고하는데, 사람에 따라 이때 세 플랫폼 중 특정 한 플랫폼의 리뷰를 신뢰하는 사람도 있고, 혹은 세 플랫폼 리뷰를 비교하며 꼼꼼하게 확인하는 사람도 있다. 후자의 경우 각 플랫폼마다 직접 들어가 검색해야 하는 불편함이 있는데, 이를 해결하고자 세 플랫폼의 리뷰를 한번에 보여주는 프로그램을 개발하였다.

>프로젝트의 한계

- 실제 배포 목적이 아닌 수업 내용(Java - Oracle DB 연결) 복습 목적이므로, 평점, 이미지 등 모든 데이터는 임의로 넣은 데이터다.

### 2. 사용 기술

- Java8 [설치](https://www.oracle.com/kr/java/technologies/javase/javase8-archive-downloads.html)

- Oracle Database 11g XE [설치](https://www.oracle.com/kr/database/technologies/appdev/xe.html)

- DBeaver Community 22.3.5 [설치](https://dbeaver.io/download/)

- 오라클 자바 API(JDBC) [설치](https://www.oracle.com/database/technologies/appdev/jdbc-downloads.html) → 오라클 DB 11버전에 맞는 JDBC 설치

### 3. 프로그램 구성

##### (1) 메뉴

|메뉴|회원가입/로그인<br>마이페이지|맛집 검색|맛집 랭킹|맛집 상세페이지|
|:---:|:---:|:---:|:---:|:---:|
|상세 기능|회원가입<br>로그인<br>회원정보수정<br>회원탈퇴|지역별 검색<br>음식종류별 검색<br>북마크|별점순 조회<br>조회순 높은순 조회<br>시간대별 음식점 추천|음식점 상세 정보 보여주기<br>북마크<br>메모 기능|

>프로토타입

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224480902-f3454ed5-6ebd-4e53-b507-d76421e7206f.png" width=800> </p>

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224481077-2988f326-1078-4fc7-8fcc-45aca95c8134.JPG" width=800> </p>

> 역할

4명이 팀원이 위의 메뉴를 한개씩 맡아서 개발

## [2] 구현-1단계 (28일차)

### 1. DB 설계

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224481681-a4761074-dde6-490c-90c5-bd83cec713d2.gif" width=300> </p>

총 네개의 테이블로 PJ_RESTAURANT 테이블과 PJ_MEMBER 테이블를 기준으로 각각 Name 과 ID를 기본키로 설정하고 다른 테이블에서 외래키로 참조할 수 있도록 하였다.

### 2. 기초 UI

각자 한 메뉴를 담당하기 때문에 통합된 UI가 필요해 위의 프로토타입을 기반으로 UI를 구성하였다. 

[기초UI](./src/app/uiBase.java)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224481482-0d5ef6cc-d9dd-4502-adf9-0cbe51de7099.png" width=200> </p>

## [3]구현 2단계 (29일차)

### 1. 맛집 검색 메뉴 UI

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224493634-7e920c04-8932-446e-bd64-5bf5ec94583f.gif" width=200> </p>

- 레스토랑 데이터는 임의로 다음과 같이 작성

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224493933-9d19d19c-a94b-4c15-95ee-5bb594a5d286.JPG" width=900> </p>

- 프로토타입 대로 드롭다운 메뉴 구성 시, 기간내 끝내지 못할 것 같아 버튼으로 변경하였다.

- 음식점 리스트를 DAO에서 Select구문 실행 후 배열로 반환 받는데, 이때 각 음식점 이미지 마다 크기 조정 시, 지역별 조회 시 실행은 정상적으로 되지만 다음과 같은 창 나오는 에러  (Delayed model change job has encountered a problem. An internal error has occurred. Index out of bounds)

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/224493413-3be0c363-1ca8-415b-bd46-e71cfe54a495.png" width=250> </p>

