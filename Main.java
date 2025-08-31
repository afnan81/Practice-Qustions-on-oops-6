import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Create items
        Book book = new Book("B001", "1984", LocalDate.of(1949, 6, 8), "George Orwell", 328);
        DVD dvd = new DVD("D001", "Inception", LocalDate.of(2010, 7, 16), "Christopher Nolan", 148);
        Cd cd = new Cd("C001", "Thriller", LocalDate.of(1982, 11, 30), "Michael Jackson", 9);

        // Print details
        System.out.println("Book: " + book.getTitle() + " by " + book.getAuthor() + ", Pages: " + book.getPages());
        System.out.println("DVD: " + dvd.getTitle() + " directed by " + dvd.getDirector() + ", Runtime: " + dvd.getRunningTime() + " minutes");
        System.out.println("CD: " + cd.getTitle() + " by " + cd.getArtist() + ", Tracks: " + cd.getTracks());
    }
}
