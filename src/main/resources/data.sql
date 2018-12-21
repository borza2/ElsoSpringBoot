insert into Blogger (age,name) VALUES (21, 'Gyula');
insert into Blogger (age,name) VALUES (24, 'Pista');
insert into STORY(title, content, posted, blogger_id) VALUES ('Teszt cím', 'Teszt Tartalom', CURRENT_DATE(), (select id from Blogger where name='Gyula'));
insert into STORY(title, content, posted, blogger_id) VALUES ('Teszt cím2', 'Teszt Tartalom2', CURRENT_DATE(), (select id from Blogger where name='Gyula'));
insert into STORY(title, content, posted, blogger_id) VALUES ('Ez Pistáé', 'Pista egy fasza csávó', CURRENT_DATE(), (select id from Blogger where name='Pista'));