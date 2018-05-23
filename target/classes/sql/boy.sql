/*
Navicat MySQL Data Transfer

Source Server         : Dadawern
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-05-23 18:56:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `boy`
-- ----------------------------
DROP TABLE IF EXISTS `boy`;
CREATE TABLE `boy` (
  `boy_id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '男生ID',
  `name` varchar(100) NOT NULL COMMENT '男生名称',
  `number` int(11) NOT NULL COMMENT '可约会次数',
  PRIMARY KEY (`boy_id`)
) ENGINE=InnoDB AUTO_INCREMENT=201511621321 DEFAULT CHARSET=utf8 COMMENT='男生表';

-- ----------------------------
-- Records of boy
-- ----------------------------
INSERT INTO `boy` VALUES ('201511621302', '陈世相', '10');
INSERT INTO `boy` VALUES ('201511621314', '林杰杰', '10');
INSERT INTO `boy` VALUES ('201511621319', '膜小锐', '10');
INSERT INTO `boy` VALUES ('201511621320', '彭小达', '10');
