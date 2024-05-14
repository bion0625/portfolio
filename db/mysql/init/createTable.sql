create table USERS (
    USERNAME varchar(50) not null primary key,
    PASSWORD varchar(500) not null,
    ENABLED boolean not null
);

create table AUTHORITIES (
    USERNAME varchar(50) not null,
    AUTHORITY varchar(50) not null,
    constraint fk_authorities_users foreign key(USERNAME) references USERS(USERNAME)
);

create unique index ix_auth_username on AUTHORITIES (USERNAME,AUTHORITY);