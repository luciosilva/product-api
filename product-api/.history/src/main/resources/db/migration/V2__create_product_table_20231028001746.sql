create schema if not exists productapidb;

create table productapidb.product (
    id bigserial primary key,
    product_identifier varchar not null,
    nome varchar(100) not null,
    descricao varchar(100) not null,
    
    category_id bigint references productapidb.category(id)
);