# 이름의 성이 홍씨인 모든 학생들의 정보를 출력하는 SQL문
#select * from student where st_name like '홍%'; # 홍 이라는 글자로 시작되는
#select * from student where st_name like '%홍%'; # 홍 이라는 글자가 포함되는
#select * from student where st_name like '%홍'; # 홍 이라는 글자로 끝나는

#학번이 2020인 모든 학생들의 정보를 출력하는 SQL문
#select * from student where st_num like '2019%';

#데이터 삭제 시 유의사항
/* 삭제하려는 데이터를 다른 테이블에서 외래키로 참조하고 있을 때 삭제 불가
1. 참고하고 있는 데이터를 삭제 후 해당(원래 삭제하려했던) 데이터를 삭제.
2. 참고하고 있는 데이터를 수정 후 해당(원래 삭제하려했던) 데이터를 삭제.
*/

/* 학생이 게시글에 첨부파일을 추가하여 게시글을 등록 하려고 한다.
이때 게시글 등록이 성공적으로 이뤄지기 위한 전제조건은 무엇이고, 어느 테이블에서 insert가 일어나야 하는가?
*/
/* 내생각 : 게시글 전에 첨부파일에서 insert가 발생하고 난 뒤에 게시글에서 insert가 일어나야함.
insert가 일어나는곳 : board 테이블 attachments 테이블
board 테이블 에서 insert되기 위한 조건
1. 게시글분류코드, 작성자 학번 필요
attachments 테이블 에서 insert되기 위한 조건
1. 참조파일이 등록될 게시글 번호 필요
*/
/* insert가 일어나는곳 : board 테이블 attachments 테이블
board 테이블 에서 insert되기 위한 조건
1. student 테이블에 게시글을 등록한 학생 정보가 있어야 한다.
2. board_type 테이블에 게시글의 종류가 등록되어 있어야 한다.
attachments 테이블 에서 insert되기 위한 조건
1. board 테이블에 게시글이 등록되어야 한다.
*/

# 학생의 성이 홍씨이고, 학번이 2020학번인 학생들의 모든 정보를 출력하는 SQL문

#select * from student where st_name like '홍%' and st_num like '2020%';
#select * from student where st_name like '홍%' and st_name like '%꼬%';


