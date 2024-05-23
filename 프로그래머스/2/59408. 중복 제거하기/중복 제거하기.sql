-- 코드를 입력하세요
# SELECT count(DISTINCT NAME) as 'COUNT'
# from ANIMAL_INS
# where NAME is not null


select count(distinct name) count
from ANIMAL_INS 
where NAME is not null
