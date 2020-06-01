select * from shoppingmall.member; #회원

select * from shoppingmall.member 
	where  m_authority != 'user'; # 셀러만 보려면 주석풀기 and m_authority != 'admin';

select * from shoppingmall.member;  #1 / 1
select * from shoppingmall.product; #
select * from shoppingmall.product_registration; #
select * from shoppingmall.purchase; #2/
select * from shoppingmall.purchase_list; #3(여러번가능)/
select * from shoppingmall.registration_list; #

#상품코드,상품명,재고량 보기
select pd_code as '상품코드', pd_name as '상품명', pd_price as '가격', rl_amount as '재고량' 
	from shoppingmall.product 
    join shoppingmall.registration_list
    on pd_code = rl_pd_code;

    
