-- ALTER TABLE students_skips
-- ALTER COLUMN skips_houre 
-- Set default 0

-- ALTER TABLE students_skips RENAME student_id TO s_id
-- ALTER TABLE students_skips RENAME s_id TO student_id

-- CREATE TEMP TABLE temp_skips AS (SELECT * FROM students_skips);
-- INSERT INTO temp_skips(student_id,skips_houre) values(20,100);
-- SELECT * FROM temp_skips

-- CREATE TEMP TABLE temp_skips AS (SELECT * FROM students_skips);
-- INSERT INTO temp_skips(student_id,skips_houre) values(20,100);
-- UPDATE temp_skips
-- SET skip_reason = 'неповажна'
-- WHERE student_id = 20;
-- SELECT * FROM temp_skips

-- CREATE TEMP TABLE temp_skips AS (SELECT * FROM students_skips);
-- INSERT INTO temp_skips(student_id,skips_houre) values(20,100);
-- DELETE
-- FROM temp_skips
-- WHERE student_id = 20;
-- SELECT * FROM temp_skips

-- CREATE TEMP TABLE temp_skips AS (SELECT * FROM students_skips);
-- INSERT INTO temp_skips(student_id,skips_houre) values(20,100);
-- UPDATE temp_skips
-- SET date = '2022-11-05'
-- WHERE student_id = 20;
-- SELECT * FROM temp_skips

-- CREATE TEMP TABLE temp_skips AS (SELECT * FROM students_skips);
-- INSERT INTO temp_skips(student_id,skips_houre) values(20,100);
-- UPDATE temp_skips
-- SET skips_houre = skips_houre * 0.8
-- WHERE skips_houre <10 AND skip_reason = 'поважна';
-- UPDATE temp_skips
-- Set skips_houre = round(skips_houre);
-- SELECT * FROM temp_skips