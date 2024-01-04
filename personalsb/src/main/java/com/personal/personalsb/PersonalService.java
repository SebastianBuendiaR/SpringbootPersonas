package com.personal.personalsb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonalService {

    @Autowired
    PersonalRepository personalRepository;


    public List<Person> returnAllPeople(){
        return personalRepository.getPeople();
    }
}
