package com.rgl.adapter;

public class SchoolStudentAdapter implements Student{

    SchoolStudent schoolStudent;

    public SchoolStudentAdapter(SchoolStudent schoolStudent) {
        this.schoolStudent = schoolStudent;
    }

    @Override
    public String getName() {
        return schoolStudent.getFirstName();
    }

    @Override
    public String getSurname() {
        return schoolStudent.getLastName();
    }

    @Override
    public String toString() {
        return "SchoolStudentAdapter{" +
                "schoolStudent=" + schoolStudent +
                '}';
    }

    @Override
    public String getEmail() {
        return schoolStudent.getEmailAddress();
    }
}
