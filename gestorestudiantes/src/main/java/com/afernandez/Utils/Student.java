package com.afernandez.Utils;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final List<String> subjects;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.subjects = new ArrayList<>();
    }

    public void addSubject(String subject) {
        subjects.add(subject);
    }

    public void removeSubject(String subject) {
        subjects.remove(subject);
    }

    public List<String> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (" + age + " years old)";
    }
}
