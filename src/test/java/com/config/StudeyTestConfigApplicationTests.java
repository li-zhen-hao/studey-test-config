package com.config;

import com.config.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudeyTestConfigApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private Person person;
    @Test
    public void contextLoads() {
        System.out.println(person);
    }
    @Test
    public void testHelloServer(){
        boolean b = applicationContext.containsBean("helloService");
        System.out.println(b);
    }

}

