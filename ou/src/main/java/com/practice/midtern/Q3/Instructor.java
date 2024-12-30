package com.practice.midtern.Q3;

import java.time.LocalDate;

public class Instructor extends Person{
    private static int count;
    private int seniority;
    public Instructor(LocalDate dob, String id, String idRole, String name, int seniority) {
        super(dob, id, String.format("INS-%05d", count++), name);
        this.seniority = seniority;
    }

}
