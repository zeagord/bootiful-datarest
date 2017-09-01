package com.github.blog.sundarsy.springdatarestdemo;

import com.github.blog.sundarsy.springdatarestdemo.model.Person;
import com.github.blog.sundarsy.springdatarestdemo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;

/**
 * Created by rg3 on 8/31/17.
 */

@RequestMapping("person")
@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepo;

    @RequestMapping(value = "/findaperson/{id}", method = RequestMethod.GET)
    public ResponseEntity<Person> getPerson(@PathVariable Long id){
        return new ResponseEntity<Person>(personRepo.findOne(id), HttpStatus.OK);
    }

    @RequestMapping(value = "/saveaperson", method = RequestMethod.POST)
    public ResponseEntity<Person> getPerson(@RequestBody Person person){
        return new ResponseEntity<Person>(personRepo.save(person), HttpStatus.OK);
    }
}
