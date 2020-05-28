# select 속성 from 테이블A join  테이블B on 테이블A.속성명 = 테이블B.속성명  where 조건;
# 두 테이블을 연결해주는 연결고리에 해당하는 부분 = on 다음에 나오는 코드

#select * from course;

#on을 통해 연결 할 때 테이블A와 테이블B에 연결하는 속성명이 서로 다른경우 테이블명 생략 가능.
#여러개의 테이블을 join으로 연결할 때, 테이블 연결 순서에 따라 join 속도가 달라진다.

#강의를 하는 교수명을 확인하기 위한 SQL
/*
select co_code, pr_name
	from course
		join professor
        on professor.pr_num = course.co_pr_num;
*/

#강의의 과목명을 확인하기 위한 SQL
/*
select co_code, su_title
	from course
		join subject
        on su_num = co_su_num;
*/

#강의의 과목명과 교수를 확인하기 위한 SQL
/*
select co_code, pr_name, su_title
	from course
	join professor
    on pr_num = co_pr_num
    join subject
    on su_num = co_su_num;
 */   
 
#학생 이름과 지도교수의 이름이 출력되도록 SQL문을 작성하세요.
/*
select st_name, pr_name
	from coach
    join student
    on ch_st_num = st_num
    join professor
	on ch_pr_num = pr_num;
*/

#게시글에 첨부파일 이름과 작성 학생 이름 함께 출력시키기
/*
select bo_title, ac_file_name, st_name
	from board
    join attachments
    on bo_num = ac_bo_num
    join student
    on bo_st_num = st_num;
*/  

#홍길동 학생이 수강했거나 하고있는 과목을 출력하는 SQL문을 작성하세요.
/* 혼자한거 똥망
select st_name like '홍길동', su_title
	from attend
    join course
    on at_co_code = co_code
    join subject
    on co_su_num = su_num;
*/

/* 쌤이랑 한거
select st_name, su_title
	from attend
    join student
    on at_st_num = st_num
    join course
    on at_co_code = co_code
    join subject
    on co_su_num = su_num
    where st_name = '김철수';
*/

#위의 예제를 서브쿼리를 이용해 풀이

select st_name, su_title
	from attend
    #	student 테이블에서 이름이 ***인 학생을 검색하여 검색 결과를 st라는 임시 테이블로 생성
    #	MySQL에서는 서브쿼리결과 에 as 테이블명을 안붙이면 에러발생. 오라클은 as와 임시테이블명을 안붙여도 가능
    join (select st_name, st_num from student where st_name = '김철수') st
    on at_st_num = st_num
    join course
    on at_co_code = co_code
    join subject
    on co_su_num = su_num;
    
# 현재(2020년 1학기) 개설된 과목명을 볼 수 있도록 SQL문을 작성하세요.
/* 혼자한거 또 똥망 ㅠ
select su_title
	from subject
    join course
    on su_num = co_su_num
    join attend
    on co_code = at_co_code
    join student
    on at_st_num = st_num
    where at_co_code like '2020%';
    
    select su_title
	from course
    join subject
    on co_su_num = su_num;
    where co_code like '2020%';
*/
# 쌤이랑
/*
select co_code, su_title
	from (select * from course where co_code like '2020#_%#_1#_%' escape '#') t
    join subject
    on co_su_num = su_num;
*/


# 짱구 학생이 현재까지 수강했거나 수강한 과목의 총 학점을 출력하도록 SQL문을 작성하세요
/* 혼자한거
select st_name, su_title, sum(su_point)
	from attend
    join (select st_name, st_num from student where st_name = '신짱구') st
    on at_st_num = st_num
    join course
    on at_co_code = co_code
    join subject
    on co_su_num = su_num;
 */
 
 select st_name, sum(su_point)
	from attend
    join (select st_name, st_num from student where st_name = '신짱구') st
    on at_st_num = st_num
    join course
    on at_co_code = co_code
    join subject
    on co_su_num = su_num;
    
# 수강기록에서 총점을 확인하는 SQL문
select at_co_code as '강의코드', at_st_num as '학번', 
(at_mid + at_final + at_homework + at_attendance) as 'total' from attend;


#2020년 1학기에 대학수학기초 강의 1분반 학생의 수를 확인하는 SQL문
select su_title as '과목명', count(*) as '학생 수(명)'
	from (select * from attend where at_co_code like '2020@_%@_1@_%' escape '@') as t1
		join course
        on co_code = at_co_code
        join (select * from subject where su_title = '대학수학기초') as t2
        on su_num = co_su_num;

# 홍길동 학생이 작성한 게시글을 확인하는 SQL문
select bo_title, st_name 
	from board
	join (select * from student where st_name = '신짱구') as t
    on bo_st_num = st_num;