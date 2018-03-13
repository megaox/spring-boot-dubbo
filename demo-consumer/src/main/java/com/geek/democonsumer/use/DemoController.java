package com.geek.democonsumer.use;

import com.alibaba.dubbo.config.annotation.Reference;
import com.geek.demoapi.api.DemoStubService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@Reference(version = "1.0.0")//里面有很多参数可供选择，请自行查询API
	private DemoStubService demoStubService;

	@GetMapping("test")
	public int justTest() {
		return demoStubService.testPlus(1, 2);
	}
}
