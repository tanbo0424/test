package com.qf;

import com.qf.person.service.PersonService;
import com.qf.pojo.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-mybatis.xml","spring-service.xml");
        PersonService bean = applicationContext.getBean(PersonService.class);
       // List<Person> people = bean.selectAll();
       // System.out.println(people);


//        Person person=new Person();
//        person.setName("asfas");
//        person.setSex("sf");
//        person.setTel(2312);
//        person.setEmail("asdf");
//        person.setAddress("sadfas");
//      bean.addPerson(person);

        Person selectid = bean.selectid(1);
        System.out.println(selectid);

    }
}
