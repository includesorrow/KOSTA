create table image_info(
ibun number(10) constraint image_info_ibun_pk primary key,
ilabel varchar2(30),
idate date,
ifile varchar2(150) constraint image_info_ifile_nn not null constraint image_info_ifile_uq unique
);

create sequence image_info_seq start with 1 increment by 1;

select rownum,ibun,ilabel,idate,ifile from image_info where rownum <6 order by ibun desc;

select rownum,ibun,ilabel, idate, ifile from
(select * from image_info order by ibun desc)
where rownum<6;
select rownum,ibun,ilabel, idate, ifile from 
(select * from image_info order by ibun desc) where rownum in (1,2,3,4,5);

insert into image_info(ibun) values