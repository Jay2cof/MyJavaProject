package oop.Abstraction;

/*
    There are two types of abstraction
    1. Abstract
    2. Interface
    note-
    1. you declare abstract class using the abstract keyword.
    2. You cannot instantiate an abstract class i.e you cannot create an object of an abstract. but you can extend abstract class
    3. An abstract class can contain abstract and non-abstract method
     */


public abstract class School {
    public int getTeachers() {
        return teachers;
    }

    public void setTeachers(int teachers) {
        this.teachers = teachers;
    }

    public int getStudent() {
        return student;
    }

    public void setStudent(int student) {
        this.student = student;
    }

    public String getNameOfSchool() {
        return nameOfSchool;
    }

    public void setNameOfSchool(String nameOfSchool) {
        this.nameOfSchool = nameOfSchool;
    }

    private int teachers;
    private int student;
    private String nameOfSchool;

    public abstract void salary();// does need a body thats why its abstract
    public abstract void bonus();


}
