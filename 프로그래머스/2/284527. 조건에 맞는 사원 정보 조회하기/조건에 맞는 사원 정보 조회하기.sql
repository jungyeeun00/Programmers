-- 코드를 작성해주세요
# select sum(SCORE) as SCORE,	e.EMP_NO,	e.EMP_NAME,	e.POSITION,	e.EMAIL
# from HR_EMPLOYEES e join HR_GRADE g on e.EMP_NO=g.EMP_NO
# group by EMP_NO
# having SCORE
# order by SCORE desc
# limit 1

select SCORE,	d.EMP_NO,	EMP_NAME,	POSITION,	EMAIL
from HR_EMPLOYEES d , (select EMP_NO,  sum(SCORE) score
                          from HR_GRADE
                          where YEAR=2022
                         group by EMP_NO
                         order by score desc
                         limit 1) g 
where d.EMP_NO=g.EMP_NO