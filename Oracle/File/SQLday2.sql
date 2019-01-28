

/*���̺�� gogek
gobun number(3)
goname varchar2(25)
gotel varchar2(34)
gojumin varchar2(14)
godam number(3)
pk : gobun
unique, notnull : jumin
foreign key godam -> sawon.sabun
*/

CREATE TABLE GOGEK(
gobun number(3),
goname varchar2(25),
gotel varchar2(34),
gojumin varchar2(14)constraint gogek_gojumin_nn NOT NULL,
godam number(3),

constraint gogek_gobun_pk primary key(gobun),
constraint gogek_gojumin_uq unique(gojumin),

constraint gogek_godam_fk foreign key (godam) references sawon(sabun)
);

delete from dept;
delete from sawon;
commit;

Insert Into Dept Values(10, '�ѹ���','����');
Insert Into Dept Values(20, '������','����');
Insert Into Dept Values(30, '�����','�λ�');
Insert Into Dept Values(40, '������', '����');
Insert Into Dept Values(50, '���ߺ�', '����');

Insert Into sawon Values(1,'��浿',10,'ȸ��',5000,'1980/01/01','����',null);
Insert Into sawon Values(2,'�ѱ���',20,'����',3000,'1988/11/01', '����',1);
Insert Into sawon Values(3,'�̼���',20,'����',3500,'1985/03/01','����', 2);
Insert Into sawon Values(5,'�̼���',20,'���',1200,'1990/05/01','����', 3);
Insert Into sawon Values(7,'��⸸',20,'����',2300,'1996/06/01','����', 2);
Insert Into sawon Values(11,'������',20,'����',1600,'1989/12/01','����', 2);
Insert Into sawon Values(14,'ä�ö�',20,'���',3400,'1993/10/01','����', 3);
Insert Into sawon Values(17,'�̼���',30,'����',2803,'1984/05/01','����', 1);
Insert Into sawon Values(13,'����ȭ',10,'����',3000,'1996/11/01','����', 1);
Insert Into sawon Values(19,'�Ӳ���',20,'���',2200,'1988/04/01','����', 7);
Insert Into sawon Values(20,'������',10,'����',4500,'1990/05/01','����', 13);
Insert Into sawon Values(6,'���θ�',30,'����',4003,'1995/05/01','����', 17);
Insert Into sawon Values(8,'ä��ȭ',30,'�븮',1703,'1992/06/01','����', 17);
Insert Into sawon Values(12,'������',10,'�븮',1800,'1990/10/01','����', 20);
Insert Into sawon Values(9,'����ȭ',10,'���',1100,'1984/08/01','����', 12);
Insert Into sawon Values(4,'�̶̹�',30,'�븮',2503,'1983/04/01','����', 17);
Insert Into sawon Values(10,'������',30,'���',1303,'1988/11/01','����', 4);
Insert Into sawon Values(15,'���϶�',10,'���',2000,'1991/04/01','����', 12);
Insert Into sawon Values(16,'������',30,'���',400,'1981/04/01','����', 4);
Insert Into sawon Values(18,'������',30,'���',1003,'1986/07/01','����', 4);
Insert Into sawon Values(21,'�����',50,'����',4500,'2000/05/01','����', 1);
Insert Into sawon Values(22,'ȫ����',50,'����',3500,'2001/11/01','����', 21);
Insert Into sawon Values(23,'������',50,'�븮',2500,'2002/08/01','����', 22);
Insert Into sawon Values(24,'������',50,'���',2000,'2010/05/11','����', 23);


insert into gogek values(1,'����', '123-1234', '700113-1537915',3);
insert into gogek values(2,'����', '343-1454', '690216-1627914',2);
insert into gogek values(3,'����', '144-1655', '750320-2636215',null);
insert into gogek values(4,'ö��', '673-1674', '770430-1234567',4);
insert into gogek values(5,'����', '123-1674', '720521-1123675',3);
insert into gogek values(6,'ĵ��', '673-1764', '650725-2534566',null);
insert into gogek values(7,'����', '176-7677', '630608-1648614',7);
insert into gogek values(8,'�赹', '673-6774', '800804-1346574',9);
insert into gogek values(9,'ȫ��', '767-1234', '731225-1234689',13);
insert into gogek values(10,'�ȳ�','767-1677', '751015-2432168',4);
insert into gogek values(11,'�䳪','767-1677', '041010-4142355',24);
insert into gogek values(12,'�α�','767-1677', '031015-3112163',24);
commit;




--alias
select saname as ����̸� from sawon;
--select column
--as ����̸� << ��Ī�� ����.

select saname ����̸� from sawon;

select saname "��� �̸�" from sawon;

--�ֵ���ǥ  ���� ���� : Ȥ�ó� �����̽� ����� �� �־.

--���ڿ� ���� ������
select saname || '�� ��� ��ȣ�� ' || sabun || '�Դϴ�.'
from sawon;

--�̷��� ���� �����ϴ�.

select saname || ' �� �޿��� '||sapay||' �Դϴ� �̹���     ���ʽ���'||sapay||'�� 50%�Դϴ�.'    as �׽�Ʈ
from sawon;

---------------

select saname || '�� ��� ��ȣ�� ' || sabun || '�Դϴ�.' as sainfo
from sawon;
--�̷��� ���� ��-��





--�񱳿�����
select saname as �̸�, sapay/12 as ���� from sawon;
select saname, sapay/2 * 100 as ���ʽ� from sawon;
---���� : 10���μ��� ������ �ؾ߰ڴ�
select saname, deptno, sapay/2 * 100 as ���ʽ� 
from sawon 
where deptno = 10;
-- 2000 ~ 3000������ �޿��� �޴� ����� ���
--and ������ or������

select saname, sapay , deptno
from sawon
where sapay>=2000 and sapay <= 3000 and deptno = 10;


 --�μ���ȣ�� 10, 20�μ��� ����Ͻÿ�
 
 SELECT saname, sapy, deptno
 from sawon
 where deptno = 10 or deptno = 20;
 
 ---in������ (or�����ڰ� ��������)                                                                                                              
 
 --in������, or�� ����ϴ°ͺ��� ���α׷����� ����������
 --not in() -> �ʼ������� �����ؾ� ��
 
 select saname, sapay, deptno
 from sawon
 where deptno in(10,20);

 select saname, sapay, deptno
 from sawon
 where deptno not in(10,20);


--like ���ڿ� ������
-- % � ���� ���ڿ�
-- _ � �� ���ڿ�
-- ��) �̸��߿� "��"�� ���� ����� ã�� �ʹ�

select saname, sapay
from sawon
where saname like '%��%';


select saname
from sawon
where saname like '__��';

--dual table : ���� ���̺�
--�� ������ ����� ����ϱ� ���� ���� ���̺�
--�������, ������ �÷� ���� ���� �ѹ��� ����ϱ� ���� �������� ���
select 100* 2 result 
from sawon;
--100 * 2 -> ��Ű���� �Ǵ� ��. 24���� ���.
select 100* 2 result 
from sawon 
where sabun = 1; 
--�̷��� �Ǳ� ��.�ٵ� �̰� �߸���.
--�ٵ� �̰� ����� 24���̺��� ����.

select 100 * 2 result
from dual;
--�̷��� ���� ���ϴ� ���� 1���� ����.
select 100 * 2 result
from dual;
desc dual;


--sysdate ���� ��¥�� �������.
select sysdate from dual;
desc dual;
select * from dual;
-- X������. �ƹ��ǹ̾��� ROW���� ������.    

--�����Լ�
select -10, abs(-10) from dual;
select sin(10), cos(10), tan(10) from dual;


--�ݿø�
select round(999.999) as Ȯ�� from dual;
select round(999.999,0) from dual;
select round(999.999,2) from dual;
select round(999.999,-2) from dual;
select round(888.888,9) from dual;

--�ڸ����� ������ ����
select trunc(888.999) from dual;
select trunc(888.999,0) from dual;
select trunc(888.999,2) from dual;
select trunc(888.999,-2) from dual;
--���Ѱ�(cell), ���Ѱ�(floor)
select ceil(10.001), floor(10.99) from dual;
--ceil �����ǿø�
--floor �����ǳ���



--���� ������ ��
select mod(10,2) from dual;


--�����Լ�
--length ���ڿ��� ���̸� ���ϴ� �Լ�
select length('kostaBigdataStudy Oracle') from dual;
--lower upper : �ҹ���/�빮��
select lower('kostaBigdataStudy Oracle') from dual;


--initcap() : ���ڿ��� ù��° ���ڸ� �빮�ڷ� ��ȯ
select initcap('kostaBigdataStudy Oracle') from dual;
select * from nis_database_parameters where parameter like '%charcterset%';

--AL32UTF8 : �ѱ� ���� ����� ����, 3����Ʈ ������ ������
select lengthb('kosta'), length('kosta') from dual;
--lengthb : ���ڿ��� ����Ʈ���� ��ȯ
select lengthb('����Ŭ'), length('����Ŭ') from dual;


--���ڿ��ڸ��� (trim), rtrin, ltrim
select trim(' kosta bigdata ' ), length( ' kosta bigdata ' ) ,length( trim (' kosta bigdata ' )) from dual;
--rtrim, ltrim���� ���� �߶󺾽ô�.
select length(rtrim('     kosta bigdata             ')), length(ltrim(' kosta bigdata    ')) from dual;

select trim('*' from '*****kosta bigdata******') from dual;



--instr(���ڿ�,ã�����ڿ�,�˻�����,n��°)
--���ڿ� �߿��� ������ Ư�� ���ڰ� ���Ե� ��ġ�� ��ȯ�ϴ� �Լ�
select instr('kosta_kosta', 'k', 1,2) from dual;
select instr('kosta_kosta', 'k', -1,2) from dual;
select instr('kosta_kosta', 'k', 1,-2) from dual;



--substr(���ڿ�, n���� n��)
--����Ŭ �ε����� 1���� ����*******
select substr('Welcome to Oracle', 3) from dual;
select substr('Welcome to Oracle', 5,3) from dual;
select substr('Welcome to Oracle', -3,3) from dual;
select substr('Welcome to Oracle', 3,3) from dual;


create table memphone(
num number(3) constraint memphone_num_pk primary key,
name varchar2(20),
pnum varchar2(25));
create sequence memphone_seq
increment by 1
start with 1;
insert into memphone values(memphone_seq.nextVal,'��ű�', '02)567-1267');
insert into memphone values(memphone_seq.nextVal,'�����', '032)567-1267');
insert into memphone values(memphone_seq.nextVal,'��ī��', '051)567-1267');
insert into memphone values(memphone_seq.nextVal,'�帮��', '053)567-1267');
insert into memphone values(memphone_seq.nextVal,'���ϴ�', '02)567-1267');

--memberphone ���̺��� ������� ��ȭ��ȣ�߿�

--�����, ����, ��ȭ��ȣ ���·� ����Ͻÿ�.












select name as �����
from memphone;

select 
substr(pnum,1,1) as ��ȭ��ȣ
from memphone;
---instr('kosta_kosta', 'k', 1,2)

select instr(pnum,')',1,1) as ��ȭ��ȣ
from memphone;

--------------------
select name, 
substr(pnum,1,instr(pnum,')',1,1)-1),
substr(pnum, (instr(pnum,')',1,1)+1),10)
from memphone;

--instr(���ڿ�,ã�����ڿ�,�˻�����,n��°)
--���ڿ� �߿��� ������ Ư�� ���ڰ� ���Ե� ��ġ�� ��ȯ�ϴ� �Լ�
select instr('kosta_kosta', 'k', 1,2) from dual;
select instr('kosta_kosta', 'k', -1,2) from dual;
select instr('kosta_kosta', 'k', 1,-2) from dual;


--����ä��� �Լ�

select rpad(saname,8,'��'), lpad(saname,8,'��') from sawon;
--���浿�ڡ�              �ڡڰ��浿


--select gojumin from gogek;
--�̰ſ�������. �ֹε��ڸ� �����°�




--decode�Լ�  : oracle������ �����ϴ� SQL�Լ�
--decode(���ذ�,����1,���1,����2,���2,......�׿�) "�÷�"
--case �Լ� : decode�� ����� Ȯ���� �Լ�
/*

case [���ذ�] when ���ذ� ���ǰ�1 then ���1
when ���ذ� ���ǰ�2 then ���2
else �� ���� �����
end "�÷���"
*/

select saname, deptno,
case when deptno = 50 then '���ߺ�'
when deptno = 20 then '������'
when deptno = 30 then '�����'
else '�Ѱ�����'
end "�ӽúμ���"
from sawon order by 2 asc;



--���� : decode �Լ��� ���ذ��� ���ϴ� column���� "-"�񱳸� ���ؼ��� ���ǰ� ��ġ
--case : ���, ��, ���� �پ��� �񱳰� �����ϴ�.

select deptno, dname from dept;


--�ѹ����� ������� �ѹ��� -> �Ѱ�����
--10���μ��� ��쿡 view�� �ѹ��ΰ� �ƴ� �Ѱ����η� �������� �� ��

select saname, deptno, decode(deptno,10,'�Ѱ�����',20,'������',30,'�����',40,'������',50,'�����','�Ѱ�����') 
"�ӽúμ���"
from sawon
order by 2 asc;
-- order by asc : ��������, desc ��������. 
--deptno�� �������� ���������Ѱ�


select * from gogek;



select * from gogek where godam is null;
select * from gogek where godam is not null;

commit;




---------------------------------------------------------------------------
select '�μ���ȣ'||deptno as deptno
, saname||'���� �޿���'||sapay||'�Դϴ�.' as message
from sawon
where sapay>=2000 and sapay<=3000;


-------------------------------------
select saname as �����, sapay as �޿�, round(sapay/12,-1)  as ����, sapay/ 1000 * 33*10000 as ����
from sawon;
select round(999.999,0) from dual;


select (RPAD(gojumin,7,'*') ||'*******')
from gogek;

-------------------------
select goname,gojumin,
case when substr(gojumin, (instr(gojumin,'-',1,1)+1),1) =1 then '����'
else '����'
end "����"
from gogek;
----------------

select saname, deptno,
case when deptno = 50 then '���ߺ�'
when deptno = 20 then '������'
when deptno = 30 then '�����'
else '�Ѱ�����'
end "�ӽúμ���"
from sawon order by 2 asc;

-----------------------------

select saname, sapay,
case when sapay < 1000 then sapay*0.1
when sapay >=1000 and sapay < 2000 then sapay*0.15
else sapay*0.2
end "���ʽ�"
from sawon;


-----------------

select saname || ' �� �޿��� '||sapay||' �Դϴ� �̹���     ���ʽ���'||sapay||'�� 50%�Դϴ�.'    as  ���ʽ�
from sawon;

select '�μ���ȣ'||deptno as deptno
, saname||'���� �޿���'||sapay||'�Դϴ�.' as message
from sawon
where sapay>=2000 and sapay<=3000;

select saname as �����, sapay as �޿�, round(sapay/12,-1)  as ����, sapay/ 1000 * 33*10000 as ����
from sawon;

select (RPAD(gojumin,7,'*') ||'*******')
from gogek;



select goname,gojumin,
case when substr(gojumin, (instr(gojumin,'-',1,1)+1),1) =1 then '����'
else '����'
end "����"
from gogek;


select saname, sapay,
case when sapay < 1000 then sapay*0.1
when sapay >=1000 and sapay < 2000 then sapay*0.15
else sapay*0.2
end "���ʽ�"
from sawon;
