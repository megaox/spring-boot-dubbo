package com.geek.democonsumer;

import com.alibaba.dubbo.config.annotation.Reference;
import com.geek.demoapi.api.DemoStubService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = DemoConsumerApplicationTests.class)
public class DemoConsumerApplicationTests {

}
