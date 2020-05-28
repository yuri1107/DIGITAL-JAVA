select * from attend where at_co_code = '2020_MSC002_1_1';

#강의가 2020_MSC002_1_1인 강의를 수강하는 학생들의 중간고사 총점
select sum(at_mid) from attend where at_co_code = '2020_MSC002_1_1';

#강의가 2020_MSC002_1_1인 강의를 수강하는 학생들의 중간고사 평균
select avg(at_mid) from attend where at_co_code = '2020_MSC002_1_1';
#강의가 2020_MSC002_1_1인 강의를 수강하는 학생들의 수
select count(*) from attend where at_co_code = '2020_MSC002_1_1';


