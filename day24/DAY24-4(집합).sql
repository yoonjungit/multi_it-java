--<집합>

-- 테이블을 합해서 검색하는 방법 3가지 : 집합, 조인, 서브쿼리

-- UNION : 연결된 SELECT문의 결과 값을 합집합으로 묶음, 중복값은 제거

SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 10
UNION 
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP WHERE DEPTNO = 20

-- UNIONALL

-- MINUS : 앞의 SELECT문의 결과에서 뒤의 SELECT문의 결과를 제외한 값을 출력

-- INTERSECT : 교집합 데이터만 출력

-- ****<조인>*****
-- 조건 : 기준(하나 이상의 겹치는 데이터)이 있어야 함. 
-- ex) 학생 개인정보 : 학번 학과 연락처	//	수강신청명단 : 학번, 수강과목, 지도교수	=> 학번 기준으로 두 테이블을 합침
-- 사용 이유 : 항목들이 여러개의 테이블에 흩어져 있는 경우 테이블을 모아서(합해서) 검색

-- SELECT 컬럼 FROM 테이블1, 테이블2 WHERE 기준데이터

SELECT * FROM EMP, DEPT WHERE EMP.DEPTNO = DEPT.DEPTNO

SELECT * FROM MEMBER m, BBS b WHERE m.ID = b.WRITER 	--테이블 닉네임 설정 가능, 이때 교집합이 아닌 데이터는 출력되지 않음 (INNER JOIN)

SELECT b."no", b.TITLE, NAME FROM MEMBER m, BBS b WHERE m.ID = b.WRITER

-- 조인의 종류 : 
	-- INNERJOIN : 테이블 간 공통된 값만 추출
	-- OUTER JOIN (외부 조인)
		-- 0 : 왼쪽(앞) 테이블 전체 값(교집합 포함)
		-- RIGHT (OUTER) JOIN : 오른쪽(뒤) 테이블 전체 값(교집합 포함)

-- INNER JOIN

SELECT E.EMPNO, E.ENAME, E.JOB, D.DEPTNO, D.LOC 
FROM EMP E, DEPT D 
WHERE E.DEPTNO = D.DEPTNO

-- OUTER JOIN

SELECT * 
FROM MEMBER M
LEFT OUTER JOIN BBS B 
ON(M.ID = B.WRITER)		-- MEMBER 값 전체 (MEMBER 중 교집합 아닌 kiwi도 포함, 이때 BBS에는 kiwi의 데이터가 NULL로 표시)

SELECT * 
FROM MEMBER M
RIGHT OUTER JOIN BBS B 
ON(M.ID = B.WRITER)		-- BBS 값 전체 (MEMBER 중 교집합 아닌 kiwi는 제외)

-- <JOIN 확인문제>
SELECT * 
FROM EMP E
LEFT OUTER JOIN DEPT D 
ON E.DEPTNO = D.DEPTNO	-- EMP 값 전체 (DEPT는 교집합만)

SELECT * 
FROM EMP E
RIGHT OUTER JOIN DEPT D 
ON E.DEPTNO = D.DEPTNO	-- DEPT 값 전체 (EMP는 교집합만)

SELECT * 
FROM MEMBER M 
LEFT OUTER JOIN BBS B 
ON B.WRITER = M.ID

SELECT * 
FROM MEMBER M 
RIGHT OUTER JOIN BBS B 
ON B.WRITER = M.ID

--<JOIN 확인문제2>

CREATE TABLE company (
	id varchar2(200) primary key,
	name varchar2(200),
	addr varchar2(200),
	tel varchar2(200)
)

INSERT INTO COMPANY VALUES('c100', 'GOOD', 'SEOUL', '011')

INSERT INTO COMPANY VALUES('c200', 'JOA', 'BUSAN', '012')

INSERT INTO COMPANY VALUES('c300', 'MARIA', 'ULSAN', '013')

INSERT INTO COMPANY VALUES('c400', 'MY', 'KWANGJU', '014')

SELECT * FROM COMPANY

-- INNER JOIN

SELECT C.ID, C.ADDR, P.NAME, P.PRICE
FROM PRODUCT P, COMPANY C
WHERE P.COMPANY = C.ID

-- OUTER JOIN

SELECT C.ID, C.ADDR, P.NAME, P.PRICE 
FROM PRODUCT P
LEFT OUTER JOIN COMPANY C 
ON(P.COMPANY = C.ID)		

SELECT C.ID, C.ADDR, P.NAME, P.PRICE 
FROM PRODUCT P
RIGHT OUTER JOIN COMPANY C 
ON(P.COMPANY = C.ID)		

