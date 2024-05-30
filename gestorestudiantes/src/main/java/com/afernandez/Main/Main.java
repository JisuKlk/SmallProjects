package com.afernandez.Main;

import java.util.Scanner;

import com.afernandez.Utils.Constants;
import com.afernandez.Utils.StudentManager;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManager manager = new StudentManager();
        int option;

        do {
            System.out.println("\n" + Constants.ADD_STUDENT);
            System.out.println(Constants.ADD_SUBJECT_TO_STUDENT);
            System.out.println(Constants.REMOVE_SUBJECT_FROM_STUDENT);
            System.out.println(Constants.SHOW_ALL_STUDENTS);
            System.out.println(Constants.SHOW_SUBJECTS_OF_STUDENT);
            System.out.println(Constants.EXIT);
            System.out.print(Constants.SELECT_OPTION);
            option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> manager.addStudent(scanner);
                case 2 -> manager.addSubjectToStudent(scanner);
                case 3 -> manager.removeSubjectFromStudent(scanner);
                case 4 -> manager.showStudents();
                case 5 -> manager.showSubjectsOfStudent(scanner);
                case 6 -> System.out.println(Constants.GOODBYE);
                default -> System.out.println(Constants.INVALID_OPTION);
            }
        } while (option != 6);
    }
}
