package com.pdm.backend.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.pdm.backend.models.Person;

public interface PersonServices {

    

    
    Person createPersons(String person_id , Person person);
    Page<Person> findAll(Pageable pageable);
    Optional<Person> findOne(String person_id);
    boolean isExist(String person_id);
    Person partialUpdatedPerson(String person_id , Person persons);
    void delete (String person_id);
    Person assignCourseToPerson(String person_id , String course_id);
    Person assignExamToPerson(String person_id , long exam_id);

}
