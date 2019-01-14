1. 引用jar包(查看pom.xml文件)
2. 创建数据库
drop table if EXISTS `account`;

CREATE TABLE `account` (
  `id` BIGINT(11) NOT NULL auto_increment COMMENT '主键' ,
  `name` varchar(255) NOT NULL comment '用户名称' ,
  `balance` decimal(15,2) not null DEFAULT 0.00 comment '账户余额',
  `frezee` decimal(15,2) DEFAULT NULL comment '当前冻结余额',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
3. 创建EO对象(参考AccountEO)
4. 创建BaseMapper, 该类放在Util目录下, 不能合AccountMapper下, 不然会报错
5. 创建AccountMapper和其它的供使用用的Mapper
	5.1  配置AccountMap需要的Mapper.xml文件
6. 创建Service层代码, AccountService
7. 创建Controller层代码, AccountController
8. 创建config.properties文件, 配置数据库配置信息
9. 创建applicationContext.xml文件
	9.1 引入config.properties文件
	9.2 创建DataSource信息
	9.3 创建SqlSessionFactory信息
	9.4 创建SqlSession信息
	9.5 引入mapper文件信息
	9.6 创建AOP信息
	9.7 创建tx:advice 信息
	9.8 引入transactionManager信息
10. 创建mybatis-servlet.xml文件(也可以是其它文件, 这个看请求映射路径是怎么样的)
11. 更新web.xml文件, 引入启动时需要的信息	
	