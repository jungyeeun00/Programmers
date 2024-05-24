-- 코드를 입력하세요
# SELECT MONTH(START_DATE) as MONTH, CAR_ID, count(*) RECORDS
# from CAR_RENTAL_COMPANY_RENTAL_HISTORY
# where MONTH(START_DATE) between 8 and 10 and CAR_ID in (select CAR_ID
#                                                        from CAR_RENTAL_COMPANY_RENTAL_HISTORY
#                                                        where MONTH(START_DATE) between 8 and 10
#                                                        group by CAR_ID
#                                                        having count(*)>=5)
# group by CAR_ID, MONTH
# order by MONTH, CAR_ID desc

select month(START_DATE) MONTH,	CAR_ID,	count(*) RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
where year(START_DATE)=2022 and month(START_DATE) between 8 and 10
        and CAR_ID in (select CAR_ID
                      from CAR_RENTAL_COMPANY_RENTAL_HISTORY
                      where year(START_DATE)=2022 and month(START_DATE) between 8 and 10
                      group by CAR_ID
                      having count(*)>=5)
group by CAR_ID, MONTH
order by MONTH, CAR_ID desc