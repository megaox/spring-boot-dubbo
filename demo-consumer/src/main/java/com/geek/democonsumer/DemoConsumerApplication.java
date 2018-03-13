package com.geek.democonsumer;

import com.geek.democonsumer.use.DemoConsumerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoConsumerApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ca = SpringApplication.run(DemoConsumerApplication.class, args);
		DemoConsumerService dcs = ca.getBean(DemoConsumerService.class);
		int rs = dcs.justTest();
		System.out.println(rs);
	}
}
