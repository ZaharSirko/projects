

-- INSERT INTO worker(worker_id,worker_surename,worker_name
-- ,worker_age,worker_gender,worker_children,worker_chief,worker_department
-- ,worker_exp,worker_salary) VALUES
-- (1,'Ніколайчук','Дибач',55,'Чоловіча',0,'+',1,13,7165),
-- (2,'Дворжицькі','Івантослав',36,'Чоловіча',0,'-',2,11,7573),
-- (3,'Хомич', 'Рід',57,'Чоловіча',3,'-',1,18,7516),
-- (4,'Шматько', 'Любим',43,'Чоловіча',1,'-',2,12,7474),
-- (5,'Татарнюк', 'Власт',55,'Чоловіча',2,'-',1,13,7489),
-- (6,'Гомонай', 'Цвітан',41,'Чоловіча',1,'-',2,12,7626),
-- (7,'Риндзак', 'Милодар',23,'Чоловіча',0,'-',1,40,7390),
-- (8,'Пінскер', 'Агапія',63,'Жіноча',4,'-',1,21,7019),
-- (9,'Югай', 'Зоя',29,'Жіноча',0,'+',2,10,7237),
-- (10,'Хаварівська', 'Йосифата',33,'Жіноча',4,'-',1,14,7008),
-- (11,'Даниш', 'Устина',33,'Жіноча',0,'-',2,13,7689),
-- (12,'Ярич', 'Радмила',44,'Жіноча',2,'-',1,28,7424),
-- (13,'Слабошпицька', 'Діана',46,'Жіноча',2,'-',2,20,7665),
-- (14,'Корчинська', 'Настя',28,'Жіноча',1,'-',1,10,6976);

-- INSERT into brigade_worker(brigade_worker_id,brigade_worker_surename,brigade_worker_name
-- ,brigade_worker_age,brigade_worker_department,brigade_worker_salary) VALUES
--     (1,'Маркусь', 'Давид',66,1,12126),
-- 	(2,'Миколаєнко', 'Лук`ян',41,1,12699),
-- 	(3,'Коритко', 'Олелько',52,2,12780),
-- 	(4,'Деркач', 'Щастислав',43,1,12638),
-- 	(5,'Цимбалюк', 'Євгеній',46,2,12294),
-- 	(6,'Бобрович', 'Щедриця',38,1,12116),
-- 	(7,'Калитовська', 'Щазина',80,2,12177),
-- 	(8,'Федько', 'Перемила',30,2,12454),
-- 	(9,'Кравчук', 'Цвітана',42,1,12298),
-- 	(10,'Ситенко', 'Шарлота',70,2,12549);

    -- INSERT INTO locomotive_driver(locomotive_driver_id,locomotive_driver_surename,locomotive_driver_name
    -- ,locomotive_driver_gender,locomotive_driver_work_experience,locomotive_driver_salary,
    -- locomotive_driver_medical_examination_2022,locomotive_driver_medical_examination_2023) VALUEs
	-- (1,'Устимович', 'Корнило', 'Чоловіча', 35, 12128,'+','+'),
	-- (2,'Куземський', 'Толигнів', 'Чоловіча', 30, 11812,'+','-'),
	-- (3,'Лукащук', 'Аркадій', 'Чоловіча', 59, 11037,'+','-'),
	-- (4,'Лисецька', 'Христя', 'Жіноча  ', 43, 10301,'+','-'),
	-- (5,'Жигалко', 'Щазина', 'Жіноча  ', 58, 11206,'+','+'),
	-- (6,'Компанець', 'Юліанія', 'Жіноча  ', 33, 11174,'+','-');

    -- INSERT INTO	locomotive(locomotiveid,locomotive_name,locomotive_age,locomotive_department,
    -- locomotive_completed_routes,locomotive_completed_routes_before_repair) VALUEs
    -- (1,'Pesa',19,2,5253,3838),
	-- (2,'ТЕМ2',29,2,5253,3030),
	-- (3,'АДМ 474',39,1,5253,3267),
	-- (4,'HRCS2',25,2,5253,2104),
	-- (5,'ВЛ80',32,1,5253,3588),
	-- (6,'ЧМЭ3',21,2,5253,3937),
	-- (7,'ДС3',27,1,5253,2222),
	-- (8,'ЧС-4',31,2,5253,1038),
	-- (9,'ЕД9',24,1,5253,3959),
	-- (10,'ЧС8',20,1,5253,1784);


-- INSERT into routes(routes_id,routes_from,routes_direction,routes_to) values
-- (1,'Івано-Франківськ','->','Львів'),
-- (2,'Івано-Франківськ','->','Одеса'),
-- (3,'Івано-Франківськ','->','Київ'),
-- (4,'Івано-Франківськ','->','Рахів'),
-- (5,'Івано-Франківськ','->','Дніпро'),
-- (6,'Івано-Франківськ','->','Харків'),
-- (7,'Івано-Франківськ','->','Костянтинівка'),
-- (8,'Івано-Франківськ','->','Полтава'),
-- (9,'Івано-Франківськ','->','Кременчук'),
-- (10,'Івано-Франківськ','->','Запоріжжя'),
-- (11,'Одеса','->','Вінниця'),
-- (12,'Одеса','->','Харків'),
-- (13,'Одеса','->','Дніпро'),
-- (14,'Київ','->','Ізмаїл'),
-- (15,'Київ','->','Вінниця'),
-- (16,'Київ','->','Харків'),
-- (17,'Київ','->','Рівне'),
-- (18,'Київ','->','Трускавець'),
-- (19,'Київ','->','Запоріжжя'),
-- (20,'Львів','->','Ізмаїл'),
-- (21,'Львів','->','Дніпро'),
-- (22,'Львів','->','Харків'),
-- (23,'Львів','->','Вінниця'),
-- (24,'Львів','->','Чернівці'),
-- (25,'Львів','->','Рівне'),
-- (26,'Львів','->','Ужгород'),
-- (27,'Дніпро','->','Івано-Франківськ'),
-- (28,'Дніпро','->','Київ'),
-- (29,'Дніпро','->','Одеса'),
-- (30,'Харків','->','Івано-Франківськ'),
-- (31,'Харків','->','Львів'),
-- (32,'Харків','->','Київ'),
-- (33,'Харків','->','Одеса'),
-- (34,'Вінниця','->','Київ'),
-- (35,'Вінниця','->','Одеса'),
-- (36,'Вінниця','->','Львів'),
-- (37,'Ізмаїл','->','Львів'),
-- (38,'Ізмаїл','->','Київ'),
-- (39,'Київ','->','Дніпро'),
-- (40,'Львів','->','Одеса'),
-- (41,'Львів','->','Івано-Франківськ'),
-- (42,'Львів','->','Київ'),
-- (43,'Київ','->','Львів'),
-- (44,'Київ','->','Одеса'),
-- (45,'Одеса','->','Київ'),
-- (46,'Одеса','->','Львів'),
-- (47,'Одеса','->','Франківськ'),
-- (48,'Київ','->','Дніпро');



-- insert into train(train_id,train_name,routes_id,routes_ticket_price,routes_duration) Values
-- (1,'Тясмин',1,97,2),
-- (2,'Чайка',1,116,3),
-- (3,'Пальміра',1,127,2),
-- (4,'Захар Беркут',1,101,1),
-- (5,'Дніпровець',2,168,14),
-- (6,'Молода Гвардія',2,180,15),
-- (7,'Гетьман Сагайдачний',2,159,13),
-- (8,'Промінь',2,177,14),
-- (9,'Київ',3,158,9),
-- (10,'Верховина',3,169,10),
-- (11,'Георгій Кірпа',3,143,11),
-- (12,'Мрія',3,162,9);


-- INSERT INTO delayed_routes(delayed_routes,routes_id,delayed_routes_reason) VALUES
-- 	(1,8,'Поломка'),
-- 	(2,25,'Поломка'),
-- 	(3,18,'Поломка'),
-- 	(4,19,'Аварія'),
-- 	(5,26,'Аварія'),
-- 	(6,9,'Аварія'),
-- 	(7,27,'Погодні умови'),
-- 	(8,20,'Погодні умови'),
-- 	(9,10,'Погодні умови');

-- INSERT INTO canceled_routes(canceled_routes_id,canceled_routes_type,routes_id) VALUES
-- 	(1,'Рейс',11),
-- 	(2,'Рейс',12),
-- 	(3,'Рейс',13) ,
-- 	(4,'Рейс',14),
-- 	(5,'Рейс',39),
-- 	(6,'Рейс',16),
-- 	(7,'Рейс',15),
-- 	(8,'Рейс',20),
-- 	(9,'Рейс',21),
-- 	(10,'Рейс',22),
-- 	(11,'Рейс',23),
-- 	(12,'Рейс',4),
-- 	(13,'Рейс',5),
-- 	(14,'Рейс',6),
-- 	(15,'Рейс',7),
-- 	(16,'Маршрут',27),
-- 	(17,'Маршрут',28),
-- 	(18,'Маршрут',29),
-- 	(19,'Маршрут',30),
-- 	(20,'Маршрут',31),
-- 	(21,'Маршрут',32),
-- 	(22,'Маршрут',33),
-- 	(23,'Маршрут',34),
-- 	(24,'Маршрут',35),
-- 	(25,'Маршрут',36),
-- 	(26,'Маршрут',37),
-- 	(27,'Маршрут',38);

-- INSERT into sold_ticket(sold_ticket,routes_id,sold_ticket_hour,sold_ticket_week,
-- sold_ticket_mounth) values
-- 	(1,1,2,10,172),
-- 	(2,3,4,18,193),
-- 	(3,2,4,20,449),
-- 	(4,40,5,25,447),
-- 	(5,41,5,19,155),
-- 	(6,42,6,41,167),
-- 	(7,44,5,48,207),
-- 	(8,43,1,40,147),
-- 	(9,45,3,33,146),
-- 	(10,46,0,37,180),
-- 	(11,47,3,41,191);

-- insert into not_redeemed_tickets(not_redeemed_tickets_type,routes_id,not_redeemed_tickets_count) values
--     ('Рейс',11,89),
-- 	('Рейс',12,91),
-- 	('Рейс',13,75),
-- 	('Рейс',14,66),
-- 	('Рейс',48,27),
-- 	('Рейс',16,90),
-- 	('Рейс',15,50),
-- 	('Рейс',19,59),
-- 	('Рейс',17,11),
-- 	('Рейс',18,58),
-- 	('Рейс',20,88),
-- 	('Рейс',21,99),
-- 	('Рейс',22,83),
-- 	('Рейс',23,46),
-- 	('Рейс',25,49),
-- 	('Рейс',26,51),
-- 	('Рейс',24,21),
-- 	('Рейс',4,34),
-- 	('Рейс',5,62),
-- 	('Рейс',6,42),
-- 	('Рейс',10,12),
-- 	('Рейс',8,33),
-- 	('Рейс',9,45),
-- 	('Рейс',7,92),
-- 	('Рейс',1,92),
-- 	('Рейс',3,92),
-- 	('Рейс',2,92),
-- 	('Маршрут',27,7),
-- 	('Маршрут',28,16),
-- 	('Маршрут',29,96),
-- 	('Маршрут',30,98),
-- 	('Маршрут',31,35),
-- 	('Маршрут',32,89),
-- 	('Маршрут',33,93),
-- 	('Маршрут',34,41),
-- 	('Маршрут',35,61),
-- 	('Маршрут',36,1),
-- 	('Маршрут',37,6),
-- 	('Маршрут',38,37);

-- insert into redeemed_tickets(redeemed_tickets_type,routes_id,redeemed_tickets_count) values
--     ('Рейс',11,75),
-- 	('Рейс',12 ,201),
-- 	('Рейс',13,200),
-- 	('Рейс',14,20), 
-- 	('Рейс',48,100),
-- 	('Рейс',16,251),
-- 	('Рейс',15,142),
-- 	('Рейс',19,122),
-- 	('Рейс',17,69),
-- 	('Рейс',18,40),
-- 	('Рейс',20,8),
-- 	('Рейс',21,53),
-- 	('Рейс',22,232),
-- 	('Рейс',23,69),
-- 	('Рейс',25,24),
-- 	('Рейс',26,91),
-- 	('Рейс',24,73),
-- 	('Рейс',4,115),
-- 	('Рейс',5,58),
-- 	('Рейс',6,140),
-- 	('Рейс',10,118),
-- 	('Рейс',8,58),
-- 	('Рейс',9,156),
-- 	('Рейс',7,99),
-- 	('Рейс',1,118),
-- 	('Рейс',3,62),
-- 	('Рейс',2,103),
-- 	('Маршрут',27,192),
-- 	('Маршрут',28,162),
-- 	('Маршрут',29,102),
-- 	('Маршрут',30,53),
-- 	('Маршрут',31,33),
-- 	('Маршрут',32,120),
-- 	('Маршрут',33,113),
-- 	('Маршрут',34,53),
-- 	('Маршрут',35,33),
-- 	('Маршрут',36,12),
-- 	('Маршрут',37,35),
-- 	('Маршрут',38,9);


    -- insert into passengers(passengers_id, passengers_surename,passengers_name,
    --  passengers_gender,passengers_age,routes_to) VALUES
    --  (1,'Глібовицький','Никифор','Чоловіча',24,'Івано-Франківськ'),
	--  (2,'Нагаєвський','Віродан ','Чоловіча',10,'Івано-Франківськ'),
	--  (3,'Черський','Пимін','Чоловіча',76,'Івано-Франківськ'),
	--  (4,'Коник','Назарій','Чоловіча',25,'Івано-Франківськ'),
	--  (5,'Смаль','Пребислав','Чоловіча',32,'Івано-Франківськ'),
	--  (6,'Циба','Жито','Чоловіча',55,'Івано-Франківськ'),
	--  (7,'Баліцький','Йошка','Чоловіча',40,'Івано-Франківськ'),
	--  (8,'Усик','Олесь','Чоловіча',34,'Івано-Франківськ'),
	--  (9,'Драк','Ходота','Чоловіча',49,'Івано-Франківськ'),
	--  (10,'Сопронюк','Фрол','Чоловіча',4,'Івано-Франківськ'),
	--  (12,'Шарко','Жанна','Жіноча',75,'Івано-Франківськ'),
	--  (13,'Покропивна','Ніка','Жіноча',52,'Івано-Франківськ'),
	--  (14,'Іляшенко','Йосипа','Жіноча',30,'Івано-Франківськ'),
	--  (15,'Бугайчук','Устина','Жіноча',63,'Івано-Франківськ'),
	--  (16,'Федина','Вікторина','Жіноча',27,'Івано-Франківськ'),
	--  (17,'Кошова','Йосифата','Жіноча',23,'Івано-Франківськ'),
	--  (18,'Антонич','Таїса','Жіноча',57,'Івано-Франківськ'),
	--  (19,'Фіґоль','Леля','Жіноча',28,'Івано-Франківськ'),
	--  (20,'Вакалюк','Йосипа','Жіноча',69,'Івано-Франківськ'),
	--  (21,'Михайленко','Єпистимія','Жіноча',36,'Івано-Франківськ'),
	--  (22,'Анищенко','Улита','Жіноча',30,'Івано-Франківськ'),
	--  (23,'Іконников','Юхимія','Жіноча',42,'Івано-Франківськ'),
	--  (24,'Вітенко','Белла','Жіноча',12,'Івано-Франківськ'),
	--  (25,'Гупало','Ніка','Жіноча',52,'Івано-Франківськ'),
	--  (26,'Чорней','Інна','Жіноча',3,'Львів'),
	--  (27,'Боговін','Ірина','Жіноча',63,'Львів'),
	--  (28,'Шандро','Артеміса','Жіноча',32,'Львів'),
	--  (29,'Ющук','Йовілла','Жіноча',54,'Львів'),
	--  (30,'Щур','Йовілла','Жіноча',61,'Львів'),
	--  (31,'Бобошко','Щавелина','Жіноча',34,'Львів'),
	--  (32,'Куйбіда','Шанетта','Жіноча',12,'Львів'),
	--  (33,'Григоренко','Агрипина','Жіноча',76,'Львів'),
	--  (34,'Миколюк','Ліна','Жіноча',85,'Львів'),
	--  (35,'Бузько','Елла','Жіноча',13,'Львів'),
	--  (36,'Арсенич','Альбертина','Жіноча',65,'Львів'),
	--  (37,'Романович','Хотимир','Чоловіча',33,'Львів'),
	--  (38,'Безуглий','Устим','Чоловіча',22,'Львів'),
	--  (39,'Стойко','Юлій','Чоловіча',76,'Львів'),
	--  (40,'Цибулько','Йосип','Чоловіча',6,'Львів'),
	--  (41,'Коструба','Федір','Чоловіча',15,'Львів'),
	--  (42,'Модзалевський','Іван','Чоловіча',26,'Львів'),
	--  (43,'Гапоненко','Арсен','Чоловіча',31,'Львів'),
	--  (44,'Воловик','Зорегляд','Чоловіча',34,'Львів'),
	--  (45,'Костюченко','Квітан','Чоловіча',26,'Львів'),
	--  (46,'Дупленко','Зорян','Чоловіча',36,'Львів'),
	--  (47,'Макотер','Євстафій','Чоловіча',19,'Львів'),
	--  (48,'абаненко','Анісій','Чоловіча',25,'Львів'),
	--  (49,'Загацький','Боян','Чоловіча',11,'Львів'),
	--  (50,'Дриженко','Йонас','Чоловіча',12,'Київ'),
	--  (51,'Шарко','Юрій','Чоловіча',37,'Київ'),
	--  (52,'Кришталь','Вишезор','Чоловіча',65,'Київ'),
	--  (53,'Яременко','Милослав','Чоловіча',15,'Київ'),
	--  (54,'Кусень','Велемир','Чоловіча',23,'Київ'),
	--  (55,'Зятик','Юхим','Чоловіча',15,'Київ'),
	--  (56,'Бойчук','Яровит','Чоловіча',18,'Київ'),
	--  (57,'Волошенюк','Шарль','Чоловіча',18,'Київ'),
	--  (58,'Білоконь','Соловей','Чоловіча',81,'Київ'),
	--  (59,'Соколовський','Стоймир','Чоловіча',22,'Київ'),
	--  (60,'Леманський','Зореслав','Чоловіча',31,'Київ'),
	--  (61,'Князевич','Фрол','Чоловіча',64,'Київ'),
	--  (62,'Василик','Чеслав','Чоловіча',11,'Київ'),
	--  (63,'Федецький','Цвітан','Чоловіча',26,'Київ'),
	--  (64,'Івко','Толигнів','Чоловіча',33,'Київ'),
	--  (65,'Романенко','Первушко','Чоловіча',64,'Київ'),
	--  (66,'Затуливітер','Кора','Жіноча',51,'Київ'),
	--  (67,'Кондратович','Тава','Жіноча',47,'Київ'),
	--  (68,'Біденко','Ярослава','Жіноча',39,'Київ'),
	--  (69,'Таланчук','Юдиф','Жіноча',30,'Київ'),
	--  (70,'Білоусько','Шарлота','Жіноча',50,'Київ'),
	--  (71,'Білоусько','Шарлота','Жіноча',33,'Київ'),
	--  (72,'Майборода','Нонна','Жіноча',27,'Київ'),
	--  (73,'Безкоровайний','Тіна','Жіноча',89,'Київ'),
	--  (74,'Артимович','Юхимія','Жіноча',90,'Одеса'),
	--  (75,'Іллєнко','Ася','Жіноча',37,'Одеса'),
	--  (76,'Осадча','Юдит','Жіноча',12,'Одеса'),
	--  (77,'Говера','Чеслава','Жіноча',15,'Одеса'),
	--  (78,'Дмитриченко','Чеслава','Жіноча',23,'Одеса'),
	--  (79,'Томків','Олена','Жіноча',15,'Одеса'),
	--  (80,'Маньковська','Ніка','Жіноча  ',18,'Одеса'),
	--  (81,'Князевич','Рідна','Жіноча',18,'Одеса'),
	--  (82,'Бойчук','Йосифата','Жіноча',23,'Одеса'),
	--  (83,'Овдієнко','Павлина','Жіноча',22,'Одеса'),
	--  (84,'Світлицька','Позвізда','Жіноча',31,'Одеса'),
	--  (85,'Згурська','Юхимія','Жіноча',51,'Одеса'),
	--  (86,'Наливайко','Магадара','Жіноча',11,'Одеса'),
	--  (87,'Босенко','Богуслава','Жіноча',26,'Одеса'),
	--  (88,'Свашенко','Казимира','Жіноча',33,'Одеса'),
	--  (89,'Щоголова','Чеслава','Жіноча',64,'Одеса'),
	--  (90,'Греба','Чеслава','Жіноча',71,'Одеса'),
	--  (91,'Мацієвич','Оримир','Чоловіча',47,'Одеса'),
	--  (92,'Макар','Каленик','Чоловіча',39,'Одеса'),
	--  (93,'Чаленко','Йошка','Чоловіча',30,'Одеса'),
	--  (94,'Жарко','Щастислав','Чоловіча',50,'Одеса'),
	--  (95,'Суходуб','Світовид','Чоловіча',27,'Одеса'),
	--  (96,'Андрухович','Здоровега','Чоловіча',18,'Одеса'),
	--  (97,'Домбровський','Йошка','Чоловіча',24,'Одеса');

-- DELETE FROM sold_ticket;

-- SELECT * From routes