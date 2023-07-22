package com.rgl.composite;

import java.util.ArrayList;
import java.util.List;

public class HeadDepartment implements Department {
    private int id;
    private String name;
    private final List<Department> childDepartments;

    public HeadDepartment(int id, String name) {
        this.id = id;
        this.name = name;
        this.childDepartments = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addDepartment(Department department) {
        // Prevent adding the headDepartment itself as a child
        if (department != this) {
            childDepartments.add(department);
        }
    }

    public void removeDepartment(Department department) {
        childDepartments.remove(department);
    }

    @Override
    public void printDepartmentDetails() {
        System.out.println("Head Dept id: " + getId() + " Head Dept name: " + getName());
        System.out.println("Child Departments:");
        for (Department department : childDepartments) {
            department.printDepartmentDetails();
        }
    }
}
