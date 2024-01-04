package com.personal.personalsb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class PersonalRepository {
    
    List<Person> listPeople = new ArrayList<>(Arrays.asList(
        new Person("Sebastian","Engineer",25),
        new Person("Raul","Communication",29),
        new Person("Gustavo","Engineer",29)
    ));

    
    public List<Person> getPeople(){
        return listPeople;
    }
    

}
