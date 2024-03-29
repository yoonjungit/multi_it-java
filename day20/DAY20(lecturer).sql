CREATE TABLE "HR"."NOTICE" 
   (	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENTS" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	"WRITEDATE" DATE, 
	"RECOMMEND" NUMBER(38,0), 
	"VIEWCOUNT" NUMBER(38,0)
   )
​
-- 추천게시판(recommend)
-- re_no 숫자
-- title, content, 
-- writer 문자
   
CREATE TABLE RECOMMEND (
	RE_NO NUMBER(38,0),
	TITLE VARCHAR2(100),
	CONTENT VARCHAR2(100),
	WRITER VARCHAR2(100)
)
​
DROP TABLE RECOMMEND -- 테이블 통째로 던져버림.
​
​
CREATE TABLE RECOMMEND (
	RE_NO NUMBER(38,0),
	TITLE VARCHAR2(100),
	CONTENT VARCHAR2(100),
	WRITER VARCHAR2(100)
)
​
​
ALTER TABLE HR.RECOMMEND MODIFY TITLE VARCHAR2(333)
​
ALTER TABLE HR.RECOMMEND ADD VIEWCOUNT NUMBER(38,0) NULL;
​
ALTER TABLE RECOMMEND DROP COLUMN VIEWCOUNT;
​
-- 추천게시판(recommend)
-- re_no 숫자
-- title, content, 
-- writer 문자
​
PRODUCT22
​
CREATE TABLE "HR"."BOARD3" 
   (	"BOARDNO" NUMBER(38,0), 
	"TITLE" VARCHAR2(100), 
	"CONTENTS" VARCHAR2(100), 
	"WRITER" VARCHAR2(100), 
	"WRITEDATE" DATE, 
	"RECOMMEND" NUMBER(38,0), 
	"VIEWCOUNT" NUMBER(38,0)
   ) 
   
ALTER TABLE BOARD3 MODIFY WRITER VARCHAR2(200) 
​
ALTER TABLE BOARD3 DROP COLUMN VIEWCOUNT
​
ALTER TABLE BOARD3 ADD TEST2 VARCHAR2(100)
​
DROP TABLE BOARD3        
​
​
-- D C L : DB 관리/제어해주는 문법(계정생성, 계정권한부여, 백업, 복구)
​
CREATE USER apple IDENTIFIED BY a1234
​
GRANT CONNECT, resource, dba TO apple
​
CREATE TABLE "HR"."PRODUCT222" 
   ("ID" VARCHAR2(100) PRIMARY key, 
	"NAME" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"PRICE" NUMBER(38,0)
   )
 
CREATE TABLE "HR"."PRODUCT3" 
   ("ID" VARCHAR2(100) PRIMARY key, 
	"NAME" VARCHAR2(100), 
	"CONTENT" VARCHAR2(100), 
	"PRICE" NUMBER(38,0)
   )
   
CREAtE USER scott
IDENTIFIED BY tiger;
​
GRANT cONNECT, resource, dba TO scott;
​
INSERT INTO MEMBER VALUES ('100','100','park','011')
​
INSERT INTO MEMBER VALUES ('200','200','park','011')
​
INSERT INTO MEMBER VALUES ('300','300','park','011')
​
SELECT * FROM MEMBER
​
SELECT * FROM MEMBER WHERE id = '100' --id가 100인 모든 컬럼
​
​
SELECT id FROM MEMBER WHERE id = '100' --id가 100인 id 컬럼
​
SELECT id, name FROM MEMBER WHERE id = '100' --id가 100인 id,name 컬럼
​
SELECT name, id FROM MEMBER WHERE id = '100' --id가 100인 id,name 컬럼
​
SELECT id AS 아이디, name FROM MEMBER WHERE id = '100' --id가 100인 id,name 컬럼
​
SELECT tel FROM MEMBER WHERE name = 'park'
​
UPDATE MEMBER SET name = 'kim' WHERE id = '100'
​
UPDATE MEMBER SET name = 'yang' WHERE id = '200'
​
UPDATE MEMBER SET name = 'lee' WHERE id = '300'
   
SELECT * FROM MEMBER   
​
UPDATE MEMBER SET pw = '8888', tel = '9999' WHERE id = 'ice'
   
DELETE FROM MEMBER WHERE id = '100'
​
DELETE FROM MEMBER WHERE tel = '011'
​
SELECT * FROM MEMBER WHERE id = '200' AND tel = '011'
​
SELECT * FROM MEMBER WHERE id = '200' or tel = '011'
​
-- id,name,content,price,company,img
​
CREATE TABLE product (
	id varchar2(200), 
	name varchar2(200), 
	content varchar2(200), 
	price varchar2(200), 
	company varchar2(200), 
	img varchar2(200)
)
​
SELECT * FROM MEMBER ORDER BY id -- 오름차순
​
SELECT * FROM MEMBER ORDER BY id DESC -- 내림차순
​
SELECT * FROM PRODUCT ORDER BY price DESC
​
SELECT name, content, price FROM PRODUCT ORDER BY company
​
​
SELECT name, price FROM PRODUCT 
WHERE id = '100'
​
​
SELECT name, COMPANY FROM PRODUCT 
WHERE price = '5000'
​
​
SELECT COMPANY, IMG  FROM PRODUCT 
WHERE id = '100' AND price = '1000'
​
SELECT COMPANY, name  FROM PRODUCT 
WHERE COMPANY = 'c100'
​
SELECT * FROM PRODUCT 
​
SELECT NAME, PRICE FROM PRODUCT 
WHERE COMPANY = 'c100' OR COMPANY = 'c200'
​
UPDATE PRODUCT SET CONTENT = '품절' 
WHERE PRICE = '5000'
​
SELECT * FROM PRODUCT p 
WHERE PRICE = '5000'
​
UPDATE PRODUCT SET IMG = '0.png', PRICE = '10000'
WHERE id = '100' OR id = '102'
​
SELECT * FROM PRODUCT  
WHERE id = '100' OR id = '102'
​
UPDATE PRODUCT SET COMPANY = 'apple', NAME = 'appleshoes'
WHERE id = '101'
​
SELECT * FROM PRODUCT  
WHERE id = '101'
​
DELETE FROM PRODUCT 
WHERE NAME = 'shoes1' OR id = '107'
​
SELECT * FROM PRODUCT 
WHERE NAME = 'shoes1' OR id = '107'
​
DELETE FROM PRODUCT 
WHERE COMPANY = 'c100'
​
SELECT * FROM PRODUCT 
​
DELETE FROM PRODUCT 
​
SELECT * FROM PRODUCT 
​
​
DROP TABLE PRODUCT
​
SELECT * FROM PRODUCT