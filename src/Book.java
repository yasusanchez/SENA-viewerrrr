import java.util.List;

public class Book extends Publication {
    private String isbn;
    private boolean readed;
    private int timeReaded;

    // Constructor
    public Book(String title, String edititionDate, String editorial, String isbn) {
        super(title, edititionDate, editorial);
        this.isbn = isbn;
        this.readed = false; // Valor predeterminado
        this.timeReaded = 0; // Valor predeterminado
    }

    // Getters y Setters
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }

    public boolean isReaded() { return readed; }
    public void setReaded(boolean readed) { this.readed = readed; }

    public int getTimeReaded() { return timeReaded; }
    public void setTimeReaded(int timeReaded) { this.timeReaded = timeReaded; }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + getTitle() + '\'' +
                ", edititionDate='" + getEdititionDate() + '\'' +
                ", editorial='" + getEditorial() + '\'' +
                ", authors=" + getAuthors() +
                ", isbn='" + isbn + '\'' +
                ", readed=" + readed +
                ", timeReaded=" + timeReaded +
                '}';
    }
}
