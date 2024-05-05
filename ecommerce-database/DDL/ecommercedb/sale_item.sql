create table ecommercedb.sale_item
(
    product_id int    null,
    price      double not null,
    quantity   int    not null,
    constraint sale_item_product_id_fk
        foreign key (product_id) references ecommercedb.product (id)
)
    engine = InnoDB;

