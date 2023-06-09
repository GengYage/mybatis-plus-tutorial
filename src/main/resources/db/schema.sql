DROP TABLE IF EXISTS user;

CREATE TABLE user
(
    id    BIGINT      NOT NULL COMMENT '主键ID',
    name  VARCHAR(30) NULL DEFAULT NULL COMMENT '姓名',
    age   INT(11)     NULL DEFAULT NULL COMMENT '年龄',
    email VARCHAR(50) NULL DEFAULT NULL COMMENT '邮箱',
    PRIMARY KEY (id)
);

DROP TABLE IF EXISTS device;

CREATE TABLE device
(
    id          BIGINT      NOT NULL COMMENT '主键ID',
    owner       BIGINT      NULL DEFAULT NULL COMMENT '设备拥有者',
    sn          VARCHAR(32) NULL DEFAULT NULL COMMENT 'sn',
    type        VARCHAR(32) NULL DEFAULT NULL COMMENT '设备类型',
    create_time DATETIME    NULL COMMENT '创建时间',
    update_time DATETIME    NULL COMMENT '更新时间',
    PRIMARY KEY (id)
);
