create table member_tx(
num number constraint member_tx_num_pk primary key,
id varchar2(20) constraint member_tx_id_nn not null,
password varchar2(20),
name varchar2(35),
address varchar2(100),
constraint member_tx_id_uq unique(id));


create sequence member_tx_seq
increment by 1
start with 1;



create table customer_tx(
num number constraint customer_tx_num_pk primary key,
ssn varchar2(20) constraint customer_tx_ssn_nn not null,
name varchar2(35),
address varchar2(100),
constraint customer_tx_id_uq unique(ssn));

create sequence customer_tx_seq
increment by 1
start with 1;


