create table bt_user
(
    id       int auto_increment
        primary key,
    username varchar(50)  null,
    password varchar(50)  null,
    tel      varchar(50)  null,
    address  varchar(100) null
)
    comment '用户表';

INSERT INTO booktrading.bt_user (id, username, password, tel, address) VALUES (2, '1001', '1001', '18209315709', '太原');
INSERT INTO booktrading.bt_user (id, username, password, tel, address) VALUES (3, '1002', '1002', '18209315709', '太原');