# 23일차

## [1] 복습

### 1. 테이블 생성

```SQL
-- 제약 조건 제외 생성

CREATE TABLE "HR"."MEMBER" 
   (	
   	"ID" VARCHAR2(10), 
	"PW" VARCHAR2(10), 
	"NAME" VARCHAR2(10), 
	"TEL" VARCHAR2(10)
   ) 

-- 제약 조건 포함 생성

CREATE TABLE "HR"."BBS2" 
(	"no" VARCHAR2(100), 
	"TITLE" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	 CONSTRAINT "BBS_PK22" PRIMARY KEY ("no"),
	 CONSTRAINT "FK_MEMBER22" FOREIGN KEY ("WRITER")
	  REFERENCES "HR"."MEMBER" ("ID")
) 

```
### 2. 제약 조건 추가
```SQL
--기본키(PRIMARY KEY) 제약조건 추가 

ALTER TABLE HR.BBS3
ADD CONSTRAINT BBS3_PK 
PRIMARY KEY ("no")

--외래키(FOREIGN KEY) 제약조건 추가

ALTER TABLE HR.BBS3 
ADD CONSTRAINT FK_MEMBER33 
FOREIGN KEY (WRITER) REFERENCES HR."MEMBER"(ID);
```

## [2] 본 수업

### 1. SYSDATE : 현재 시간 넣기

```SQL
INSERT INTO NOTICE 
VALUES (1, '직원평가 결과 조회 안내','', 100, sysdate, 1, 1)
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222599703-6b1025d7-4b49-413b-ab35-ffa70d738b77.PNG" width=500> </p>

### 2. SEQUENCE : 시퀀스

자동으로 순차적으로 증가하는 순번을 반환

```
생성 : 
CREATE SEQUENCE 시퀀스명 INCREMENT BY 얼마나증가할지 START WITH 시작할숫자 

사용 :
INSERT INTO 테이블명 VALUES(시퀀스명.NEXTVAL, 밸류2, ..., 밸류n)
```

```SQL
--OR_SEQ : 0부터 1씩 증가하는 시퀀스

CREATE SEQUENCE OR_SEQ INCREMENT BY 1 START WITH 0

--ID 컬럼을 시퀀스로 처리

INSERT INTO MEMBER VALUES
(OR_SEQ.NEXTVAL, 1234*, '김길동', 01023456789)
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222599699-057637f2-5755-405d-a181-fdc96e6f80e9.PNG" width=500> </p>

### 3. DISTINCT : 중복 데이터 제거

선택한 컬럼에서 중복되는 데이터를 제거해 보여줌

```
SELECT DISTINCT 컬럼명 FROM 테이블명
```

```SQL
SELECT DISTINCT deptno FROM emp
```

<p align="center"><img src="https://user-images.githubusercontent.com/64455378/222599705-fa2ca9ae-f2f1-43f4-8708-9499f221cfa7.PNG" width=500> </p>

### 4. 특정 범위의 값만 조회

```
숫자, 문자열 :
SELECT 컬렴명 FROM 테이블명 WHERE 범위선택할컬럼 IN 범위 
→ 범위는 배열, 그리고 BETWEEN으로 설정가능
```

```SQL
SELECT * FROM EMP
WHERE JOB IN ('SALESMAN', 'MANAGER')

SELECT * FROM EMP
WHERE JOB NOT IN ('SALESMAN', 'MANAGER')

SELECT * FROM EMP
WHERE SAL BETWEEN 2000 AND 3000 

SELECT * FROM EMP
WHERE SAL NOT BETWEEN 2000 AND 3000 
```

```
문자열 :
SELECT 컬렴명 FROM 테이블명 WHERE 범위선택할컬럼 LIKE 조회할데이터조건
SELECT 컬렴명 FROM 테이블명 WHERE 범위선택할컬럼 IS 조회할데이터조건
```

```SQL
SELECT * FROM EMP
WHERE ENAME LIKE '_L%'		--'_L%' : 두번째 문자가 L인 문자열 조회

SELECT * FROM EMP
WHERE ENAME NOT LIKE '_L%'

SELECT * FROM EMP
WHERE COMM IS NULL			--NULL : 빈 데이터

SELECT * FROM EMP
WHERE COMM IS NOT NULL
```