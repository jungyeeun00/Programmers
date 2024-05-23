-- 코드를 입력하세요
SELECT APNT_NO,	p.PT_NAME,	p.PT_NO,	d.MCDP_CD,	DR_NAME,	APNT_YMD
from APPOINTMENT a join PATIENT p on a.PT_NO=p.PT_NO join DOCTOR d on d.DR_ID=a.MDDR_ID
where a.APNT_YMD like "%2022-04-13%" and a.APNT_CNCL_YN='N' and a.MCDP_CD='CS'
order by APNT_YMD