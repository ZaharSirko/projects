-- select student_id, sum(skips_houre) from students_skips
-- WHERE date not in (SELECT date from students_skips WHERE skips_houre>2)
-- GROUP by student_id
-- ORDER by student_id

-- SELECT std_name,
-- (SELECT sum(skips_houre) as "Total_skip_houre" FROM students_skips
-- WHERE students.student_id=students_skips.student_id),
-- (SELECT count(*) FROM students_skips 
-- WHERE students.student_id=students_skips.student_id) as "Days" FROM students

-- SELECT group_name,(SELECT count(*) from students 
-- WHERE groups.group_id = students.group_id) as "Total_member_in_groups"
-- From groups

-- SELECT temp_table.std_name, temp_table.adres FROM
-- (SELECT student_id, surename, std_name, adres FROM students
-- WHERE students.std_name LIKE '%в%') AS temp_table

-- SELECT date,AVG(skips_houre)
-- FROM students_skips
-- GROUP by date
-- ORDER by date

-- SELECT date_part('day',date),sum(skips_houre) as "Total_skip_hour"
-- FROM students_skips
-- WHERE EXTRACT(DAY from date) BETWEEN 
-- EXTRACT(DAY from (SELECT  min (date) from students_skips)) and 20
-- GROUP BY date

-- SELECT student_id, date_part('day',date),skips_houre
-- FROM students_skips
-- WHERE skips_houre > 4 and student_id not in 
-- (SELECT student_id from students_skips WHERE skips_houre< 4)

-- SELECT * FROM (SELECT surename , std_name, adres FROM students 
-- where adres like 'г%') as temp_table
-- WHERE temp_table.std_name like 'С%'


-- SELECT  table_2.student_id AS "Student_id"
--        ,table_2.period_1 AS "DAY 0 - 15" 
--        ,table_1.period_2 AS "DAY 15-30" 
--        FROM
-- (SELECT student_id, sum(skips_houre) AS period_1 FROM students_skips
-- WHERE EXTRACT (DAY FROM date) BETWEEN 0 AND 15
-- GROUP BY student_id) AS table_2
-- LEFT JOIN
-- (SELECT student_id, sum(skips_houre) AS period_2 FROM students_skips
-- WHERE EXTRACT (DAY FROM date) BETWEEN 15 AND 30
-- GROUP BY student_id) AS table_1 ON table_1.student_id=table_2.student_id
-- ORDER BY table_2.student_id;


-- SELECT  table_2.student_id AS "Student_id"
--        ,table_2.period_1 AS "DAY 0 - 15" 
--        ,table_1.period_2 AS "DAY 15-30" 
--        FROM
-- (SELECT student_id, sum(skips_houre) AS period_1
-- FROM students_skips
-- WHERE EXTRACT (DAY FROM date) BETWEEN 0 AND 15
-- GROUP BY student_id) AS table_2
-- LEFT JOIN
-- (SELECT student_id, sum(skips_houre) AS period_2
-- FROM students_skips
-- WHERE EXTRACT (DAY FROM date) BETWEEN 15 AND 30
-- GROUP BY student_id) AS table_1 
-- USING(student_id) 
-- ORDER BY table_2.student_id;


