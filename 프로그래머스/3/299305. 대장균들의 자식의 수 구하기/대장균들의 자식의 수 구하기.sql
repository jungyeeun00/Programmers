-- 코드를 작성해주세요
select ID, ifnull((select count(*) from ECOLI_DATA group by PARENT_ID having PARENT_ID=ID),0) CHILD_COUNT
from ECOLI_DATA
order by ID