
create table Book
(
id bigint AUTO_INCREMENT  PRIMARY KEY,
title varchar(255) not null ,
author varchar(255) not null,
publication_Year bigint not null,
isbn bigint not null


);


create table Patron (
id bigint AUTO_INCREMENT PRIMARY KEY ,
name varchar(255) not null,
contact_information varchar(255) not null


);


create table Borrowing_Record(
BorrowingRecordId bigint not null ,
book_id bigint not null,
patron_id bigint not null

);