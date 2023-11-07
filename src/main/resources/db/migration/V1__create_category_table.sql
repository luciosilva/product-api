create schema if not exists productapidb;

create table productapidb.category (
    id bigserial primary key,
    nome varchar(100) not null
);