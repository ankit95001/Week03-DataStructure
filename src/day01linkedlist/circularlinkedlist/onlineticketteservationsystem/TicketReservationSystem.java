package day01linkedlist.circularlinkedlist.onlineticketteservationsystem;

class TicketReservationSystem {
    private Node head;

    // Constructor
    public TicketReservationSystem() {
        this.head = null;
    }

    // Add a new ticket reservation at the end of the circular list
    public void addTicket(Ticket ticket) {
        Node newNode = new Node(ticket);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Remove a ticket by Ticket ID
    public void removeTicketById(int ticketId) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Node temp = head, prev = null;
        do {
            if (temp.ticket.ticketId == ticketId) {
                if (prev == null) { // Deleting the head
                    Node last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    if (last == head) { // Only one node
                        head = null;
                    } else {
                        last.next = head.next;
                        head = head.next;
                    }
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Ticket with ID " + ticketId + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Ticket with ID " + ticketId + " not found.");
    }

    // Display all tickets in the list
    public void displayAllTickets() {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Node temp = head;
        System.out.println("Tickets:");
        do {
            System.out.println(temp.ticket);
            temp = temp.next;
        } while (temp != head);
    }

    // Search for a ticket by Customer Name or Movie Name
    public void searchTicket(String searchKey) {
        if (head == null) {
            System.out.println("No tickets available.");
            return;
        }

        Node temp = head;
        boolean found = false;
        do {
            if (temp.ticket.customerName.equalsIgnoreCase(searchKey) || temp.ticket.movieName.equalsIgnoreCase(searchKey)) {
                System.out.println(temp.ticket);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tickets found for the search key: " + searchKey);
        }
    }

    // Calculate the total number of booked tickets
    public int totalTickets() {
        if (head == null) {
            return 0;
        }

        int count = 0;
        Node temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        return count;
    }
}
