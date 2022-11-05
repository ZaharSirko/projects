SELECT groups.group_name,
students.surename,
students.std_name,
students_skips.date,
students_skips.skips_houre,
students_skips.skip_reason,
students.adres,
CASE
    WHEN students_skips.skip_reason  ='неповажна'
    THEN 'Порушник' END AS disturbers
FROM groups
INNER JOIN students ON students.group_id = groups.group_id
INNER JOIN students_skips ON students_skips.student_id = students.student_id
