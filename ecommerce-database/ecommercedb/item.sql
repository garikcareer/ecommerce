create table ecommercedb.item
(
    item_id       int unsigned as (null),
    item_title    char(255) not null,
    item_subtitle char(255) null,
    constraint item_pk
        primary key (item_id)
)
    engine = InnoDB;

