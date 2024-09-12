public class Serie extends Film {
    private int timeViewed;
    private int sessionQuantity;

    public Serie(String title, String genre, int duration, int sessionQuantity) {
        super(title, genre, null, duration, 0); // year is not needed for Series
        this.sessionQuantity = sessionQuantity;
        this.timeViewed = 0;
    }

    public int getTimeViewed() { return timeViewed; }
    public void setTimeViewed(int timeViewed) { this.timeViewed = timeViewed; }

    public int getSessionQuantity() { return sessionQuantity; }
    public void setSessionQuantity(int sessionQuantity) { this.sessionQuantity = sessionQuantity; }

    @Override
    public String toString() {
        return super.toString() + String.format(", Time Viewed: %d min, Sessions: %d", timeViewed, sessionQuantity);
    }
}
