-- 코드를 입력하세요
SELECT concat('/home/grep/src/', f.BOARD_ID, '/', FILE_ID, FILE_NAME, FILE_EXT  ) as FILE_PATH
from  USED_GOODS_FILE f, (select BOARD_ID
                         from USED_GOODS_BOARD 
                         order by VIEWS desc
                         limit 1) b
where f.BOARD_ID=b.BOARD_ID
order by FILE_ID desc