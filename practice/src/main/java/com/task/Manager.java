package com.task;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee{
    private String department;
    private List<String>tasks = new ArrayList<>();
    public Manager(String name, double salary, String department) {
        super(name, salary);
        this.department = department;
    }
    public Manager(){
        super();
    }
    public void assignTask(Employee employee, String task){
        tasks.add(task);
        System.out.println("Manager of " + department + " assign task "+task+" to " + employee.getName());
    }
    public void viewAllTask(){
        this.tasks.forEach(task -> System.out.println(task));
    }

    @Override
    public String toString() {
        return super.toString() + "\n Department: " + department;
    }
    
}
