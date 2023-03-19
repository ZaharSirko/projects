SELECT groups.group_name,
students.surename,
students.std_name,
students.adres,
(SELECT sum(skips_houre) AS "Total_skip_houre" FROM students_skips
WHERE students.student_id=students_skips.student_id),
(SELECT
CASE
WHEN count(skip_reason)>0
THEN 'Порушник' END AS "disturbers"
FROM students_skips
WHERE students.student_id=students_skips.student_id
AND skip_reason='неповажна')
FROM groups
INNER JOIN students ON students.group_id = groups.group_id
