-- SELECT * FROM students,groups;

-- SELECT skips_time FROM students_skips WHERE skips_time > 6;

-- SELECT std_name, fk_group_id FROM students WHERE  fk_group_id >1; 

-- SELECT * FROM students WHERE  fk_group_id =5;

-- SELECT * FROM students WHERE  fk_group_id =5 OR  fk_group_id= 2;

-- SELECT * FROM students WHERE fk_group_id =1 AND student_id < 6;

-- SELECT * FROM groups, students WHERE group_id = 2 AND fk_group_id= 2;  

-- SELECT * FROM students WHERE fk_group_id >=3 AND fk_group_id <= 5;

-- SELECT * FROM groups, students WHERE (group_id>=2 AND group_id<4) AND 
-- (student_id>=2 AND student_id <= 4);  

-- SELECT * FROM groups,students WHERE groups.group_id = students.fk_group_id;

-- SELECT students.std_name FROM students WHERE std_name ='Іван';

-- SELECT avg(skips_time) AS avg_students_skips_houre FROM students_skips;

-- SELECT count(skips_time) FROM students_skips;

-- SELECT * FROM students WHERE std_name = 'Іван' OR std_name = 'Петро';

-- SELECT * FROM students_skips WHERE skips_time>2 ORDER BY skips_time;

-- SELECT * FROM students_skips WHERE skips_time>5 ORDER BY date DESC;

-- SELECT *FROM students WHERE fk_group_id BETWEEN 2 AND 4;

-- SELECT * FROM students WHERE student_id IN(1,3,6,7,12);

-- SELECT * FROM students WHERE student_id NOT IN(1,3,6,7,12);

