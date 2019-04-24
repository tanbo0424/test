package com.qf.userinfo.controller;

import com.qf.person.service.PersonService;
import com.qf.pojo.Person;
import com.qf.pojo.UserInfo;
import com.qf.userinfo.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.*;

public class ResultFulControllerTest {
    @Test
    public void test(){
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
       // UserService userService= applicationContext.getBean(UserService.class);
        PersonService bean = applicationContext.getBean(PersonService.class);
        List<Person> people = bean.selectAll();
        System.out.println(people);

    }

}