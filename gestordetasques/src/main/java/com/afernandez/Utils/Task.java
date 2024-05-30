package com.afernandez.Utils;

public class Task {

    private static int instanceCount = 0;
    private final int id;
    private final String name;
    private boolean isDone;

    public Task(String name) {
        this.name = name;
        this.isDone = false;
        this.id = ++instanceCount;
    }

    public void markAsDone() {
        this.isDone = true;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public boolean isDone() {
        return this.isDone;
    }

    @Override
    public String toString() {
        return "Id: " + id + ", Name: " + name + ", Is done: " + isDone;
    }
}
