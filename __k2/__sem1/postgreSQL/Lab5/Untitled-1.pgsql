-- SELECT max(skips_houre) from students_skips

-- SELECT current_timestamp AS time,'current_time' AS Detal
-- UNION ALL
-- SELECT localtimestamp,'localtime'


-- SELECT student_id,min(skips_houre) from students_skips
-- GROUP BY student_id
-- ORDER BY student_id

-- SELECT max(skips_houre)/min(skips_houre) as max_div_min  from students_skips

-- SELECT group_name as Group,std_name as Name,surename from groups as gr
-- INNER JOIN students as std on gr.group_id = std.group_id

-- SELECT skips_houre,date from students_skips
-- WHERE EXTRACT(YEAR from CURRENT_DATE)-1  = EXTRACT(YEAR FROM date)
 
--  SELECT SQRT(ABS(LN(exp(9))))    

-- SELECT avg(skips_houre) as avg_skip_houre from students_skips

-- SELECT min(date) as min_date from students_skips

-- SELECT EXTRACT(WEEK FROM CURRENT_DATE) AS week ,
-- EXTRACT(MONTH FROM CURRENT_DATE) AS current_month,
-- EXTRACT(YEAR FROM CURRENT_DATE) AS current_year,
-- EXTRACT(DaY FROM CURRENT_DATE) AS day_of_year;


-- SELECT age(timestamp '1994-12-23') AS my_current_age;


-- SELECT avg(skips_houre) >6 as avg_skip_houre from students_skips

-- SELECT now()AS current_date;

-- SELECT *
-- FROM students_skips
-- WHERE EXTRACT(QUARTER FROM date)=4
-- AND EXTRACT(YEAR FROM date)=EXTRACT(YEAR FROM CURRENT_DATE)-1;

-- SELECT info.std_name,info.surename,sum(skips_houre) from (students
-- JOIN students_skips on students.student_id = students_skips.student_id )as info
-- GROUP by info.std_name,info.surename

-- SELECT student_id,skips_houre,skip_reason, date_part('day',date) as day from students_skips
