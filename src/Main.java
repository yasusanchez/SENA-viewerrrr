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
            System.out.println(" Menu: ");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");

            option = scanner.nextInt();
            scanner.nextLine();  // Consumir nueva linea

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
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, selecciona una opción válida.");
            }

        } while (option != 0);

        scanner.close();
    }

    private void displayMovies() {
        System.out.println("Movies:");
        if (movies.isEmpty()) {
            System.out.println("No hay peliculas disponibles.");
        } else {
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }

    private void displaySeries() {
        System.out.println("Series:");
        if (series.isEmpty()) {
                System.out.println("No hay series disponibles.");
        } else {
            for (Serie serie : series) {
                System.out.println(serie);
            }
        }
    }

    private void displayBooks() {
        System.out.println("Books:");
        if (books.isEmpty()) {
            System.out.println("No hay libros disponibles.");
        } else {
            for (Book book : books) {
                System.out.println(book);
            }
        }
    }

    private void displayMagazines() {
        System.out.println("Magazines:");
        if (magazines.isEmpty()) {
            System.out.println("No hay revista disponible.");
        } else {
            for (Magazine magazine : magazines) {
                System.out.println(magazine);
            }
        }
    }

    private void generateReport() {
        System.out.println("Generando informe general...");

        // Contar los elementos en cada lista
        int movieCount = movies.size();
        int seriesCount = series.size();
        int bookCount = books.size();
        int magazineCount = magazines.size();

        // Mostrar el informe
        System.out.println("Informe General:");
        System.out.println("Número de películas: " + movieCount);
        System.out.println("Número de series: " + seriesCount);
        System.out.println("Número de libros: " + bookCount);
        System.out.println("Número de revistas: " + magazineCount);

        // Mostrar detalles de cada tipo (opcional)
        if (movieCount > 0) {
            System.out.println("\nDetalles de las películas:");
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }

        if (seriesCount > 0) {
            System.out.println("\nDetalles de las series:");
            for (Serie serie : series) {
                System.out.println(serie);
            }
        }

        if (bookCount > 0) {
            System.out.println("\nDetalles de los libros:");
            for (Book book : books) {
                System.out.println(book);
            }
        }

        if (magazineCount > 0) {
            System.out.println("\nDetalles de las revistas:");
            for (Magazine magazine : magazines) {
                System.out.println(magazine);
            }
        }
    }

    private void generateDailyReport() {
        System.out.println("Generando informe diario...");
        // Implement daily report generation logic here
    }

    public static void main(String[] args) {
        new Main().run();
    }
}