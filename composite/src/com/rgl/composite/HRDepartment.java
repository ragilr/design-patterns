package com.rgl.composite;

public class HRDepartment implements Department{

    int id;
    String name;

    public HRDepartment(int id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public void printDepartmentDetails() {
        System.out.println("Dept id:"+getId()+" Dept name:"+getName());
    }
}
