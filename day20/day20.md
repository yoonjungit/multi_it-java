# 20일차
## 오라클 데이터베이스 실습
> 사용 버전
- DB : Oracle Database 11g XE
- DB TOOL : [DBeaver Community 22.3.5](https://dbeaver.io/download/)

## [1] 실습(SQL)
### SQL 종류
|용어|분류|역할|주요문법|
|:---:|:---:|:---:|:---:|
|DDL|Data Definition Language|데이터 항목 정의|CREATE, DROP, ALTER, TRUNCATE|
|DML|Data Manipulation Language|데이터 조작|INSERT, SELECT, UPDATE, DELETE|
|DCL|Data Control Language|DBMS 제어|GRANT, REVOKE, BACKUP, RESTORE|
|TCL|Transaction ControlLanguage|트랜잭션 제어|COMMIT, ROLLBACK|


### 1. DDL(Data Definition Language) : 데이터 정의어
>`ALTER` : 테이블에 열 추가/수정/삭제
```
- 추가
ALTER TABLE (소유계정).테이블명 ADD 열이름 열데이터타입 (NULL 제약조건);
- 수정
ALTER TABLE (소유계정).테이블명 MODIFY 열이름 열데이터타입 (NULL 제약조건);
- 삭제
ALTER TABLE (소유계정).테이블명 DROP COLUMN 열이름;
```
```SQL
ALTER TABLE HR.NOTICE ADD REPLY_COUNT VARCHAR2(200);

ALTER TABLE HR.NOTICE MODIFY REPLY_COUNT NUMBER(38,0);

ALTER TABLE HR.NOTICE DROP COLUMN REPLY_COUNT;
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221347891-5bac98f8-397c-49f8-b2e6-602d8d3e5ae8.GIF" width=600> </p>

>`TRUNCATE` : 테이블 데이터(행) 초기화
```
TRUNCATE TABLE 테이블명
```
```SQL
TRUNCATE TABLE NOTICE
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221348047-abe8bfd4-d414-4fc8-89b8-386ce2cdb608.GIF" width=600> </p>

***

### 2. DML(Data Manipulation Language) : 데이터 조작

>`SELECT` : 데이터 조회(19일차 수업에서 추가)
```
- 조건(필터)
SELECT 조회할컬럼 FROM 테이블명 WHERE 조건
- 컬럼명 변경 후 조회
SELECT 조회할컬럼 AS 표시할컬럼명 FROM 테이블명 WHERE 조건
```

```SQL
SELECT * FROM NOTICE WHERE WRITER = '홍길동'    --1

SELECT WRITER FROM NOTICE WHERE WRITER = '홍길동'    --2

SELECT WRITER AS 아이디, VIEW_COUNT  FROM NOTICE WHERE WRITER = '홍길동'    --3

SELECT * FROM NOTICE WHERE WRITER = '홍길동' or VIEW_COUNT > '2000'    --4

SELECT WRITER , VIEW_COUNT FROM NOTICE WHERE WRITER = '홍길동' AND VIEW_COUNT > '100'    --5
```
|번호|조회할 컬럼|조건|
|:---:|:---:|:---:|
|1|전체|작성자가 홍길동|
|2|WRITER|작성자가 홍길동|
|3|WRITER, VIEW_COUNT (단 'WRITER'대신 '아이디'로 보여주기)|작성자가 홍길동|
|4|WRITER|작성자가 홍길동 혹은 조회수가 2000이상|
|5|WRITER, VIEW_COUNT|작성자가 홍길동 그리고 조회수가 2000이상|

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221346833-3830e0a1-85f8-48c1-8add-b853d52a10d9.png" width=700> </p>


>`UPDATE` : 데이터 수정
```
UPDATE 테이블명 SET WRITER 변경할값 조건
```
```SQL
UPDATE NOTICE SET WRITER = '임길동' WHERE WRITER = '이길동'

```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221347447-0828e195-587e-4b14-b4f0-c3016795071a.GIF" width=600> </p>

> `DELETE` : 데이터 삭제
```
DELETE FROM 테이블명 (조건)
```
```SQL
DELETE FROM NOTICE WHERE WRITER = '임길동'      --작성자가 임길동인 글 삭제

DELETE FROM NOTICE      --데이터 전체삭제

```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221347677-4ab5a73b-5c4b-478a-ad80-859785cf6f14.GIF" width=600> </p>

***

### 3. DCL(Data Control Language) : DBMS제어

데이터의 무결성(Integruty), 보안(Security), 회복(Recovery), 동시성(Concurrency)을 위해 사용자별 데이터베이스의 접근 또는 사용 권한을 부여 또는 제거하여 데이터를 보호 관리하는 언어 (계정관리, 백업/복원)
[출처](http://www.incodom.kr/SQL/DCL)

>`GRANT` : 권한부여
>`REVOKE` : 권한해제
```
1. 계정 생성
CREATE USER 사용자WRITER WRITERENTIFIED BY 비밀번호;
2. 권한 부여
GRANT 권한 TO 사용자;
3. 권한 해제
REVOKRE RESOURCE FROM apple;
4. 계정 삭제
DROP USER 사용자WRITER CASCADE;

```
```SQL
CREATE USER apple WRITERENTIFIED BY a1234;

GRANT CONNECT, RESOURCE, DBA TO apple;

REVOKE RESOURCE FROM apple;

DROP USER apple CASCADE;
```
권한 교재 402-403
기본권한 3가지
- CONNECT : 외부 연결
- RESOURCE : TABLE, ROW, COLUMN
- DBA(Database Administrators) : 관리자 관련

***

## [2] 데이터 베이스 설계

### 1. 스키마(Schema)

데이터베이스 내에 데이터의 구조, 표현 방법, 데이터 간 관계를 정의한 구조
<p align="center"><img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FkClY1%2FbtqQzSdmZ1H%2FNetufh3kJCShtWE1cNCyHK%2Fimg.png" width=400> </p>

<p align="center"><img src="https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2FdAo68g%2FbtqQstsiTAS%2FMkg34bcvuV0kkljotYO2Z0%2Fimg.png" width=400> </p>

### 2. 제약 조건
>UNIQUE : 열에 중복된 데이터 값을 허용하지 않음. NULL은 값이 존재하지 않기 때문에 중복 대상에서 제외

>PRIMARY KEY : UNIQUE와 마찬가지로 중복된 데이터 값을 허용하지 않음. 차이점은 NULL값도 허용하지 않음.

>FOREIGN KEY : 다른 테이블 간 관계를 정의하는 데 사용하는 제약 조건

```
- 테이블 생성시 제약 조건 추가 / 삭제
CREATE TABLE 테이블명(
    열이름 열데이터타입(데이터 최대 길이)
    ...
    열이름 열데이터타입(데이터 최대 길이)
    CONSTRAINT 제약조건명 추가할제약조건 ("컬럼명")
);

- 생성된 테이블에 제약 조건 추가
ALTER TABLE 테이블명 ADD CONSTRAINT 제약조건명 추가할제약조건 ("컬럼명")
FOREIGN KEY >
ALTER TABLE 테이블명 ADD CONSTRAINT 제약조건명 FOREIGN KEY ("컬럼명") REFERENCES 연결할테이블(연결할컬럼명)
컬럼명은 생략이 아닌, 괄호 안에 기재

- 생성된 제약 조건 삭제
ALTER TABLE 테이블명 DROP CONSTRAINT 제약조건명
```

```SQL
CREATE TABLE "HR"."NOTICE" 
   (	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENTS" VARCHAR2(100) DEFAULT NULL, 
	"WRITER" VARCHAR2(100), 
	"WRITE_DATE" DATE, 
	"RECOMMEND" NUMBER(38,0), 
	"VIEW_COUNT" NUMBER(38,0), 
	 CONSTRAINT "NOTICE_PK" PRIMARY KEY ("BOARDNO")

ALTER TABLE NOTICE ADD CONSTRAINT FK_MEMBER FOREIGN KEY (WRITER) REFERENCES "MEMBER"(ID);

ALTER TABLE NOTICE DROP CONSTRAINT NOTICE_PK
```
DBeaver에서 하는 방법
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221362103-91818736-775c-4f00-98cc-349dd29a50cc.png" width=900> </p>

### 3. ERD(Entity Relation Diagram)

테이블간의 관계를 설명해주는 다이어그램

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221360056-318d3086-a0a9-4132-8a9a-b2c703859bf7.GIF" width=400> </p>

- 위의 제약조건 예제에서 FOREIGN KEY 설정 후
<p align="center"><img src="https://user-images.githubusercontent.com/64455378/221363239-91c17531-1618-42ff-9c27-15c8a7b7c5f0.PNG" width=200> </p>
