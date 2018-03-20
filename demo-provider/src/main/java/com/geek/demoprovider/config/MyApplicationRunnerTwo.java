package com.geek.demoprovider.config;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 项目启动之后立即运行
 */
@Component
@Order(value = 20)
public class MyApplicationRunnerTwo implements ApplicationRunner {
	@Override
	public void run(ApplicationArguments args) {
		System.out.println("ApplicationRunner: init something. Order-20");
	}
}
