select *
from ANGELMINJI_EMP;
select *from SCOTT.ANGELMINJI_SALGRADE;
commit;
select *
from  ANGELMINJI_EMP;
select ENAME,job from ANGELMINJI_EMP;
select ENAME,job from ANGELMINJI_EMP order by ENAME asc;
select ENAME,job from ANGELMINJI_EMP order by ENAME desc ;
select  job from ANGELMINJI_EMP;
select distinct JOB from ANGELMINJI_EMP;
select distinct JOB from ANGELMINJI_EMP order by JOB asc;
select distinct JOB from ANGELMINJI_EMP order by 1;

select *from ANGELMINJI_EMP where ENAME='SMITH';
select *from ANGELMINJI_EMP where ENAME='ward';
select *from ANGELMINJI_EMP where ENAME='SMITH' OR ENAME='WARD';

SELECT ENAME , sal from ANGELMINJI_EMP;

select ENAME "사 원 명",SAL"급 여" from ANGELMINJI_EMP;
select ENAME 사원명,SAL 급여 from ANGELMINJI_EMP;

select '내이름은 '||Ename||' 이고 직업은 '||job||'입니다' from ANGELMINJI_EMP;
select '내이름은 '||Ename||' 이고 직업은 '||job||'입니다' "사원" from ANGELMINJI_EMP;
select '사원 '||Ename||' 님의 연봉은 '||SAL||'만원입니다' "연봉" from ANGELMINJI_EMP;
select ENAME,SAL from ANGELMINJI_EMP where SAL>=2000 and sal<=3000;
select ENAME,sal from ANGELMINJI_EMP where sal between 1000 and 3000;

select ENAME,job from ANGELMINJI_EMP where job='SALESMAN' or job='MANAGER' or job='CLERK';
select ENAME,job from ANGELMINJI_EMP where job in ('SALESMAN','MANAGER','CLERK');
select ENAME,job,MGR from ANGELMINJI_EMP where MGR in ('7902','7839','7788');

select *from ANGELMINJI_EMP where MGR is null;
--comm이 null인 경우
select *from ANGELMINJI_EMP where COMM is null;
--comm이 null 이 아닌경우
select *from ANGELMINJI_EMP where comm is not null;
--문자조회시 %,_를 이용해서 조회
--ENAME이 a로 시작하는 사람 조회
select ENAME,SAL from ANGELMINJI_EMP where ENAME like 'A%';

--ENAME이 n으로 끝나는 사람

select ENAME,SAL from ANGELMINJI_EMP where ENAME like '%N';

--이름의 두 번째 글자가 A인 사람

select ENAME,SAL from ANGELMINJI_EMP where ENAME like '_A%';
--이름의 세 번째 글자가 A인 사람
select ENAME,SAL from ANGELMINJI_EMP where ENAME like '__A%';

--이름이 S나 M으로 시작하는 사람
select ENAME,SAL from ANGELMINJI_EMP where ENAME like 'M%' or  ENAME like'S%';
--이름이 s로 시작하는 사람중에 연봉이 2000이상인 사람 조회
select ENAME,SAL from ANGELMINJI_EMP where ENAME like 'S%'and SAL >=2000;
--MGR이 7902,7788,7566이 아닌 (not)사람을 조회 (in)
select ENAME,job,MGR from ANGELMINJI_EMP where MGR not in ('7902','7788','7566');

--comm, comm+1000 의 결과 출력
select comm,comm+100 from ANGELMINJI_EMP; --null인 경우 더해도 결과는 null
--함수중 NVL(컬럼명, 널일경우 초기값),MYSQL은 ifnull이다
select nvl(comm,0) ,nvl(comm,0)+1000 from ANGELMINJI_EMP;
--위의 SQL문을 컬럼제목을 추가하여 완성하시오 "comm" ,"comm2"
select nvl(comm,0) "comm",nvl(comm,0)+1000 "comm2"from ANGELMINJI_EMP; --null 일경우 0으로 출력 또는 걔산

--sal 이 2000~3000 이 아닌 경우 조회,두 가지 방법으로 해보기
select ENAME,SAL from ANGELMINJI_EMP where SAL not between 2000 and 3000;
select ENAME,SAL from ANGELMINJI_EMP where SAL<2000 or SAL>3000;

--GRUOP 함수(COUNT,MAX,MIN,AVG,SUM)
SELECT COUNT(*)FROM ANGELMINJI_EMP; --전체 인원수
SELECT MAX(SAL)FROM ANGELMINJI_EMP; --최고연봉
SELECT MIN(SAL)FROM ANGELMINJI_EMP; --최소연봉
SELECT SUM(SAL)FROM ANGELMINJI_EMP; --SAL의 합계
SELECT AVG(SAL)FROM ANGELMINJI_EMP; --SAL의 평균

--AVG는 소수점 이하가 나오는 경우가 많아서 ROUND,CEIL,FLOOR 등과 같이 많이 사용
--평균은 소수점 이하 2자리까지만 나오게 하기
select ROUND(AVG(SAL),2) FROM ANGELMINJI_EMP; --2073.21 반올림
select CEIL(AVG(SAL)) FROM ANGELMINJI_EMP; --2074 무조건 올림
select FLOOR(AVG(SAL)) FROM ANGELMINJI_EMP; --2073 무조건 내림

--ppt 57 페이지 GROUP BY 절
--JOB을 그룹으로 각 인원수를 구해보자
select JOB 직업,count(*) 인원수 from ANGELMINJI_EMP group by JOB;

--위의 결과에 직접의 오름차순으로 출력
select JOB 직업,count(*) 인원수 from ANGELMINJI_EMP group by JOB order by 직업; --컬럼명으로 순서정하기
select JOB 직업,count(*) 인원수 from ANGELMINJI_EMP group by JOB order by 1;

--위의 결과에 인원수의 오름차순
select JOB 직업,count(*) 인원수 from ANGELMINJI_EMP group by JOB order by 인원수 ; 컬럼명으로 순서정하기
select JOB 직업,count(*) 인원수 from ANGELMINJI_EMP group by JOB order by 2 ; 컬럼 번호로 순서정하기

--직업별 인원수와 최고연봉,최저연봉,평균연봉(무조건올림)을 구해보시오
select job 직업,count(*) 인원수,max(SAL) 최고연봉,min(SAL) 최저연봉, CEIL(AVG(SAL)) 평균연봉 from SCOTT.ANGELMINJI_EMP group by job;

--Having은 GROUP절에서 그룹함수를 이용해서 조건을 나타낼 경우
--직업별 인원수와 최고연봉을 구하는데 직업별 인원수가 3명 이상인 경우만 조회를 하시오
select job,count(*),max(SAL) from ANGELMINJI_EMP group by job having count(job)>=3;

--오라클에서는 현재날짜를 구할 때 SYSDATE,MYSQL은 NOW()
select sysdate from dual; 현재 콘솔에 현재 날짜 출력
--3일뒤
select sysdate+3 from dual;
--30일뒤
select sysdate+30 from dual;

--날짜타입을 문자열로 변환 TO_CHAR : 기호 Y,M,D,HH,HH24,MI,SS,AM/PM등
SELECT TO_CHAR(SYSDATE,'YYYY') FROM DUAL;
SELECT TO_CHAR(SYSDATE,'YYYY MM mm ') FROM DUAL;

--기호를 많이 쓰는데 다양한 기호로 날짜를 출력해보자
select to_char(sysdate,'YYYY-MM-DD HH24:MI') FROM DUAL;

--EMP에서 HIREDATE(날짜타입)을 이용해서 출력해보자
select ENAME,TO_CHAR(HIREDATE, 'YYYY-MM-DD') HIREDATE FROM ANGELMINJI_EMP;

--고용년도가 1987년인 사람 출력
select ENAME,TO_CHAR(HIREDATE, 'YYYY-MM-DD') HIREDATE FROM ANGELMINJI_EMP where to_char(HIREDATE, 'YYYY') = 1987;
--고용월이 5월인 사람 출력
select ENAME,TO_CHAR(HIREDATE, 'YYYY-MM-DD') HIREDATE FROM ANGELMINJI_EMP where to_char(HIREDATE, 'MM') = 05;
select*from ANGELMINJI_EMP where to_char(HIREDATE,'MM')=05;

--SUBQUERY(SELECT문 안에 또 SELECT문이 있는 경우)
--SMITH의 연봉과 같은 연봉을 가진 사람을 구하시오
select*from ANGELMINJI_EMP where SAL =(SELECT SAL FROM ANGELMINJI_EMP WHERE ENAME='SCOTT');
--평균연봉보다 많이 받는 사람 정보
select*from SCOTT.ANGELMINJI_EMP where sal>(select avg(SAL) from ANGELMINJI_EMP);





