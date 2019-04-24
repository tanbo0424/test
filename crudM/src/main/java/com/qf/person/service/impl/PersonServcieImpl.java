package com.qf.person.service.impl;

import com.qf.person.mapper.PersonMapper;
import com.qf.person.service.PersonService;
import com.qf.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServcieImpl implements PersonService {
@Autowired(required = false)
    PersonMapper personMapper;
    public List<Person> selectAll() {
        return personMapper.selectAll();
    }

    public void addPerson(Person person) {
        personMapper.addPerson(person);
    }

    public Person selectid(int id) {


        return personMapper.selectid(id);
    }

    public void updatePerson(Person person) {
        personMapper.updatePerson(person);
    }

    public void deleteid(int id) {
        personMapper.deleteid(id);
    }

    public List<Person> selectSexAndName(String name) {
        return personMapper.selectSexAndName(name);
    }


}
