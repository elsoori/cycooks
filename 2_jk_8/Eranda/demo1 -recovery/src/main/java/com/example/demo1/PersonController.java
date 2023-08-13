package com.example.demo1;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class PersonController {

    HashMap<String, Person> peopleList = new HashMap<>();
    //private HashMap<String, Person> ;

    @PutMapping("/addDetails")
    public @ResponseBody String createPerson(@RequestBody Person person) {
        peopleList.put(person.getTelNum(), person);
        return "Saved";
    }

    @GetMapping("/getAll")
    public @ResponseBody HashMap<String,Person> getAllPersonsOne() {
        return peopleList;
    }

    @PostMapping("/addPerson/{firstName}/{lastName}/{address}/{telNum}")
    public @ResponseBody String createPersonByPath(@PathVariable String firstName, @PathVariable String lastName, @PathVariable String address, @PathVariable String telNum) {
       Person person = new Person(firstName, lastName, address, telNum);
       peopleList.put(person.getTelNum(), person);
       return "saved " + firstName + " " + telNum;
    }

    @DeleteMapping ("/deletePerson/{telNum}")
    public @ResponseBody String deletePerson(@PathVariable String telNum) {
        if(!peopleList.containsKey(telNum)) return "Person not found";
        peopleList.remove(telNum);
        return "Person Removed";
    }





}
