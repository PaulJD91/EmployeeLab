package com.codebase.staff;

public abstract class Employee {

    private String name;
    private String ninumber;
    private double salary;

    public Employee(String name, String ninumber, double salary) {
        this.name = name;
        this.ninumber = ninumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNinumber() {
        return ninumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        this.salary += raise;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
