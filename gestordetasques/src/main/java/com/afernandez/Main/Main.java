package com.afernandez.Main;

import com.afernandez.Utils.Constants;
import com.afernandez.Utils.TaskManager;

class Main {

    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        System.out.println(Constants.ADDING_TASK);
        manager.addTask("Complete Programming Assignment", "High");
        System.out.println(Constants.PRINTING_ALL_TASKS);
        manager.showAllTasks();
        System.out.println(Constants.PRINTING_TASKS_BY_PRIORITY);
        manager.showTasksByPriority(Constants.HIGH);
        System.out.println(Constants.MARKING_TASK_AS_DONE);
        manager.markTaskAsDone(1);
        System.out.println(Constants.PRINTING_ALL_TASKS);
        manager.showAllTasks();
        System.out.println(Constants.REMOVING_TASK);
        manager.removeTask(1);
        System.out.println(Constants.PRINTING_ALL_TASKS);
        manager.showAllTasks();
    }
}
