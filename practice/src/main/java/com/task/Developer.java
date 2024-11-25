package com.task;

public class Developer extends Employee{
    private String programmingLanguage;

    public Developer() {
    }
    public Developer(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }
    public Developer(String programmingLanguage, String name, double salary) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return super.toString() + "\nProgramming language:  " + programmingLanguage;
    }
    
}
