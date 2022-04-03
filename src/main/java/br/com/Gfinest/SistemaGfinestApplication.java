package br.com.Gfinest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages="br.com.Gfinest.model")
@ComponentScan(basePackages= {"br.com.Gfinest.*"})
@EnableJpaRepositories(basePackages= {"br.com.Gfinest.repository"})
@EnableTransactionManagement
public class SistemaGfinestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SistemaGfinestApplication.class, args);
	}

}
