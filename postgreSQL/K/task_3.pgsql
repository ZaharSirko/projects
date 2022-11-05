SELECT groups.group_name, COUNT(*) AS Skip_times,extract (month FROM students_skips.date) AS "month" FROM students_skips
INNER JOIN students ON students_skips.student_id = students.student_id
INNER JOIN groups ON students.group_id = groups.group_id
WHERE 
(
(extract (month FROM students_skips.date) BETWEEN 9 AND 12 )
OR
(extract (month FROM students_skips.date) BETWEEN 2 AND 6)
)
AND
extract (month FROM students_skips.date)>=extract (month FROM current_date)
AND 
 skip_reason = 'неповажна'
GROUP BY groups.group_id,"month"