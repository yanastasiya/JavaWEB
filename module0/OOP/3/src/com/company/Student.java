package com.company;

public class Student {
    protected String surname;
    protected String initials;
    protected int numOfGroup;
    protected int[] study;

    public Student(String surname, String initials, int numOfGroup, int[] study) {
        this.surname = surname;
        this.initials = initials;
        this.numOfGroup = numOfGroup;
        this.study = study;
    }
}
