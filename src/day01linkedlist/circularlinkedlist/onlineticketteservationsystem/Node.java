package day01linkedlist.circularlinkedlist.onlineticketteservationsystem;

class Node {
    Ticket ticket;
    Node next;

    public Node(Ticket ticket) {
        this.ticket = ticket;
        this.next = null;
    }
}
