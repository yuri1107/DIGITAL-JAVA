# 등록된 학생들의 학번과 이름이 출력되도록 SQL문을 작성하세요.
#select st_num, st_name from university.student;

# 등록된 학생들 중에서 학번이 2020110011인 학생의 모든 정보를 출력하는 SQL문을 작성하세요.
#select * from student where st_num=2020110011;

# 등록된 학생들 중에서 학번이 2020110011이 아닌 모든 학생들의 정보를 출력하는 SQL문을 작성하세요.
#select * from student where st_num != 2020110011;
#select * from student where st_num <> 2020110011;

# 2019학번 학생을 등록하는 SQL문을 작성하세요. 학번, 이름, 주민번호, 분류 임의로 입력
/*
insert into student
	values  (2019548800, '김내일', '023456-2789122', '석사');

insert into student (st_num, st_name, st_identification_num)
	values (2019110001, '장보고', '000505-1234567');
*/
# 2020학번 학생들만 출력되도록 SQL문을 작성하세요.

select * from student where st_num > 2020000000 && st_num < 2021000000;
select * from student;

#select * from student where st_type = '학사';


