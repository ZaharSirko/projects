-- SELECT sum(CASE WHEN skips_houre>5 THEN skips_houre ELSE 0 END) AS "Сума пропущених годин більші за 5",
-- sum(CASE WHEN skips_houre>5 THEN 1 ELSE 0 END) AS "Кількість",
-- sum(CASE WHEN skips_houre<5 THEN skips_houre ELSE 0 END) AS "Сума пропущених годин менші за 5",
-- sum(CASE WHEN skips_houre<5 THEN 1 ELSE 0 END) AS "Кількість",
-- EXTRACT(YEAR FROM CURRENT_DATE)-1 AS "Рік" 
-- FROM students_skips
-- WHERE EXTRACT(YEAR FROM date)=EXTRACT(YEAR FROM CURRENT_DATE)-1;


-- SELECT (CASE
-- WHEN temp_table.avg_skip_houre BETWEEN 0 AND 2 THEN
-- temp_table.std_name
-- ELSE '---'
-- END) AS "0-2",
-- (CASE WHEN temp_table.avg_skip_houre BETWEEN 3 AND 4 THEN
-- temp_table.std_name
-- ELSE '---'
-- END)AS "3-4",
-- (CASE WHEN temp_table.avg_skip_houre BETWEEN 5 AND 6 THEN
-- temp_table.std_name
-- ELSE '---'
-- END)AS "5-6"
-- FROM
-- (SELECT std_name, avg(skips_houre) AS "avg_skip_houre"
-- FROM students_skips
-- INNER JOIN students ON students_skips.student_id=students.student_id
-- GROUP BY std_name) AS temp_table


-- SELECT std_name, adres FROM students
-- WHERE student_id = ANY
-- (SELECT student_id FROM students_skips
-- WHERE EXTRACT(MONTH FROM date)=EXTRACT(MONTH FROM CURRENT_DATE)-1)

-- SELECT std_name, adres FROM students
-- WHERE student_id> ANY
-- (SELECT student_id 
-- FROM students_skips
-- WHERE (EXTRACT(MONTH FROM date)=EXTRACT(MONTH FROM CURRENT_DATE)-1)
-- AND 
-- (EXTRACT(YEAR FROM date)=EXTRACT(YEAR FROM CURRENT_DATE)-1))

-- SELECT std_name, surename, max(skips_houre) FROM students_skips
-- INNER JOIN students ON students.student_id=students_skips.student_id
-- WHERE skips_houre = ANY
-- (SELECT max(skips_houre) FROM students_skips
-- INNER JOIN students ON students.student_id=students_skips.student_id
-- )
-- GROUP BY std_name, surename


-- SELECT std_name, surename FROM students_skips
-- INNER JOIN students ON students.student_id=students_skips.student_id
-- WHERE date > ALL
-- (SELECT date
-- FROM students_skips
-- INNER JOIN students ON students.student_id=students_skips.student_id
-- WHERE std_name='Степан');


-- SELECT std_name, surename FROM students_skips
-- INNER JOIN students ON students.student_id=students_skips.student_id
-- WHERE not date <= ALL
-- (SELECT date
-- FROM students_skips
-- INNER JOIN students ON students.student_id=students_skips.student_id
-- WHERE std_name='Степан');


-- SELECT std_name, adres
-- FROM students AS a
-- WHERE EXISTS
-- (SELECT * FROM students_skips AS b
-- WHERE a.student_id = b.student_id
-- AND EXTRACT(MONTH FROM date)=EXTRACT(MONTH FROM CURRENT_DATE)-1)


-- SELECT * FROM students AS a
-- WHERE '2021-10-19' IN
-- (SELECT date
-- FROM students_skips AS b
--  WHERE a.student_id = b.student_id)

-- SELECT std_name, surename, adres, date, skips_houre
-- FROM students, students_skips AS a
-- WHERE students.student_id=a.student_id
-- AND 
-- skips_houre = (SELECT max(skips_houre) FROM students_skips AS b
-- WHERE a.student_id=b.student_id)

-- SELECT group_name FROM groups AS a
-- WHERE EXISTS
-- (SELECT * FROM students AS b
-- WHERE a.group_id=b.group_id
-- AND 3< 
-- (SELECT count(*) FROM students_skips 
-- WHERE students_skips.student_id=b.student_id))