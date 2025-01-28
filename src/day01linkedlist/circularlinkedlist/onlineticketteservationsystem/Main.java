package day01linkedlist.circularlinkedlist.onlineticketteservationsystem;

public class Main {
    public static void main(String[] args) {
        TicketReservationSystem system = new TicketReservationSystem();

        // Add tickets
        system.addTicket(new Ticket(101, "Ankit", "Inception", "A1", "10:00 AM"));
        system.addTicket(new Ticket(102, "Aakrati", "Avatar", "B2", "12:00 PM"));
        system.addTicket(new Ticket(103, "Anand", "Titanic", "C3", "02:00 PM"));

        // Display all tickets
        system.displayAllTickets();

        // Search for a ticket by customer name
        System.out.println("\nSearching for tickets by Customer Name 'Alice':");
        system.searchTicket("Alice");

        // Search for a ticket by movie name
        System.out.println("\nSearching for tickets by Movie Name 'Avatar':");
        system.searchTicket("Avatar");

        // Total tickets
        System.out.println("\nTotal tickets: " + system.totalTickets());

        // Remove a ticket by ID
        System.out.println("\nRemoving ticket with ID 102:");
        system.removeTicketById(102);

        // Display all tickets after removal
        System.out.println("\nTickets after removal:");
        system.displayAllTickets();

        // Total tickets after removal
        System.out.println("\nTotal tickets: " + system.totalTickets());
    }
}