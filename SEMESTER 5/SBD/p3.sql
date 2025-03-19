CREATE TABLE customer_p3 (
    customer_id varchar(255) NOT NULL PRIMARY KEY,
    customer_name varchar(255),
    segment varchar(255),
    age int,
    country varchar(255),
    city varchar(255),
    postal_code varchar(255),
    region varchar(255)
);

SELECT * FROM customer_p3;

CREATE TABLE product_p3 (
    product_id varchar(255) NOT NULL PRIMARY KEY,
    category varchar(255),
    sub_category varchar(255),
    product_name varchar(255)
);

SELECT * FROM product_p3;

CREATE TABLE sales_p3 (
    order_line int NOT NULL PRIMARY KEY,
    order_id varchar(255),
    order_date date,
    ship_date date,
    ship_mode varchar(255),
    customer_id varchar(255),
    product_id varchar(255),
    sales double precision,
    quantity int,
    discount double precision,
    profit double precision
);

SELECT * FROM sales_p3;

insert into customer_p3 values('001', 'Ferry', 'Customer', '20', 'Indonesia', 'Bekasi', '22572', 'A');
insert into customer_p3 values('002', 'Pebriansyah', 'Customer', '17', 'Indonesia', 'Cirebon', '17622', 'C');
insert into customer_p3 values('003', 'Ambappe', 'Customer', '25', 'Indonesia', 'Ngawi', '19212', 'B');
insert into customer_p3 values('004', 'Mamavinga', 'Customer', '22', 'Indonesia', 'Bogor', '13458', 'C');

SELECT * FROM customer_p3;

insert into product_p3 values('001', 'Electronic', 'Earphone', 'Razer Hammerhead');
insert into product_p3 values('002', 'Electronic', 'Headphone', 'Marshall');
insert into product_p3 values('003', 'Electronic', 'Smartphone', 'IPhone 15');
insert into product_p3 values('004', 'Electronic', 'TWS', 'Soundcore');

SELECT * FROM product_p3;

insert into sales_p3 values('001', '111', '2022-11-2', '2022-11-3', 'JNE', '001', '002', '50000', '1', '0.2', '10');
insert into sales_p3 values('002', '112', '2022-10-2', '2022-10-3', 'JNE', '002', '002', '50000', '2', '0.2', '10');
insert into sales_p3 values('003', '113', '2022-9-2', '2022-9-3', 'JNE', '003', '003', '100000', '1', '0.2', '10');
insert into sales_p3 values('004', '114', '2022-11-15', '2022-11-16', 'JNE', '004', '001', '100000', '1', '0.2', '10');

SELECT * FROM sales_p3;

select customer_p3.customer_id, customer_p3.customer_name, customer_p3.city,
sales_p3.order_date, sales_p3.ship_mode
from customer_p3, sales_p3
where customer_p3.customer_id = sales_p3.customer_id;

SELECT * FROM product_p3 join sales_p3 ON product_p3.product_id = sales_p3.product_id;

select c.customer_name, sa.ship_date, sa.ship_mode, p.product_name 
from customer_p3 c, sales_p3 sa, product_p3 p
where c.customer_id = sa.customer_id and sa.product_id = p.product_id;

SELECT * FROM sales_p3;

insert into sales_p3 values('005', '15', '2022-11-15', '2022-11-10', 'JNE', '006', '005', '100000', '5', '0.2', '10');

select customer_p3.customer_id, customer_p3.customer_name, sales_p3.order_id, sales_p3.order_date, sales_p3.product_id
from customer_p3
right outer join sales_p3 on customer_p3.customer_id = sales_p3.customer_id;

SELECT p.product_id, c.sub_category
FROM product_p3 p join product_p3 c ON c.product_name = p.category;
	
SELECT * FROM product_p3;














































