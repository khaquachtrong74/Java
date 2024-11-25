package com.task.two;

public class main {
    public static void main(String[] args) {
        TicketBookingSystem system = new TicketBookingSystem();

        // Thêm phim
        system.addMovie(new Movie("Inception", "Sci-Fi", 148));
        system.addMovie(new Movie("Titanic", "Romance", 195));

        // Thêm rạp chiếu
        system.addTheater(new Theater("Galaxy Cinema", 100));
        system.addTheater(new Theater("CGV", 200));

        // Đặt vé
        system.bookTicket("Inception", "Galaxy Cinema", 10.5);
        system.bookTicket("Titanic", "CGV", 12.0);
        System.out.println("+++++++++++++++++++++++");
        // Hiển thị tất cả các vé đã đặt
        system.viewAllBookings();

        // Hủy vé
        system.cancelTicket(1);
        System.out.println("============================");
        // Hiển thị lại sau khi hủy
        system.viewAllBookings();
    }
}
