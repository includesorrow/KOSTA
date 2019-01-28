create table t_reg(
TEXT varchar2(300)


);



insert into T_REG values('ABC123');
insert into T_REG values('ABC 123');
insert into T_REG values('ABC  123');
insert into T_REG values('abc 123');
insert into T_REG values('abc  123');
insert into T_REG values('a1b2c3');
insert into T_REG values('aabbcc123');
insert into T_REG values('?/!@#$*&');
insert into T_REG values('\~*().,');
insert into T_REG values('123123');
insert into T_REG values('123abc');
insert into T_REG values('abc');

select * from t_reg
where regexp_like(text, '[a-z]');

select * from t_reg
where regexp_like(text, '[A-Z]');

select * from t_reg
where regexp_like(text, '[a-zA-Z]');

select * from t_reg
where regexp_like(text, '[a-z] ');

select * from t_reg
where regexp_like(text, '[a-z] [0-9]');


select * from t_reg
where regexp_like(text, '[[:space:]]');

select * from t_reg
where regexp_like(text, '[A-Z]{4}');

select * from t_reg
where regexp_like(text, '[0-9]{3}');

select * from t_reg
where regexp_like(text, '[A-Z][0-9]{3}');

select * from t_reg
where regexp_like(text, '[[:upper:]]');


select * from t_reg
where regexp_like(text, '^[A-Za-z]');
select * from t_reg
where regexp_like(text, '^[0-9A-Z]');
select * from t_reg
where regexp_like(text, '^[a-z]|^[0-9]');

select * from t_reg
where regexp_like(text, '[a-zA-Z]$');

select * from t_reg
where regexp_like(text, '[[:alpha:]]$');
select * from t_reg
where regexp_like(text, '^[^a-z]');
select * from t_reg
where regexp_like(text, '^[^0-9a-z]');
select * from t_reg
where not regexp_like(text, '[a-z]');

create table student(
NAME varchar2(300),
ID varchar(300)

);

insert into student(name,id) values('James Seo', '75true');
insert into student(name,id) values('Demi Moore', 'Moore');
insert into student(name,id) values('Bill Murray', 'Murray');

select * from t_reg
where not regexp_like(text, '[0-9]');

select * from t_reg
where regexp_like(text, '?');


select * from t_reg
where regexp_like(text, '*');


select * from t_reg
where not regexp_like(text, '\?');


select text, regexp_replace(text,'[[:digit:]]','*') "no -> char"
from t_reg;

select text, regexp_replace(text,'([0-9])','\1-*') "ADD CGHAR"
from t_reg;

select regexp_replace('aaa  bbb', '( ){1,}','') from dual;


select regexp_replace('aaa bbb', '( ){2,}','') AS ONE,
REGEXP_REPLACE('aaa  bbb', '( ){2,}','') "TWO"
from dual;


select regexp_replace('aaa bbb', '( ){2,}','*') AS ONE,

regexp_replace('aaa  bbb', '( ){2,}','*') AS two,
regexp_replace('aaa   bbb', '( ){2,}','*') AS three
from dual;


select regexp_replace('20141023', '([[:digit:]]{4})([[:digit:]]{2})([[:digit:]]{2})','\1-\2-\3')
from dual;

select regexp_substr('sys\oracle@racdb:1521:racdb',
'[^:]+',1,2) result
from dual;

select regexp_substr('sys\oracle@racdb:1521:racdb',
'[^\:]+',1,2) result
from dual;

select regexp_substr('sys\oracle@racdb:1521:racdb',
'[^\:]+',1,1) result
from dual;

set pagesize 50
select text, regexp_count(text,'A')
from t_reg;

select text, regexp_count(text,'c',3)
from t_reg;
select text, regexp_count(text,'c') "result1",
regexp_count(text,'c',1,'i') "result2"
from t_reg ;
select text, regexp_count(text,'.') "result1",
regexp_count(text,'\,') "result2"
from t_reg ;