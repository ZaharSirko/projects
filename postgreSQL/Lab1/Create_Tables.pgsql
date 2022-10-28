
CREATE TABLE groups(
   group_id INTEGER PRIMARY KEY ,
   group_name varchar(80) NOT NULL
);

CREATE TABLE students(
    fk_group_id INTEGER NOT NULL,
    student_id INTEGER  PRIMARY KEY ,
    surename varchar(80) NOT NUL
    std_name varchar(80) NOT NULL,
    adres varchar(80) NOT NULL
);

CREATE TABLE students_skips(
    fk_student_id INTEGER NOT NULL,
    skips_time FLOAT,
    skip_reason varchar(80),
    date date NOT NULL
);

ALTER TABLE students ADD CONSTRAINT fk_students FOREIGN
KEY(fk_group_id) REFERENCES groups(group_id)

ALTER TABLE students_skips ADD CONSTRAINT fk_students_skips FOREIGN
KEY(fk_student_id) REFERENCES students(student_id)


CREATE TABLE groups(
   group_id INTEGER PRIMARY KEY ,
   group_name varchar(80) NOT NULL
);

CREATE TABLE students(
    fk_group_id INTEGER NOT NULL,
    student_id INTEGER  PRIMARY KEY ,
    surename varchar(80) NOT NUL
    std_name varchar(80) NOT NULL,
    adres varchar(80) NOT NULL
);

CREATE TABLE students_skips(
    fk_student_id INTEGER NOT NULL,
    skips_time FLOAT,
    skip_reason varchar(80),
    date date NOT NULL
);

ALTER TABLE students ADD CONSTRAINT fk_students FOREIGN
KEY(fk_group_id) REFERENCES groups(group_id)

ALTER TABLE students_skips ADD CONSTRAINT fk_students_skips FOREIGN
KEY(fk_student_id) REFERENCES students(student_id
