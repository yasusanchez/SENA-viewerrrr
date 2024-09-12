import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private List<Movie> movies;
    private List<Serie> series;
    private List<Book> books;
    private List<Magazine> magazines;

    public Main() {
        movies = new ArrayList<>();
        series = new ArrayList<>();
        books = new ArrayList<>();
        magazines = new ArrayList<>();

        // Sample data
        movies.add(new Movie("Inception", "Sci-Fi", "Christopher Nolan", 148, 2010));
        series.add(new Serie("Breaking Bad", "Crime", 47, 5));
        books.add(new Book("1984", "1949", "Secker & Warburg", "1234567890"));
        magazines.add(new Magazine("Time", "2024-09", "Time Inc."));
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("SENA Viewer Menu:");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            option = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (option) {
                case 1:
                    displayMovies();
                    break;
                case 2:
                    displaySeries();
                    break;
                case 3:
                    displayBooks();
                    break;
                case 4:
                    displayMagazines();
                    break;
                case 5:
                    generateReport();
                    break;
                case 6:
                    generateDailyReport();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option.");
            }

        } while (option != 0);

        scanner.close();
    }

    private void displayMovies() {
        System.out.println("Movies:");
        if (movies.isEmpty()) {
            System.out.println("No movies available.");
        } else {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }

    private void displaySeries() {
        System.out.println("Series:");
        if (series.isEmpty()) {
            System.out.println("No series available.");
        } else {
            for (Serie serie : series) {
                System.out.println(serie);
            }
        }
    }

    private void displayBooks() {
        System.out.println("Books:");
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private void displayMagazines() {
        System.out.println("Magazines:");
        if (magazines.isEmpty()) {
            System.out.println("No magazines available.");
        } else {
            for (Magazine magazine : magazines) {
                System.out.println(magazine);
            }
        }
    }

    private void generateReport() {
        System.out.println("Generating general report...");
        // Implement report generation logic here
    }

    private void generateDailyReport() {
        System.out.println("Generating daily report...");
        // Implement daily report generation logic here
    }

    public static void main(String[] args) {
        new Main().run();
    }
}