/* join 양식
select 속성
	from 테이블A
		join 테이블B
			on 테이블A,속성A = 테이블B,속성B
        join 테이블C
			on 테이블A,속성A = 테이블C,속성C
		where 조건;
	*조건은 생략될 수 있다.
    *하나의 테이블로 내가 원하는 정보를 찾을 수 없을 때  join을 통해 확인이 가능하다.
    */
    
select * from professor;

select * from coach;

# 채성아 교수님의 모든 지도학생의 이름을 확인하기 위한 SQL문을 작성하세요.
/* 혼자한거
select st_name as '지도학생', pr_name as '지도교수'
	from professor
    join coach
    on pr_num = ch_pr_num
    join student
    on ch_st_num = st_num
	where pr_name like '채성아';
*/

select pr_name, st_name
	from coach
		join professor
        on pr_num = ch_pr_num
        join student
		on st_num = ch_st_num
        where pr_name = '채성아';

select pr_name, st_name
	from coach
		join (select * from professor where pr_name = '채성아') as pr
			on pr_num = ch_pr_num
        join student
			on st_num = ch_st_num;
            
# 채성아 교수님이 강의하고 있거나 강의했던 모든 과목명을 확인하는 SQL문을 작성하세요.

select pr_name as '교수 이름' , su_title as '과목명'
	from professor
		join course
			on pr_num = co_pr_num
		join subject
			on co_su_num = su_num
		where pr_name like '채성아';
        
select * from coach;
#폐강인 경우는 강의 테이블에서 해당 강의를 삭제한다는 조건의 시스템
select pr_name, su_title, co_code
	from course
    join (select * from professor where pr_name = '채성아') as pr
    on pr_num = co_pr_num
    join subject
    on su_num = co_su_num;
    
#채성아 선생님이 2020년 1학기에 강의하는 모든 과목명을 확인하는 SQL문을 작성하세요.
#폐강인 경우는 강의 테이블에서 해당 강의를 삭제한다는 조건의 시스템
#혼자한거랑 쌤이랑한거랑 같음
#2020#_%#_1%로 조건을 걸면 다음과 같은 경우에 검색되서 잘못됨 => 2020_MCS001_2_1
#2020#_%#_1#_% 로 조건을 걸면 _1 다음에 1글자 이상이 필요해서 해결 됨
select pr_name as '교수', su_title as '과목명', co_code
	from (select * from course where co_code like '2020#_%#_1#_%' escape '#') as t
    join (select * from professor where pr_name = '채성아') as pr
    on pr_num = co_pr_num
    join subject
    on su_num = co_su_num;
    
select pr_name as '교수', su_title as '과목명', co_code
	from course
    join professor
    on pr_num = co_pr_num
    join subject
    on su_num = co_su_num
    where pr_name = '채성아' and co_code like '2020#_%#_1_%' escape '#';
    
#채성아 교수가 하거나 했던 강의 이름을 중복된 강의명은 제거
#group by
select pr_name, su_title
	from course
    join (select * from professor where pr_name = '채성아') as pr
    on pr_num = co_pr_num
    join subject
    on su_num = co_su_num
    group by su_title;

# 정렬 : order by ASC / DESC
select * from attend order by at_num desc; #내림차 (큰수 -> 작은수)
select * from attend order by at_num asc; #오름차 (작은수 -> 큰수)
