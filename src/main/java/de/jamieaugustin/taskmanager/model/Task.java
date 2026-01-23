package de.jamieaugustin.taskmanager.model;

public class Task {
    private long id;
    private String name;
    private String note;
    private boolean isFinished;

    public Task(long id, String name, String note, boolean isFinished) {
        this.id = id;
        this.name = name;
        this.note = note;
        this.isFinished = isFinished;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isFinished() {
        return isFinished;
    }

    public void setFinished(boolean finished) {
        isFinished = finished;
    }
}
