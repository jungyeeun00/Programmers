-- 코드를 작성해주세요
select count(*) FISH_COUNT
from FISH_INFO 
where ifnull(LENGTH,0)<10