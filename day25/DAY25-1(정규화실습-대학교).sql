CREATE TABLE "STUDENT_INFORMATION"
(	
	"학생번호" NUMBER(38, 0) PRIMARY KEY,
	"학생이름" VARCHAR2(100),
	"주소" VARCHAR2(100),
	"학과" VARCHAR2(100)
)

CREATE TABLE "RECORD"
(	
	"학생번호" NUMBER(38, 0),
	"강좌이름" VARCHAR2(100),
	"성적" NUMBER(5,1)
)

CREATE TABLE "DEPARTMENT"
(	
	"학과" VARCHAR2(100) PRIMARY KEY,
	"학과사무실" VARCHAR2(100)
)

CREATE TABLE "SUBJECT2"
(	
	"강좌이름" VARCHAR2(100) PRIMARY KEY,
	"강의실"  VARCHAR2(100)
)

SELECT S.학생번호, S.학생이름, S. 주소, S.학과, D.학과사무실, R.강좌이름, A.강의실, R.성적
FROM STUDENT_INFORMATION S, RECORD R, DEPARTMENT D, SUBJECT2 A
WHERE S.학생번호 = R.학생번호 AND D.학과 = S.학과 AND R.강좌이름 = A.강좌이름
ORDER BY S.학생번호

DELETE FROM RECORD WHERE 학생번호 = 501 AND 강좌이름 = '자료구조'

SELECT * FROM STUDENT_INFORMATION

SELECT * FROM RECORD

SELECT * FROM DEPARTMENT

SELECT * FROM SUBJECT2

SELECT *
FROM STUDENT_INFORMATION
WHERE 학생번호 IN (SELECT 학생번호 FROM RECORD WHERE 성적>3.5);

SELECT *
FROM RECORD
WHERE 강좌이름 = (SELECT 강좌이름 FROM SUBJECT2 WHERE 강의실 = '공학관110')