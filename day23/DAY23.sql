CREATE TABLE orderlist (
	"no" VARCHAR2(100),
	member_id varchar2(100),
	product_id varchar2(100),
	total_count varchar2(100)
)

ALTER TABLE HR.ORDERLIST ADD CONSTRAINT FK_MEMBER2 FOREIGN KEY (MEMBER_ID) REFERENCES HR."MEMBER"(ID);

ALTER TABLE HR.ORDERLIST ADD CONSTRAINT FK_PRODUCT FOREIGN KEY (PRODUCT_ID) REFERENCES HR.PRODUCT(ID);


CREATE TABLE depart (
	id VARCHAR2(100),
	name varchar2(100),
	instructor varchar2(100)
)

CREATE TABLE student (
	id VARCHAR2(100),
	name varchar2(100),
	tel varchar2(100),
	depart_id varchar2(100)
)


ALTER TABLE HR.DEPART
ADD CONSTRAINT DEPART_PK PRIMARY KEY (ID)
ENABLE;

ALTER TABLE HR.SUBJECT ADD CONSTRAINT FK_DEPART2 FOREIGN KEY (DEPART_ID) REFERENCES HR.DEPART(ID);

ALTER TABLE HR.STUDENT ADD REFERENCES "HR"."DEPART" ("ID")

SELECT * FROM DEPART

SELECT * FROM STUDENT

SELECT * FROM SUBJECT


CREATE TABLE depart2 (
	id VARCHAR2(100),
	name varchar2(100),
	instructor varchar2(100),
	CONSTRAINT FK_DEPART2 PRIMARY KEY (DEPART_ID)

CREATE TABLE student (
	id VARCHAR2(100),
	name varchar2(100),
	tel varchar2(100),
	depart_id varchar2(100)
)

-- 시퀀스 적용

CREATE TABLE ORDERLIST3 (
	ID NUMBER(38,0),
	TITLE varchar2(100),
	PRICE NUMBER(38,0)
)

INSERT INTO ORDERLIST3 VALUES(OR_SEQ.NEXTVAL, '스웨터', 39000)

INSERT INTO MEMBER VALUES(OR_SEQ.NEXTVAL, 1, '김길동', 01023456789)

SELECT * FROM MEMBER

SELECT * FROM ORDERLIST3 WHERE id>=3 ORDER BY ID DESC 

-- 실습

CREATE TABLE DEPT(
DEPTNO NUMBER(2),
DNAME VARCHAR2(14 BYTE),
LOC VARCHAR2(13 BYTE)
)

CREATE TABLE EMP(
EMPNO NUMBER(4),
ENAME VARCHAR2(10 BYTE),
JOB VARCHAR2(9 BYTE),
MGR NUMBER(4),
HIREDATE DATE,
SAL NUMBER(7,2),
COMM NUMBER(7,2),
DEPTNO NUMBER(2)
)

CREATE TABLE SALGRADE(
GRADE NUMBER,
LOSAL NUMBER,
HISAL NUMBER
)

ALTER TABLE DEPT ADD (
CONSTRAINT PK_DEPT
PRIMARY KEY
(DEPTNO));

ALTER TABLE EMP ADD (
CONSTRAINT PK_EMP
PRIMARY KEY
(EMPNO));

ALTER TABLE EMP ADD (
CONSTRAINT FK_DEPTNO
FOREIGN KEY (DEPTNO)
REFERENCES DEPT (DEPTNO));


SELECT * FROM EMP --PROJECTION(행 검색)

SELECT DISTINCT DEPTNO FROM EMP	--DISTINCT

SELECT ENAME, SAL *12 FROM EMP	--SAL*12 한 값

SELECT * FROM EMP ORDER BY SAL DESC

SELECT * FROM EMP WHERE NOT DEPTNO = 30 ORDER BY EMPNO DESC

INSERT INTO NOTICE 
VALUES (1, '직원평가 결과 조회 안내','',100, sysdate, 1, 1)

CREATE TABLE DEPTTEMP2
AS SELECT * FROM DEPT

SELECT * FROM DEPTTEMP2

UPDATE DEPTTEMP2 SET DNAME = 'DATABASE', LOC = 'BUSAN' WHERE DEPTNO = 40

DELETE FROM DEPTTEMP2 WHERE DNAME = 'SALES'

SELECT * FROM DEPTTEMP2