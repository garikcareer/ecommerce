create table ecommercedb.brand
(
    id   int auto_increment,
    name char not null,
    constraint brand_pk
        primary key (id)
)
    engine = InnoDB;

create index brand__index
    on ecommercedb.brand (name);

