package day01linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

public class Main {
    public static void main(String[] args) {
        RoundRobinScheduler scheduler = new RoundRobinScheduler(4); // Time quantum = 4

        // Add processes
        scheduler.addProcess(new Process(1, 10, 1));
        scheduler.addProcess(new Process(2, 5, 2));
        scheduler.addProcess(new Process(3, 8, 1));
        scheduler.addProcess(new Process(4, 6, 3));

        // Display all processes
        scheduler.displayAllProcesses();

        // Simulate round-robin scheduling
        scheduler.simulateScheduling();
    }
}