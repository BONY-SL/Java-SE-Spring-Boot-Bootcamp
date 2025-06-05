package com.example.demoaop;

import com.example.demoaop.service.TransferService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoaopApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(DemoaopApplication.class, args);

		TransferService transferService = applicationContext.getBean(TransferService.class);
		transferService.transferMoney("sahan","kolith",33);
	}

}
