CREATE TABLE orderform (
 orderNumber VARCHAR(16) PRIMARY KEY,
 reciverName VARCHAR(16),
 reciverTel VARCHAR(16),
 weight VARCHAR(16),
 status VARCHAR(8),
 orderTime VARCHAR(50) 
);


insert into orderform values('201907240001','李亚娥','18912345678','3KG','已预约','2019-07-25 18:20:00');
insert into orderform values('201907240002','周丽','18900001111','2KG','未取件','2019-07-25 18:20:00');
insert into orderform values('201907240003','刘佳','18912345678','13KG','已取件','2019-07-25 18:20:00');