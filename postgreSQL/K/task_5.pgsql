SELECT sum(students_skips.skips_houre) AS skips_houre,students.std_name,students.surename,students.adres
FROM students_skips
INNER JOIN students ON students_skips.student_id = students.student_id
WHERE skips_houre>0 and skip_reason= 'неповажна'
GROUP BY students.student_id