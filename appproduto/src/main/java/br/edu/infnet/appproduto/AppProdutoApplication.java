package br.edu.infnet.appproduto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class AppProdutoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppProdutoApplication.class, args);
	}

}
