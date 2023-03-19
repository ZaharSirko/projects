SELECT groups.group_name, COUNT(*) AS "Skip_times", extract (YEAR FROM students_skips.date) AS "YEAR" 
FROM students_skips
INNER JOIN students ON students_skips.student_id = students.student_id
INNER JOIN groups ON students.group_id = groups.group_id
WHERE 
 groups.group_name = 'ІП-21-1'
 AND
 extract (YEAR FROM students_skips.date)>=  extract (YEAR FROM CURRENT_DATE)-5
GROUP BY groups.group_id,"YEAR"
