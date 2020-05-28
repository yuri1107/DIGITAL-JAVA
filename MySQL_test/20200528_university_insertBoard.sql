
insert board_type values
	('abc000', '자기소개');

insert into board (bo_title, bo_content, bo_bt_code, bo_st_num)	values 
    ('짱구입니다', '떡잎마을방범대 대장', 'abc000', 2017050501),
    ('철수입니다', '떡잎마을방범대 브레인', 'abc000', 2017050502),
    ('훈이입니다', '떡잎마을방범대 발암물질', 'abc000', 2017050505);
    
insert into board (bo_title, bo_content, bo_bt_code, bo_st_num)	values 
    ('떡잎방범대 스케줄표 입니다.', '내용과 첨부파일 확인하기', 'abc123', 2017050501);
    
insert into attachments (ac_file_name,ac_file_path, ac_bo_num) values
	('떡잎방범대 6월1째주 스케줄표', 'c\\CockleBarrier', 20);