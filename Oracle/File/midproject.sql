select m.movie_number, m.movie_title, m.movie_price, t.tag_table_num, tt.tag_name
             from movie m, movie_tag t, tag_table tt
             where tt.tag_table_num = t.tag_table_num
              and m.movie_number = t.movie_number
              and movie_title like '%' || '옹박' || '%';
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

   insert into counsel_category values(1, '건의');
   insert into counsel_category values(2, '신고');
   insert into counsel_category values(3, '문의');

   insert into tag_category values(1, '장르');
   insert into tag_category values(2, '배우');
   insert into tag_category values(3, '감독');
   insert into tag_category values(4, '댓글');
   
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
   and movie_title like '%'|| '로그네이션'|| '%';

   select movie_title, movie_number
   from movie
   where movie_number=19890094;
   
   
   --초기 테이블값--

INSERT INTO MEMBER_GRADE VALUES(9,'최고관리자');
INSERT INTO MEMBER_GRADE VALUES(7,'민원담당자');
INSERT INTO MEMBER_GRADE VALUES(6,'영화담당자');
INSERT INTO MEMBER_GRADE VALUES(5,'회원담당자');
INSERT INTO MEMBER_GRADE VALUES(1,'일반유저');
Insert Into MEMBER VALUES(1,'Admin@Admin.ad','최고관리자','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,9,1);
   Insert Into MEMBER VALUES(2,'Minwon_Admin1@Admin.ad','민원담당자1','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,7,1);
   Insert Into MEMBER VALUES(3,'Minwon_Admin2@Admin.ad','민원담당자2','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,7,1);
   Insert Into MEMBER VALUES(4,'Minwon_Admin3@Admin.ad','민원담당자2','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,7,1);

   Insert into member values(5,'Movie_Admin1@Admin.ad','영화담당자1','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,6,1);
   Insert into member values(6,'Movie_Admin2@Admin.ad','영화담당자2','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,6,1);
   Insert into member values(7,'Movie_Admin3@Admin.ad','영화담당자3','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,6,1);

   Insert into member values(8,'Client_Admin1@Admin.ad','회원담당자1','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,5,1);
   Insert into member values(9,'Client_Admin2@Admin.ad','회원담당자2','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,5,1);
   Insert into member values(10,'Client_Admin3@Admin.ad','회원담당자3','admin',to_date('1900-01-01'),to_date('1900-01-01'),null,5,1);
   insert into counsel_category values(1, '건의');
   insert into counsel_category values(2, '신고');
   insert into counsel_category values(3, '문의');

   insert into tag_category values(1, '장르');
   insert into tag_category values(2, '배우');
   insert into tag_category values(3, '감독');
   insert into tag_category values(4, '댓글');
   
   insert into price values(1,0);
   insert into price values(2,1000);
   insert into price values(3,2500);
   insert into price values(4,5000);
   insert into price values(5,10000);
   insert into active_check values(0, '비활성화');
insert into active_check values(1, '활성화');
   
   
   
   commit;
   
   insert into movie values(111111,1,'극한직업',to_date('1999-01-01'),to_date('1999-01-01'),10,1000,1000,1000,1000,1000);
   insert into movie values(222222,1,'미션임파서블',to_date('1999-01-01'),to_date('1999-01-01'),10,1000,1000,1000,1000,1000);
   insert into movie values(333333,1,'미션',to_date('1999-01-01'),to_date('1999-01-01'),10,1000,1000,1000,1000,1000);
   insert into movie values(444444,1,'마션',to_date('1999-01-01'),to_date('1999-01-01'),10,1000,1000,1000,1000,1000);
   insert into movie values(555555,1,'영화는영화다',to_date('1999-01-01'),to_date('1999-01-01'),10,1000,1000,1000,1000,1000);
   insert into movie values(666666,1,'완벽',to_date('1999-01-01'),to_date('1999-01-01'),10,1000,1000,1000,1000,1000);
   
   
   insert into tag_table values(1,'C1','액션');
   insert into tag_table values(1,'C2','판타지');
   insert into tag_table values(1,'C3','로맨스');
   insert into tag_table values(1,'C4','애니메이션');
   insert into tag_table values(1,'C5','공포');
   
   insert into tag_table values(2,10000,'감독A');
   insert into tag_table values(2,20000,'감독B');
   insert into tag_table values(2,30000,'감독C');
   insert into tag_table values(2,40000,'감독D');
   insert into tag_table values(2,50000,'감독E');
   insert into tag_table values(2,60000,'감독F');
   insert into tag_table values(2,70000,'감독G');
   insert into tag_table values(2,80000,'감독H');
   
   insert into tag_table values(3,1111,'배우A');
   insert into tag_table values(3,2222,'배우B');
   insert into tag_table values(3,3333,'배우C');
   insert into tag_table values(3,4444,'배우D');
   insert into tag_table values(3,5555,'배우E');
   insert into tag_table values(3,6666,'배우F');
   insert into tag_table values(3,7777,'배우G');
   insert into tag_table values(3,8888,'배우H');
   
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
   and movie_title like '%'||'극한'||'%';
   
   
   
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

         
         
         