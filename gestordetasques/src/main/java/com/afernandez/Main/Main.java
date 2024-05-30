package com.afernandez.Main;

import java.util.Scanner;

import com.afernandez.Utils.Constants;
import com.afernandez.Utils.TaskManager;

class Main {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(Constants.MENU_OPTIONS);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> {
                    System.out.println(Constants.ADDING_TASK);
                    System.out.print(Constants.ENTER_TASK_NAME);
                    String taskName = scanner.nextLine();
                    System.out.print(Constants.ENTER_TASK_PRIORITY);
                    String priority = scanner.nextLine();
                    manager.addTask(taskName, priority);
                }
                case 2 -> {
                    System.out.println(Constants.PRINTING_ALL_TASKS);
                    manager.showAllTasks();
                }
                case 3 -> {
                    System.out.print(Constants.ENTER_TASK_PRIORITY);
                    String priority = scanner.nextLine();
                    System.out.println(Constants.PRINTING_TASKS_BY_PRIORITY);
                    manager.showTasksByPriority(priority);
                }
                case 4 -> {
                    System.out.print(Constants.ENTER_TASK_ID);
                    int taskId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(Constants.MARKING_TASK_AS_DONE);
                    manager.markTaskAsDone(taskId);
                }
                case 5 -> {
                    System.out.print(Constants.ENTER_TASK_ID);
                    int taskId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(Constants.REMOVING_TASK);
                    manager.removeTask(taskId);
                }
                case 6 -> {
                    System.out.println(Constants.EXIT_MESSAGE);
                    scanner.close();
                    return;
                }
                default -> System.out.println(Constants.INVALID_OPTION);
            }
        }
    }
}
