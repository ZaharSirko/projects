-- CREATE DATABASE tour;

-- CREATE table route(
--  route_id INTEGER PRIMARY KEY,
--  route_name varchar(255) NOT NULL,
--  route_duration date NOT NULL,
--  route_max_number_of_people INTEGER NOT NULL
-- );

-- CREATE table client(
-- client_id INTEGER PRIMARY KEY,
-- client_name varchar(255) NOT NULL,
-- client_second_name varchar(255) NOT NULL,
-- client_phone_number varchar(255) NOT NULL
-- );

-- CREATE table booking(
-- booking_id INTEGER PRIMARY KEY,
-- client_id INTEGER NOT NULL REFERENCES client(client_id),
-- route_id INTEGER NOT NULL REFERENCES route(route_id),
-- booking_date date NOT NULL,
-- booking_status varchar(255) NOT NULL
-- );

-- CREATE table stats(
-- stats_id INTEGER PRIMARY KEY,
-- route_id INTEGER NOT NULL REFERENCES route(route_id),
-- stats_sales INTEGER NOT NULL,
-- stats_profit float NOT NULL,
-- stats_losses float NOT NULL
-- );

