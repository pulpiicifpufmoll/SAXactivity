import java.util.ArrayList;

public class Vector {
    private String content;
    private ArrayList<Booking> bookings;

    public Vector() {

        this.bookings = new ArrayList<>();
        this.content = "";
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}


