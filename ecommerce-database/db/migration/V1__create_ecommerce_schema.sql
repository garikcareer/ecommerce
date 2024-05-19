CREATE TABLE item
(
    item_id       BIGINT       NOT NULL,
    item_title    VARCHAR(255) NOT NULL,
    item_subtitle VARCHAR(255) NULL,
    CONSTRAINT pk_item PRIMARY KEY (item_id)
)engine = InnoDB;