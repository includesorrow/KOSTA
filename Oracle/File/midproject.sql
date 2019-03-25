select m.movie_number, m.movie_title, m.movie_price, t.tag_table_num, tt.tag_name
             from movie m, movie_tag t, tag_table tt
             where tt.tag_table_num = t.tag_table_num
              and m.movie_number = t.movie_number
              and movie_title like '%' || '�˹�' || '%';
update movie set movie_price = 10
where movie_number = 20164442;
rollback;

 SELECT 'DROP TABLE "' || TABLE_NAME || '" CASCADE CONSTRAINTS;' FROM user_tables;
DROP TABLE "MYLISTS" CASCADE CONSTRAINTS;
DROP TABLE "NOTICE" CASCADE CONSTRAINTS;
DROP TABLE "EVENT" CASCADE CONSTRAINTS;
DROP TABLE "MEMBER" CASCADE CONSTRAINTS;
DROP TABLE "REVIEW_USEDWORDS" CASCADE CONSTRAINTS;
DROP TABLE "WATCH_LOG" CASCADE CONSTRAINTS;
DROP TABLE "SEARCH_LOG" CASCADE CONSTRAINTS;
DROP TABLE "LOGIN_LOG" CASCADE CONSTRAINTS;
DROP TABLE "VIEW_LOG" CASCADE CONSTRAINTS;
DROP TABLE "TAG_CATEGORY" CASCADE CONSTRAINTS;
DROP TABLE "TAG_TABLE" CASCADE CONSTRAINTS;
DROP TABLE "MOVIE_SOLD_LOG" CASCADE CONSTRAINTS;
DROP TABLE "LIST_CATEGORY" CASCADE CONSTRAINTS;
DROP TABLE "LIST_TABLE" CASCADE CONSTRAINTS;
DROP TABLE "ANIVERSARY_TABLE" CASCADE CONSTRAINTS;
DROP TABLE "MOVIE_RATING" CASCADE CONSTRAINTS;
DROP TABLE "MEMBER_GRADE" CASCADE CONSTRAINTS;
DROP TABLE "MEMBER_FILTER" CASCADE CONSTRAINTS;
DROP TABLE "MINWON" CASCADE CONSTRAINTS;
DROP TABLE "COUNSEL_CATEGORY" CASCADE CONSTRAINTS;
DROP TABLE "MOVIE_TAG" CASCADE CONSTRAINTS;
DROP TABLE "MY_RANK_TABLE" CASCADE CONSTRAINTS;
DROP TABLE "MOVIE_MODIFY_LOG" CASCADE CONSTRAINTS;
DROP TABLE "PRICE" CASCADE CONSTRAINTS;
commit;

   insert into counsel_category values(1, '����');
   insert into counsel_category values(2, '�Ű�');
   insert into counsel_category values(3, '����');

   insert into tag_category values(1, '�帣');
   insert into tag_category values(2, '���');
   insert into tag_category values(3, '����');
   insert into tag_category values(4, '���');
   
   commit;
   select m.movie_title, t.tag_name from movie m, tag_table t, movie_tag s 
   where m.movie_number=s.movie_number 
   and t.tag_table_num = s.tag_table_num 
   and tag_category_num=1;
   
   
   select m.movie_title,m.movie_price, t.movie_number, tt.tag_name, tt.tag_table_num, tt.tag_category_num
   from movie m, movie_tag t, tag_table tt
   where m.movie_number = t.movie_number
   and t.tag_table_num = tt.tag_table_num
      and tag_category_num = 1
   and movie_title like '%'|| '�α׳��̼�'|| '%';

   select movie_title, movie_number
   from movie
   where movie_number=19890094;
   
   
   --�ʱ� ���̺�--

INSERT INTO MEMBER_GRADE VALUES(9,'�ְ������');
INSERT INTO MEMBER_GRADE VALUES(7,'�ο������');
INSERT INTO MEMBER_GRADE VALUES(6,'��ȭ�����');
INSERT INTO MEMBER_GRADE VALUES(5,'ȸ�������');
INSERT INTO MEMBER_GRADE VALUES(1,'�Ϲ�����');
Insert Into MEMBER VALUES(1,'Admin@Admin.ad','�ְ������','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,9,1);
   Insert Into MEMBER VALUES(2,'Minwon_Admin1@Admin.ad','�ο������1','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,7,1);
   Insert Into MEMBER VALUES(3,'Minwon_Admin2@Admin.ad','�ο������2','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,7,1);
   Insert Into MEMBER VALUES(4,'Minwon_Admin3@Admin.ad','�ο������2','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,7,1);

   Insert into member values(5,'Movie_Admin1@Admin.ad','��ȭ�����1','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,6,1);
   Insert into member values(6,'Movie_Admin2@Admin.ad','��ȭ�����2','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,6,1);
   Insert into member values(7,'Movie_Admin3@Admin.ad','��ȭ�����3','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,6,1);

   Insert into member values(8,'Client_Admin1@Admin.ad','ȸ�������1','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,5,1);
   Insert into member values(9,'Client_Admin2@Admin.ad','ȸ�������2','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,5,1);
   Insert into member values(10,'Client_Admin3@Admin.ad','ȸ�������3','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,5,1);
   insert into counsel_category values(1, '����');
   insert into counsel_category values(2, '�Ű�');
   insert into counsel_category values(3, '����');

   insert into tag_category values(1, '�帣');
   insert into tag_category values(2, '���');
   insert into tag_category values(3, '����');
   insert into tag_category values(4, '���');
   
   insert into price values(1,0);
   insert into price values(2,1000);
   insert into price values(3,2500);
   insert into price values(4,5000);
   insert into price values(5,10000);
   insert into active_check values(0, '��Ȱ��ȭ');
insert into active_check values(1, 'Ȱ��ȭ');
   
   
   
   commit;
   
   insert into movie values(111111,1,'��������',to_date('1999-01-01'),to_date('1999-01-01'),10,1000,1000,1000,1000,1000);
   insert into movie values(222222,1,'�̼����ļ���',to_date('1999-01-01'),to_date('1999-01-01'),10,1000,1000,1000,1000,1000);
   insert into movie values(333333,1,'�̼�',to_date('1999-01-01'),to_date('1999-01-01'),10,1000,1000,1000,1000,1000);
   insert into movie values(444444,1,'����',to_date('1999-01-01'),to_date('1999-01-01'),10,1000,1000,1000,1000,1000);
   insert into movie values(555555,1,'��ȭ�¿�ȭ��',to_date('1999-01-01'),to_date('1999-01-01'),10,1000,1000,1000,1000,1000);
   insert into movie values(666666,1,'�Ϻ�',to_date('1999-01-01'),to_date('1999-01-01'),10,1000,1000,1000,1000,1000);
   
   
   insert into tag_table values(1,'C1','�׼�');
   insert into tag_table values(1,'C2','��Ÿ��');
   insert into tag_table values(1,'C3','�θǽ�');
   insert into tag_table values(1,'C4','�ִϸ��̼�');
   insert into tag_table values(1,'C5','����');
   
   insert into tag_table values(2,10000,'����A');
   insert into tag_table values(2,20000,'����B');
   insert into tag_table values(2,30000,'����C');
   insert into tag_table values(2,40000,'����D');
   insert into tag_table values(2,50000,'����E');
   insert into tag_table values(2,60000,'����F');
   insert into tag_table values(2,70000,'����G');
   insert into tag_table values(2,80000,'����H');
   
   insert into tag_table values(3,1111,'���A');
   insert into tag_table values(3,2222,'���B');
   insert into tag_table values(3,3333,'���C');
   insert into tag_table values(3,4444,'���D');
   insert into tag_table values(3,5555,'���E');
   insert into tag_table values(3,6666,'���F');
   insert into tag_table values(3,7777,'���G');
   insert into tag_table values(3,8888,'���H');
   
   insert into movie_tag values(111111,10000);
   insert into movie_tag values(111111,'C1');
   insert into movie_tag values(111111,1111);
   
   commit;
   
   insert into movie_tag values(222222,20000);
   insert into movie_tag values(222222,'C1');
   insert into movie_tag values(222222,2222);
   insert into movie_tag values(222222,1111);
   
   insert into movie_tag values(333333,30000);
   insert into movie_tag values(333333,'C2');
   insert into movie_tag values(333333,3333);
   
   insert into movie_tag values(444444,40000);
   insert into movie_tag values(444444,'C2');
   insert into movie_tag values(444444,4444);

   insert into moive_tag values(555555,50000);
   insert into movie_tag values(555555,'C3');
   insert into movie_tag values(555555,5555);
   
   insert into movie_tag values(666666,60000);
   insert into movie_tag values(666666,'C4');
   insert into movie_tag values(666666,6666);
   
   insert into movie_tag values(777777,70000);
   insert into movie_tag values(777777,'c5');
   insert into movie_tag values(777777,7777);
   
   insert into movie_tag values(888888,80000);
   insert into movie_tag values(888888,'C5');
   insert into movie_tag values(888888,8888);
   COMMIT;
   
   
   select m.movie_title, t.tag_table_num, tt.tag_category_num, tt.tag_name
   from movie m, movie_tag t, tag_table tt
   where m.movie_number = t.movie_number
   and t.tag_table_num = tt.tag_table_num
   and tt.tag_category_num = 1
   and movie_title like '%'||'����'||'%';
   
   
   
   insert  into loginlog values(1,1,sysdate,sysdate);
insert  into loginlog values(2,1,'19/03/16','19/03/16');
insert  into loginlog values(3,1,'19/03/15','19/03/15');
insert  into loginlog values(4,1,'19/03/14','19/03/14');
insert  into loginlog values(5,1,'19/03/13','19/03/13');
insert  into loginlog values(6,1,'19/03/13','19/03/12');
insert  into loginlog values(7,1,'19/03/13','19/03/11');
insert  into loginlog values(9,1,'19/03/17','19/03/17');
insert  into loginlog values(11,1,'19/03/19','19/03/19');
insert  into loginlog values(12,1,'19/02/18','19/03/19');
insert  into loginlog values(13,1,'19/01/18','19/03/19');
insert  into loginlog values(14,1,'18/12/18','19/03/19');
insert  into loginlog values(15,1,'18/11/18','19/03/19');
insert  into loginlog values(16,1,'19/02/18','19/03/19');
insert  into loginlog values(17,1,'17/10/18','19/03/19');
insert  into loginlog values(18,1,'16/12/18','16/03/19');
insert  into loginlog values(19,1,'15/11/18','15/03/19');
insert  into loginlog values(20,1,'14/02/18','14/03/19');
insert  into loginlog values(21,1,'13/10/18','13/03/19');
insert  into loginlog values(22,1,'17/10/18','17/03/19');
insert  into loginlog values(23,1,'19/03/20','19/03/20');
insert  into loginlog values(24,1,'18/03/20','19/03/20');


select movie_price
from movie
where movie_price >= 5;




create or replace trigger price_trigger
after update 
on movie
for each row
declare
BEGIN

(select movie_price
from movie
where movie_price >= 6);
end;

CREATE OR REPLACE VIEW name_query
     AS
       SELECT a.ename, b.dname
       FROM  emp a, dept b
       WHERE a.deptno = b.deptno
         AND b.deptno = 20;
         
         
    create or replace view movie_search
    as
    select m.movie_number, m.movie_title, m.movie_price,m.movie_open_date, m.movie_purchase_date, m.movie_rating,m.movie_investment,  t.tag_table_num,tt.tag_category_num, tt.tag_name
    from movie m, movie_tag t, tag_table tt
    where m.movie_number = t.movie_number
				and t.tag_table_num = tt.tag_table_num
				and tt.tag_category_num = 1;	
		
commit;
rollback;

delete from movie where movie_number='20124054';

select movie_number from movie
where movie_number = '20071053';


delete from movie m, movie_Rating mr, moviesoldlog msl, movie_tag mt, viewlog vl, my_rank_table mrt, list_table lt,
review_usedwords ruw, watchlog wl

where m.movie_number = '20080698'
and mr.movie_number = '20080698'
and msl.movie_number = '20080698'
and mt.movie_number = '20080698'
and vl.movie_number = '20080698'
and mrt.movie_number = '20080698'
and lt.movie_number = '20080698'
and ruw.movie_number = '20080698'
and wl.movie_number = '20080698';

delete from 
where movie_number=20080698;



create VIEW delete_movie
as select m.movie_number, t.movie_number
from movie m, movie_tag t;
         commit;
         
         
         
         
select movie_title from movie
where active_check_number=0;

         
         
         