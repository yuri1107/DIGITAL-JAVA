/*
insert into
	board_type(bt_code, bt_type)
	values('abc123', '공지사항');
    #게시판분류_분류코드/분류명
*/

insert into professor
	values (2020110001, '홍쓰앵', '40', '010-1234-5678', '교수실 101호');
select * from professor;

insert into course
	values ('2020_MSC001_1_1', '강의실 101호', '월1,2 수1,2', 1, 2020110001, 'MSC001');
select * from course;
#원래는 여기에서 학생등록을 해야하는데 우리는 학생정보가 이미 있기때문에 패스

insert into attend (at_st_num, at_co_code)
	values (2011578946, '2020_MSC001_1_1');
select * from attend;



