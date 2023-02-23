# 19일차
## [1] 이론 - 데이터베이스 관련 용어 및 개념
### 1. 데이터

>종류

|분류|정의|예시|
|:---:|:---:|:---:|
|정형|미리 정해진 구조에 따라 저장된 구조화된 데이터|엑셀 스프레드 시트, **관계형 데이터베이스**|
|반정형|정형 데이터 같이 테이블의 행과 열로 구조화되어 있지는 않지만, 스키마 및 메타데이터 특성을 가지고 있는 데이터|XML, JSON|
|비정형|정해진 구조가 없이 저장된 데이터|음성, 영상|


### 2. 데이터 베이스

구조화된 데이터의 모음. 일반적으로 데이터베이스 관리 시스템(DBMS)에 의해 제어 ↔ 파일시스템

>특징

- 실시간 접근성 : 사용자의 요청이 있을 때 즉시 처리함

- 계속적 변화 : 새로운 데이터의 삽입, 삭제, 수정 등에 따라 항상 최신 데이터로 유지

- 동시 공유 : 여러 사용자가 동시에 공유할 수 있음

- 내용에 의한 참조 : 데이터 참조 시, 데이터의 주소나 위치에 의거하지 않고 내용에 의해 참조
ex) 웹 사이트에서 사과 검색 시, 주소가 아닌 사과 내용을 검색

### 3. 데이터 모델
데이터를 저장하는 방식 
- 계층형 데이터 모델 : 데이터간 관계를 트리 구조(부모-자식 관계)를 활용해 정의.

<p align="center"><img src="https://tecoble.techcourse.co.kr/static/c6e8cd551f495b1a37890070cffabf39/063ad/rdb-hierarchy.png" width=500> </p>

- 네트워크형 데이터 모델 : 망형 관계.

<p align="center"><img src="https://velog.velcdn.com/images/yeomyaloo/post/81c95a4a-9edf-4c56-a348-308f001c656d/image.png" width=500> </p>

- 객체 지향형 데이터 모델 : 객체 지향 프로그래밍의 객체 개념을 기반으로 한 데이터 모델, 데이터를 독립된 개체로 구성하고 관리.

<p align="center"><img src="https://velog.velcdn.com/images/och_changhoon/post/e5f6cfef-0848-4498-a245-dfdb38a42bb0/image.png" width=500> </p>

- 관계형 데이터 모델 : 데이터간 관계에 초점을 둔 모델

<p align="center"><img src="https://blog.kakaocdn.net/dn/dh0fDu/btqyQUf4jv9/jpx17EeZl8wzKhpDyMRGQk/img.png" width=500> </p>

    
    관계형 데이터 모델의 구성 요소
    ① 개체(Entity) ≒ 데이터베이스의 테이블
    ② 속성(Attribute) ≒  데이터베이스의 열(column)
    ③ 관계(Relationship) : 개체간 혹은 속성간의 연관성을 나타냄(외래키로 구현)
    

### 4. DBMS : Database Management System

데이터베이스를 관리하고, 관련된 작업을 가능하게 해주는 시스템

- **RDBMS**(Relational Database Management) : 관계형 데이터베이스를 관리하는 DBMS


### 5. SQL

데이터를 쿼리, 조작 및 정의하고 액세스 제어를 제공하기 위해 거의 모든 관계형 데이터베이스에서 사용되는 프로그래밍 언어 ([출처](https://www.oracle.com/kr/database/what-is-database/))

>분류

|용어|분류|역할|주요문법|
|:---:|:---:|:---:|:---:|
|DDL|Data Definition Language|데이터 항목 정의|CREATE, DROP, ALTER, TRUNCATE|
|DML|Data Manipulation Language|데이터 조작|INSERT, SELECT, UPDATE, DELETE|
|DCL|Data Control Language|DBMS 제어|GRANT, REVOKE, BACKUP, RESTORE|
|TCL|Transaction ControlLanguage|트랜잭션 제어|COMMIT, ROLLBACK|

- **CRUD** : Create, Read, Update, Delete
DML의 데이터 조작(생성-INSERT, 조회-SELECT, 수정-UPDATE, 삭제-DELETE) 기능을 총칭하는 것으로 데이터베이스에서 가장 많이 쓰는 기능이기 때문에 CRUD라 줄여서 말함.

***

## [2] 프로그램 설치 및 데이터베이스 연결

### 1. 데이터베이스 및 데이터베이스 클라이언트 프로그램 설치

> 사용 프로그램 및 버전
- DB : Oracle Database 11g XE
- DB TOOL : [DBeaver Community 22.3.5](https://dbeaver.io/download/)

### 2. 오라클 서버 연결 및 사용자 확인

명령 프롬포트(cmd) > sqlplus 입력 후 엔터 >

user-name : system
password : 설치 시 입력했던 비밀번호 입력 후 엔터
Connected to : ~ 확인
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221340180-18f3c813-985c-49a0-9daf-f9d4e9b51c1e.png" width=600> </p>

### 3. DBeaver에 오라클 데이터베이스 연결
데이터베이스 > 새 데이터베이스 연결 > 오라클 선택 >
Database : XE버전 선택

Password 입력
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221340492-b32b499b-68ef-439f-b117-3862f9fd71cb.png" width=600> </p>
Driver Settings 들어가기 >
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221340437-c9203d3d-a6c1-4e3a-97a7-c11fc0893b2f.png" width=300> </p>
데이터베이스 버전 선택 후 위의 Libraries 선택 >
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221340479-b0627b78-86cc-48a5-a985-6af0831e6c88.png" width=300> </p>
Delete로 기존 파일 모두 삭제 후 Add Files로 다운받은 JDBC 드라이버 넣기 >

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221340725-2f5bfb51-f97a-4373-acfb-d4289e972467.png" width=600> </p>
Test Connection 클릭 후 연결 상태 확인

***

## [3] 실습

### 1. DDL(Data Definition Language) : 데이터 정의어

>`CREATE` : 테이블 생성
```
CREATE TABLE (소유 계정) 테이블명 (
    열이름 열데이터타입(데이터 최대 길이)
    ...
    열이름 열데이터타입(데이터 최대 길이)
)
* 이때 데이터 최대 길이는 바이트 단위가 아닌 자릿수
```
```SQL
CREATE TABLE "HR"."NOTICE" 
   (	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENTS" VARCHAR2(100) DEFAULT NULL, 
	"WRITER" VARCHAR2(100), 
	"WRITE_DATE" DATE, 
	"RECOMMEND" NUMBER(38,0), 
	"VIEW_COUNT" NUMBER(38,0)
   )
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221343104-6f0c029f-8bc4-4327-99b7-00eb45760ff9.png" width=600> </p>

- 소유 계정 생략 가능.
- 소유 계정, 열이름, 테이블명 등에 작은 따옴표 사용 및 따옴표(큰/작은) 생략 가능.
- DEFAULT NULL 입력 시 디폴트값이 NULL이므로 데이터 생성 시에 공백이어도 데이터 추가 가능

- NUMBER(유효숫자 자릿수, 소수점 자릿수)
    ex) 123.74 → 유효숫자 자릿수 : 5
        NUMBER(5, 2)인 경우 → 123.74
        NUMBER(4, 1)인 경우 → 123.7
        NUMBER(7, 1)인 경우 → 123.7

- CHAR, VARCHAR2 차이 : 문자열 길이의 고정성 여부

    ① CHAR : 고정형 길이 

    ex) 안녕하세요
        CHAR(5) → '안녕하세요'
        CHAR(7) → '안녕하세요  '
        자릿수가 부족한 경우 공백으로 메꾼다.
        (실제로는 따옴표 생략)

    ② VARCHAR2 : 가변형

    왜 VARCHAR이 아닌 VARCHAR2?

    [오라클 문서](https://docs.oracle.com/cd/B28359_01/server.111/b28286/sql_elements001.htm#SQLRF0021) 에는 다음과 같이 나와있다.
    ```
        "Do not use the VARCHAR datatype. Use the VARCHAR2 datatype instead.Although the VARCHAR datatype is currently synonymous with VARCHAR2, the VARCHAR datatype is scheduled to be redefined as a separate datatype used for variable-length character strings compared with different comparison semantics."
    ```

    즉 VARCHAR = VARCHAR2이지만 나중에 VARCHAR에 다른 데이터 타입을 재정의할 것이니 VARCHAR2를 쓰라고 되어있다.
    
>`DROP` : 테이블 삭제

```
DROP TABLE (소유 계정). 테이블명
```
```SQL
DROP TABLE "HR"."NOTICE"
```
***

### 2. DML(Data Manipulation Language) : 데이터 조작

>`INSERT` : 데이터 추가

```
INSERT INTO 테이블명 VALUES(데이터1, 데이터2, … , 데이터n)
```
```SQL
INSERT INTO NOTICE VALUES (1, '공지사항', '', '홍길동', '2023-01-01', 0, 0)
```
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221343172-b36e1e33-6f2e-4938-a5a9-97389e1121ac.GIF" width=600> </p>


- 세번째CONTENTS 열은 디폴트 값이 NULL이므로 입력 안해도 데이터 추가 가능


>`SELECT` : 데이터 조회

```
SELECT 조회할컬럼 FROM 테이블명 (ORDER BY 컬럼명 조건) :
```

```SQL
SELECT * FROM NOTICE

SELECT WRITER FROM NOTICE

SELECT WRITER, WRITE_DATE FROM NOTICE

SELECT WRITER, WRITE_DATE, VIEW_COUNT FROM NOTICE ORDER BY VIEW_COUNT       -- 조회수로 오름차순 정렬

SELECT WRITER, WRITE_DATE, VIEW_COUNT FROM NOTICE ORDER BY VIEW_COUNT DESC  -- 조회수로 내림차순 정렬
```
- ＊은 전체
- 여러 컬럼 동시 조회 가능

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221346480-2b902430-3b0e-48d0-8f35-93731d9ad0d3.png" width=700> </p>