-- 코드를 입력하세요
SELECT i.NAME, i.DATETIME
from ANIMAL_INS i 
where i.ANIMAL_ID not in (select o.ANIMAL_ID
                            from ANIMAL_OUTS o
                         where i.ANIMAL_ID=o.ANIMAL_ID)
order by DATETIME
limit 3