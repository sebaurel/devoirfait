package fr.WCS.devoirfait;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

@SpringBootApplication
public class DevoirfaitApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevoirfaitApplication.class, args);
	}

	@Bean
	public LocalEntityManagerFactoryBean entityManagerFactory(){
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("DevoirFait");
		return factoryBean;
	}
}
