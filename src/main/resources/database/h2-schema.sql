CREATE TABLE sequence
(
    name varchar(30)  not null,
    nextid int  not null,
    constraint pk_sequence primary key (name)
);

CREATE  TABLE category(
 id VARCHAR (32) not NULL,
 name VARCHAR (20) NOT NULL,
 createDate DATETIME NOT NULL,
 modifyDate DATETIME NOT NULL
)

