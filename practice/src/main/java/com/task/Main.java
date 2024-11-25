package com.task;

public class Main {
    public static void main(String[] args) {
        // Tạo đối tượng công ty
        Company company = new Company();

        // Thêm các nhân viên
        company.addEmployee(new Employee("Alice", 5000));
        company.addEmployee(new Employee("Bob", 7000));
        company.addEmployee(new Employee("Charlie", 6000));

        // Tính tổng lương dạng số
        double totalSalary = company.calculateTotalSalary();
        System.out.println("Tong luong cua tat ca nhan vien: " + totalSalary);

        // Tính tổng lương và trả về Employee đại diện
        Employee totalEmployee = company.calculateTotalEmployee();
        System.out.println("Nhan vien dai dien cho tong luong: " + totalEmployee);
    }
}