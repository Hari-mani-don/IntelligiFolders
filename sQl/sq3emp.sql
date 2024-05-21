use uniq;
create table emp(a int , b int, c int);
insert into emp values(20,30,10),(45,20,0),(100,49494,324);
select * from emp;
select *, greatest(a,b, c) as greatest_value from emp;
select *, least(a,b,c) as least_value from emp;
select abs(-2);
select abs(a) from emp;
select ceil(90.5);select ceil(90.0);select ceil(90.9);
select floor(90.5);select floor(90.0);select floor(90.9);
select round(90.5);select round(90.0);select round(90.9);
select power(10,2);select power(80.0);select power(0,0);select power(0,2);
select mod(10,30);select mod(5,2);
select sqrt(10);select sqrt(25);




use customers;
select * from customersList;
update customersList set salary=800 where salary=1800;
update customersList set salary=1000 where salary=800;
update customersList set ename=concat("Mr.",ename);
update customersList set ename=substr(ename,4);
update customersList set ename=concat(length(ename)," ",ename);
update customersList set ename=concat(length(ename)," ",ename," ");
update customersList set ename=ucase(ename);
update customersList set ename=lcase(ename);
update customersList set ename=reverse(ename);
update customersList set ename=replace(ename,"5","10");
update customersList set ename=reverse(ename);
update customersList set ename=substr(ename,3);
update customersList set ename=substr(ename,2);
update customersList set ename=replace(ename,"1 "," ");
update customersList set ename=concat(ename,length(ename));
update customersList set ename=reverse(ename);
update customersList set ename=substr(ename,2);
select  replace(ename,"5","0") from customersList ;

-- task
Alter table customersList add anual_salary bigint;
update customersList set anual_salary=salary*12;
select ename,job , salary*6 as Half_Salary from customersList ;
update  customersList set anual_salary=anual_salary+2000;
select ename,salary , salary+(salary * 10 /100) as Hike_Salary from customersList ;
select ename, salary, salary-(salary * 25 /100) as deduction from customersList;
select ename, salary, (salary+50) as monthly_Hike from customersList;
select anual_salary , anual_salary-(anual_salary*10/100) as anual_deduction from customersList;
select ename  ,job , salary-100 as penalty_100 from customersList;


-- apr 15 2024 16:00
select now();
select date(now());
select time(now());
select adddate('2024-12-04',interval -5 day);
select date_sub('2024-12-04',interval 5 day);
select date_add('2024-12-04',interval +5 year);
select curdate();
select curtime();
select date('2024-12-05)');
select time('1:24:08');
select subdate(now(),interval 5 microsecond);
select subdate(now(),interval 5 year);
select subdate(now(),interval 5 month);
select subdate(now(),interval 5 week);
select subdate(now(),interval 5 minute);
select subdate(now(),interval 5 day);
select datediff('2024-05-01', now());
select date_format(now(),'%d-%m-%y');
select date_format(now(),'%D-%M-%Y');
select date_format(now(),'%D%D-%M-%Y');
select date_format(now(),'%D');
select date_format(now(),'%d');
select date_format(now(),'%M');
select date_format(now(),'%m');
select date_format(now(),'%y');
select date_format(now(),'%Y');
select date_format(hiredate,'%d') from customersList;
select date_format(hiredate,'%Y') from customersList;
select date_format(hiredate,'%y') from customersList;
select date_format(hiredate,'%m') from customersList;
select date_format(hiredate,'%M') from customersList;
select date_format(hiredate,'%D') from customersList;
select day(hiredate) from customersList;
select month(hiredate) from customersList;
select hiredate from customersList;
select date(hiredate) from customersList;
select year(hiredate) from customersList;
select left(ename,100) from customersList ;
select right(ename,4) from customersList ;
update customersList set ename=reverse(ename);
use customers;

-- task
select count(ename) , deptno from customersList  group by deptno;
select sum(salary) , job from customersList group by job;
select count(ename) , job from customersList where salary>1500 group by job;
select count(hiredate) from customersList where hiredate is not null;
select count(salary), salary from customersList group by salary ;
select count(ename), job from customersList where job != 'manager'  group by job ;
-- task
use customers;
select max(salary) , min(salary) from customersList where salary not in (1000)  group by  deptno;
select count(ename), job from customersList group by job;
select count(ename), job from customersList where not job='supervisor' group by job;
select sum(salary) as total_salary , job from customersList  group by job;
select count(ename) as manager ,deptno from customersList where job='manager' group by deptno;
select avg(salary) as average , deptno from customersList where not deptno=30 group by deptno;
select count(ename) as A_isThere,job from customersList where ename like '%a%' group by job;
select count(ename) as numberOf_employee, avg(salary) as average, deptno from customersList where salary>2000 group by deptno;
select count(ename) as numberOf_employee, sum(salary) as total_salary , deptno from customersList where job='salesman' group by deptno;
select count(ename) as numberOf_employee, max(salary) as maximum_salary, job from customersList group by job;
select max(salary) as maximum_salary , deptno from customersList group by deptno;
select count(salary) as salary_Count  from customersList;
select count(ename) as same_hired_date, deptno, hiredate from customersList group by hiredate,deptno having count(ename)>=2;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          ;
select count(ename) as number_of_employee_Getting_Same_salary, deptno from customersList group by deptno;

-- task
select count(ename) as total_employee,deptno from customersList where job='clerk' group by deptno having count(job='clerk')>1; 
select sum(salary) as total_salary, deptno from customersList group by deptno having count(ename)>5;
select count(ename) as each_job_earning , job from customersList where salary>1200 group by job having sum(salary)>3800;
select count(ename) as number_of_manager, deptno from customersList where job='manager' group by deptno having count(job='manager')=2;
select max(salary) as max_salary, deptno from customersList where salary>2600 group by deptno;
select avg(salary) as avg_salary, deptno from customersList group by deptno having avg(salary)<3000;
select deptno ,count(ename) from customersList where ename like '%a%'or'%s%' group by deptno order by deptno asc ;  
select job, max(salary) as Max_salary, min(salary) as min_salary from customersList where salary>1000 and salary<5000 group by job;
select salary , count(salary)as repeted from customersList group by salary having count(salary)>1;
select hiredate, count(hiredate) as duplicated from customersList group by hiredate having count(hiredate)>1;



select * from customers ;
select cust_name from customers where cust_name='hari';
insert into customers values(20,'hari',21,'chennai');


-- task
select ename, salary from customersList where salary>(select salary from customersList where  ename='allen');
alter table customersList rename column enameS to ENAME;
select * from customersList where job=(select job from customersList where enames='miller');
select ename from customersList where salary>(select salary from customersList where ename='adams');
select ename, salary from customersList where salary<(select salary from customersList where ename='king');
select ename, deptno from customersList where DEPTNO=(select deptno from customersList where ename='jones');
select ename, job from customersList where job=(select job from customersList where ename='james');
select empno, ename, SALARY*12 as anual_salary from customersList where SALARY*12>(select SALARY*12 from customersList where ENAME='wards');
select ename , hiredate  from customersList where hiredate<(select hiredate from customersList where ename='turner');
select ename, hiredate from customersList where hiredate>(select hiredate from customersList where ename='president');
select ename, salary from customersList where salary<(select salary from customersList where empNo=7844);
select * from customersList where hiredate<(select hiredate from customersList where ename='miller');
select ename , deptno from customersList where SALARY>(select salary from customersList where ename='allan');
select ename, salary from customersList where salary>(select salary from customersList where ename='scott') and hiredate<(select HIREDATE from customersList where ename='king');
select * from customersList where job=(select job from customersList where ename='turner') and SALARY<5000;
select ename, salary from customersList where salary>(select salary from customersList where ename='miller') and salary<(select salary from customersList where ename='allen');
select * from customersList where deptno=20 and job=(select job from customersList where ename ='smith');
select ename, hiredate from customersList where HIREDATE>year(hiredate) and HIREDATE<year((select hiredate from customersList where ename='king'));
select ename, salary , salary*12 as anual_salary from customersList where salary<(select salary from customersList where ename='blake') and salary>3500;
select * from customersList where salary>(select salary from customersList where ename='scott') and SALARY<(select salary from customersList where ENAME='king');
select ename from customersList where ename like "a%" and deptno=(select deptno from customersList where ename='blake');
select ename,commision from customersList where COMMISION is not null and job=(select job from customersList where ename='smith');
select  * from customersList where job='clerk' and DEPTNO=(select deptno from customersList where ename='turner');
select ename, salary ,job from customersList where salary*12>(select salary*12 from customersList where ename='smith') and salary*12<(select SALARY*12 from customersList where ename='king');

use customers;


-- task
use customers;
select max(salary) from customersList where salary<(select max(salary) from customersList where salary<(select max(salary) from customersList));
select ename from customersList where salary=(select min(salary) from customersList where salary>(select min(salary) from customersList)) limit 1;
select min(salary) from customersList where salary>(select min(salary) from customersList where salary>(select min(salary) from customersList ));
select min(salary) from customersList where salary>(select min(salary) from customersList where salary>(select min(salary) from customersList where salary>(select min(salary) from customersList)));
select ename from customersList where salary=(select max(salary) from customersList where salary<(select max(salary) from customersList where salary<(select max(salary) from customersList)));
select empno from customersList where salary=(select min(salary) from customersList);
select Department.dname from customersList left join Department on Department.deptno=customersList.deptno where salary=(select max(salary)from customersList where salary<(select max(salary)from customersList
where salary<(select max(salary)from customersList where salary<(select max(salary)from customersList ))));

-- 21
select  d.dname , c.ename, d.location from customersList c  join Department d on c.deptno = d.deptno where c.hiredate<(
select max(hiredate) from customersList) order by hiredate desc limit 1  ;
-- 22
select d.location , c.ename from customersList c  left join Department d on d.deptno= c.deptno where hiredate=(select min(hiredate)
from customersList)  limit 1;
-- 23
select c.ename, d.dname from customersList c inner join Department d on d.deptno= c.deptno; 
-- 24
select c.ename, d.dname from customersList c inner join Department d on d.deptno=c.deptno where c.deptno=30;
-- 25
select c.ename, d.location from customersList c inner join Department d on d.deptno=c.deptno ;
-- 26 
select d.dname, c.salary from customersList c inner join Department d on d.deptno= c.deptno where d.dname='accounting';
-- 27
select d.dname,  c.salary*12 as anual_salary from customersList c inner join Department d on d.deptno=c.deptno 
where c.salary>2340; 
-- 28 
select c.ename , d.dname from customersList c  inner join Department d on d.deptno=c.deptno where d.dname like '%a%';
-- 29 
select c.ename , d.dname from customersList c inner join Department d on d.deptno =c.deptno where c.job='salesman';
-- 30
select d.dname,c.job from customersList c inner join Department d on d.deptno=c.deptno where c.job like 's%' and d.dname like 's%';
-- 31
select d.dname , c.mgr, c.ename from customersList c inner join Department d on d.deptno=c.deptno where c.mgr=7839;
-- 32
select d.dname, c.hiredate from customersList c inner join Department d on d.deptno=c.deptno where c.hiredate>'1983-01-01' and (d.dname in('accounting' ,'research'));
-- 33
select c.ename, d.dname, d.deptno from customersList c inner join Department d on d.deptno = c.deptno where c.deptno in (10,30) and c.commision is not null;
-- 34
select d.dname, c.empno from customersList c inner join Department d on d.deptno=c.deptno where c.empno in (7839,7902) and d.location='new york';
-- 35
select c.ename , m.ename from customersList c , customersList m  where c.mgr=m.empno;
-- 36
select  e.ename , e.salary, m.ename, m.salary from customersList e inner join customersList m on e.mgr =m.empno where e.salary>m.salary;
 -- 37
 select e.ename, mgr.ename , e.salary*12 as empl_anual_salary, mgr.salary*12 as mgr_anual_salary from 
 customersList e inner join customersList mgr on e.mgr=mgr.empno where e.salary*12>10000 and mgr.ename like '%a%';
 -- 38
 select e.ename, mgr.ename from customersList e left join customersList mgr on e.mgr=mgr.empno where e.job='clerk';
 -- 39
 select e.ename, mgr.job from customersList e inner join customersList mgr on e.mgr=mgr.empno where mgr.deptno in (10,30);
 -- 40
 select e.ename, mgr.salary from customersList e inner join customersList mgr on e.mgr=mgr.empno where e.salary>2300 and mgr.salary>2300;
 -- 41
 select e.ename, mgr.hiredate from customersList e inner join customersList mgr on e.mgr=mgr.empno where e.hiredate<'1982-01-01';
 -- 42
 select e.ename, mgr.commision from customersList e inner join customersList mgr on e.mgr=mgr.empno where e.job='manager' and mgr.deptno=10;
 -- 43
 select e.ename, mgr.ename , e.salary, mgr.salary from customersList e inner join customersList mgr on 
 e.mgr=mgr.empno where e.salary>mgr.salary;
 -- 44
 select e.ename, e.hiredate, mgr.ename ,mgr.hiredate from customersList e inner join customersList mgr on
 e.mgr=mgr.empno where mgr.hiredate<e.hiredate;
 -- 45
 select e.ename , mgr.ename from customersList e inner join customersList mgr on e.mgr=mgr.empno where
 e.job=mgr.job;
 -- 46
 select e.ename, mgr.ename from customersList e inner join customersList mgr on e.mgr=mgr.empno where
 mgr.job='manager';
 -- 47
 select e.ename , mgr.ename, e.salary*12 as e_anual_salary, mgr.salary*12 as mgr_anual_salary from customersList e inner join
 customersList mgr on e.mgr=mgr.empno where e.deptno in (10,30) and mgr.salary>e.salary;
 use customecustomersrs;
select * from customercustomerscustomerssList ;
select * from Department;
 alter table Department drop column salary;
 
 
 
 
 -- today work
 create index sample_index on customersList(salary);
 create view sample_view as
 select * from customersList where job='clerk';
 select * from Department union Select * from customersList;
 select * from customersList ;
 select * from sample_view;
 use ecommerce;
 select * from products;
 select * from orders;
 
 
 
 
 create database DataProcess;
 use DataProcess;
 create table primaryTable(
 name varchar(30) not null,
 mobileNumber varchar(10) primary key not null
 );
 Alter table primaryTable modify mobileNumber varchar(10) not null;
 insert into primaryTable values("hari","9361931850");
 insert into primaryTable values("mani","6384977823");
 insert into primaryTable values("HariMani","7826980179");
 insert into primaryTable values("Vignesh","7282228020");
 
 create table secondayTable(
 Address varchar(30) not null,
 mobileNumber varchar(10)  not null
 );
 
 insert into secondayTable values("27,a street","9361931850");
 insert into secondayTable values("789,b street","6384977823");
 insert into secondayTable values("04,c street","7826980179");
 insert into secondayTable values("298,b street","7282228020");
 delete from secondayTable where mobileNumber='7826980179';
 select * from primaryTable;
 select * from secondayTable;