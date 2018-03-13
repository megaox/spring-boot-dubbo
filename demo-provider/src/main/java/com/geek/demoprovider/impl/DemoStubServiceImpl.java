package com.geek.demoprovider.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.geek.demoapi.api.DemoStubService;

@Service(version = "1.0.0")
public class DemoStubServiceImpl implements DemoStubService {

	@Override
	public int testPlus(int a, int b) {
		return a + b;
	}
}
