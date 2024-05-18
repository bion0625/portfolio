create table users
(
    enabled  bit          not null,
    username varchar(50)  not null,
    password varchar(500) not null,
    primary key (username)
) engine=InnoDB;

create table authorities (
    username varchar(50) not null,
    authority varchar(50) not null
) engine=InnoDB;