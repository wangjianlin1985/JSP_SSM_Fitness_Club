/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50620
Source Host           : localhost:3306
Source Database       : ssm_sterngym

Target Server Type    : MYSQL
Target Server Version : 50620
File Encoding         : 65001

Date: 2020-01-12 18:23:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `class`
-- ----------------------------
DROP TABLE IF EXISTS `class`;
CREATE TABLE `class` (
  `classid` int(11) NOT NULL AUTO_INCREMENT COMMENT '教学班号',
  `course_id` int(11) DEFAULT NULL COMMENT '课程编号',
  `classtime` varchar(50) DEFAULT NULL COMMENT '上课时间',
  `empl_id` int(11) DEFAULT NULL COMMENT '教练编号(员工)',
  `classvolume` int(2) DEFAULT NULL COMMENT '班级容量',
  PRIMARY KEY (`classid`),
  KEY `class_courseid_fk` (`course_id`),
  KEY `class_emploid_fk` (`empl_id`),
  CONSTRAINT `class_courseid_fk` FOREIGN KEY (`course_id`) REFERENCES `course` (`cid`),
  CONSTRAINT `class_emploid_fk` FOREIGN KEY (`empl_id`) REFERENCES `employee` (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of class
-- ----------------------------
INSERT INTO `class` VALUES ('1', '8', '7:00-8:00', '1', '4');
INSERT INTO `class` VALUES ('2', '18', '7:00-8:00', '2', '20');
INSERT INTO `class` VALUES ('3', '18', '8:30-9:30', '1', '20');
INSERT INTO `class` VALUES ('4', '8', '8:30-9:30', '2', '20');

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `cid` int(255) NOT NULL AUTO_INCREMENT COMMENT '课程id',
  `cname` varchar(50) DEFAULT NULL COMMENT '课程名称',
  `trainer_id` int(11) DEFAULT NULL COMMENT '对应的员工（教练）id',
  `ctime` int(11) DEFAULT NULL COMMENT '课时(h)',
  `cdesc` text COMMENT '课程简介',
  `cfunction_id` int(11) DEFAULT NULL COMMENT '课程功能id',
  `ccate_id` int(11) DEFAULT NULL COMMENT '课程类型id',
  `cpic` varchar(255) DEFAULT NULL COMMENT '课程图片',
  `ccreatetime` datetime DEFAULT NULL COMMENT '课程创建时间',
  `cprice` decimal(10,2) DEFAULT NULL COMMENT '课程价格',
  PRIMARY KEY (`cid`),
  KEY `category_id_fk` (`ccate_id`),
  KEY `function_id_fk` (`cfunction_id`),
  KEY `trainer_id_fk` (`trainer_id`),
  CONSTRAINT `category_id_fk` FOREIGN KEY (`ccate_id`) REFERENCES `coursecategory` (`cate_id`),
  CONSTRAINT `function_id_fk` FOREIGN KEY (`cfunction_id`) REFERENCES `coursefunction` (`fid`),
  CONSTRAINT `trainer_id_fk` FOREIGN KEY (`trainer_id`) REFERENCES `employee` (`eid`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('2', '身体平衡', null, '20', '身心平衡悄悄在兴起，并备受办公室男女们的青睐。', '1', '1', 'http://localhost:8080/SternGym/sterngymimages/1528534465173.jpg', '2019-05-11 10:51:24', '0.00');
INSERT INTO `course` VALUES ('3', '身体格斗', null, '30', '有氧搏击悄悄在兴起，并备受办公室男女们的青睐。出拳、踢腿、挥拳、呐喊，这样也能减肥，就是这么神奇。是“野蛮”的减肥时尚。\r\n\r\n如果说瑜珈、SPA是以一种温柔的方式释放身心。那么，有氧搏击操则是让人在剧烈的运动中完成激情释放。它让都市白领有了另一种释放身心的方式，在磨练身体的同时，精神世界也得到放松和满足。', '1', '1', 'http://localhost:8080/SternGym/sterngymimages/1528534598021.jpg', '2019-05-11 11:02:02', '0.00');
INSERT INTO `course` VALUES ('4', '古典舞', null, '2', '古典舞，世界上许多国家和民族都有各具独特风格的古典舞蹈。', '3', '2', 'http://localhost:8080/SternGym/sterngymimages/1528594999307.jpg', '2019-05-11 11:14:21', '0.00');
INSERT INTO `course` VALUES ('5', '爵士', null, '4', '爵士舞即美国现代舞，是一种急促又富动感的节奏型舞蹈，是属于一种外放性的舞蹈。爵士舞蹈最初是非洲舞蹈的延伸，经被贩卖作为奴隶的黑人群体带到美国本土，而在美国逐渐演进形成本土化、大众化的舞蹈。', '3', '2', 'http://localhost:8080/SternGym/sterngymimages/1528595072348.jpg', '2019-05-11 11:16:42', '0.00');
INSERT INTO `course` VALUES ('6', '减脂骑行', null, '3', '高效的便携式共振训练。其特点在于基于共振原理，可以作用于身体的深层肌肉。这些深层肌肉只有在外力作用下反射性的工作，传统运动难以触及。', '1', '5', 'http://localhost:8080/SternGym/sterngymimages/1528595165748.jpg', '2019-05-11 11:18:14', '0.00');
INSERT INTO `course` VALUES ('8', '游泳', '1', '20', '人在水中游泳，两臂划水同时两腿打水或蹬水，全身肌肉群都参加了运动，可以使全身的肌肉得到良好的锻炼。另外，游泳时，因为水的密度（换句话说就是阻力）和传热性能比空气大（水的热传导系数比空气大26倍，就是说在相同温度的情况下，人体在水里散失热量比在空气里快20多倍，可以有效地消耗热量），所以身体在水中运动消耗的能量比陆地上多。这些能量的供应要靠消耗体内的糖和脂肪来补充。经常进行游泳运动，可以逐渐去掉体内过多的脂肪，而不会长得肥胖。', '5', '1', 'http://localhost:8080/SternGym/sterngymimages/1528598244979.png', '2019-05-12 09:08:55', '0.00');
INSERT INTO `course` VALUES ('18', '阿斯汤加瑜伽', '2', '20', '阿斯汤加瑜伽\r\n\r\n阿斯汤加瑜伽，是国际上最为古老和流行的一种哈他瑜伽的练习风格。这种瑜伽强调体位练习中“三把锁”的应用，即喉咙、肚脐、会阴相结合。它比较侧重于力量、柔韧性、耐力的培养锻炼，尤其是力量和耐力，是各类瑜伽中运动强度比较大的一种。在练习过程中，唯有当动作与呼吸的频率协调一致时，练习者才能充分享有该瑜伽体式蕴含的益处。', '3', '3', 'http://www.csbishe.cn:8009/SternGym/sterngymimages/1564563205714.png', null, '2000.00');

-- ----------------------------
-- Table structure for `coursecategory`
-- ----------------------------
DROP TABLE IF EXISTS `coursecategory`;
CREATE TABLE `coursecategory` (
  `cate_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程类型id',
  `cate_name` varchar(255) DEFAULT NULL COMMENT '课程类型名称',
  PRIMARY KEY (`cate_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of coursecategory
-- ----------------------------
INSERT INTO `coursecategory` VALUES ('1', '训练类');
INSERT INTO `coursecategory` VALUES ('2', '舞蹈类');
INSERT INTO `coursecategory` VALUES ('3', '身心类');
INSERT INTO `coursecategory` VALUES ('4', '武道类');
INSERT INTO `coursecategory` VALUES ('5', '单车类');

-- ----------------------------
-- Table structure for `coursefunction`
-- ----------------------------
DROP TABLE IF EXISTS `coursefunction`;
CREATE TABLE `coursefunction` (
  `fid` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程功能id',
  `fname` varchar(255) DEFAULT NULL COMMENT '课程功能名称',
  PRIMARY KEY (`fid`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of coursefunction
-- ----------------------------
INSERT INTO `coursefunction` VALUES ('1', '减脂');
INSERT INTO `coursefunction` VALUES ('2', '塑形');
INSERT INTO `coursefunction` VALUES ('3', '柔韧 ');
INSERT INTO `coursefunction` VALUES ('4', '力量');
INSERT INTO `coursefunction` VALUES ('5', '核心');
INSERT INTO `coursefunction` VALUES ('6', '心肺');
INSERT INTO `coursefunction` VALUES ('7', '平衡');

-- ----------------------------
-- Table structure for `employee`
-- ----------------------------
DROP TABLE IF EXISTS `employee`;
CREATE TABLE `employee` (
  `eid` int(255) NOT NULL AUTO_INCREMENT COMMENT '工号',
  `ename` varchar(30) DEFAULT NULL COMMENT '员工姓名',
  `egender` tinyint(4) DEFAULT '0' COMMENT '性别，默认女',
  `ephone` varchar(20) DEFAULT NULL COMMENT '员工手机',
  `epost_id` int(255) DEFAULT NULL COMMENT '员工职务id',
  `eadd` varchar(255) DEFAULT NULL COMMENT '员工地址',
  `ehire` datetime DEFAULT NULL COMMENT '员工入职日期',
  `estate` int(4) DEFAULT '1' COMMENT '员工是否在职，默认为1在职',
  PRIMARY KEY (`eid`),
  KEY `epost_id_fk` (`epost_id`),
  CONSTRAINT `epost_id_fk` FOREIGN KEY (`epost_id`) REFERENCES `post` (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of employee
-- ----------------------------
INSERT INTO `employee` VALUES ('1', '韩玉飞', '0', '17865923922', '1', '山东理工大学', '2019-05-11 10:25:04', '1');
INSERT INTO `employee` VALUES ('2', '申旭东', '1', '17865923333', '1', '山东理工大学', '2019-05-09 10:25:43', '1');
INSERT INTO `employee` VALUES ('4', '教练3', '1', '17865923592', '1', '多对多', '2019-05-18 10:07:11', '1');

-- ----------------------------
-- Table structure for `member`
-- ----------------------------
DROP TABLE IF EXISTS `member`;
CREATE TABLE `member` (
  `mid` int(255) NOT NULL AUTO_INCREMENT COMMENT '会员编号',
  `mname` varchar(50) DEFAULT NULL COMMENT '会员姓名',
  `mpassword` varchar(255) DEFAULT NULL COMMENT '会员密码',
  `mgender` tinyint(4) DEFAULT '0' COMMENT '会员性别，默认0女  1男',
  `midno` varchar(255) DEFAULT NULL COMMENT '会员身份证号',
  `mphone` varchar(20) DEFAULT NULL COMMENT '会员手机',
  `memail` varchar(255) DEFAULT NULL COMMENT '会员邮箱',
  `mdate` datetime DEFAULT NULL COMMENT '会员注册时间',
  PRIMARY KEY (`mid`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of member
-- ----------------------------
INSERT INTO `member` VALUES ('1', '赵2', 'D42A827C924AEB40F30ABEDC3CE54A60', '0', '371581199311017223', '17865923591', '765349413@qq.com', '2019-05-10 10:31:09');
INSERT INTO `member` VALUES ('4', '赵亚鑫', 'AB0966E92DC3ED50DB897C40FA14A985', '0', '371581199311017223', '17865923512', '765349412@qq.com', null);
INSERT INTO `member` VALUES ('6', '赵亚鑫', 'AB0966E92DC3ED50DB897C40FA14A985', '1', '371581199311017223', '17865923513', '765349411@qq.com', null);
INSERT INTO `member` VALUES ('7', '赵w哈哈', 'AB0966E92DC3ED50DB897C40FA14A985', '1', '371581199311017223', '17865923514', '971739912@qq.com', null);
INSERT INTO `member` VALUES ('9', '赵亚鑫', 'AB0966E92DC3ED50DB897C40FA14A985', '0', '371581199311017223', '17865923515', '765349443@qq.com', null);
INSERT INTO `member` VALUES ('11', '赵亚', 'AB0966E92DC3ED50DB897C40FA14A985', '0', '371581199311017223', '17865923516', '765349455@qq.com', null);
INSERT INTO `member` VALUES ('14', '赵亚鑫', 'AB0966E92DC3ED50DB897C40FA14A985', '0', '371581199311017223', '17865923519', '765349445@qq.com', null);
INSERT INTO `member` VALUES ('17', '赵亚鑫3', '25F9E794323B453885F5181F1B624D0B', '0', '371581199311017223', '17865923522', '17865923522@163.com', null);
INSERT INTO `member` VALUES ('18', '赵', '0FCF40C37B02CD591E153BB98F46A1D3', '0', '371581199311017223', '17865923523', '765349449@qq.com', '2019-05-10 11:27:05');
INSERT INTO `member` VALUES ('19', 'admin', 'C3B11E03752B5EAAC804696DD995E77D', '0', '371581199311017223', '17865923524', '765349450@qqcom', '2019-05-19 11:01:19');
INSERT INTO `member` VALUES ('20', '注册用户', 'D42A827C924AEB40F30ABEDC3CE54A60', '0', '371581111111111111', '17866666625', '765349451@qq.com', '2019-05-19 14:07:43');
INSERT INTO `member` VALUES ('21', '饿肚肚', 'D42A827C924AEB40F30ABEDC3CE54A60', '0', '371581111111111111', '17822222226', '111111111@qq.com', '2019-05-19 15:12:58');
INSERT INTO `member` VALUES ('22', '重置测试1', 'D42A827C924AEB40F30ABEDC3CE54A60', '0', '123456789122345678', '17865923592', '17865923592@163.com', '2019-05-20 09:47:40');
INSERT INTO `member` VALUES ('23', '预订课程', 'D42A827C924AEB40F30ABEDC3CE54A60', '0', '371581111111111113', '17823132546', '765349476@qq.com', '2019-05-21 20:06:55');
INSERT INTO `member` VALUES ('26', 'user1', 'D42A827C924AEB40F30ABEDC3CE54A60', '0', '132123123132132132', '13022502404', '1347845688@qq.com', '2019-09-10 10:52:23');

-- ----------------------------
-- Table structure for `message`
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `msg_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '留言id',
  `msg_mid` int(11) DEFAULT NULL COMMENT '用户ID',
  `msg_content` varchar(255) DEFAULT NULL COMMENT '留言内容',
  `msg_rid` int(11) DEFAULT NULL COMMENT '回复id',
  `msg_date` datetime DEFAULT NULL COMMENT '留言时间',
  PRIMARY KEY (`msg_id`),
  KEY `msg_mid_fk` (`msg_mid`),
  KEY `msg_rid_fk` (`msg_rid`),
  CONSTRAINT `msg_mid_fk` FOREIGN KEY (`msg_mid`) REFERENCES `member` (`mid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `msg_rid_fk` FOREIGN KEY (`msg_rid`) REFERENCES `reply` (`rid`) ON DELETE SET NULL ON UPDATE SET NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('2', '22', 'liuyan', null, '2019-05-21 17:08:15');
INSERT INTO `message` VALUES ('4', '22', '反反复复', null, '2019-05-21 17:10:09');
INSERT INTO `message` VALUES ('5', '22', 'liuyan2', null, '2019-05-21 17:27:28');
INSERT INTO `message` VALUES ('6', '22', 'ddddd', null, '2019-06-09 11:04:20');
INSERT INTO `message` VALUES ('7', '24', '今天又下雨了又下雨了今天又下雨了又下雨了今天又下雨了又下雨了\n今天又下雨了又下雨了今天又下雨了又下雨了今天又下雨了又下雨了\n今天又下雨了又下雨了今天又下雨了又下雨了今天又下雨了又下雨了\n今天又下雨了又下雨了今天又下雨了又下雨了', null, '2019-06-10 16:06:33');
INSERT INTO `message` VALUES ('8', '22', '今天天气不好', null, '2019-06-10 16:21:51');
INSERT INTO `message` VALUES ('9', '24', '哈哈哈哈', null, '2019-06-10 16:47:35');
INSERT INTO `message` VALUES ('11', '26', '我想报名参加！！！', null, '2020-01-12 18:10:30');

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `nid` int(11) NOT NULL AUTO_INCREMENT COMMENT '新闻id',
  `ntitle` varchar(255) DEFAULT '' COMMENT '新闻标题',
  `ncontent` text COMMENT 'x新闻详情',
  `ncreatetime` datetime DEFAULT NULL COMMENT '新闻创建时间',
  `nk_id` int(11) DEFAULT NULL COMMENT '新闻种类ID',
  PRIMARY KEY (`nid`),
  KEY `nk_id_nkid_fk` (`nk_id`),
  CONSTRAINT `nk_id_nkid_fk` FOREIGN KEY (`nk_id`) REFERENCES `newskinds` (`nkid`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('2', '健身俱乐部通知', '<p>&nbsp;<span>定于下周一（6月11日）开始体育部学生健身俱乐部（一、二校区）活动全面启动，请俱乐部学生按项目指定时间参加活动，祝同学们健身快乐！</span></p>', '2019-06-06 10:57:48', '4');
INSERT INTO `news` VALUES ('3', '严烈健身俱乐部——没有冬天的健身房', '<p>&nbsp; &nbsp; &nbsp; &nbsp; 寒冷的冬季刺骨的冷风扑面而来，抵御风寒的人们都穿上了棉衣，围上了围巾。可是，对于健身达人和减肥的妹子们冬季可是一个关键的季节。天气寒冷，出门都需要鼓足勇气，而且冬季的空气也并不是那么清新，就让健身和减肥成为难事。因此，健身房便成为大部分人的选择。</p><p style=\"text-align: center;\"><img src=\"http://localhost:8080/SternGym/sterngymimages/1528601250839.jpeg\" alt=\"undefined\"><br></p><p style=\"text-align: left;\">&nbsp; &nbsp; &nbsp; &nbsp; 冬季的健身房受欢迎，一方面是因为健身房本身器械齐全，对于减肥和健身都有很大的帮助。另一方面冬季的健身房不论是温度和湿度都是适宜健身的环境。在阳光健身俱乐部可以享受空调全天开放，室内恒温，热水24小时恒温、汗蒸房免费蒸等待遇，所以健身俱乐部是充满阳光没有冬天的健身房。</p><p style=\"text-align: center;\"><img src=\"http://localhost:8080/SternGym/sterngymimages/1528601306482.jpeg\" alt=\"undefined\"><br></p><p>&nbsp; &nbsp; &nbsp; &nbsp;健身时，大部分人都了解要充分热身，保持体温。在阳光健身俱乐部可以通过慢跑、爬坡走或者是轻器械训练等来热身保持体温，而且有空调调节室内温度，就不用担心突然身体温差的改变从而影响身体健康。在严烈健身俱乐部健身不用穿太多，简单的运动装就可以，在汗流浃背的时候也可以脱掉，不用担心会感冒等问题。</p><p> \r\n</p><p>&nbsp; &nbsp; &nbsp; &nbsp;健身之后不要马上去洗浴，稍微休息一会儿，等到身体缓和之后再用温水洗浴就可以了，阳光健身俱乐部的热水是24小时恒温供应，所以不用担心洗浴问题。在休息或洗浴之后可以去汗蒸房，身体有足够的休息再进入汗蒸房就不会造成供血供氧不足的问题。</p><p>&nbsp; &nbsp; &nbsp; &nbsp;其实冬季健身是非常有益的，可以通过提高人体的抵抗力并消除身体的疲劳，让人体和心理更健康。如果你想享受充满阳光没有冬天的健身房，就来山东理工大学严烈健身俱乐部吧，我们一起在冬天拥有健康的体魄。</p><p style=\"text-align: left;\"><br></p>', '2017-11-02 08:57:28', '3');
INSERT INTO `news` VALUES ('4', '严烈健身与UA强强联手，打造运动健身新秩序', '<p>&nbsp; &nbsp; &nbsp; &nbsp;从悉尼到黄金海岸，经典澳洲东海岸自驾线路，不同的是配备豪华房车与司机，开着流动的家穿越城市与乡村，让您尽情享受旅途的每一分惊喜。驾车游览也并不是两点一线，众多小道带您发掘隐藏的珍宝和知名景点，在澳大利亚的东部尽情游玩、徜徉于国家公园中，见识澳洲最可爱的一些动物，同时还有机会体验沿途每一座景色宜人的金色沙滩。而这一切专为喜爱纯粹旅行的您准备。<br></p><p><br></p><p style=\"text-align: center;\"><img src=\"http://localhost:8080/SternGym/sterngymimages/1528601461743.jpg\" alt=\"undefined\"><br></p><p style=\"text-align: center;\"><br></p><p style=\"text-align: center;\"><img src=\"http://localhost:8080/SternGym/sterngymimages/1528601467970.jpg\" alt=\"undefined\"><br></p><p style=\"text-align: center;\"><br></p><p style=\"text-align: center;\"><br></p><p style=\"text-align: center;\"><br></p><p style=\"text-align: left;\">驾驶豪华房车驰骋在澳洲东海岸<br></p><p>\r\n澳大利亚四面环海，道路设施完善，自驾线路资源丰富，各种房车营地资源齐全，再配备上豪华奔驰房车，让您尽情体验这随心所欲走走停停的纯粹旅行。</p><p><br></p>\r\n悉尼塔旋转餐厅<br><p>\r\n来悉尼想翻看悉尼全貌，最佳去处非悉尼他莫属，一遍享受美味自助餐，一遍欣赏360度鸟瞰悉尼的绚丽景色，悉尼塔旋转餐厅是澳洲最高，最华丽的旋转餐厅，在靠窗的位置入座，天晴的日子，80公里内的景色都可尽收眼底，包括悉尼歌剧院、海港大桥、情人港、圣玛丽大教堂等。</p><p><br></p>\r\n蓝光萤火虫夜游<br>\r\n春溪国家公园（Springbrook National \r\nPark）中因河水长期冲蚀形成了一种天然洞穴，且洞穴崩塌形成貌似桥梁的自然奇景，称为自然桥，在清凉黑暗的自然桥拱洞里，孕育了数以亿计的蓝光虫。这些像宝宝一样的毛虫，通体呈透明褐色，消化器官中能排放出一种遇氧气会发亮的萤火素，与别处的萤火虫有所不同的是，他们不飞也不闪，白天这些看不见的小生灵们，晚间则让您犹如置身浩瀚银河一般。<p></p><p></p>', '2019-04-13 08:58:38', '4');
INSERT INTO `news` VALUES ('5', '集爱赢大奖，大家都在玩', '<p style=\"text-align: center;\">\r\n	谁说七夕只过一天</p><p style=\"text-align: center;\">\r\n	有爱天天都是过七夕</p><p style=\"text-align: center;\">严烈健身最近开展的“集爱赢大奖”活动</p><p style=\"text-align: center;\">\r\n	就分分钟把那些单身汪虐到哭</p><p style=\"text-align: center;\">\r\n	还有惊喜大奖可以拿</p><p>\r\n\r\n\r\n\r\n\r\n</p><p style=\"text-align: center;\">\r\n	瞧瞧他们玩得多忘我</p><p style=\"text-align: center;\"><img src=\"http://localhost:8080/SternGym/sterngymimages/1528608960112.jpg\" alt=\"undefined\"><br></p><p style=\"text-align: center;\">\r\n	爱就要大声说出来</p><p style=\"text-align: center;\">\r\n	集齐他/她与他们的爱</p><p style=\"text-align: center;\">\r\n	就可以召唤大奖啦</p><p style=\"text-align: center;\">\r\n	活动时间有限，奖品有限</p><p style=\"text-align: center;\">\r\n	错过就要等到下一个猴年马月啦</p><p style=\"text-align: center;\">\r\n	现在就去严烈健身俱乐部门店参与活动吧</p><p style=\"text-align: center;\">\r\n\r\n\r\n\r\n\r\n\r\n</p><p style=\"text-align: center;\">\r\n	活动详情请咨询严烈健身俱乐部工作人员</p>', '2019-05-20 11:11:07', '1');
INSERT INTO `news` VALUES ('6', '2019淄博市健身教练职业技能竞赛团体赛规程', '<p style=\"text-align: center;\">比赛日期:6月1日~30日<br></p><p>\r\n	比赛地址:山东理工大学体育学院</p><p><br></p><p>比赛形式：团队答题，每队选派3人，进行答题。必答题20题，每题积分十分。<br>\r\n	必答题形式：主持人宣读并利用大屏幕展示题目，参赛队需要在题目宣读结束后10秒内将答案写在答题板上，并向裁判展示，题目答对的参赛队伍得十分，回答错误不加分。<br>\r\n	比赛内容：运动解剖学、运动生理学、运动生物化学、运动医学、运动生物力学、运动训练学、运动心理学以及体适能理论等。<br>\r\n	&nbsp;<br>\r\n	参赛队伍须派6名选手上场，按规定路线及顺序接力完成下列三项竞赛内容，以总时长进行排名用时短者名次列前，并获得相应积分。<br>\r\n	&nbsp;<br>\r\n	2.1.背人180度旋转蹲<br>\r\n	设置：起始端设置标志线，终点端设置标志，起点至终点距离为25米<br>\r\n	\r\n要求：两名参赛者，一人作为比赛者，一人作为负重，其中一人持接力棒，比赛者需要将另一人背起，进行侧向蹲起行进，第一次蹲起如果面朝左侧，那么第二次必须以前脚为轴旋转180度面向右侧蹲起，以此类推，过终点线后，两人交换，按照上述方法返回起点，将接力棒交给下一项目选手。<br>\r\n	犯规：<br>\r\n	&nbsp;（1）比赛者蹲起时运动幅度向下大腿低于水平线，向上膝关节自然伸直<br>\r\n	&nbsp;（2） 另一人任何肢体位置不能与地面接触<br>\r\n	&nbsp;（3） 犯规需要返回起始位置重新进行比赛<br>\r\n	&nbsp;<br>\r\n	2.2.双人障碍物180度旋转跳<br>\r\n	设置：起始端设置标志线，第一障碍物设置于起始端，每2米设置一排障碍物，障碍物高约30CM&nbsp;，供设置12排障碍物，每排2个，终点端设置标志，与最后障碍物之间距离3米，起点至终点距离为25米<br>\r\n	要求：接到接力棒后，一人持接力棒，两名参赛者面对第一排障碍物起跳，空中旋转180度，即至第一与第二障碍物之间，应背对第二障碍物，以此类推，两人中以最后一人过终点线为标准，此项比赛结束，将接力棒交给下一项目选手。<br>\r\n	犯规：<br>\r\n	&nbsp;（1）跳跃时空中未能旋转180度<br>\r\n	&nbsp;（2）未等两名选手都过终点线，而将接力棒交予下一项目选手<br>\r\n	&nbsp;（3）犯规需要返回起始位置重新进行比赛<br>\r\n	&nbsp;<br>\r\n	2.3.双人核心训练<br>\r\n	设置：设置瑜伽垫<br>\r\n	要求：两名参赛选手，一人在下，一人在上，需互相双手抓住对方脚腕，下方的人进行卷腹、上方的人同时进行反向卷腹，完成50次，如在50次内出现体力不支，两名参赛选手可互换位置，直至完成50次，团队接力比赛结束。<br>\r\n	犯规：<br>\r\n	（1）下方的人肩胛骨未能离开垫子<br>\r\n	（2）上方的人出现塌腰<br></p><p>\r\n	（3）出现犯规后，本次训练不计算次数</p><p><img src=\"http://localhost:8080/SternGym/sterngymimages/1528609106847.jpg\" alt=\"undefined\"><br></p><p>3.2.比赛内容：各代表队以团队形式进行健身才艺展示。<br>\r\n	3.3.比赛时间：2分钟。<br>\r\n	3.4.比赛要求：<br>\r\n	（1）通过赛前抽签决定出场顺序，各代表队按照顺序候场，依次上台展示；<br>\r\n	（2）至少6名选手参加，其中至少包括1名女选手；<br>\r\n	（3）内容积极、活泼、向上，且须与体育健身相关，形式不限。<br>\r\n	（4）音乐自备，MP3格式<br>\r\n	3.5.根据选手才艺比赛表现，由评委打分（去掉最高及最低分后取平均分）以实际参赛队伍数量计算得分，得分多者，名次列前。<br>报名热线：12345678900&nbsp; 贾老师</p><p></p><p></p>', '2019-05-31 09:15:02', '2');
INSERT INTO `news` VALUES ('7', '泳池维修通知', '<p>泳池维修通知</p><p>维修时间为6月7日~6月10日</p>', '2019-06-06 09:52:33', '4');
INSERT INTO `news` VALUES ('9', '桃花健身季 桃花朵朵开 你还在等什么？', '<p style=\"text-align: center;\"><strong>严烈健身桃花健身季</strong> \r\n	</p><p style=\"text-align: center;\">\r\n		<strong>爱在严烈 三生三世只为你</strong> \r\n	</p><p style=\"text-align: center;\">\r\n		现场桃花朵朵开\r\n	</p><p>\r\n	\r\n	\r\n	</p><p style=\"text-align: center;\">\r\n		看现场人气就知道了~！</p><p style=\"text-align: center;\"><img src=\"http://localhost:8080/SternGym/sterngymimages/1528609461542.jpg\" alt=\"undefined\">&nbsp;&nbsp;</p><p style=\"text-align: center;\"><img src=\"http://localhost:8080/SternGym/sterngymimages/1528609471215.jpg\" alt=\"undefined\"><br></p><p style=\"text-align: center;\">&nbsp; &nbsp;性感的肚皮舞，婀娜的身姿\r\n	</p><p style=\"text-align: center;\">\r\n	</p><p style=\"text-align: center;\">\r\n		<strong>男士们看的眼睛都直</strong></p><p style=\"text-align: center;\"><strong><img src=\"http://localhost:8080/SternGym/sterngymimages/1528609507606.jpg\" alt=\"undefined\"><br></strong></p><p style=\"text-align: center;\"><strong><img src=\"http://localhost:8080/SternGym/sterngymimages/1528609519775.jpg\" alt=\"undefined\"><br></strong></p><p style=\"text-align: center;\">&nbsp; &nbsp;自由搏击操超级酷炫\r\n	</p><p style=\"text-align: center;\">\r\n		小编的少女心都出来了\r\n	</p><p style=\"text-align: center;\">\r\n		<strong>超级想学这酷酷的搏击操</strong> \r\n	</p><p style=\"text-align: center;\">\r\n	\r\n	\r\n	</p><p style=\"text-align: center;\">\r\n		<strong>有人一起约吗？</strong></p><p style=\"text-align: center;\"><strong><img src=\"http://localhost:8080/SternGym/sterngymimages/1528609593246.gif\" alt=\"undefined\"><br></strong></p><p style=\"text-align: center;\">\r\n		<strong>感觉怎么样，快加入严烈健身俱乐部吧，</strong> \r\n	</p><p style=\"text-align: center;\">\r\n		<strong>你也可以这么棒哦！</strong> \r\n	</p><p style=\"text-align: center;\">\r\n		<strong>我们</strong><strong>俱乐部</strong><strong>帅哥美女超级多哦</strong> \r\n	</p><p style=\"text-align: center;\">\r\n		<strong>桃花健身季，来一场脱单吧！</strong> \r\n	</p><p style=\"text-align: center;\">\r\n		<strong>感觉怎么样呢？</strong> \r\n	</p><p style=\"text-align: center;\">\r\n	\r\n	\r\n	\r\n	\r\n	</p><p style=\"text-align: center;\">\r\n		<strong>一起约起来吧！</strong></p>', '2019-05-09 13:21:16', '3');
INSERT INTO `news` VALUES ('12', '“酷炼一夏，燃动淄博”严烈健身房5.26大型户外健身派对', '<p>&nbsp; &nbsp; &nbsp; &nbsp;由严烈健身精英团操教练团队共同演绎了这场这绝无仅有的健身狂欢。在他们的带领下，数现场所有的健身爱好者们，痛快感受了一场世界级的健身派对，领略了社交集体健身的无限魅力。</p><p style=\"text-align: center;\"><img src=\"http://localhost:8080/SternGym/sterngymimages/1528599932050.jpg\" alt=\"undefined\"><br></p><p style=\"text-align: center; \">&nbsp; &nbsp; &nbsp;&nbsp;</p><p style=\"text-align: center; \"><br></p><p style=\"text-align: center; \"><br></p><p style=\"text-align: center; \"><br></p><p style=\"text-align: center; \"><br></p><p style=\"text-align: center; \">现场还如火如荼的举办了GRIT勇士挑战赛，许多健身达人都踊跃参加，挑战全场，更挑战自己的极限。并赢得丰富的奖品。</p><p style=\"text-align: center; \"><br></p><p style=\"text-align: center; \"><br></p><p style=\"text-align: center; \"><br></p><p style=\"text-align: center; \"><br></p><p style=\"text-align: center; \"><span><img src=\"http://localhost:8080/SternGym/sterngymimages/1528600080567.jpg\" alt=\"undefined\"><br></span></p><p style=\"text-align: center; \"><img src=\"http://localhost:8080/SternGym/sterngymimages/1528600064380.jpg\" alt=\"undefined\"><br></p><p>&nbsp; &nbsp; &nbsp; &nbsp;活动的成功，最离不开的是会员们大力的支持，虽然活动已经告一段落，但我们希望全民健身的热情不会因此而熄灭。今后严烈健身俱乐部还会举办更多类似的大型体育互动活动，加入严烈健身俱乐部，颠覆你对健身的想法，与我们一起融入愉快的氛围中，让汗水浸透的身体。给你非一般的运动体验！&nbsp; &nbsp; &nbsp; &nbsp;</p>', '2019-05-26 22:53:17', '1');
INSERT INTO `news` VALUES ('13', '大咖云集,健身界传奇人物相聚严烈健身', '<p style=\"text-align: center;\"><span>9.7日，我们邀请到了6位健身界的传奇人物</span></p><p style=\"text-align: center;\"><span>来到我们严烈健身俱乐部</span></p><p style=\"text-align: center;\"><span>一起交流学习&nbsp;</span></p><p style=\"text-align: center;\"><span><img src=\"http://localhost:8080/SternGym/sterngymimages/1528599187953.jpg\" alt=\"undefined\"><br></span></p><p style=\"text-align: center;\"><span>现场</span></p><p style=\"text-align: center;\"><span>他们不仅与我们的教练和会员们共同交流</span><br data-filtered=\"filtered\"></p><p style=\"text-align: center;\"><span>更是近距离互动</span></p><p style=\"text-align: center;\"><span>一起来感受健身的魅力</span></p><p style=\"text-align: center;\"><span>这个激动时刻，小编当然想与你共同分享。</span></p><p style=\"text-align: center;\"><span>那么首先让我一起看看现场来了哪些大咖吧</span></p><p style=\"text-align: center;\"><strong><span>/Kevin levrone（凯文 莱弗隆）/<img src=\"http://localhost:8080/layui/images/face/39.gif\" alt=\"[鼓掌]\"></span></strong></p><p style=\"text-align: center;\"><span><img src=\"http://localhost:8080/SternGym/sterngymimages/1528599225353.jpg\" alt=\"undefined\"><br></span></p><p style=\"text-align: center;\"><span>这位相信已经不用多说</span></p><p style=\"text-align: center;\"><span><br></span></p><p style=\"text-align: center;\"><br></p><p style=\"text-align: center;\"><span>Egard&nbsp;&nbsp;&nbsp; IFBB 残疾人职业组冠军</span></p><p style=\"text-align: center;\"><span>4岁失去双腿</span></p><p style=\"text-align: center;\"><span>但他的人生目标可不仅仅是站起来</span></p><p style=\"text-align: center;\"><span>命运没有给他的</span></p><p style=\"text-align: center;\"><span>最终却成了他的骄傲</span></p><p style=\"text-align: center;\"><span><img src=\"http://localhost:8080/SternGym/sterngymimages/1564559758255.png\" alt=\"undefined\"><br></span></p><p style=\"text-align: center;\"><span>最后当然少不了和我们严烈健身俱乐部大家族来个全家福</span></p>', '2017-09-08 16:51:24', '1');
INSERT INTO `news` VALUES ('14', '别让中年危机提前来临，严烈健身俱乐部为你保驾护航', '<p>&nbsp; &nbsp; &nbsp; &nbsp; 2017年12月,《中国青年报》调查称,抽样的1979名90后中,79.6%年轻人已开始关注养生信息。阳光健身房更是了解到,去年双十一,从午夜零点到一点,一个小时,天猫卖出了179吨枸杞,购买主力军竟然是年轻人。</p><p style=\"text-align: center;\"><img src=\"http://localhost:8080/SternGym/sterngymimages/1528600890936.png\" alt=\"undefined\"><br></p><p style=\"text-align: left;\">&nbsp; &nbsp; &nbsp; &nbsp; 他们纠结,他们不安,他们内心惶恐,他们身体虚弱,他们担心哪一天自己会轰然倒下,被时代的快车所甩掉。上海社科院社会学研究所所长杨雄说,我们正处在一个“时空压缩”的时代:中国社会用30多年时间完成了欧美国家300年走完的现代化,自然也要承担别人用几代人承受的压力。而承担这些压力所需要的不仅仅是强大的内心,更需要强健的体魄。<br>\r\n<br>\r\n<br>\r\n</p><p>　　 当然,对于许多90后来说,光养生并不能解决问题,如何利用有限的时间高效率的提高身体素质才是可行之道。而健身房专业的器械以及健身教练的专业辅导,不管是下班后的短暂空闲,还是周末的悠闲时光,都能让身体素质得到有效的锻炼。也正是因此,健身房成为了无数年轻人青睐的场所。于是在蓬勃发展的健身行业中,许多优秀健身房脱颖而出,阳光健身俱乐部便是其中之一。</p><p style=\"text-align: center;\"><img src=\"http://localhost:8080/SternGym/sterngymimages/1528600931986.png\" alt=\"undefined\"><br></p><p style=\"text-align: left;\">&nbsp; &nbsp; &nbsp; &nbsp;严烈健身俱乐部是一家健身,休闲、娱乐的俱乐部。俱乐部设有:健身有氧区、固定器械区、搏击区、私教区、十多种特色瑜伽、健美操24小时恒温热水等设施。<br>\r\n<br>\r\n<br>\r\n　　身体是革命的本钱,对于大部分已经成家立业的90后来说,如何对抗提前来临的“中年危机”,相信健身房是一个不错的选择。照顾好自己,才能更好的成为家庭中的顶梁柱,这个夏天,严烈健身等你前来!</p><p></p>', '2019-05-15 16:51:34', '3');

-- ----------------------------
-- Table structure for `newskinds`
-- ----------------------------
DROP TABLE IF EXISTS `newskinds`;
CREATE TABLE `newskinds` (
  `nkid` int(11) NOT NULL AUTO_INCREMENT COMMENT '新闻种类ID',
  `nkname` varchar(10) DEFAULT NULL COMMENT '新闻种类名称',
  PRIMARY KEY (`nkid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of newskinds
-- ----------------------------
INSERT INTO `newskinds` VALUES ('1', '活动');
INSERT INTO `newskinds` VALUES ('2', '比赛');
INSERT INTO `newskinds` VALUES ('3', '广告');
INSERT INTO `newskinds` VALUES ('4', '公告');

-- ----------------------------
-- Table structure for `post`
-- ----------------------------
DROP TABLE IF EXISTS `post`;
CREATE TABLE `post` (
  `pid` int(255) NOT NULL AUTO_INCREMENT COMMENT '职务id',
  `pname` varchar(50) DEFAULT NULL COMMENT '职务名称',
  `psalary` decimal(12,2) DEFAULT NULL COMMENT '职务薪资',
  PRIMARY KEY (`pid`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of post
-- ----------------------------
INSERT INTO `post` VALUES ('1', '教练', '1000.00');
INSERT INTO `post` VALUES ('2', '会计', '1000.00');
INSERT INTO `post` VALUES ('3', '客服', '1000.00');
INSERT INTO `post` VALUES ('4', '其他', '900.00');

-- ----------------------------
-- Table structure for `reply`
-- ----------------------------
DROP TABLE IF EXISTS `reply`;
CREATE TABLE `reply` (
  `rid` int(11) NOT NULL AUTO_INCREMENT COMMENT '回复id',
  `rcontent` varchar(255) DEFAULT NULL COMMENT '回复内容',
  `rdate` datetime DEFAULT NULL COMMENT '回复时间',
  `r_msg_id` int(11) DEFAULT NULL COMMENT '留言id',
  PRIMARY KEY (`rid`),
  KEY `r_msg_id_fk` (`r_msg_id`),
  CONSTRAINT `r_msg_id_fk` FOREIGN KEY (`r_msg_id`) REFERENCES `message` (`msg_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of reply
-- ----------------------------
INSERT INTO `reply` VALUES ('15', '哈喽', '2019-05-21 17:25:03', '4');
INSERT INTO `reply` VALUES ('16', 'fddd', '2019-05-21 17:27:50', '5');
INSERT INTO `reply` VALUES ('18', '恩呢', '2019-06-10 16:22:52', '8');
INSERT INTO `reply` VALUES ('21', '是的', '2019-06-10 16:47:24', '7');

-- ----------------------------
-- Table structure for `sheet`
-- ----------------------------
DROP TABLE IF EXISTS `sheet`;
CREATE TABLE `sheet` (
  `sid` int(11) NOT NULL AUTO_INCREMENT COMMENT '课程表ID',
  `ssrc` varchar(50) DEFAULT NULL COMMENT '课程表链接',
  PRIMARY KEY (`sid`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sheet
-- ----------------------------
INSERT INTO `sheet` VALUES ('2', 'P90X课程表.pdf');

-- ----------------------------
-- Table structure for `tbl_order`
-- ----------------------------
DROP TABLE IF EXISTS `tbl_order`;
CREATE TABLE `tbl_order` (
  `oid` int(11) NOT NULL AUTO_INCREMENT COMMENT '订单id',
  `member_id` int(11) DEFAULT NULL COMMENT '订单对应的会员id',
  `ocreatetime` datetime DEFAULT NULL COMMENT '订单时间',
  `class_id` int(11) DEFAULT NULL COMMENT '教学班级号',
  `ostatus` int(2) DEFAULT '0' COMMENT '订单状态，默认为0 未支付。1已支付',
  PRIMARY KEY (`oid`),
  KEY `classid_fk` (`class_id`),
  KEY `member_id_fk` (`member_id`),
  CONSTRAINT `classid_fk` FOREIGN KEY (`class_id`) REFERENCES `class` (`classid`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `member_id_fk` FOREIGN KEY (`member_id`) REFERENCES `member` (`mid`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of tbl_order
-- ----------------------------
INSERT INTO `tbl_order` VALUES ('1', '22', '2019-05-21 19:50:26', '1', '0');
INSERT INTO `tbl_order` VALUES ('2', '22', '2019-05-21 20:05:13', '1', '0');
INSERT INTO `tbl_order` VALUES ('3', '23', '2019-05-21 20:07:19', '4', '0');
INSERT INTO `tbl_order` VALUES ('4', '22', '2019-05-21 20:54:59', '4', '0');
INSERT INTO `tbl_order` VALUES ('5', '22', '2019-05-29 16:16:23', '1', '0');
INSERT INTO `tbl_order` VALUES ('6', '22', '2019-06-01 16:26:29', '1', '0');
INSERT INTO `tbl_order` VALUES ('7', '24', '2019-06-10 16:48:17', '4', '0');
INSERT INTO `tbl_order` VALUES ('8', '24', '2019-06-10 17:46:00', '3', '0');
