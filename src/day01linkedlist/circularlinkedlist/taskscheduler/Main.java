package day01linkedlist.circularlinkedlist.taskscheduler;

public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();

        // Add tasks
        scheduler.addTaskAtEnd(new Task(1, "Task1", 1, "2025-01-28"));
        scheduler.addTaskAtEnd(new Task(2, "Task2", 2, "2025-01-29"));
        scheduler.addTaskAtEnd(new Task(3, "Task3", 1, "2025-01-30"));

        // Display all tasks
        scheduler.displayAllTasks();

        // Add a task at the beginning
        scheduler.addTaskAtBeginning(new Task(4, "Task4", 3, "2025-01-27"));
        scheduler.displayAllTasks();

        // Add a task at position 2
        scheduler.addTaskAtPosition(new Task(5, "Task5", 2, "2025-01-26"), 2);
        scheduler.displayAllTasks();

        // Remove a task by ID
        scheduler.removeTaskById(2);
        scheduler.displayAllTasks();

        // View current task and move to the next
        scheduler.viewAndMoveNext();
        scheduler.viewAndMoveNext();

        // Search tasks by priority
        scheduler.searchTasksByPriority(1);
        scheduler.searchTasksByPriority(5);
    }
}
