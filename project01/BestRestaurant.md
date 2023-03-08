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