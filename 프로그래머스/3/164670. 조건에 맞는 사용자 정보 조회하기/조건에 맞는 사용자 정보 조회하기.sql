-- 코드를 입력하세요
SELECT USER_ID,	NICKNAME, concat(CITY,' ', STREET_ADDRESS1,' ', STREET_ADDRESS2)as	'전체주소',	concat(left(TLNO,3), '-', mid(TLNO, 4,4),'-',right(TLNO,4)) as 전화번호
from USED_GOODS_USER u, (select WRITER_ID
                        from USED_GOODS_BOARD
                        group by WRITER_ID
                        having count(*)>=3) b
where u.USER_ID=b.WRITER_ID
order by USER_ID desc