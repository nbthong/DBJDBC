CREATE DATABASE `dbjdbc` CHARACTER SET utf8 COLLATE utf8_general_ci;

use dbjdbc;

Create table user(
	`id` INT auto_increment,
    `username` varchar(100),
    `password` varchar(100),
    `age` INT,
    primary key (`id`)
);

INSERT INTO `user` (`username`,`password`,`age`) VALUES ("nbthong","thong1304",20);
INSERT INTO `user` (`username`,`password`,`age`) VALUES ("thongnb99","thong1304",91);
INSERT INTO `user` (`username`,`password`,`age`) VALUES ("thong100T","thong1304",67);


