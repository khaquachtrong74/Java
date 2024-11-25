package com.task.two;

public class Ticket {
    private static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Ticket.count = count;
    }
    private int ticketId = count++;
    private Movie movie;
    private Theater theater;
    private double price;

    public Ticket() {
    }

    public Ticket(Movie movie, Theater theater, double price) {
        this.movie = movie;
        this.theater = theater;
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ticket id: ").append(ticketId);
        stringBuilder.append("\nMoive: ").append(movie.getTitle());
        stringBuilder.append("\nTheater: ").append(theater);
        stringBuilder.append("\nPrice: ").append(price);
        return stringBuilder.toString();
    }
    public void displayTicketInfor(){
        System.out.println(this);
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
