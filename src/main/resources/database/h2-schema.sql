CREATE TABLE sequence (
	NAME varchar NOT NULL auto_increment PRIMARY KEY,
	nextid INT NOT NULL
) ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE category (
	id INT NOT NULL auto_increment PRIMARY KEY,
	NAME VARCHAR (20) NOT NULL,
	createDate datetime NOT NULL,
	modifyDate datetime NOT NULL
) ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE `apidoc` (
	`id` INT (11) NOT NULL AUTO_INCREMENT,
	`NAME` VARCHAR (30) NOT NULL,
	`category_id` INT (11) NOT NULL,
	`description` text,
	`createDate` datetime NOT NULL,
	`modifyDate` datetime NOT NULL,
	PRIMARY KEY (`id`),
	KEY `pk_c_id` (`category_id`),
	CONSTRAINT `pk_c_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE request_parameter (
	api_id INT NOT NULL,
	NAME VARCHAR (100) NOT NULL,
	type VARCHAR (10) NOT NULL,
	description text
) ENGINE = INNODB DEFAULT CHARSET = utf8;

CREATE TABLE response_parameter (
	api_id INT NOT NULL,
	NAME VARCHAR (100) NOT NULL,
	type VARCHAR (10) NOT NULL,
	description text
) ENGINE = INNODB DEFAULT CHARSET = utf8;