package day01linkedlist.circularlinkedlist.onlineticketteservationsystem;

class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    String seatNumber;
    String bookingTime;

    public Ticket(int ticketId, String customerName, String movieName, String seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
    }

    @Override
    public String toString() {
        return "Ticket[ID=" + ticketId + ", CustomerName=" + customerName + ", Movie=" + movieName + ", Seat=" + seatNumber + ", BookingTime=" + bookingTime + "]";
    }
}
