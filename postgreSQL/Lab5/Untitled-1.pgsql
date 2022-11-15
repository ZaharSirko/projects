-- SELECT max(skips_houre) from students_skips

-- SELECT current_timestamp AS time,'current_time' AS Detal
-- UNION ALL
-- SELECT localtimestamp,'localtime'


-- SELECT student_id,skips_houre from students_skips
-- WHERE skips_houre>5

-- SELECT max(skips_houre)/min(skips_houre) as max_div_min  from students_skips

-- SELECT group_name,std_name,surename from groups
-- INNER JOIN students on groups.group_id = students.group_id

-- SELECT skips_houre,date from students_skips
-- WHERE EXTRACT(YEAR from CURRENT_DATE)-1  = EXTRACT(YEAR FROM date)
 
--  SELECT SQRT(ABS(LN(exp(9))))

-- SELECT avg(skips_houre) as avg_skip_hore from students_skips

-- SELECT min(date) as min_date from students_skips

-- SELECT EXTRACT(DAY FROM CURRENT_DATE) AS day_week ,
-- EXTRACT(MONTH FROM CURRENT_DATE) AS current_month,
-- EXTRACT(YEAR FROM CURRENT_DATE) AS current_year,
-- EXTRACT(DaY FROM CURRENT_DATE) AS day_of_year;


-- SELECT age(timestamp '1994-12-23') AS my_current_age;


-- SELECT avg(skips_houre) >6 as avg_skip_hore from students_skips

-- SELECT now()AS current_date;

-- SELECT *
-- FROM students_skips
-- WHERE EXTRACT(QUARTER FROM date)=4
-- AND EXTRACT(YEAR FROM date)=EXTRACT(YEAR FROM CURRENT_DATE)-1;

-- SELECT info.std_name,info.surename,info.skips_houre from (students
-- JOIN students_skips on students.student_id = students_skips.student_id )as info 

-- SELECT student_id,skips_houre,skip_reason, date_part('year',date) as YEAR from students_skips
