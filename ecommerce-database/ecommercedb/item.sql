create table ecommercedb.item
(
    item_id       bigint unsigned as (null) stored,
    item_name    varchar(255) not null,
    item_description varchar(255) null,
    constraint item_pk
        primary key (item_id)
)
    engine = InnoDB;
