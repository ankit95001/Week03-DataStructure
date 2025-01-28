package day01linkedlist.circularlinkedlist.taskscheduler;

class Task {
    int taskId;
    String taskName;
    int priority;
    String dueDate;

    public Task(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task[ID=" + taskId + ", Name=" + taskName + ", Priority=" + priority + ", DueDate=" + dueDate + "]";
    }
}