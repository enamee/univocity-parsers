package com.univocity.parsers.labtest;

public class Student {
    private int id;
    private String name;
    private int age;
    private String email;
    private String major;
    private double cgpa;
    private int year;
    private int semester;

    public Student(int id, String name, int age, String email, String major, double cgpa, int year, int semester) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
        this.major = major;
        this.cgpa = cgpa;
        this.year = year;
        this.semester = semester;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getMajor() {
        return major;
    }

    public double getCgpa() {
        return cgpa;
    }

    public int getYear() {
        return year;
    }

    public int getSemester() {
        return semester;
    }
}
