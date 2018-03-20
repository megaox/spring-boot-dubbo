package com.geek.demoprovider.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 项目启动之后立即运行
 */
@Component
@Order(value = 10)
public class MyApplicationRunnerOne implements CommandLineRunner {
	@Override
	public void run(String... args) {
		System.out.println("CommandLineRunner: init something. Order: 10");
	}
}
