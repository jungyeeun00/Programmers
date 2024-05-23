-- 코드를 입력하세요
SELECT YEAR(SALES_DATE) YEAR, MONTH(SALES_DATE)	MONTH,	GENDER,	count(distinct i.USER_ID) USERS
from USER_INFO i join ONLINE_SALE o on i.USER_ID=o.USER_ID
where i.GENDER is not null
group by YEAR, MONTH, GENDER
order by YEAR, MONTH, GENDER