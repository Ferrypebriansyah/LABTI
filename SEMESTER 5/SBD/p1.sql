CREATE DATABASE ferry_market;

CREATE TABLE customer_p1(
id_pelanggan VARCHAR(20) NOT NULL PRIMARY KEY,
nama_pelanggan VARCHAR(30),
umur INT,
alamat VARCHAR(50),
kota VARCHAR(50)
);

SELECT * FROM customer_p1;

ALTER TABLE customer_p1 DROP kota;
SELECT * FROM customer_p1;

INSERT INTO customer_p1 values 
('5441', 'Yanto', 22, 'Setu'),
('5442', 'Siti', 22, 'Ambon'),
('5443', 'Propesor', 22, 'Pantai Gading'),
('2572', 'Ferry', 20, 'Bekasi'),
('5042', 'Pebriansyah', 21, 'Madrid');
SELECT * FROM customer_p1;

UPDATE customer_p1 SET alamat = 'Bekasi' WHERE nama_pelanggan = 'Yanto';
SELECT * FROM customer_p1;

DELETE FROM customer_p1 WHERE umur = 22;

SELECT * FROM customer_p1;

-- PERTEMUAN 2

SELECT * FROM customer_p1;

BEGIN;

UPDATE customer_p1
SET umur = 19
WHERE nama_pelanggan = 'Ferry';

ROLLBACK;

BEGIN;

UPDATE customer_p1
SET nama_pelanggan = 'Ferry Benzema'
where umur = 19;

COMMIT;

ROLLBACK;

INSERT INTO customer_p1 VALUES ('60422008', 'Ferry', 18, 'Banda Neira');
INSERT INTO customer_p1 VALUES ('60422022', 'Bellingham', 25, 'Birmingham');
INSERT INTO customer_p1 VALUES ('60422034', 'Gui Sihan', 20, 'Taiwan');
INSERT INTO customer_p1 VALUES ('60422031', 'Rusdi', 31, 'Kongo');
INSERT INTO customer_p1 VALUES ('60422098', 'Eun Bi', 24, 'Gangwon');

SELECT * FROM customer_p1;

SELECT * FROM customer_p1 WHERE nama_pelanggan LIKE 'a%';

SELECT * FROM customer_p1 WHERE nama_pelanggan LIKE '%a%';

SELECT * FROM customer_p1 ORDER BY id_pelanggan DESC;

SELECT nama_pelanggan, umur FROM customer_p1 WHERE umur BETWEEN 17 AND 30;






