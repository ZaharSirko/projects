-- CREATE DATABASE kursova;

-- CREATE TABLE worker(
--     worker_id INTEGER PRIMARY KEY,
--     worker_name text NOT NULL,
--     worker_surename text NOT NULL,
--     worker_children Integer ,
--     worker_salary INTEGER NOT NULL,
--     worker_age INTEGER NOT NULL,
--     worker_exp INTEGER NOT NULL,
--     worker_chief text ,
--     worker_department INTEGER NOT NULL,
--     worker_gender text NOT NULL
-- );


-- CREATE TABLE  brigade_worker(
--    brigade_worker_id INTEGER PRIMARY KEY,
--     brigade_worker_name text NOT NULL,
--     brigade_worker_surename text NOT NULL,
--     brigade_worker_age INTEGER NOT NULL,
--     brigade_worker_salary INTEGER NOT NULL,
--    brigade_worker_department INTEGER NOT NULL
-- );

-- CREATE TABLE  locomotive_driver(
--     locomotive_driver_id INTEGER PRIMARY KEY,
--     locomotive_driver_name text NOT NULL,
--     locomotive_driver_surename text NOT NULL,
--     locomotive_driver_gender text NOT NULL,
--     locomotive_driver_salary INTEGER NOT NULL,
--     locomotive_driver_work_age INTEGER NOT NULL,
--     locomotive_driver_work_experience INTEGER NOT NULL,
--     locomotive_driver_medical_examination_2022 text NOT NULL,
--     locomotive_driver_medical_examination_2023 text NOT NULL
-- );

-- CREATE TABLE  locomotive(
--    locomotiveid INTEGER PRIMARY KEY,
--     locomotive_name text NOT NULL,
--     locomotive_age INTEGER NOT NULL,
--     locomotive_department INTEGER NOT NULL,
--     locomotive_completed_routes INTEGER NOT NULL,
--     locomotive_completed_routes_before_repair INTEGER NOT NULL
-- );

-- CREATE table routes(
--     routes_id INTEGER PRIMARY KEY,
--     routes_from text not null,
--     routes_direction text not null,
--     routes_to text not null
-- );

-- CREATE TABLE train(
--     train_id INTEGER PRIMARY KEY,
--     routes_id INTEGER not null,
--     train_name text NOT NULL,
--     routes_duration INTEGER NOT NULL,
--     routes_ticket_price INTEGER NOT NULL
-- );

-- CREATE TABLE  canceled_routes(
--     canceled_routes_id INTEGER PRIMARY KEY,
--     canceled_routes_type text,
--     routes_id INTEGER not null
-- );

-- CREATE TABLE  delayed_routes(
--     delayed_routes INTEGER PRIMARY KEY,
--     routes_id INTEGER not null,
--     delayed_routes_reason text NOT NULL
-- );

-- CREATE TABLE  sold_ticket(
--     routes_id INTEGER NOT NULL,
--     sold_ticket INTEGER PRIMARY KEY,
--     sold_ticket_hour INTEGER,
--     sold_ticket_week INTEGER,
--     sold_ticket_mounth INTEGER
-- );

-- CREATE TABLE  passengers(
--     routes_to text NOT NULL,
--     passengers_id INTEGER PRIMARY KEY,
--     passengers_name text NOT NULL,
--     passengers_surename  text NOT NULL,
--     passengers_gender text NOT NULL,
--     passengers_age INTEGER NOT NULL
-- );

-- CREATE TABLE  not_redeemed_tickets(
--     tickets_id INTEGER not null,
--     routes_id INTEGER not null,
--     not_redeemed_tickets_type text,
--     not_redeemed_tickets_count INTEGER NOT NULL
-- );

-- CREATE TABLE  redeemed_tickets(
--     tickets_id INTEGER not null,
--     routes_id INTEGER not null,
--     redeemed_tickets_type text,
--     redeemed_tickets_count INTEGER NOT NULL
-- );


-- ALTER TABLE sold_ticket ADD CONSTRAINT fk_sold_ticket FOREIGN
-- KEY(routes_id) REFERENCES routes(routes_id);

-- ALTER TABLE train ADD CONSTRAINT fk_train FOREIGN
-- KEY(routes_id) REFERENCES routes(routes_id);

-- ALTER TABLE canceled_routes ADD CONSTRAINT fk_canceled_routes FOREIGN
-- KEY(routes_id) REFERENCES routes(routes_id);

-- ALTER TABLE delayed_routes ADD CONSTRAINT fk_delayed_routes FOREIGN
-- KEY(routes_id) REFERENCES routes(routes_id);

-- ALTER TABLE not_redeemed_tickets ADD CONSTRAINT fk_not_redeemed_tickets FOREIGN
-- KEY(routes_id) REFERENCES routes(routes_id);

-- ALTER TABLE redeemed_tickets ADD CONSTRAINT fk_redeemed_tickets FOREIGN
-- KEY(routes_id) REFERENCES routes(routes_id);
