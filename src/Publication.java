import java.util.List;

public class Publication {
    private String title;
    private String edititionDate;
    private String editorial;
    private List<String> authors;

    // Constructor
    public Publication(String title, String edititionDate, String editorial) {
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
    }

    // Getters y Setters
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getEdititionDate() { return edititionDate; }
    public void setEdititionDate(String edititionDate) { this.edititionDate = edititionDate; }

    public String getEditorial() { return editorial; }
    public void setEditorial(String editorial) { this.editorial = editorial; }

    public List<String> getAuthors() { return authors; }
    public void setAuthors(List<String> authors) { this.authors = authors; }

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", edititionDate='" + edititionDate + '\'' +
                ", editorial='" + editorial + '\'' +
                ", authors=" + authors +
                '}';
    }
}