-- -- Транзакція 1 Оновлення курса, рейтига і заліка
-- BEGIN;
-- UPDATE students SET std_course = std_course + 1 WHERE std_id = 1;
-- UPDATE exams SET rating = rating + 5 WHERE std_id = 1;
-- UPDATE credits SET credits_pass = 'залік' WHERE std_id = 1;
-- COMMIT;

-- -- Транзакція 2 Оновлення курса, рейтига і заліка
-- BEGIN;
-- UPDATE students SET std_course = std_course + 1 WHERE std_id = 2;
-- UPDATE exams SET rating = rating + 5 WHERE std_id = 2;
-- UPDATE credits SET credits_pass = 'залік' WHERE std_id = 2;
-- COMMIT;

-- -- Транзакція 3 Оновлення курса, рейтига і заліка
-- BEGIN;
-- UPDATE students SET std_course = std_course + 1 WHERE std_id = 3;
-- UPDATE exams SET rating = rating + 5 WHERE std_id = 3;
-- UPDATE credits SET credits_pass = 'залік' WHERE std_id = 3;
-- COMMIT;

-- -- Транзакція 4 Оновлення курса, рейтига і заліка
-- BEGIN;
-- UPDATE students SET std_course = std_course + 1 WHERE std_id = 4;
-- UPDATE exams SET rating = rating + 5 WHERE std_id = 4;
-- UPDATE credits SET credits_pass = 'залік' WHERE std_id = 4;
-- COMMIT;

-- -- Транзакція 5 Оновлення курса, рейтига і заліка
-- BEGIN; 
-- UPDATE students SET std_course = std_course + 1 WHERE std_id = 5;
-- UPDATE exams SET rating = rating + 5 WHERE std_id = 5;
-- UPDATE credits SET credits_pass = 'залік' WHERE std_id = 5;
-- COMMIT;
 
-- -- Транзакція 6 Оновлення курса, рейтига і заліка
-- BEGIN;
-- UPDATE students SET std_course = std_course + 1 WHERE std_id = 6;
-- UPDATE exams SET rating = rating + 5 WHERE std_id = 6;
-- UPDATE credits SET credits_pass = 'залік' WHERE std_id = 6;
-- COMMIT;

-- -- Транзакція 7 Оновлення групи всіх студентів
-- BEGIN;
-- UPDATE students SET std_group = 'БПС-13-3' WHERE std_id = 1;
-- UPDATE students SET std_group = 'БПС-13-3' WHERE std_id = 2;
-- UPDATE students SET std_group = 'БПС-13-3' WHERE std_id = 3;
-- UPDATE students SET std_group = 'БПС-13-3' WHERE std_id = 4;
-- UPDATE students SET std_group = 'БПС-13-3' WHERE std_id = 5;
-- UPDATE students SET std_group = 'БПС-13-3' WHERE std_id = 6;
-- COMMIT;

-- -- Транзакція 8 Оновлення рейтинга всіх студентів
-- BEGIN;
-- UPDATE exams SET rating = rating - 10 WHERE std_id = 1;
-- UPDATE exams SET rating = rating - 10 WHERE std_id = 2;
-- UPDATE exams SET rating = rating - 10 WHERE std_id = 3;
-- UPDATE exams SET rating = rating - 10 WHERE std_id = 4;
-- UPDATE exams SET rating = rating - 10 WHERE std_id = 5;
-- UPDATE exams SET rating = rating - 10 WHERE std_id = 6;
-- COMMIT;

-- Транзакція 9 Видалення студента
-- BEGIN;
-- DELETE FROM exams WHERE std_id = 1;
-- DELETE FROM credits WHERE std_id = 1;
-- DELETE FROM students WHERE std_id = 1;
-- COMMIT;

-- Транзакція 10 Видалення студента
-- BEGIN;
-- DELETE FROM exams WHERE std_id = 2;
-- DELETE FROM credits WHERE std_id = 2;
-- DELETE FROM students WHERE std_id = 2;
-- COMMIT;

SELECT * from students;
SELECT * from credits;
SELECT * from exams;

