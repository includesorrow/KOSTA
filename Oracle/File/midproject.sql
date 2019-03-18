INSERT INTO MEMBER_GRADE VALUES(9,'최고관리자');
INSERT INTO MEMBER_GRADE VALUES(7,'민원담당자');
INSERT INTO MEMBER_GRADE VALUES(6,'영화담당자');
INSERT INTO MEMBER_GRADE VALUES(5,'회원담당자');
INSERT INTO MEMBER_GRADE VALUES(1,'일반유저');

    Insert Into MEMBER VALUES(1,'Admin@Admin.ad','최고관리자','admin',to_date('1900-01-01'),null,9);
    Insert Into MEMBER VALUES(2,'Minwon_Admin1@Admin.ad','민원담당자1','admin',to_date('1900-01-01'),null,7);
    Insert Into MEMBER VALUES(3,'Minwon_Admin2@Admin.ad','민원담당자2','admin',to_date('1900-01-01'),null,7);
    Insert Into MEMBER VALUES(4,'Minwon_Admin3@Admin.ad','민원담당자2','admin',to_date('1900-01-01'),null,7);
    
    Insert into member values(5,'Movie_Admin1@Admin.ad','영화담당자1','admin',to_date('1900-01-01'),null,6);
    Insert into member values(6,'Movie_Admin2@Admin.ad','영화담당자2','admin',to_date('1900-01-01'),null,6);
    Insert into member values(7,'Movie_Admin3@Admin.ad','영화담당자3','admin',to_date('1900-01-01'),null,6);
    
    Insert into member values(8,'Client_Admin1@Admin.ad','회원담당자1','admin',to_date('1900-01-01'),null,5);
    Insert into member values(9,'Client_Admin2@Admin.ad','회원담당자2','admin',to_date('1900-01-01'),null,5);
    Insert into member values(10,'Client_Admin3@Admin.ad','회원담당자3','admin',to_date('1900-01-01'),null,5);

    
    insert into counsel_category values(1, '건의');
    insert into counsel_category values(2, '신고');
    insert into counsel_category values(3, '문의');

    insert into tag_category values(1, '장르');
    insert into tag_category values(2, '배우');
    insert into tag_category values(3, '감독');
    insert into tag_category values(4, '댓글');
    
    
    
    SELECT 'DROP TABLE "' || TABLE_NAME || '" CASCADE CONSTRAINTS;' FROM user_tables;

DROP TABLE "MOVIE" CASCADE CONSTRAINTS;
DROP TABLE "MYLISTS" CASCADE CONSTRAINTS;
DROP TABLE "NOTICE" CASCADE CONSTRAINTS;
DROP TABLE "EVENT" CASCADE CONSTRAINTS;
DROP TABLE "MEMBER" CASCADE CONSTRAINTS;
DROP TABLE "REVIEW_USEDWORDS" CASCADE CONSTRAINTS;
DROP TABLE "WATCHLOG" CASCADE CONSTRAINTS;
DROP TABLE "SEARCHLOG" CASCADE CONSTRAINTS;
DROP TABLE "LOGINLOG" CASCADE CONSTRAINTS;
DROP TABLE "VIEWLOG" CASCADE CONSTRAINTS;
DROP TABLE "TAG_CATEGORY" CASCADE CONSTRAINTS;
DROP TABLE "TAG_TABLE" CASCADE CONSTRAINTS;
DROP TABLE "MOVIESOLDLOG" CASCADE CONSTRAINTS;
DROP TABLE "LIST_CATEGORY" CASCADE CONSTRAINTS;
DROP TABLE "LIST_TABLE" CASCADE CONSTRAINTS;
DROP TABLE "ANIVERSARY_TABLE" CASCADE CONSTRAINTS;
DROP TABLE "MOVIE_RATING" CASCADE CONSTRAINTS;
DROP TABLE "MEMBER_GRADE" CASCADE CONSTRAINTS;
DROP TABLE "MEMBER_FILTER" CASCADE CONSTRAINTS;
DROP TABLE "MINWON" CASCADE CONSTRAINTS;
DROP TABLE "COUNSEL_CATEGORY" CASCADE CONSTRAINTS;
DROP TABLE "MOVIE_TAG" CASCADE CONSTRAINTS;




INSERT INTO MEMBER_GRADE VALUES(9,'최고관리자');
INSERT INTO MEMBER_GRADE VALUES(7,'민원담당자');
INSERT INTO MEMBER_GRADE VALUES(6,'영화담당자');
INSERT INTO MEMBER_GRADE VALUES(5,'회원담당자');
INSERT INTO MEMBER_GRADE VALUES(1,'일반유저');

   Insert Into MEMBER VALUES(1,'Admin@Admin.ad','최고관리자','admin',to_date('1900-01-01'),null,9);
   Insert Into MEMBER VALUES(2,'Minwon_Admin1@Admin.ad','민원담당자1','admin',to_date('1900-01-01'),null,7);
   Insert Into MEMBER VALUES(3,'Minwon_Admin2@Admin.ad','민원담당자2','admin',to_date('1900-01-01'),null,7);
   Insert Into MEMBER VALUES(4,'Minwon_Admin3@Admin.ad','민원담당자2','admin',to_date('1900-01-01'),null,7);

   Insert into member values(5,'Movie_Admin1@Admin.ad','영화담당자1','admin',to_date('1900-01-01'),null,6);
   Insert into member values(6,'Movie_Admin2@Admin.ad','영화담당자2','admin',to_date('1900-01-01'),null,6);
   Insert into member values(7,'Movie_Admin3@Admin.ad','영화담당자3','admin',to_date('1900-01-01'),null,6);

   Insert into member values(8,'Client_Admin1@Admin.ad','회원담당자1','admin',to_date('1900-01-01'),null,5);
   Insert into member values(9,'Client_Admin2@Admin.ad','회원담당자2','admin',to_date('1900-01-01'),null,5);
   Insert into member values(10,'Client_Admin3@Admin.ad','회원담당자3','admin',to_date('1900-01-01'),null,5);


   insert into counsel_category values(1, '건의');
   insert into counsel_category values(2, '신고');
   insert into counsel_category values(3, '문의');

   insert into tag_category values(1, '장르');
   insert into tag_category values(2, '배우');
   insert into tag_category values(3, '감독');
   insert into tag_category values(4, '댓글');
   
   
   insert into movie values('1',1,'액션영화',to_date('1999-01-01'),to_date('1999-02-03'),8,200,150,2300,3000,4000);
   insert into movie values('2',1,'액션영화',to_date('1999-01-01'),to_date('1999-02-03'),8,200,150,2300,3000,4000);
   insert into movie values('3',3,'영화3',to_date('1999-03-03'),to_date('1999-03-03'),3,300,300,300,300,300);
   insert into movie values('4',3,'영화4',to_date('1999-04-04'),to_date('1999-04-04'),4,400,400,400,400,400);
   insert into movie values('5',3,'영화4',to_date('1999-05-05'),to_date('1999-05-05'),5,500,500,500,500,500);
   
   
   commit;
   
   delete from movie where (movie_title = '액션영화');
   
   	select * from movie;
    select movie_number from movie;
    select movie_title from movie;
    
    select movie_number,movie_price,movie_title,movie_open_date,
  		movie_purchase_date,movie_rating,movie_view_count,movie_watch_count,
  		movie_number_of_audience,movie_investment,movie_copyright_cost from movie;
  		commit;
        
        select * from movie;
        commit;
        
         select movie_title from movie
  			 where movie_title like '%' || '영' || '%';
  			 