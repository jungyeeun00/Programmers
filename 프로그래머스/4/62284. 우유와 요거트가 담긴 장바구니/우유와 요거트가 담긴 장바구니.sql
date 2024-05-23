-- 코드를 입력하세요
SELECT A.CART_ID
from (select CART_ID from CART_PRODUCTS where name='Milk') A
join  (select CART_ID from CART_PRODUCTS where name='Yogurt') B on A.CART_ID=B.CART_ID
order by A.CART_ID