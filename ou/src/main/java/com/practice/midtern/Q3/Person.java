package com.practice.midtern.Q3;

import java.time.LocalDate;

public class Person {

    private String id;
    private String idRole;
    private String name;
    private LocalDate dob;

    public Person(LocalDate dob, String id, String idRole, String name) {
        this.dob = dob;
        this.id = id;
        this.idRole = idRole;
        this.name = name;
    }
    
    
}
