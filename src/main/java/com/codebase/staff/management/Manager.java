package com.codebase.staff.management;

import com.codebase.staff.Employee;

public class Manager extends Employee {

    private String deptName;
    public Manager(String name, String ninumber, double salary, String deptName) {
        super(name, ninumber, salary);
        this.deptName = deptName;
    }

    public String getDeptName() {
        return deptName;
    }
}
