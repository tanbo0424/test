package com.qf.person.mapper;

import com.qf.pojo.Person;


import java.util.List;

public interface PersonMapper {
    public List<Person> selectAll();

    public void addPerson(Person person);

    public Person selectid(int id);

    public void updatePerson(Person person);

    public void deleteid(int id);

    public List<Person> selectSexAndName(String name);
}
