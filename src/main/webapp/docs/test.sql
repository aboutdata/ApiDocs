/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2016-06-01 14:18:06
*/

SET FOREIGN_KEY_CHECKS=0;


DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(30) NOT NULL,
  `description` text,
  `createDate` datetime NOT NULL,
  `modifyDate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for `apidoc`
-- ----------------------------
DROP TABLE IF EXISTS `apidoc`;
CREATE TABLE `apidoc` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(30) NOT NULL,
  `category_id` int(11) NOT NULL,
  `description` text,
  `createDate` datetime NOT NULL,
  `modifyDate` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `pk_c_id` (`category_id`),
  CONSTRAINT `pk_c_id` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of apidoc
-- ----------------------------
INSERT INTO `apidoc` VALUES ('4', '接口名称', '2', '描述', '2016-03-17 17:50:14', '2016-03-17 17:50:14');
INSERT INTO `apidoc` VALUES ('5', '接口名称', '2', '描述', '2016-03-17 17:51:25', '2016-03-17 17:51:25');

-- ----------------------------
-- Table structure for `category`
-- ----------------------------
DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(20) NOT NULL,
  `createDate` datetime NOT NULL,
  `modifyDate` datetime NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of category
-- ----------------------------
INSERT INTO `category` VALUES ('2', '测试api', '2016-03-17 17:44:42', '2016-03-17 17:44:42');

-- ----------------------------
-- Table structure for `request_parameter`
-- ----------------------------
DROP TABLE IF EXISTS `request_parameter`;
CREATE TABLE `request_parameter` (
  `api_id` int(11) NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `type` varchar(10) NOT NULL,
  `description` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of request_parameter
-- ----------------------------
INSERT INTO `request_parameter` VALUES ('4', '用户名', 'String', '参数描述');
INSERT INTO `request_parameter` VALUES ('4', '用户名', 'String', '参数描述');

-- ----------------------------
-- Table structure for `response_parameter`
-- ----------------------------
DROP TABLE IF EXISTS `response_parameter`;
CREATE TABLE `response_parameter` (
  `api_id` int(11) NOT NULL,
  `NAME` varchar(100) NOT NULL,
  `type` varchar(10) NOT NULL,
  `description` text
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of response_parameter
-- ----------------------------
INSERT INTO `response_parameter` VALUES ('4', '用户名', 'String', '参数描述');
INSERT INTO `response_parameter` VALUES ('5', '用户名', 'String', '参数描述');

-- ----------------------------
-- Table structure for `sequence`
-- ----------------------------
DROP TABLE IF EXISTS `sequence`;
CREATE TABLE `sequence` (
  `NAME` int(11) NOT NULL AUTO_INCREMENT,
  `nextid` int(11) NOT NULL,
  PRIMARY KEY (`NAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sequence
-- ----------------------------

--新增项目字段
alter TABLE category add COLUMN projectId int(11) COMMENT "项目id";