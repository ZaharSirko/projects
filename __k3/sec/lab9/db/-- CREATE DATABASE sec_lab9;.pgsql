-- CREATE DATABASE sec_lab9;

-- CREATE TABLE role(
--  role_id INTEGER PRIMARY KEY,
--  role_name varchar(80) NOT NULL
-- );

-- CREATE TABLE users(
--  users_id INTEGER PRIMARY KEY,
--  role_id INTEGER NOT NULL,
--  users_name varchar(80) NOT NULL,
--  users_password varchar(80) NOT NULL
-- );

-- ALTER TABLE users ADD CONSTRAINT fk_users FOREIGN
-- KEY(role_id) REFERENCES role(role_id);

-- INSERT into role(role_id,role_name) values
-- (1,'Admin'),
-- (2,'User');

-- INSERT into users(users_id,role_id,users_name,users_password) values
-- (1,1,'admin','admin123'),
-- (2,2,'user','user123');



-- DROP table users