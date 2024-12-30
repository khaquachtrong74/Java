package com.practice.midtern.Q3;

import java.time.LocalDate;

public class Student extends Person{

    private static int count;
    private String phoneNumb;
    public Student(LocalDate dob, String id, String name, String phoneNumb) {
        super(dob, id, String.format("STD-%05d", count++), name);
        this.phoneNumb = phoneNumb;
    }
    
}
