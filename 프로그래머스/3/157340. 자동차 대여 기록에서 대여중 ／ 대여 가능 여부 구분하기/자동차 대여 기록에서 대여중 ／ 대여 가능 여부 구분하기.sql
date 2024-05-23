-- 코드를 입력하세요
# SELECT CAR_ID, 
#     max(case 
#         when '2022-10-16' between date_format(START_DATE, '%Y-%m-%d') and date_format(END_DATE,'%Y-%m-%d') then '대여중' 
#         else '대여가능' 
#         end) as AVAILABILITY
# from CAR_RENTAL_COMPANY_RENTAL_HISTORY
# group by CAR_ID
# order by CAR_ID desc

SELECT CAR_ID,
    MAX(CASE
        WHEN '2022-10-16' BETWEEN DATE_FORMAT(START_DATE, '%Y-%m-%d') AND DATE_FORMAT(END_DATE, '%Y-%m-%d') THEN '대여중'
    ELSE '대여 가능'
    END) AS AVAILABILITY FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY 
GROUP BY CAR_ID
ORDER BY CAR_ID DESC
