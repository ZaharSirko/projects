-- Вся таблиця
-- SELECT * FROM groups
-- INNER JOIN students ON students.group_id = groups.group_id
-- INNER JOIN students_skips ON students_skips.student_id = students.student_id
-- Запит

SELECT groups.group_name,
students.surename,
students.std_name,
students_skips.date,
students_skips.skips_houre,
students_skips.skip_reason,students.adres
FROM groups
JOIN students ON students.group_id = groups.group_id
JOIN students_skips ON students_skips.student_id = students.student_id