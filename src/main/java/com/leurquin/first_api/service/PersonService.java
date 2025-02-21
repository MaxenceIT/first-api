package com.leurquin.first_api.service;

import com.leurquin.first_api.model.Person;
import com.leurquin.first_api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

   // public void listPerson() {
   //     personRepository.findAll().forEach(System.out::println);
   // }

    public List<Person> listPerson() {
        return personRepository.findAll();
    }

    public Optional<Person> getPerson(Long id) {
        return personRepository.findById(id);
    }
}
