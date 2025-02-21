package com.leurquin.first_api.repository;

import com.leurquin.first_api.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
