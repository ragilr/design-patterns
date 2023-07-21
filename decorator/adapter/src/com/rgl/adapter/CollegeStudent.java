package com.rgl.adapter;

public class CollegeStudent implements Student{

    private String name;
    private String surname;
    private String email;


    @Override
    public String toString() {
        return "CollegeStudent{" +
                "name='" + getName() + '\'' +
                ", surname='" + getSurname() + '\'' +
                ", email='" + getEmail() + '\'' +
                '}';
    }

    public CollegeStudent(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSurname() {
        return surname;
    }

    @Override
    public String getEmail() {
        return email;
    }
}
