package com.example.apimobile;

import com.example.apimobile.dao.UserDAO;
import com.example.apimobile.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableAsync
@EnableScheduling
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.example.apimobile")
@EntityScan("com.example.apimobile")
@SpringBootApplication
public class ApiMobileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiMobileApplication.class, args);
	}

}
