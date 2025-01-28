package day01linkedlist.circularlinkedlist.roundrobinschedulingalgorithm;

class Node {
    Process process;
    Node next;

    public Node(Process process) {
        this.process = process;
        this.next = null;
    }
}
