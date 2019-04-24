package com.qf.person.service;

import com.qf.pojo.Person;

import java.util.List;

public interface PersonService {
    public List<Person> selectAll();

    public void addPerson(Person person);

    public Person selectid(int id);

    public void updatePerson(Person person);

    public void deleteid(int id);

    public List<Person> selectSexAndName(String name);
}
