package com.task;

public class Employee {
    private static int dem;

    public static int getDem() {
        return dem;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public static void setDem(int dem) {
        Employee.dem = dem;
    }

    private String name;
    private String id = String.format("ID:%05d", dem++);
    private double salary;

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee tongLuong(Employee other) {
        return new Employee(this.name + " & " + other.name, this.salary + other.salary);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Name: ").append(name);
        stringBuilder.append("\nSalary: ").append(salary);
        return stringBuilder.toString();
    }

}
