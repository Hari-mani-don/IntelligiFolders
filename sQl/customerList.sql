create database customesList;
use customesList;
-- create table
create table cusomers(
id int primary Key,
cust_name varchar(30) not null,
cust_age int(2) not null,
cust_Location varchar(100));

-- Alter table
alter table cusomers rename customers;
alter table customers rename column id to Id;
select * from customers;
desc cusomers;