/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50718
 Source Host           : localhost
 Source Database       : show

 Target Server Type    : MySQL
 Target Server Version : 50718
 File Encoding         : utf-8

 Date: 07/11/2017 11:23:58 AM
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
--  Table structure for `feature`
-- ----------------------------
DROP TABLE IF EXISTS `feature`;
CREATE TABLE `feature` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `content` varchar(1024) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `msg`
-- ----------------------------
DROP TABLE IF EXISTS `msg`;
CREATE TABLE `msg` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `show_id` bigint(20) unsigned NOT NULL,
  `user_id` bigint(20) unsigned NOT NULL,
  `user_ip` varchar(32) DEFAULT NULL,
  `content` varchar(1024) DEFAULT NULL COMMENT '评论',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `product`
-- ----------------------------
DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
  `product_id` bigint(20) unsigned NOT NULL,
  `gmt_create` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modify` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `url` varchar(2048) DEFAULT NULL,
  `is_p4p` tinyint(1) DEFAULT '0' COMMENT '是否p4p商品',
  `url_p4p` varchar(2048) DEFAULT NULL COMMENT '广告链接',
  `cate_id` bigint(20) unsigned DEFAULT NULL COMMENT '类目id',
  `view_sales` varchar(20) DEFAULT NULL COMMENT 'N人收货',
  `sale_id` bigint(20) unsigned DEFAULT NULL COMMENT '卖家id',
  `l1_category` bigint(20) unsigned DEFAULT NULL COMMENT '一级类目大类'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `show`
-- ----------------------------
DROP TABLE IF EXISTS `show`;
CREATE TABLE `show` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键id',
  `gmt_create` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modify` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `truth` double(5,2) DEFAULT '100.00' COMMENT '真实度',
  `praise` int(9) unsigned DEFAULT NULL COMMENT '点赞',
  `product_id` bigint(20) unsigned DEFAULT NULL,
  `source` tinyint(4) NOT NULL COMMENT '来源',
  `pics` varchar(4096) NOT NULL COMMENT '图片链接,英文逗号分隔',
  `show_time` timestamp NULL DEFAULT NULL COMMENT '评价时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `spider_track`
-- ----------------------------
DROP TABLE IF EXISTS `spider_track`;
CREATE TABLE `spider_track` (
  `id` bigint(20) NOT NULL,
  `gmt_create` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modify` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `category_id` bigint(20) DEFAULT NULL,
  `keyword` varchar(100) DEFAULT NULL,
  `last_time` timestamp NULL DEFAULT NULL,
  `num` bigint(20) DEFAULT NULL COMMENT '抓取的数量',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
--  Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT,
  `gmt_create` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `gmt_modify` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  `username` varchar(256) DEFAULT NULL,
  `password` varchar(512) DEFAULT NULL,
  `sex` tinyint(4) DEFAULT NULL COMMENT '性别',
  `head_portrait_url` varchar(255) DEFAULT NULL,
  `signature` varchar(1024) DEFAULT NULL COMMENT '签名',
  `mobile_phone_number` varchar(20) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

SET FOREIGN_KEY_CHECKS = 1;
