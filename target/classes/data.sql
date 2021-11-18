DROP TABLE IF EXISTS customer;
DROP TABLE IF EXISTS address;

CREATE TABLE customer(
  id_customer VARCHAR(255) NOT NULL PRIMARY KEY,
  name VARCHAR(255),
  last_name VARCHAR(255),
  document_type VARCHAR(10),
  document_number BIGINT,
  email VARCHAR(255),
  phone VARCHAR(255)
);

CREATE TABLE address(
  id_address VARCHAR(255) NOT NULL PRIMARY KEY,
  city VARCHAR(255),
  street VARCHAR(255),
  street_number INT,
  floor_number INT,
  flat VARCHAR(255),
  id_customer VARCHAR(255)
);

insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('675a990d-6ed6-425c-8afe-6fd7a507b77a', 'Jarred', 'Antoszczyk', 'DNI', 51762912, 'jantoszczyk0@eepurl.com', '844-424-1701');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('5cb7271b-bbdf-4ee2-850b-d7a41211c5ba', 'Constantia', 'MacVicar', 'PASAPORTE', 51347308, 'cmacvicar1@imageshack.us', '184-152-5870');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('a9ca36a1-f246-4af4-af52-a5d1f963e7dd', 'Salem', 'Ganford', 'LC', 12136038, 'sganford2@liveinternet.ru', '746-342-0915');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('011c3022-4515-4971-9fc6-778971a28423', 'Herculie', 'Pinckstone', 'PASAPORTE', 17593510, 'hpinckstone3@g.co', '537-476-6629');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('0477037a-ebdb-48d3-a733-f7ac16eba0bf', 'Nert', 'Russel', 'LC', 20258021, 'nrussel4@deliciousdays.com', '911-498-4994');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('97cdc1e3-9e1d-4988-a2d3-9d7d527f35f5', 'Emlynn', 'Jachtym', 'LC', 23683257, 'ejachtym5@google.nl', '800-791-9107');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('b65b883e-a1bc-4282-88b2-c59d9c83b1b4', 'Ashby', 'Francesco', 'LC', 23506870, 'afrancesco6@engadget.com', '205-611-5380');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('a4bf6b4a-f115-47ac-9b60-ab08a3fc9ea6', 'Gipsy', 'Snashall', 'DNI', 50768594, 'gsnashall7@twitter.com', '500-681-3279');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('6a1a884e-3928-4d56-bd26-f8e11b1a43db', 'Hillary', 'Harradence', 'PASAPORTE', 12946195, 'hharradence8@live.com', '279-688-2721');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('45d7b3d3-0cb0-4b17-8dbd-e49a47d1580e', 'Clair', 'Nelissen', 'DNI', 48984753, 'cnelissen9@imgur.com', '858-674-5893');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('adc4aa69-1f14-4eb9-ab87-3e3e38488698', 'Aleda', 'Bicknell', 'DNI', 36052433, 'abicknella@toplist.cz', '306-954-8535');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('7a01e620-76ab-4782-9220-c4ae54e102ed', 'Guy', 'Gorger', 'DNI', 25346149, 'ggorgerb@sciencedaily.com', '224-591-9671');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('bc45b952-0350-4551-90ee-0f98ed938dc9', 'Kirby', 'Losty', 'DNI', 39180202, 'klostyc@samsung.com', '312-511-6084');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('08b82c15-9433-4593-b09e-b6ca0129420a', 'Lewie', 'Meakin', 'LC', 50150172, 'lmeakind@boston.com', '472-858-4291');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('4e8c02c3-f635-4b24-ad10-7a1cc5f57889', 'Eula', 'Stanbury', 'LC', 30253433, 'estanburye@oaic.gov.au', '521-748-7250');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('b1db8619-c3e3-4832-b2b6-ae1f93e8f145', 'Miltie', 'Mancktelow', 'PASAPORTE', 22890180, 'mmancktelowf@google.co.jp', '737-617-9760');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('c928c2c6-d90e-4136-968f-f93b2ee56c8f', 'Arch', 'Itzcovichch', 'DNI', 43278337, 'aitzcovichchg@patch.com', '367-658-3520');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('0d45749b-769c-4359-aa54-bea8657aae6c', 'Daria', 'Town', 'DNI', 25666084, 'dtownh@wunderground.com', '838-306-3958');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('59ce98da-11aa-4f0e-919b-a203a5d75de2', 'Sallyanne', 'Durling', 'PASAPORTE', 40347685, 'sdurlingi@prlog.org', '720-325-7513');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('983619fd-5128-4685-84cb-06e9d194c7d0', 'Cassandra', 'Cully', 'PASAPORTE', 7235285, 'ccullyj@devhub.com', '219-266-4567');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('744ec14d-f77b-4dba-be00-5f48282e2039', 'Whitaker', 'Vatini', 'DNI', 14922859, 'wvatinik@odnoklassniki.ru', '735-364-0902');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('b6440c4c-912c-4b4d-b6e8-2ee5f6d9efc8', 'Clarie', 'Jubb', 'LC', 54949463, 'cjubbl@paginegialle.it', '357-503-5482');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('dc028ca6-a641-4dbf-9964-841d5f346af2', 'Rube', 'Bugdell', 'DNI', 50007213, 'rbugdellm@upenn.edu', '704-307-3382');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('8bccb4fa-f45e-44bc-925e-3cd2a719bb18', 'Harland', 'Hardwick', 'LC', 37152412, 'hhardwickn@purevolume.com', '483-111-6038');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('5e9c005e-ea44-4e28-8f46-72b9101583a8', 'Trixi', 'Huddy', 'LC', 46120362, 'thuddyo@weibo.com', '186-278-4636');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('82d1b7c8-6881-4af1-9761-0f1998c7defa', 'Blythe', 'Cartledge', 'DNI', 44184573, 'bcartledgep@nsw.gov.au', '601-742-9677');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('7a769a04-10ab-4cda-86ad-f2577c77f241', 'Bartel', 'Chippindale', 'DNI', 5645285, 'bchippindaleq@nytimes.com', '740-253-9367');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('8d736b44-e8c8-4f90-9a60-102106cf27fe', 'Adelina', 'Struys', 'DNI', 25045123, 'astruysr@wiley.com', '106-347-1922');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('6ac76714-5fde-47b9-baf8-8f4c9ef6dd04', 'Silvano', 'Blight', 'DNI', 41394269, 'sblights@sphinn.com', '196-760-3644');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('0430a0b3-5409-4c11-a0d5-18898523b288', 'Yalonda', 'Chisholm', 'PASAPORTE', 41078505, 'ychisholmt@blogger.com', '825-820-1232');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('1c61e309-dd51-4e18-bf95-faf3b6b46d74', 'Anabal', 'Stidever', 'LC', 6106471, 'astideveru@booking.com', '407-914-6945');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('9a511d44-3522-43f5-a73a-5567264e3e4c', 'Cris', 'MacRonald', 'DNI', 28903138, 'cmacronaldv@xinhuanet.com', '394-256-9137');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('0d473cca-18a9-4f32-b39f-7943d2ee8ec7', 'Hamnet', 'Ayliff', 'DNI', 20089556, 'hayliffw@merriam-webster.com', '604-432-4787');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('5fa2136b-28f2-43a9-9061-8f0a22288dd6', 'Adam', 'Maddie', 'LC', 8968648, 'amaddiex@house.gov', '932-974-4068');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('d7b0a7d0-8cfd-45f1-b548-994471cf835a', 'Loraine', 'McKerley', 'PASAPORTE', 51442267, 'lmckerleyy@diigo.com', '922-317-6244');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('b27bbb6d-0105-4fb1-9808-0c354f56701d', 'Dinnie', 'Ruppert', 'DNI', 52698489, 'druppertz@timesonline.co.uk', '180-318-5315');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('8858f3ef-28e9-4a61-84f5-0b157da7e3da', 'Hube', 'Pannett', 'DNI', 7504186, 'hpannett10@symantec.com', '289-439-9910');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('2c96f05f-e8fc-4c8b-930f-deaed255ea4f', 'Darren', 'O''Leagham', 'DNI', 9416960, 'doleagham11@theglobeandmail.com', '161-808-4567');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('91d917f5-0a23-4226-a60e-4b027647f6cd', 'Daniel', 'Cowie', 'DNI', 41133978, 'dcowie12@woothemes.com', '597-875-5255');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('b050d329-dc4a-4956-9636-87b71bd2c936', 'Bebe', 'Thexton', 'PASAPORTE', 33933197, 'bthexton13@stumbleupon.com', '268-107-3076');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('2dae9eea-608a-4ed5-93aa-df13b0270681', 'Tyler', 'Prisley', 'DNI', 28718403, 'tprisley14@virginia.edu', '181-930-0276');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('3d4cb891-db7e-44c0-8996-7025778046c0', 'Nataline', 'Ivanikhin', 'DNI', 16302106, 'nivanikhin15@google.es', '170-343-4093');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('6d9bb274-ab16-4adb-8f78-5a884ffe4210', 'Jessee', 'Walklot', 'LC', 36416750, 'jwalklot16@twitter.com', '182-193-4919');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('085d681a-05e3-4350-8091-8baca825fc65', 'Meaghan', 'Dollman', 'DNI', 14050943, 'mdollman17@webeden.co.uk', '364-747-4701');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('3c2508b2-2124-42e4-863d-d9261aecdac8', 'Alyosha', 'Parlatt', 'DNI', 13135093, 'aparlatt18@netlog.com', '650-700-5370');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('d993e97c-406b-4657-93a2-5d310156b523', 'Clarinda', 'Akehurst', 'PASAPORTE', 36098317, 'cakehurst19@google.cn', '145-217-8642');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('d491a048-b8a9-40ea-8abf-1f82ea23a75e', 'Guido', 'Densie', 'PASAPORTE', 44596436, 'gdensie1a@drupal.org', '425-604-0065');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('1fcff9bd-9de8-4c87-922f-9b5f66780b64', 'Barrie', 'Lamey', 'LC', 33817967, 'blamey1b@alibaba.com', '458-774-4716');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('26b3a96f-3f3d-4ab6-a7eb-df2bd42a9323', 'Carl', 'Powles', 'DNI', 15049780, 'cpowles1c@blogger.com', '463-265-7231');
insert into customer (id_customer, name, last_name, document_type, document_number, email, phone) values ('aae31a6a-56c0-4044-9ac4-0ebe5bea018c', 'Antony', 'Brittain', 'DNI', 46115191, 'abrittain1d@sbwire.com', '448-539-9263');


insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('327fd47b-b3a2-44e5-92b0-0b29f6820fd5', 'Ad Dujayl', 'Kenwood', '92', 6, 'b', '675a990d-6ed6-425c-8afe-6fd7a507b77a');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('c5af427e-b0e8-41d1-a015-7945bd733e21', 'Saipan', 'Springview', '28073', 3, 'f', '5cb7271b-bbdf-4ee2-850b-d7a41211c5ba');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('a48d3c2f-6344-4c1f-ac62-c81fe81eab4e', 'General Ramírez', 'Goodland', '15', 4, 'e', 'a9ca36a1-f246-4af4-af52-a5d1f963e7dd');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('d5556669-1620-408b-8e1a-28ea3e8a4960', 'Fuxing', 'Bay', '66', 5, 'a', '011c3022-4515-4971-9fc6-778971a28423');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('de47ec52-1ff1-4f1e-95d0-68e2a38aa413', 'Larache', 'High Crossing', '12', 12, 'f', '0477037a-ebdb-48d3-a733-f7ac16eba0bf');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('61bb59b2-1dd1-4c9d-9d48-0d2e1a6fd488', 'Zhangbang', 'Chinook', '9', 11, 'd', '97cdc1e3-9e1d-4988-a2d3-9d7d527f35f5');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('eb10482f-3d65-44c6-a0a5-8c4bbf5be27a', 'Sandaotong', 'Summerview', '21575', 4, 'b', 'b65b883e-a1bc-4282-88b2-c59d9c83b1b4');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('dbdd24ff-2e13-4a13-af12-b774363eb002', 'Guandiping', 'Prairieview', '3', 11, 'd', 'a4bf6b4a-f115-47ac-9b60-ab08a3fc9ea6');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('7a8c3a2b-92de-4dcf-aa66-d10e0436b5a3', 'Qingzhou', 'Sherman', '977', 1, 'c', '6a1a884e-3928-4d56-bd26-f8e11b1a43db');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('00290761-fd54-4115-b103-7d58c7112f38', 'Francisco Villa', 'Northwestern', '8387', 1, 'c', '45d7b3d3-0cb0-4b17-8dbd-e49a47d1580e');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('2b965734-1e5e-402e-b578-5b48d8fb3400', 'Huancheng', 'Westerfield', '0', 3, 'c', 'adc4aa69-1f14-4eb9-ab87-3e3e38488698');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('0fa72a4a-fbd3-47bb-9fed-66424e85bca1', 'Yimamu', 'Melvin', '445', 6, 'f', '7a01e620-76ab-4782-9220-c4ae54e102ed');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('c2e7aca3-e81c-402c-8af4-70fb9bfa0d4c', 'Beigucheng', 'Bay', '2', 4, 'a', 'bc45b952-0350-4551-90ee-0f98ed938dc9');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('bd9625b0-c2b1-4482-a728-bd9ac54f4af9', 'Naukot', 'Esch', '8', 2, 'c', '08b82c15-9433-4593-b09e-b6ca0129420a');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('3bcd8572-92a8-4c21-9e6c-392c34d4763a', 'Yanwan', 'Steensland', '9045', 10, 'c', '4e8c02c3-f635-4b24-ad10-7a1cc5f57889');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('9fc9a128-4f69-428d-b27f-ecfdbb536097', 'Maragogipe', 'Continental', '85', 11, 'c', 'b1db8619-c3e3-4832-b2b6-ae1f93e8f145');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('fb71a588-920d-4dfe-8ebf-4e5227a84407', 'Anjani Barat', 'Dunning', '75530', 2, 'f', 'c928c2c6-d90e-4136-968f-f93b2ee56c8f');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('81939dd5-3426-44cf-9c7b-443e905ed981', 'Sekolan', 'Hoepker', '47440', 4, 'e', '0d45749b-769c-4359-aa54-bea8657aae6c');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('61176dcd-d605-45cf-b623-f790f46636c4', 'Monteros', 'Monterey', '4', 12, 'a', '59ce98da-11aa-4f0e-919b-a203a5d75de2');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('a5ff468f-bea9-4656-a397-036e33ca5213', 'Лабуништа', 'Lake View', '4582', 11, 'a', '983619fd-5128-4685-84cb-06e9d194c7d0');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('191c96ef-9517-43ff-be38-2425db19539c', 'Panoongan', 'Main', '8', 12, 'e', '744ec14d-f77b-4dba-be00-5f48282e2039');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('1649b52b-7388-4478-ba8d-e65d31f019cf', 'Chornoliztsi', 'Talmadge', '9', 10, 'e', 'b6440c4c-912c-4b4d-b6e8-2ee5f6d9efc8');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('4300e082-ce5d-46b7-89bd-9016b0649318', 'Mabayo', 'Weeping Birch', '56', 6, 'e', 'dc028ca6-a641-4dbf-9964-841d5f346af2');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('a6d78ebd-e5ed-4063-8857-7dba7d4ba23e', 'Karangasem', 'John Wall', '29050', 12, 'e', '8bccb4fa-f45e-44bc-925e-3cd2a719bb18');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('2ca76eda-c708-4f7d-8284-bf65bf4fc690', 'Kuncen', 'Starling', '6971', 12, 'd', '5e9c005e-ea44-4e28-8f46-72b9101583a8');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('ff5d5772-3611-4e4f-b041-bb7439619eec', 'Osek nad Bečvou', 'Loeprich', '71', 2, 'e', '82d1b7c8-6881-4af1-9761-0f1998c7defa');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('77ca3c6e-23ea-4d1d-8b6e-4584af4008e5', 'Balut', 'Comanche', '62014', 6, 'e', '7a769a04-10ab-4cda-86ad-f2577c77f241');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('2c8ad18a-4dfa-4b84-846a-9936ee44d095', 'Xingou', 'Oriole', '81', 4, 'c', '8d736b44-e8c8-4f90-9a60-102106cf27fe');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('f0a8cf5a-768a-429c-8cd5-85fbb7f01e67', 'Chodów', 'Sachtjen', '87', 11, 'f', '6ac76714-5fde-47b9-baf8-8f4c9ef6dd04');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('24bd0f09-9f28-400b-8343-57194774b388', 'Kertosari', 'Green', '85', 8, 'a', '0430a0b3-5409-4c11-a0d5-18898523b288');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('14b6fbbc-d9d1-4c32-95af-5b42ef1fdd56', 'Nanmu', 'Summit', '8', 2, 'b', '1c61e309-dd51-4e18-bf95-faf3b6b46d74');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('eefc9703-e6f9-46e2-a582-5445e0752d80', 'Växjö', 'Lunder', '67718', 7, 'e', '9a511d44-3522-43f5-a73a-5567264e3e4c');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('6b3077f1-2e93-4bb7-8448-0a470ccaec0a', 'Changnyeong', 'Prairieview', '82090', 11, 'd', '0d473cca-18a9-4f32-b39f-7943d2ee8ec7');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('97672d1f-3567-4783-87b8-9623f830a757', 'Tân Châu', 'Longview', '47', 4, 'c', '5fa2136b-28f2-43a9-9061-8f0a22288dd6');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('b49f1147-67d3-4f44-a721-bf8bce0ca76e', 'Pŭrvomaytsi', 'Texas', '8696', 5, 'c', 'd7b0a7d0-8cfd-45f1-b548-994471cf835a');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('b16dd2cc-56a7-46a3-a4da-8e7ec4e7e9ea', 'Catac', 'Kropf', '19620', 3, 'd', 'b27bbb6d-0105-4fb1-9808-0c354f56701d');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('33927cba-a203-41ef-8996-d06499e2a62c', 'Huangcun', 'Oxford', '5411', 5, 'f', '8858f3ef-28e9-4a61-84f5-0b157da7e3da');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('eb80280c-d39c-49e0-97eb-6ce20117855e', 'Daultāla', 'Scoville', '797', 8, 'e', '2c96f05f-e8fc-4c8b-930f-deaed255ea4f');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('05d2d078-7761-4ce1-a7df-8e26f138eed0', 'Tammela', 'Redwing', '37', 10, 'a', '91d917f5-0a23-4226-a60e-4b027647f6cd');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('ea4ef551-4e7b-4961-bb25-f13c13e68063', 'Capissayan Sur', 'Sommers', '02371', 12, 'e', 'b050d329-dc4a-4956-9636-87b71bd2c936');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('87fd189f-5eda-4499-ab93-c1a8012e1f46', 'Komsomolets', 'Pennsylvania', '040', 2, 'a', '2dae9eea-608a-4ed5-93aa-df13b0270681');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('e8a327bd-6f0b-441c-83ea-914f4abef075', 'Sapucaia', 'Toban', '044', 7, 'a', '3d4cb891-db7e-44c0-8996-7025778046c0');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('81109623-e1a4-406e-8800-24965e76b9ba', 'Baohe', 'Red Cloud', '5999', 10, 'a', '6d9bb274-ab16-4adb-8f78-5a884ffe4210');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('99338b6f-d55e-4a72-b6cd-3196dde89da9', 'Sifala', 'Rigney', '24', 8, 'b', '085d681a-05e3-4350-8091-8baca825fc65');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('81965040-fc95-4f49-afcf-4b3aba64e220', 'Liushikou', '4th', '55846', 4, 'a', '3c2508b2-2124-42e4-863d-d9261aecdac8');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('dbf1b2f8-49d4-425d-a44b-3a1389b1eb9b', 'Rancharia', 'Merrick', '2373', 3, 'f', 'd993e97c-406b-4657-93a2-5d310156b523');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('31522685-834c-4ecd-b3de-bb9c47610e83', 'Kumla', 'Marcy', '844', 3, 'c', 'd491a048-b8a9-40ea-8abf-1f82ea23a75e');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('1ddd980b-677f-4451-b2eb-83d0d85728a5', 'Bosaso', 'American Ash', '9537', 6, 'd', '1fcff9bd-9de8-4c87-922f-9b5f66780b64');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('fad71d95-d0db-4c2d-b750-2c2227a93639', 'Chiscas', 'Roxbury', '4', 5, 'd', '26b3a96f-3f3d-4ab6-a7eb-df2bd42a9323');
insert into address (id_address, city, street, street_number, floor_number, flat, id_customer) values ('72505170-7995-4aad-804c-b312e0a17651', 'Kuiyong', 'Dunning', '01', 4, 'c', 'aae31a6a-56c0-4044-9ac4-0ebe5bea018c');