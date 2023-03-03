# 24일차
## [1] 복습

> SQL

- INSERT, DELETE, UPDATE의 실행 결과는 정수(실행된 행 수)이지만, SELECT의 결과는 테이블

- DELETE : 컬럼명 지정 안함

> DELETE, TRUNCATE 비교 

- DELETE : 저장공간은 남겨두고 데이터만 지움. 또한 데이터를 복구/취소(rollback, 롤백) 가능 

- TRUNCATE : 저장공간도 남겨두지 않고, 복구/취소 불가능 

## [2] 문자 함수

```SQL
-- <문자 함수>

-- UPPER : 대문자로 바꾸기 (LOWER 도 가능)

SELECT UPPER(ENAME) FROM EMP

-- LENGTH : 길이

SELECT LENGTH(ENAME) FROM EMP

-- SUBSTR : 문자열 추출

SELECT SUBSTR(ENAME, 2) FROM EMP

SELECT SUBSTR(ENAME, 1, 2) FROM EMP

SELECT SUBSTR(ENAME, -2) FROM EMP

-- REPLACE : 문자 대체

SELECT REPLACE(ENAME, 'L', 'N') FROM EMP

-- LPAD / RPAD : 빈 공간을 특정 문자로 대체

SELECT LPAD(ENAME, 6, '#') FROM EMP		-- 6자리 중 빈 공간으로 #으로 넣음 (L은 앞쪽을 빈공간으로, R은 뒤쪽을 빈공간으로)
		-- ex) ARI -> ###ARI
-- CONCAT : 문자열 합치기. 이때 두개의 인자만 받을 수 있으므로, 2개 이상일 때는 중첩해야함 

SELECT CONCAT (EMPNO, ENAME) FROM EMP

SELECT CONCAT(EMPNO, ':') AS CONCAT_RESULT FROM EMP

SELECT CONCAT(CONCAT(EMPNO, ':'), ENAME) AS CONCAT_RESULT2 FROM EMP

SELECT EMPNO||':'||ENAME FROM EMP		-- 윗줄과 같은 결과, 여러개 인자를 받을 때에는 CONCAT 대신 ||를 쓰기도 함

-- TRIM : 문자열 자르기

SELECT TRIM(ENAME) FROM EMP		-- 앞 뒤로 공백 제거(중간에 있는 공백은 안됨. 중간 공백은 REPLACE 사용해서 지우기)

SELECT LENGTH(TRIM(ENAME)) FROM EMP		--공백 제거한 길이

SELECT TRIM('W' FROM ENAME) FROM EMP 

SELECT TRIM('   hong   ') FROM EMP

SELECT TRIM(BOTH 'A' FROM ENAME) FROM EMP 	-- BOTH : 양쪽 끝으로 A 삭제

SELECT TRIM(LEADING 'A' FROM ENAME) FROM EMP	-- LEADING : 앞쪽에 A 제거

SELECT TRIM(TRAILING 'A' FROM ENAME) FROM EMP	-- TRAILING : 뒤쪽에 A 제거

-- ROUND / TRUNC / CEIL / FLOOR / MOD : 소수점 반올림 / 버림 / 올림 / 내림 / 나머지
-- ADD_MONTHS : 몇개월 이후
-- NEXT_DAY : 특정 날짜 이후에 지정한 요일
-- TO_CHAR / TO_NUMBER : 숫자, 날짜 데이터를 문자로 변환 / 문자 데이터를 숫자로 변환

SELECT SYSDATE, TO_CHAR(SYSDATE, 'MONTH')AS MONTH FROM DUAL		-- 3월
--DUAL은 테스트용 먹통 테이블(실제 테이블이 아닌 테스트용 테이블)

-- TO_DATE : 문자 데이터를 날짜 데이터로 변환

SELECT TO_DATE('2018-0714', 'YYYY-MM-DD') FROM DUAL		-- 2018-07-14

SELECT TO_DATE('2018-07-14', 'YYYY-MM-DD') AS TODATE1 FROM DUAL	-- 문자를 날짜 포맷으로 출력

SELECT * FROM EMP WHERE HIREDATE > TO_DATE('1981/06/01', 'YYYY/MM/DD')	--1981년 6월 1일 이후 입사 직원 조회


-- <NULL 처리> : 기본 연산은 NULL인 데이터가 포함될 경우 실행되지 않음 따라서 NULL 인 경우 0으로 바꾼 후 실행

UPDATE EMP SET COMM = 0 WHERE COMM IS NULL	-- COMM 열의 값이 NULL인 경우 NULL이 아닌 0으로 바꿈

SELECT SAL + COMM AS TOTAL FROM EMP     -- 데이터 연산
```


## [3] 집계, 그룹함수

```SQL
--SUM / COUNT / AVG : 합 / 개수/ 평균

SELECT COUNT(*) FROM EMP 		--전체 컬럼 개수

SELECT COUNT(DISTINCT SAL) FROM EMP 		--SAL중 겹치는 데이터를 제외한 데이터의 개수

SELECT AVG(SAL) FROM EMP		--SAL 평균

SELECT AVG(SAL), SUM(SAL) FROM EMP WHERE JOB='SALESMAN'		--SALESMAN의 SAL 평균, 총합

--MIN / MAX : 최소 / 최대

SELECT MIN(SAL), MAX(SAL) FROM EMP

--GROUP BY : 그룹별로 묶을 떄

SELECT DEPTNO, AVG(SAL) FROM EMP GROUP BY DEPTNO		-- DEPTNO별로 묶어서 평균을 냄

SELECT DEPTNO,AVG(SAL) FROM EMP GROUP BY DEPTNO ORDER BY DEPTNO DESC		-- 그룹 별로 평균 낸 것을 DEPTNO 역순으로 정렬

SELECT DEPTNO, AVG(SAL) FROM EMP GROUP BY DEPTNO HAVING AVG(SAL)>=2000 ORDER BY DEPTNO DESC		--HAVING : 조건. 평균 SAL 2000이상인 그룹만

SELECT JOB, COUNT(SAL), SUM(SAL), ROUND(AVG(SAL)) FROM EMP GROUP BY JOB ORDER BY COUNT(SAL)
```


## [4] 집합

### 1. 개념

2개 이상의 테이블에서 동시에 검색하는 방법

### 2. 집합

- 두 개 이상의 쿼리문을 합치는 것

- UNION : 연결된 SELECT문의 결과 값을 합집합으로 묶음, 중복값은 제거

- UNION ALL : 연결된 SELECT문의 결과 값을 합집합으로 묶음, 중복값도 제거 없이 모두 보여줌

- MINUS : 앞의 SELECT문의 결과 값에서 뒤의 SELECT 문의 결과 값을 차집합으로 처리해서 보여줌

- INTERSECT : 먼저 작성한 SELECT 문과 다음 SELECT 문의 결과 값이 닽은 데이터만 출력 (교집합)

```
SELECT 컬럼 FROM 테이블명 WHERE 조건
(UNION, UNION ALL, MINUS, INTERSECT)
SELECT 컬럼 FROM 테이블명 WHERE 조건
```
```SQL
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10
UNION 
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 20
```

### 3. JOIN (중요)

- 두 개의 테이블을 묶어서 하나의 결과를 만들어 내는 것

- 꼭 두개의 테이블에서 하나 이상의 겹치는 데이터 열이 있어야 함

    ex) <BR>학생 개인정보 : 학번 학과 연락처<BR>수강신청명단 : 학번, 수강과목, 지도교수<BR>=> 학번 기준으로 두 테이블을 합침

- INNER JOIN(내부 조인) : 두 데이터의 교집함을 보여줌

- OUTER JOIN(외부 조인)은 LEFT 혹은 RIGHT 중 지정한 테이블의 값을 다 보여줌

    LEFT (OUTER) JOIN, RIGHT (OUTER) JOIN

<p align="center"><img src="https://www.dofactory.com/img/sql/sql-inner-join.png" width=200> <img src="https://www.dofactory.com/img/sql/sql-left-join.png" width=200><img src="https://www.dofactory.com/img/sql/sql-right-join.png" width=200> </p>

```
INNER JOIN : 
SELECT 컬럼
FROM 테이블1, 테이블2
WHERE 테이블1기준컬럼 = 테이블2 기준컬럼

OUTER JOIN:
SELECT 컬럼
LIEFT(RIGHT) OUTER JOIN 테이블1, 테이블2
ON 테이블1기준컬럼 = 테이블2 기준컬럼
```

```SQL
-- INNER JOIN
SELECT E.EMPNO, E.ENAME, E.JOB, D.DEPTNO, D.LOC 
FROM EMP E, DEPT D 
WHERE E.DEPTNO = D.DEPTNO

SELECT * 
FROM EMP E
LEFT OUTER JOIN DEPT D 
ON E.DEPTNO = D.DEPTNO	-- EMP 값 전체 (DEPT는 교집합만)

SELECT * 
FROM EMP E
RIGHT OUTER JOIN DEPT D 
ON E.DEPTNO = D.DEPTNO	-- DEPT 값 전체 (EMP는 교집합만)
```

- JOIN은 이외 SELF JOIN, FULL OUTER JOIN 등이 있지만 수업에서는 다루지 않음
