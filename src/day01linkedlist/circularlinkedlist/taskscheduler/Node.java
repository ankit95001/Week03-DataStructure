package day01linkedlist.circularlinkedlist.taskscheduler;

class Node {
    Task task;
    Node next;

    public Node(Task task) {
        this.task = task;
        this.next = null;
    }
}
