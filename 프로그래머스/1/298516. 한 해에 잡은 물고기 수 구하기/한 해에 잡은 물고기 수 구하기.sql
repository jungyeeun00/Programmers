-- 코드를 작성해주세요

select count(*) FISH_COUNT
from FISH_INFO 
where date_format(TIME, "%Y")='2021'