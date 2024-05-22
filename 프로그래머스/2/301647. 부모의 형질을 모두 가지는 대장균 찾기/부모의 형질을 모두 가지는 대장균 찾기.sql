-- 코드를 작성해주세요
select s.ID, s.GENOTYPE, p.GENOTYPE PARENT_GENOTYPE
from ECOLI_DATA s
join ECOLI_DATA p on s.PARENT_ID=p.ID
where s.GENOTYPE&p.GENOTYPE=p.GENOTYPE
order by s.ID