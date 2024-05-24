-- 코드를 작성해주세요
# select ID, ifnull((select count(*) from ECOLI_DATA group by PARENT_ID having PARENT_ID=ID),0) CHILD_COUNT
# from ECOLI_DATA
# order by ID

select ID, 	ifnull(CHILD_COUNT,0) CHILD_COUNT
from ECOLI_DATA a left join (select PARENT_ID, count(*) CHILD_COUNT
                       from ECOLI_DATA
                       group by PARENT_ID) b
                on a.ID=b.PARENT_ID
order by ID                
            