-- 코드를 입력하세요
select f.FLAVOR
from FIRST_HALF f join (select FLAVOR, sum(TOTAL_ORDER) as july_total_order
                       from JULY
                       group by FLAVOR) j
                on f.FLAVOR=j.FLAVOR
order by f.TOTAL_ORDER+j.july_total_order desc
limit 3