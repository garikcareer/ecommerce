create table ecommercedb.product
(
    id       int as (null),
    name     char not null,
    brand_id int  null,
    constraint product_pk
        primary key (id),
    constraint product_brand_id_fk
        foreign key (brand_id) references ecommercedb.brand (id)
)
    engine = InnoDB;

