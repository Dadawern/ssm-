/*
Navicat MySQL Data Transfer

Source Server         : Dadawern
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : ssm

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-05-23 18:57:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `boyappointment`
-- ----------------------------
DROP TABLE IF EXISTS `boyappointment`;
CREATE TABLE `boyappointment` (
  `boy_id` bigint(20) NOT NULL COMMENT '男生ID',
  `student_id` bigint(20) NOT NULL COMMENT '女生学号',
  `appoint_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '预约时间',
  `appoint_peoplename` varchar(50) NOT NULL,
  PRIMARY KEY (`boy_id`,`student_id`),
  KEY `idx_appoint_time` (`appoint_time`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='预约男生约会表';

-- ----------------------------
-- Records of boyappointment
-- ----------------------------
INSERT INTO `boyappointment` VALUES ('201511621302', '3', '2018-05-22 21:24:13', '如花');
INSERT INTO `boyappointment` VALUES ('201511621302', '4', '2018-05-22 21:24:15', '芙蓉');
INSERT INTO `boyappointment` VALUES ('201511621314', '1', '2018-05-22 21:24:01', '比利。海灵顿');
INSERT INTO `boyappointment` VALUES ('201511621319', '1', '2018-05-22 21:25:24', '陈荣斌');
INSERT INTO `boyappointment` VALUES ('201511621320', '1', '2018-05-22 21:25:56', '沈月');
INSERT INTO `boyappointment` VALUES ('201511621320', '2', '2018-05-22 21:24:10', '周冬雨');
