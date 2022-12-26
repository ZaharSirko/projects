-- CREATE TEMP TABLE temp_skips AS (SELECT * FROM students_skips);
-- INSERT INTO temp_skips(student_id,skips_houre) values(20,100);
-- SELECT * FROM temp_skips

-- SELECT * FROM groups
-- INNER JOIN students ON students.group_id = groups.group_id
-- INNER JOIN students_skips ON students_skips.student_id = students.student_id

-- SELECT groups.group_name,
-- students.surename,
-- students.std_name
-- FROM groups
-- INNER JOIN students ON students.group_id = groups.group_id

-- SELECT groups.group_name,
-- students.surename,
-- students.std_name,
-- students.adres,
-- (SELECT sum(skips_houre) AS "Total_skip_houre" FROM students_skips
-- WHERE students.student_id=students_skips.student_id)
-- FROM groups
-- INNER JOIN students ON students.group_id = groups.group_id


-- CREATE TEMP TABLE temp_std AS
-- (SELECT *
-- FROM students);
-- INSERT INTO temp_std(student_id,std_name)
-- VALUES(20,
-- 'Кримський регіон');
-- SELECT *
-- FROM temp_std
-- LEFT JOIN groups ON temp_std.student_id=groups.group_id;

-- CREATE TEMP TABLE temp_group AS
-- (SELECT *
-- FROM groups);
-- INSERT INTO temp_group(group_id,group_name)
-- VALUES(6,
-- 'ІП-21-4');
-- SELECT *
-- FROM temp_group FULL
-- JOIN students
-- INNER JOIN students_skips ON students.student_id=students_skips.student_id
-- ON temp_group.group_id=students.student_id;

-- CREATE TEMP TABLE temp_group AS
-- (SELECT *
-- FROM groups);
-- INSERT INTO temp_group(group_id,group_name)
-- VALUES(6,
-- 'ІП-21-4');
-- SELECT *
-- FROM temp_group FULL
-- JOIN
-- (SELECT *
-- FROM students
-- INNER JOIN students_skips ON 
-- students.student_id = students_skips.student_id) 
-- new_tb ON
-- temp_group.group_id= new_tb.group_id;


CREATE TEMP TABLE temp_group AS
(SELECT *
FROM groups);
INSERT INTO temp_group(group_id,group_name)
VALUES(6,
'ІП-21-4');
CREATE TEMP TABLE temp_student AS
(SELECT *
FROM students);
INSERT INTO temp_student(student_id,group_id,std_name)
VALUES(20,
4,
'Анжрій');
SELECT *
FROM temp_group CROSS
JOIN temp_student ;