INSERT INTO user (id, name, age, email)
VALUES (1, 'Jone', 18, 'test1@baomidou.com'),
       (2, 'Jack', 20, 'test2@baomidou.com'),
       (3, 'Tom', 28, 'test3@baomidou.com'),
       (4, 'Sandy', 21, 'test4@baomidou.com'),
       (5, 'Billie', 24, 'test5@baomidou.com');

INSERT INTO device (id, owner, sn, type, create_time, update_time)
VALUES (1, 1, 'SN1', 'android', now(), now()),
       (2, 1, 'SN2', 'pc', now(), now()),
       (3, 3, 'SN3', 'mac', now(), now());
