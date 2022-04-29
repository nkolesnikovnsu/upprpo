CREATE TABLE IF NOT EXISTS sells_magnit
(
    id    INTEGER PRIMARY KEY ,
    product  VARCHAR(200) NOT NULL ,
    type_product  VARCHAR(200) NOT NULL ,
    date_start DATE NOT NULL ,
    date_end DATE NOT NULL ,
    old_price INTEGER NOT NULL,
    new_price INTEGER NOT NULL
);
CREATE SEQUENCE magnit_seq START WITH 6 INCREMENT BY 1;
-- DROP TABLE IF EXISTS sells_magnit;
-- DROP TABLE IF EXISTS sells_magnit;
-- DROP SEQUENCE IF EXISTS magnit_seq;
-- DROP SEQUENCE IF EXISTS clients_id_sec;
