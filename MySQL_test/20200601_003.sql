#select * from shoppingmall.member;

select * from shoppingmall.member where  m_authority != 'user'; # 셀러만 보려면 주석풀기 and m_authority != 'admin';

select * from product;
#제품
select * from shoppingmall.product_registration;
#제품등록
select * from shoppingmall.registration_list;

/* 현재 구입할 수 있는 제품들을 확인하는 SQL문을 작성하세요*/
/*
#혼자한거
select pd_code, pd_name, rl_amount, pr_m_id
	from shoppingmall.product 
    join shoppingmall.registration_list
    on pd_code = rl_pd_code
    join shoppingmall.product_registration
    on rl_pr_num = pr_num
    where rl_amount > 0 and pr_m_id like 'admin';
#쌤
select pd_name as '제품명', rl_amount as '재고량'
	from registration_list 
    join product
    on pd_code = rl_pd_code
    where rl_amount > 0;
*/


select * from purchase;

select * from purchase_list;
/*abc123회원이 구매한 제품들을 확인하는 SQL문을 작성하세요*/
#혼자
select pc_m_id as '구매자', pd_name as '제품명', pl_amount as '구매량', pc_price as '총 가격', m_address as'배송지'
	from purchase_list
    join product
    on pl_pd_code = pd_code
    join purchase
	on pl_pc_num = pc_num
    join shoppingmall.member
    on m_id = pc_m_id
    where m_id like 'abc123';

#쌤
select m_id as '구매자', pd_name as '제품명', pl_amount as '구매량'
	from purchase_list
		join product
        on pl_pd_code = pd_code
        join purchase
        on pl_pc_num = pc_num
        join shoppingmall.member
        on m_id = pc_m_id
	where m_id = 'abc123';



select * from shoppingmall.product; #제품
select * from shoppingmall.product_registration; #제품등록
select * from shoppingmall.purchase; #구매
select * from shoppingmall.purchase_list; #구매리스트
select * from shoppingmall.registration_list; #제품등록리스트
