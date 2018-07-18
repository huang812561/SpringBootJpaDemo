package com.jpa.demo;

import com.jpa.demo.bean.UserBean;
import com.jpa.demo.bean.UserSequence;
import com.jpa.demo.bean.UserTable;
import com.jpa.demo.bean.UserUUID;
import com.jpa.demo.respository.UserRespository;
import com.jpa.demo.respository.UserSeqRespository;
import com.jpa.demo.respository.UserTableRespository;
import com.jpa.demo.respository.UserUUIDRespository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class SpringBootJpaDemoApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootJpaDemoApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaDemoApplication.class, args);
	}


	//主键生成策略：UUID自动生成，代码如下：
	@Bean
	public CommandLineRunner demo1(UserUUIDRespository userRespository){
		return (String... args) -> {
			userRespository.save(new UserUUID("admin","admin"));
			userRespository.save(new UserUUID("customer","customer"));
			userRespository.save(new UserUUID("user","hgq"));
			userRespository.save(new UserUUID("hgq","hgq"));
			LOGGER.info("Customers found with findAll():");
			LOGGER.info("Customers found with findAll():");
			LOGGER.info("-------------------------------");
			for (UserUUID user : userRespository.findAll()) {
				LOGGER.info(user.toString());
			}
			LOGGER.info("");

			// fetch customers by last name
			LOGGER.info("Customer found with findByLastName('admin'):");
			LOGGER.info("--------------------------------------------");
			userRespository.findByName("admin").forEach(userBean -> {
				LOGGER.info(userBean.toString());
			});
			LOGGER.info("");
		};
	}

	//主键生成策略（GenerationType.IDENTITY）：ID自增长属性
	@Bean
	public CommandLineRunner demo2(UserRespository userRespository){
		return (String... args) -> {
			userRespository.save(new UserBean("admin","admin"));
			userRespository.save(new UserBean("customer","customer"));
			userRespository.save(new UserBean("user","hgq"));
			userRespository.save(new UserBean("hgq","hgq"));

			LOGGER.info("Customers found with findAll():");
			LOGGER.info("-------------------------------");
			for (UserBean user : userRespository.findAll()) {
				LOGGER.info(user.toString());
			}
			LOGGER.info("");

			// fetch customers by last name
			LOGGER.info("Customer found with findByLastName('admin'):");
			LOGGER.info("--------------------------------------------");
			userRespository.findByName("admin").forEach(userBean -> {
				LOGGER.info(userBean.toString());
			});
			LOGGER.info("");
		};
	}

	//主键生成策略：表类型
	@Bean
	public CommandLineRunner demo3(UserTableRespository userRespository){
		return (String... args) -> {
			userRespository.save(new UserTable("admin","admin"));
			userRespository.save(new UserTable("customer","customer"));
			userRespository.save(new UserTable("user","hgq"));
			userRespository.save(new UserTable("hgq","hgq"));

			LOGGER.info("Customers found with findAll():");
			LOGGER.info("-------------------------------");
			for (UserTable user : userRespository.findAll()) {
				LOGGER.info(user.toString());
			}
			LOGGER.info("");

			// fetch customers by last name
			LOGGER.info("Customer found with findByLastName('admin'):");
			LOGGER.info("--------------------------------------------");
			userRespository.findByName("admin").forEach(userBean -> {
				LOGGER.info(userBean.toString());
			});
			LOGGER.info("");
		};
	}

	//主键生成策略：序列
	@Bean
	public CommandLineRunner demo4(UserSeqRespository userRespository){
		return (String... args) -> {
			userRespository.save(new UserSequence("admin","admin"));
			userRespository.save(new UserSequence("customer","customer"));
			userRespository.save(new UserSequence("user","hgq"));
			userRespository.save(new UserSequence("hgq","hgq"));

			LOGGER.info("Customers found with findAll():");
			LOGGER.info("-------------------------------");
			for (UserSequence user : userRespository.findAll()) {
				LOGGER.info(user.toString());
			}
			LOGGER.info("");

			// fetch customers by last name
			LOGGER.info("Customer found with findByLastName('admin'):");
			LOGGER.info("--------------------------------------------");
			userRespository.findByName("admin").forEach(userBean -> {
				LOGGER.info(userBean.toString());
			});
			LOGGER.info("");
		};
	}
}
