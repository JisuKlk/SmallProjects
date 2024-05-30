package com.afernandez.Utils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class StudentManager {
    private static final Map<String, Student> students = new HashMap<>();

    public void addStudent(Scanner scanner) {
        System.out.print(Constants.FIRST_NAME);
        String firstName = scanner.nextLine();
        System.out.print(Constants.LAST_NAME);
        String lastName = scanner.nextLine();
        System.out.print(Constants.AGE);
        int age = scanner.nextInt();
        scanner.nextLine();

        Student student = new Student(firstName, lastName, age);
        students.put(firstName, student);
        System.out.println(Constants.STUDENT_ADDED_SUCCESSFULLY);
    }

    public void addSubjectToStudent(Scanner scanner) {
        System.out.print(Constants.STUDENT_NAME);
        String studentName = scanner.nextLine();
        Student student = students.get(studentName);
        if (student == null) {
            System.out.println(Constants.STUDENT_NOT_FOUND);
            return;
        }

        System.out.print(Constants.SUBJECT_TO_ADD);
        String subject = scanner.nextLine();
        student.addSubject(subject);
        System.out.println(Constants.SUBJECT_ADDED_SUCCESSFULLY + studentName);
    }

    public void removeSubjectFromStudent(Scanner scanner) {
        System.out.print(Constants.STUDENT_NAME);
        String studentName = scanner.nextLine();
        Student student = students.get(studentName);
        if (student == null) {
            System.out.println(Constants.STUDENT_NOT_FOUND);
            return;
        }

        System.out.print(Constants.SUBJECT_TO_REMOVE);
        String subject = scanner.nextLine();
        student.removeSubject(subject);
        System.out.println(Constants.SUBJECT_REMOVED_SUCCESSFULLY + studentName);
    }

    public void showStudents() {
        System.out.println("\n" + Constants.REGISTERED_STUDENTS);
        for (Student student : students.values()) {
            System.out.println(student);
        }
    }

    public void showSubjectsOfStudent(Scanner scanner) {
        System.out.print(Constants.STUDENT_NAME);
        String studentName = scanner.nextLine();
        Student student = students.get(studentName);
        if (student == null) {
            System.out.println(Constants.STUDENT_NOT_FOUND);
            return;
        }

        List<String> subjects = student.getSubjects();
        if (subjects.isEmpty()) {
            System.out.println("Student " + studentName + Constants.NOT_ENROLLED_IN_ANY_SUBJECTS);
        } else {
            System.out.println(Constants.SUBJECTS_OF_STUDENT + studentName + ":");
            for (String subject : subjects) {
                System.out.println("- " + subject);
            }
        }
    }
}
