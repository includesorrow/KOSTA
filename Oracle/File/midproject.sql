select m.movie_number, m.movie_title, m.movie_price, t.tag_table_num, tt.tag_name
             from movie m, movie_tag t, tag_table tt
             where tt.tag_table_num = t.tag_table_num
              and m.movie_number = t.movie_number
              and movie_title like '%' || '옹박' || '%';
update movie set movie_price = 10
where movie_number = 20164442;
rollback;


alter table review_usedwords modify(usedwords_contents varchar2(3000));

Insert Into MEMBER VALUES(11,'oracle1@naver.com','김길동','abcd',to_date('1900-01-01'),to_date('1900-01-01'),null,1,1);
Insert Into MEMBER VALUES(12,'oracle2@naver.com','이하윤','abcd',to_date('1900-01-01'),to_date('1900-01-01'),null,1,1);
Insert Into MEMBER VALUES(13,'oracle3@naver.com','박도윤','abcd',to_date('1900-01-01'),to_date('1900-01-01'),null,1,1);
Insert Into MEMBER VALUES(14,'oracle4@naver.com','최서윤','abcd',to_date('1900-01-01'),to_date('1900-01-01'),null,1,1);
Insert Into MEMBER VALUES(15,'oracle5@naver.com','윤하준','abcd',to_date('1900-01-01'),to_date('1900-01-01'),null,1,1);
Insert Into MEMBER VALUES(16,'oracle6@naver.com','김서연','abcd',to_date('1900-01-01'),to_date('1900-01-01'),null,1,1);
Insert Into MEMBER VALUES(17,'oracle7@naver.com','이서준','abcd',to_date('1900-01-01'),to_date('1900-01-01'),null,1,1);
Insert Into MEMBER VALUES(18,'oracle8@naver.com','김길동','abcd',to_date('1900-01-01'),to_date('1900-01-01'),null,1,1);
Insert Into MEMBER VALUES(19,'oracle9@naver.com','박지유','abcd',to_date('1900-01-01'),to_date('1900-01-01'),null,1,1);
Insert Into MEMBER VALUES(20,'oracle10@naver.com','정민준','abcd',to_date('1900-01-01'),to_date('1900-01-01'),null,1,1);

Insert Into list_category VALUES(1,'찜리스트');
Insert Into list_category VALUES(2,'나의리스트');

Insert Into mylists VALUES(1,11,'나의 리스트1');
Insert Into mylists VALUES(2,11,'나의 리스트2');
Insert Into mylists VALUES(3,12,'나의 리스트1');
Insert Into mylists VALUES(4,12,'나의 리스트2');
Insert Into mylists VALUES(5,12,'나의 리스트3');
Insert Into mylists VALUES(6,12,'나의 리스트4');
Insert Into mylists VALUES(7,13,'나의 리스트1');
Insert Into mylists VALUES(8,13,'나의 리스트2');
Insert Into mylists VALUES(9,14,'나의 리스트1');
Insert Into mylists VALUES(10,15,'나의 리스트1');
Insert Into mylists VALUES(11,16,'나의 리스트2');
Insert Into mylists VALUES(12,17,'나의 리스트3');
Insert Into mylists VALUES(13,18,'나의 리스트4');
Insert Into mylists VALUES(14,18,'나의 리스트5');
Insert Into mylists VALUES(15,18,'나의 리스트6');
Insert Into mylists VALUES(16,18,'나의 리스트7');
Insert Into mylists VALUES(17,19,'나의 리스트1');
Insert Into mylists VALUES(18,19,'나의 리스트2');
Insert Into mylists VALUES(19,19,'나의 리스트3');
Insert Into mylists VALUES(20,20,'나의 리스트1');
Insert Into mylists VALUES(21,11,null);
Insert Into mylists VALUES(22,12,null);
Insert Into mylists VALUES(23,13,null);
Insert Into mylists VALUES(24,14,null);
Insert Into mylists VALUES(25,15,null);
Insert Into mylists VALUES(26,16,null);
Insert Into mylists VALUES(27,17,null);
Insert Into mylists VALUES(28,18,null);
Insert Into mylists VALUES(29,19,null);
Insert Into mylists VALUES(30,20,null);

Insert Into list_table VALUES(1,2,'20197470');
Insert Into list_table VALUES(2,2,'20185478');
Insert Into list_table VALUES(3,2,'20137902');
Insert Into list_table VALUES(4,2,'20195789');
Insert Into list_table VALUES(5,2,'20177537');
Insert Into list_table VALUES(6,2,'20197470');
Insert Into list_table VALUES(7,2,'20080394');
Insert Into list_table VALUES(8,2,'20137902');
Insert Into list_table VALUES(9,2,'20100752');
Insert Into list_table VALUES(10,2,'20184140');
Insert Into list_table VALUES(11,2,'20197470');
Insert Into list_table VALUES(12,2,'20184464');
Insert Into list_table VALUES(13,2,'19840018');
Insert Into list_table VALUES(14,2,'20186261');
Insert Into list_table VALUES(15,2,'20177539');
Insert Into list_table VALUES(16,2,'20184126');
Insert Into list_table VALUES(17,2,'20020222');
Insert Into list_table VALUES(18,2,'20196601');
Insert Into list_table VALUES(19,2,'20119890');
Insert Into list_table VALUES(20,2,'20184888');
Insert Into list_table VALUES(21,1,'20197149');
Insert Into list_table VALUES(22,1,'20119890');
Insert Into list_table VALUES(23,1,'20137902');
Insert Into list_table VALUES(24,1,'20020044');
Insert Into list_table VALUES(25,1,'20081396');
Insert Into list_table VALUES(26,1,'20186281');
Insert Into list_table VALUES(27,1,'20100752');
Insert Into list_table VALUES(28,1,'20184126');
Insert Into list_table VALUES(29,1,'20197470');
Insert Into list_table VALUES(30,1,'20180290');
Insert Into list_table VALUES(1,2,'20184464');
Insert Into list_table VALUES(2,2,'20177539');
Insert Into list_table VALUES(3,2,'20155924');
Insert Into list_table VALUES(4,2,'20185444');
Insert Into list_table VALUES(5,2,'20196601');
Insert Into list_table VALUES(6,2,'20184140');
Insert Into list_table VALUES(7,2,'201844641');
Insert Into list_table VALUES(8,2,'20197470');
Insert Into list_table VALUES(9,2,'20184481');
Insert Into list_table VALUES(10,2,'20189123');
Insert Into list_table VALUES(11,2,'20184140');
Insert Into list_table VALUES(12,2,'20119890');
Insert Into list_table VALUES(13,2,'20100752');
Insert Into list_table VALUES(14,2,'20197149');
Insert Into list_table VALUES(15,2,'19990050');
Insert Into list_table VALUES(16,2,'20177537');
Insert Into list_table VALUES(17,2,'20160501');
Insert Into list_table VALUES(18,2,'19840018');
Insert Into list_table VALUES(19,2,'20185242');
Insert Into list_table VALUES(20,2,'20184140');
Insert Into list_table VALUES(1,2,'20100807');
Insert Into list_table VALUES(2,2,'20196821');
Insert Into list_table VALUES(3,2,'20140144');
Insert Into list_table VALUES(4,2,'20176006');
Insert Into list_table VALUES(5,2,'20081396');
Insert Into list_table VALUES(6,2,'20176006');
Insert Into list_table VALUES(7,2,'20185478');
Insert Into list_table VALUES(8,2,'20020044');
Insert Into list_table VALUES(9,2,'20186202');
Insert Into list_table VALUES(10,2,'20182530');
Insert Into list_table VALUES(4,2,'20186261');
Insert Into list_table VALUES(5,2,'20176442');
Insert Into list_table VALUES(6,2,'20186281');
Insert Into list_table VALUES(7,2,'20129370');
Insert Into list_table VALUES(8,2,'20184464');
Insert Into list_table VALUES(9,2,'20182530');
Insert Into list_table VALUES(10,2,'20176442');
Insert Into list_table VALUES(11,2,'20186261');
Insert Into list_table VALUES(12,2,'20197149');
Insert Into list_table VALUES(13,2,'19840018');
Insert Into list_table VALUES(14,2,'20100752');
Insert Into list_table VALUES(15,2,'20185478');
Insert Into list_table VALUES(16,2,'20195789');

Insert Into my_rank_table VALUES(11,'20197470','y',null,null);
Insert Into my_rank_table VALUES(11,'20100807',null,'y',null);
Insert Into my_rank_table VALUES(11,'20176122',null,null,'y');
Insert Into my_rank_table VALUES(12,'19960077','y',null,null);
Insert Into my_rank_table VALUES(12,'19840018',null,'y',null);
Insert Into my_rank_table VALUES(12,'20189463',null,null,'y');
Insert Into my_rank_table VALUES(13,'20131248','y',null,null);
Insert Into my_rank_table VALUES(13,'20125048',null,'y',null);
Insert Into my_rank_table VALUES(13,'20185478',null,null,'y');
Insert Into my_rank_table VALUES(14,'20124054','y',null,null);
Insert Into my_rank_table VALUES(14,'20124083',null,'y',null);
Insert Into my_rank_table VALUES(15,'20160501',null,null,'y');
Insert Into my_rank_table VALUES(15,'20126674','y',null,null);
Insert Into my_rank_table VALUES(17,'20177537',null,'y',null);
Insert Into my_rank_table VALUES(17,'20195913',null,null,'y');
Insert Into my_rank_table VALUES(18,'20181877','y',null,null);
Insert Into my_rank_table VALUES(18,'20155702',null,'y',null);
Insert Into my_rank_table VALUES(18,'20010020',null,null,'y');
Insert Into my_rank_table VALUES(19,'20183502','y',null,null);
Insert Into my_rank_table VALUES(20,'20167904',null,'y',null);
Insert Into my_rank_table VALUES(20,'20170841',null,null,'y');


Insert Into watch_log VALUES(1,'20170841',11,sysdate);
Insert Into watch_log VALUES(2,'20100807',11,sysdate);
Insert Into watch_log VALUES(3,'20186202',11,sysdate);
Insert Into watch_log VALUES(4,'19900256',11,sysdate);
Insert Into watch_log VALUES(5,'20159286',11,sysdate);
Insert Into watch_log VALUES(6,'20158822',11,sysdate);
Insert Into watch_log VALUES(7,'20181942',11,sysdate);
Insert Into watch_log VALUES(8,'20189663',11,sysdate);
Insert Into watch_log VALUES(9,'20080071',11,sysdate);
Insert Into watch_log VALUES(10,'20139221',12,sysdate);
Insert Into watch_log VALUES(11,'20184802',12,sysdate);
Insert Into watch_log VALUES(12,'20181942',13,sysdate);
Insert Into watch_log VALUES(13,'19990143',13,sysdate);
Insert Into watch_log VALUES(14,'20170590',13,sysdate);
Insert Into watch_log VALUES(15,'20186501',14,sysdate);
Insert Into watch_log VALUES(16,'20060347',14,sysdate);
Insert Into watch_log VALUES(17,'20183195',14,sysdate);
Insert Into watch_log VALUES(18,'20181181',15,sysdate);
Insert Into watch_log VALUES(19,'20090834',15,sysdate);
Insert Into watch_log VALUES(20,'20183361',16,sysdate);
Insert Into watch_log VALUES(21,'19950095',17,sysdate);
Insert Into watch_log VALUES(22,'20188042',18,sysdate);
Insert Into watch_log VALUES(23,'20168668',19,sysdate);
Insert Into watch_log VALUES(24,'20186202',20,sysdate);
Insert Into watch_log VALUES(25,'20179731',20,sysdate);
Insert Into watch_log VALUES(26,'20172469',15,sysdate);
Insert Into watch_log VALUES(27,'20100807',16,sysdate);
Insert Into watch_log VALUES(28,'19790090',16,sysdate);
Insert Into watch_log VALUES(29,'19900204',17,sysdate);
Insert Into watch_log VALUES(30,'20183361',19,sysdate);
Insert Into watch_log VALUES(31,'20180522',12,sysdate);
Insert Into watch_log VALUES(32,'20154909',13,sysdate);
Insert Into watch_log VALUES(33,'20141111',13,sysdate);
Insert Into watch_log VALUES(34,'20150979',14,sysdate);
Insert Into watch_log VALUES(35,'20161481',14,sysdate);
Insert Into watch_log VALUES(36,'20150976',14,sysdate);
Insert Into watch_log VALUES(37,'20148048',15,sysdate);
Insert Into watch_log VALUES(38,'19980089',16,sysdate);
Insert Into watch_log VALUES(39,'20171909',16,sysdate);
Insert Into watch_log VALUES(40,'20178565',17,sysdate);
Insert Into watch_log VALUES(41,'20178126',18,sysdate);
Insert Into watch_log VALUES(42,'20168323',19,sysdate);
Insert Into watch_log VALUES(43,'20180126',20,sysdate);
Insert Into watch_log VALUES(44,'20175222',17,sysdate);
Insert Into watch_log VALUES(45,'20081057',17,sysdate);
Insert Into watch_log VALUES(46,'19980074',17,sysdate);
Insert Into watch_log VALUES(47,'20175054',17,sysdate);
Insert Into watch_log VALUES(48,'20186202',17,sysdate);
Insert Into watch_log VALUES(49,'20081697',17,sysdate);
Insert Into watch_log VALUES(50,'20070216',18,sysdate);


Insert Into view_log VALUES(1,'20182693',11,sysdate);
Insert Into view_log VALUES(2,'20183004',11,sysdate);
Insert Into view_log VALUES(3,'20010238',11,sysdate);
Insert Into view_log VALUES(4,'20168773',12,sysdate);
Insert Into view_log VALUES(5,'20177308',11,sysdate);
Insert Into view_log VALUES(6,'19980231',11,sysdate);
Insert Into view_log VALUES(7,'20124062',11,sysdate);
Insert Into view_log VALUES(8,'20189663',17,sysdate);
Insert Into view_log VALUES(9,'20176848',17,sysdate);
Insert Into view_log VALUES(10,'20139221',11,sysdate);
Insert Into view_log VALUES(11,'20184802',18,sysdate);
Insert Into view_log VALUES(12,'20181942',12,sysdate);
Insert Into view_log VALUES(13,'20070435',13,sysdate);
Insert Into view_log VALUES(14,'20170590',14,sysdate);
Insert Into view_log VALUES(15,'20186501',15,sysdate);
Insert Into view_log VALUES(16,'20060347',15,sysdate);
Insert Into view_log VALUES(17,'20183195',15,sysdate);
Insert Into view_log VALUES(18,'20010006',15,sysdate);
Insert Into view_log VALUES(19,'20090834',19,sysdate);
Insert Into view_log VALUES(20,'20183361',20,sysdate);
Insert Into view_log VALUES(21,'19950095',13,sysdate);
Insert Into view_log VALUES(22,'20135974',18,sysdate);
Insert Into view_log VALUES(23,'20168668',12,sysdate);
Insert Into view_log VALUES(24,'20186202',17,sysdate);
Insert Into view_log VALUES(25,'20164621',20,sysdate);
Insert Into view_log VALUES(26,'20172469',16,sysdate);
Insert Into view_log VALUES(27,'20100807',15,sysdate);
Insert Into view_log VALUES(28,'19790090',14,sysdate);
Insert Into view_log VALUES(29,'20100377',17,sysdate);
Insert Into view_log VALUES(30,'20183361',12,sysdate);
Insert Into view_log VALUES(31,'20180522',20,sysdate);
Insert Into view_log VALUES(32,'20154909',20,sysdate);
Insert Into view_log VALUES(33,'20161081',13,sysdate);
Insert Into view_log VALUES(34,'20150979',12,sysdate);
Insert Into view_log VALUES(35,'20161481',11,sysdate);
Insert Into view_log VALUES(36,'20173092',14,sysdate);
Insert Into view_log VALUES(37,'20148048',13,sysdate);
Insert Into view_log VALUES(38,'19980089',17,sysdate);
Insert Into view_log VALUES(39,'20171909',17,sysdate);
Insert Into view_log VALUES(40,'20178565',18,sysdate);
Insert Into view_log VALUES(41,'20178126',19,sysdate);
Insert Into view_log VALUES(42,'20168323',13,sysdate);
Insert Into view_log VALUES(43,'20180126',11,sysdate);
Insert Into view_log VALUES(44,'20175121',17,sysdate);
Insert Into view_log VALUES(45,'20156557',17,sysdate);
Insert Into view_log VALUES(46,'20177946',17,sysdate);
Insert Into view_log VALUES(47,'20128447',17,sysdate);
Insert Into view_log VALUES(48,'20186202',15,sysdate);
Insert Into view_log VALUES(49,'20081697',16,sysdate);
Insert Into view_log VALUES(50,'20070216',12,sysdate);


commit;
 SELECT 'DROP TABLE "' || TABLE_NAME || '" CASCADE CONSTRAINTS;' FROM user_tables;
DROP TABLE "MOVIE" CASCADE CONSTRAINTS;
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
DROP TABLE "ACTIVE_CHECK" CASCADE CONSTRAINTS;

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

INSERT INTO gsb_table values(1,'금메달');
insert into gsb_table values(2,'은메달');
insert into gsb_table values(3,'동메달');

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
    
    
    rollback;     
    
    
    
    
    select movie_title from movie
    where movie_title='1234';
         
         
         select m.movie_number, m.movie_title, m.movie_price,m.movie_open_date, m.movie_purchase_date, m.movie_rating,m.movie_investment,
		m.active_check_number,  t.tag_table_num,tt.tag_category_num, tt.tag_name
		from movie m, movie_tag t, tag_table tt
		where
        m.movie_number = t.movie_number
				and t.tag_table_num = tt.tag_table_num
				and tt.tag_category_num = 1	
				and m.movie_title like '%'||'000'||'%'
                
                order by 1 asc;
                
                select movie_title from movie
                where movie_title like '%'||'vbvb'||'%';
                
                select movie_number from movie_Tag
                where movie_number like '%'||'vbvb'||'%';
                        
                select * from movie
                where movie_title like '%'||'0000'||'%';
                select * from movie_tag
                where movie_number like '0000';
                
                
                
                select movie_number
                from review_usedwords 
                where movie_number like '%' || '201'|| '%';