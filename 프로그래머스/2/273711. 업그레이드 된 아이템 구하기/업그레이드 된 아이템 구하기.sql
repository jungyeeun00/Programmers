-- 코드를 작성해주세요
select ITEM_ID, ITEM_NAME, RARITY
from ITEM_INFO
where ITEM_ID in (select t.ITEM_ID
                 from ITEM_INFO i, ITEM_TREE t
                 where i.ITEM_ID=t.PARENT_ITEM_ID and i.RARITY='RARE')
order by ITEM_ID desc
