package com.geek.democonsumer.use;

import com.alibaba.dubbo.config.annotation.Reference;
import com.geek.demoapi.api.DemoStubService;
import org.springframework.stereotype.Component;

@Component
public class DemoConsumerService {
	@Reference(version = "1.0.0")
	private DemoStubService demoStubService;

	public int justTest() {
		return demoStubService.testPlus(1, 2);
	}
}
