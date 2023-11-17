import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Booking {
    private String locationNumber;
    private String client;
    private String agency;
    private String room;
    private String price;
    private String hotel;
    private String checkIn;
    private String roomNights;

    public Booking() {
    }

    public Booking(String room, String locationNumber, String client, String agency, String price, String hotel, String checkIn, String roomNights) {
        this.locationNumber = locationNumber;
        this.client = client;
        this.agency = agency;
        this.price = price;
        this.hotel = hotel;
        this.checkIn = checkIn;
        this.roomNights = roomNights;
        this.room = room;
    }

    public String getLocationNumber() {
        return locationNumber;
    }

    public void setLocationNumber(String locationNumber) {
        this.locationNumber = locationNumber;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getHotel() {
        return hotel;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public String getRoomNights() {
        return roomNights;
    }

    public void setRoomNights(String roomNights) {
        this.roomNights = roomNights;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "locationNumber='" + locationNumber + '\'' +
                ", client='" + client + '\'' +
                ", agency='" + agency + '\'' +
                ", room='" + room + '\'' +
                ", price='" + price + '\'' +
                ", hotel='" + hotel + '\'' +
                ", checkIn='" + checkIn + '\'' +
                ", roomNights='" + roomNights + '\'' +
                '}';
    }
}
