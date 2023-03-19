-- SELECT * From students_skips
-- WHERE skips_houre > 3
-- ORDER BY skips_houre DESC

-- SELECT students.surename,students.std_name,sum(students_skips.skips_houre) as "Total_skips_houre" 
-- From students_skips
-- INNER JOIN students on students.student_id = students_skips.student_id
-- GROUP BY students.student_id
-- ORDER BY students.surename

-- SELECT sum(students_skips.skips_houre) as "Total_skips_houre", date From students_skips
-- GROUP by date
-- ORDER by date


-- SELECT student_id, skips_houre , date From students_skips
-- WHERE EXTRACT(DAY FROM date)=date_part('day',now())-15
-- AND EXTRACT(DAY FROM date) NOT IN (10,11) 
-- ORDER BY date DESC OFFSET 2 

-- SELECT * FROM students_skips
-- WHERE EXTRACT(Day FROM date) = 13 and EXTRACT(YEAR FROM date) = 2021
-- ORDER by skips_houre
-- LIMIT 4

-- SELECT * FROM students_skips
-- WHERE skips_houre >0
-- ORDER by skips_houre  DESC
-- LIMIT 5;

-- SELECT std_name,surename FROM students
-- WHERE std_name LIKE 'Ф%'

-- SELECT std_name,surename FROM students
-- WHERE std_name NOT LIKE 'А%'

-- SELECT std_name,surename FROM students
-- WHERE surename LIKE '%енк%'

-- Запит 10

-- SELECT count(surename) FROM students
-- WHERE surename LIKE '%енк%'


-- SELECT std_name,surename FROM students
-- WHERE surename LIKE '____енко'

-- SELECT std_name,surename FROM students
-- WHERE surename LIKE '%ор%'

-- SELECT std_name,surename FROM students
-- WHERE surename LIKE '%ер%'

-- SELECT std_name,surename FROM students
-- WHERE surename LIKE 'С%о'

-- SELECT group_id, std_name,surename FROM students
-- WHERE group_id > 2
-- and surename LIKE 'С%о'

-- SELECT * FROM students_skips
-- ORDER BY students_skips.skip_reason NULLS FIRST

-- SELECT * FROM students_skips
-- ORDER BY students_skips.skip_reason NULLS LAST

-- SELECT student_id,skips_houre,date_part('year',students_skips.date) 
-- FROM students_skips

-- SELECT std_name,surename FROM students
-- WHERE surename LIKE '____енко'
-- ORDER by surename DESC