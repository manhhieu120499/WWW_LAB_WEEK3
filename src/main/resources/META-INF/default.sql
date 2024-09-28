INSERT INTO product(name, description, img_path) VALUES ("Samsung JFOLD4", "dien thoai tran vien", "./images/jfold4.jpg");
INSERT INTO product(name, description, img_path) VALUES ("Iphone 16 Promax", "thiet ke cao cap, phong cach tuong lai", "./images/iphone16.jpg");
INSERT INTO product(name, description, img_path) VALUES ("Xaomi 12 Pro", "thiet ke cam goc rong", "./images/xaomi12.jpg");
INSERT INTO product(name, description, img_path) VALUES ("Sony Experia 1", "cong nghe chup anh quang hoc", "./images/sony.jpg");
INSERT INTO product(name, description, img_path) VALUES ("OPPO Reno 8 5G", "doi moi phong cach, thiet ke cach tan", "./images/opporeno8.jpg");

INSERT INTO product_price (product_id, value, apply_date, note, state) VALUES (1, 100.0, '2024-09-22 00:00:00', 'First price for product 1', 1);
INSERT INTO product_price (product_id, value, apply_date, note, state) VALUES (1, 120.0, '2024-09-23 00:00:00', 'Second price for product 1', 0);
INSERT INTO product_price (product_id, value, apply_date, note, state) VALUES (2, 200.0, '2024-09-22 00:00:00', 'First price for product 2', 1);
INSERT INTO product_price (product_id, value, apply_date, note, state) VALUES (2, 220.0, '2024-09-23 00:00:00', 'Second price for product 2', 0);
INSERT INTO product_price (product_id, value, apply_date, note, state) VALUES (3, 200.0, '2024-09-22 00:00:00', 'First price for product 3', 1);
INSERT INTO product_price (product_id, value, apply_date, note, state) VALUES (3, 220.0, '2024-09-23 00:00:00', 'Second price for product 3', 0);
INSERT INTO product_price (product_id, value, apply_date, note, state) VALUES (4, 200.0, '2024-09-22 00:00:00', 'First price for product 4', 1);
INSERT INTO product_price (product_id, value, apply_date, note, state) VALUES (4, 220.0, '2024-09-23 00:00:00', 'Second price for product 4', 0);
INSERT INTO product_price (product_id, value, apply_date, note, state) VALUES (5, 300.0, '2024-09-22 00:00:00', 'First price for product 3', 1);