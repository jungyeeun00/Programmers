-- 코드를 작성해주세요
select d.DEPT_ID,	d.DEPT_NAME_EN, round(avg(SAL)) as	AVG_SAL
from HR_EMPLOYEES e join HR_DEPARTMENT d on e.DEPT_ID=d.DEPT_ID
group by e.DEPT_ID
order by AVG_SAL desc