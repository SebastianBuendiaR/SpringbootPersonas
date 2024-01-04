package com.personal.personalsb;

import java.util.UUID;

public class Person {
    String id;
    String name;
    String profile;
    int age;

    public Person() {
        this.id = UUID.randomUUID().toString();
    }

    
    public Person(String name, String profile, int age) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.profile = profile;
        this.age = age;
    }




    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getProfile() {
        return profile;
    }
    public void setProfile(String profile) {
        this.profile = profile;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    
}
