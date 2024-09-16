public class Serie extends Film {
    private int timeViewed;
    private int sessionQuantity;

    // Constructor
    public Serie(String title, String genre, int duration, int sessionQuantity) {
        super(title, genre, "", duration);
        this.sessionQuantity = sessionQuantity;
    }

    public int getTimeViewed() { return timeViewed; }
    public void setTimeViewed(int timeViewed) { this.timeViewed = timeViewed; }

    public int getSessionQuantity() { return sessionQuantity; }
    public void setSessionQuantity(int sessionQuantity) { this.sessionQuantity = sessionQuantity; }

    @Override
    public String toString() {
        return "Series{" +
                "id=" + getId() +
                ", title='" + getTitle() + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", creator='" + getCreator() + '\'' +
                ", duration=" + getDuration() +
                ", year=" + getYear() +
                ", viewed=" + isViewed() +
                ", timeViewed=" + timeViewed +
                ", sessionQuantity=" + sessionQuantity +
                '}';
    }
}
