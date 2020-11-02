\connect project_db;

INSERT INTO shop (id, address, geom) VALUES('Instar', 'Split', 'POINT(10, 20)');
INSERT INTO shop (id, address, geom) VALUES('Ekupi', 'Zagreb', 'POINT(20, 30)');
INSERT INTO shop (id, address, geom) VALUES('Elipso', 'Rijeka', 'POINT(10, 20)');
INSERT INTO shop (id, address, geom) VALUES('Svijet medija', 'Osijek', 'POINT(20, 30)');
INSERT INTO shop (id, address, geom) VALUES('Links', 'Dubrovnik', 'POINT(10, 20)');
INSERT INTO shop (id, address, geom) VALUES('Sancta domenica', 'Sisak', 'POINT(20, 30)');
INSERT INTO shop (id, address, geom) VALUES('Mall.hr', 'Zadar', 'POINT(10, 20)');
INSERT INTO shop (id, address, geom) VALUES('Hgshop', 'Metković', 'POINT(20, 30)');

INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Valentino Grljušić', 'Split', 'vgrljusic@gmail.com', 'POINT(80, 20)', 'Instar');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Miroslav Grljušić', 'Vrgorac', 'miroslavdeno@gmail.com', 'POINT(50, 20)', 'Instar');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Dinka Grljušić', 'Vrgorac', 'dinkadrljusic@gmail.com', 'POINT(80, 20)', 'Instar');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Anita Pitarević', 'Dubrovnik', 'pitarossa@gmail.com', 'POINT(50, 20)', 'Ekupi');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Marta Šalja', 'Dubrovnik', 'šalja999@gmail.com', 'POINT(80, 20)', 'Ekupi');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Matej Brnad', 'Sisak', 'mbrmand@gmail.com', 'POINT(50, 20)', 'Ekupi');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Ivan Ivičević', 'Dubrovnik', 'iivic@gmail.com', 'POINT(80, 20)', 'Elipso');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Ferdinand Sučić', 'Split', 'ferdinandsucic@gmail.com', 'POINT(50, 20)', 'Elipso');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Marko Zelenković', 'Dubrovnik', 'marroco@gmail.com', 'POINT(80, 20)', 'Elipso');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Josip Tenžera', 'Split', 'jtenzera@gmail.com', 'POINT(50, 20)', 'Links');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Rebeka Milković', 'Zagreb', 'milokovicrebeka@gmail.com', 'POINT(80, 20)', 'Links');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Dolores Antunica', 'Zagreb', 'doloressica@gmail.com', 'POINT(50, 20)', 'Mall.hr');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Jure Baban', 'Split', 'babanbox@gmail.com', 'POINT(80, 20)', 'Mall.hr');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Lucija Klanac', 'Zadar', 'lufyklanac@gmail.com', 'POINT(50, 20)', 'Mall.hr');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Marino Radica', 'Dubrovnik', 'radicaradica@gmail.com', 'POINT(80, 20)', 'Hgshop');
INSERT INTO customer (id, address, email, geom, shop_id) VALUES('Monika Đogo', 'Omiš', 'đogi@gmail.com', 'POINT(50, 20)', 'Hgshop');

INSERT INTO item (id, price, description, customer_id) VALUES('Samsung Galaxy S10', '600$', 'mobitel', 'Valentino Grljušić');
INSERT INTO item (id, price, description, customer_id) VALUES('Samsung Galaxy S20', '700$', 'mobitel', 'Valentino Grljušić');
INSERT INTO item (id, price, description, customer_id) VALUES('Samsung Galaxy A51', '400$', 'mobitel', 'Miroslav Grljušić');
INSERT INTO item (id, price, description, customer_id) VALUES('Samsung Galaxy Z Fold 2', '2000$', 'mobitel', 'Miroslav Grljušić');
INSERT INTO item (id, price, description, customer_id) VALUES('Samsung Galaxy S20 FE ', '600$', 'mobitel', 'Anita Pitarević');
INSERT INTO item (id, price, description, customer_id) VALUES('Iphone 12', '800$', 'mobitel', 'Anita Pitarević');
INSERT INTO item (id, price, description, customer_id) VALUES('Iphone XR', '500$', 'mobitel', 'Marta Šalja');
INSERT INTO item (id, price, description, customer_id) VALUES('Iphone 11', '600$', 'mobitel', 'Marta Šalja');
INSERT INTO item (id, price, description, customer_id) VALUES('Iphone 11 Pro', '700$', 'mobitel', 'Matej Brnad');
INSERT INTO item (id, price, description, customer_id) VALUES('Ipad air 4', '500$', 'tablet', 'Matej Brnad');
INSERT INTO item (id, price, description, customer_id) VALUES('Ipad pro', '900$', 'tablet', 'Ivan Ivičević');
INSERT INTO item (id, price, description, customer_id) VALUES('Ipad air 3', '500$', 'tablet', 'Ivan Ivičević');
INSERT INTO item (id, price, description, customer_id) VALUES('Ipad 8 ', '400$', 'tablet', 'Ferdinand Sučić');
INSERT INTO item (id, price, description, customer_id) VALUES('Ipad pro 11', '1000$', 'tablet', 'Ferdinand Sučić');
INSERT INTO item (id, price, description, customer_id) VALUES('Macbook pro 16 ', '1000$', 'laptop', 'Marko Zelenković');
INSERT INTO item (id, price, description, customer_id) VALUES('Macbook pro 13', '800$', 'laptop', 'Marko Zelenković');
INSERT INTO item (id, price, description, customer_id) VALUES('Macbook air 2019', '800$', 'laptop', 'Josip Tenžera');
INSERT INTO item (id, price, description, customer_id) VALUES('Macbook air 2020', '1200$', 'laptop', 'Josip Tenžera');
INSERT INTO item (id, price, description, customer_id) VALUES('Xiaomi Band 4', '50$', 'pametni sat', 'Rebeka Milković');
INSERT INTO item (id, price, description, customer_id) VALUES('Xiaomi Band 3', '40$', 'pametni sat', 'Rebeka Milković');
INSERT INTO item (id, price, description, customer_id) VALUES('Samsung Galaxy watch 2', '100$', 'pametni sat', 'Dolores Antunica');
INSERT INTO item (id, price, description, customer_id) VALUES('Samsung Galaxy watch', '50$', 'pametni sat', 'Dolores Antunica');
INSERT INTO item (id, price, description, customer_id) VALUES('Huawei watch GT2', '70$', 'pametni sat', 'Jure Baban');
INSERT INTO item (id, price, description, customer_id) VALUES('Huawei watch fit', '40$', 'pametni sat', 'Jure Baban');
INSERT INTO item (id, price, description, customer_id) VALUES('Huawei watch GT2e', '60$', 'pametni sat', 'Lucija Klanac');
INSERT INTO item (id, price, description, customer_id) VALUES('Huawei watch GT2e Sport', '100$', 'pametni sat', 'Lucija Klanac');
INSERT INTO item (id, price, description, customer_id) VALUES('Samsung Galaxy watch 3', '100$', 'pametni sat', 'Marino Radica');
INSERT INTO item (id, price, description, customer_id) VALUES('Asus ROG Strix G15', '1500$', 'laptop', 'Marino Radica');
INSERT INTO item (id, price, description, customer_id) VALUES('Asus ROG Zephyrus Duo', '1800$', 'laptop', 'Monika Đogo');
INSERT INTO item (id, price, description, customer_id) VALUES('Asus ROG Zephyrus G14', '1400$', 'laptop', 'Monika Đogo');
INSERT INTO item (id, price, description, customer_id) VALUES('Asus ROG VivoBook S', '1000$', 'laptop', 'Anita Pitarević');
INSERT INTO item (id, price, description, customer_id) VALUES('Asus ROG TUF 15', '900$', 'laptop', 'Anita Pitarević');