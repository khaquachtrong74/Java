package com.task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Company {
    private final List<Employee> ds = new ArrayList<>();
    public void addEmployee(Employee... a){
        this.ds.addAll(Arrays.asList(a));
    }
    // tinh tong luong trong danh sach
    public double calculateTotalSalary(){
        return this.ds.stream().mapToDouble(Employee::getSalary).sum();
    }
    public void displayAllEmployees(){
        this.ds.forEach(el -> System.out.println(el));
    }
    public Employee calculateTotalEmployee(){
        return this.ds.stream().reduce((p,q) -> p.tongLuong(q))
        .orElse(new Employee("No Employee",0));
    }
}
