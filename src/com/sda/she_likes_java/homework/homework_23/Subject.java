package com.sda.she_likes_java.homework.homework_23;

public class Subject {

    String subjectName;
    String subjectTeacher;


    public Subject(String subjectName, String subjectTeacher) {
        this.subjectName = subjectName;
        this.subjectTeacher = subjectTeacher;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectTeacher='" + subjectTeacher + '\'' +
                '}';
    }
}
