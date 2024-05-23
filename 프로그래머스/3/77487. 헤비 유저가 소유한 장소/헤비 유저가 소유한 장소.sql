-- 코드를 입력하세요
SELECT ID,	NAME,	a.HOST_ID
from PLACES a, (select HOST_ID
                from PLACES
                group by HOST_ID
                having count(HOST_ID)>=2
               ) b
where a.HOST_ID = b.HOST_ID               
order by ID