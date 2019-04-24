package com.qf.person.controller;

import com.qf.person.service.PersonService;
import com.qf.pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonService personService;
    @RequestMapping("selectAll")
    public List<Person> selectAll(){
        return personService.selectAll();
    }

    @RequestMapping("addPerson")
    public Object addPerson(@RequestBody Person person){
         personService.addPerson(person);
         return "ok";
    }
    @RequestMapping("selectid")
    public Object selectid(@RequestParam int id){
        return personService.selectid(id);
    }

    @RequestMapping("updatePerson")
    public Object updatePerson(@RequestBody Person person){
        personService.updatePerson(person);
        return "ok";
    }

    @RequestMapping("deleteid")
    public Object deleteid(@RequestParam int id){
        personService.deleteid(id);
        return "ok";
    }

    @RequestMapping("selectSexAndName")
    public Object selectSexAndName(@RequestParam String name){
        return personService.selectSexAndName(name);

    }



}
