package com.task.two;

import java.util.ArrayList;
import java.util.List;

public class TicketBookingSystem {
    private final List<Movie> movies = new ArrayList<>();
    private final List<Theater> theaters = new ArrayList<>();
    private final List<Ticket> bookings = new ArrayList<>();

    public void addMovie(Movie movie) {
        movies.add(movie);
        System.out.println("Add movie successfully");
    }

    public void addTheater(Theater theater) {
        theaters.add(theater);
        System.out.println("Add theater successfully");
    }

    public Ticket bookTicket(String movieTitle, String theaterName, double price) {
        Movie selectedMovie = movies.stream().filter(m -> m.getTitle().equalsIgnoreCase(movieTitle)).findFirst()
                .orElse(null);
        Theater selectedTheater = theaters.stream().filter(t -> t.getName().equalsIgnoreCase(theaterName)).findFirst()
                .orElse(null);

        if (selectedMovie == null) {
            System.out.println("Movie not found.");
            return null;
        }
        if (selectedTheater == null) {
            System.out.println("Theater not found.");
            return null;
        }
        if (selectedTheater.bookSeat()) {
            Ticket ticket = new Ticket(selectedMovie, selectedTheater, price);
            bookings.add(ticket);
            System.out.println("Ticket booked successfully");
            ticket.displayTicketInfor();
            return ticket;
        } else {
            System.out.println("No available seats in theater: " + theaterName);
            return null;
        }
    }

    public void cancelTicket(int ticketId) {
        Ticket ticketToCancel = bookings.stream().filter(t -> t.getTicketId() == ticketId).findFirst().orElse(null);
        if (ticketToCancel == null) {
            System.out.println("Ticket ID not found.");
        } else {
            bookings.remove(ticketToCancel);
            ticketToCancel.getTheater().cancelSeat();
            System.out.println("Ticket ID" + ticketId + " Has been canceled");
        }
    }

    public void viewAllBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
        } else {
            System.out.println("All Bookings:");
            bookings.forEach(ticket -> {
                ticket.displayTicketInfor();
                System.out.println("-------------------");
            });
        }
    }
}
