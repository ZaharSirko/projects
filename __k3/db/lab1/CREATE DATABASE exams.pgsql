-- CREATE DATABASE exams
-- DROP database exams

-- CREATE TABLE students(
--     std_id INTEGER PRIMARY KEY,
--     std_name varchar(80) NOT NULL,
--     std_course INTEGER NOT NULL,
--     std_group varchar(80) NOT NULL
-- );

-- CREATE TABLE disciplines(
--     discipline_id INTEGER PRIMARY KEY,
--     discipline_name varchar(80) NOT NULL
-- );


-- CREATE TABLE exams(
--     std_id INTEGER  NOT NULL,
--     discipline_id INTEGER  NOT NULL,
--     rating INTEGER NOT NULL ,
--     date date  NOT NULL
-- );

-- CREATE TABLE credits(
--     std_id INTEGER  NOT NULL,
--     discipline_id INTEGER  NOT NULL,
--     credits_pass text NOT NULL,
--     date date  NOT NULL
-- );

-- ALTER TABLE exams ADD CONSTRAINT fk_exams FOREIGN
-- KEY(std_id) REFERENCES students(std_id);

-- ALTER TABLE exams ADD CONSTRAINT fk_exams_disc FOREIGN
-- KEY(discipline_id) REFERENCES disciplines(discipline_id);

-- ALTER TABLE credits ADD CONSTRAINT fk_credits FOREIGN
-- KEY(std_id) REFERENCES students(std_id);

-- ALTER TABLE credits ADD CONSTRAINT fk_credits_disc FOREIGN
-- KEY(discipline_id) REFERENCES disciplines(discipline_id);

