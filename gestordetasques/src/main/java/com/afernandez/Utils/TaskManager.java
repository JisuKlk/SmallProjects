package com.afernandez.Utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TaskManager {

    private final HashMap<String, ArrayList<Task>> lists;
    private final HashMap<Integer, Task> tasks;

    public TaskManager() {
        lists = new HashMap<>();
        lists.put("Low", new ArrayList<>());
        lists.put("Medium", new ArrayList<>());
        lists.put("High", new ArrayList<>());
        tasks = new HashMap<>();
    }

    public void addTask(String taskName, String priority) {
        Task task = new Task(taskName);
        lists.get(priority).add(task);
        tasks.put(task.getId(), task);
    }

    public void markTaskAsDone(int taskId) {
        tasks.get(taskId).markAsDone();
    }

    public void removeTask(int taskId) {
        tasks.remove(taskId);
    }

    public void showAllTasks() {
        for (Map.Entry<Integer, Task> entry : tasks.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public void showTasksByPriority(String priority) {
        System.out.println(Constants.TASKS_WITH_PRIORITY + priority);
        for (Task task : lists.get(priority)) {
            System.out.println(task);
        }
    }
}
