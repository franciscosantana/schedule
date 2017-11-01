package br.org.frsantana.schedule.api.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@SpringBootApplication
@EnableResourceServer
@ComponentScan(basePackages = {"br.org.frsantana.schedule.api.application.config", "br.org.frsantana.schedule.api.domain.service"})
@EntityScan("br.org.frsantana.schedule.api.domain.entity")
@EnableJpaRepositories("br.org.frsantana.schedule.api.domain.repository")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
