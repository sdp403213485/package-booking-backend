CREATE TABLE orderform (
 orderNumber VARCHAR(16) PRIMARY KEY,
 reciverName VARCHAR(16),
 reciverTel VARCHAR(16),
 weight VARCHAR(16),
 status VARCHAR(8),
 orderTime VARCHAR(50) 
);


insert into orderform values('201907240001','李亚娥','18912345678','3KG','已预约','2019-07-25 18:20:00');