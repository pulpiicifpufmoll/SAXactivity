import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class XMLSaxHandler extends DefaultHandler {
    private Booking booking;
    private Vector vector;
    public XMLSaxHandler() {
        this.vector = new Vector();
        this.booking = new Booking();
    }

    public void startDocument() throws SAXException
    {
        System.out.println("Start Document");
    }

    public void endDocument() throws SAXException
    {
        System.out.println("End Document");
        for (Booking b : vector.getBookings()) {
            //System.out.println(b.toString());
        }
    }

    public void startElement(String url,
                             String localName,
                             String qName,
                             Attributes attributes)
    throws  SAXException
    {
        if (qName.equals("booking")){
            booking = new Booking();
            booking.setLocationNumber(attributes.getValue("location_number"));
        } else if (qName.equals("client")){
            //System.out.println("BANGEEEERRR");
            //System.out.println(getVector().getContent());
            booking.setClient(vector.getContent());
           // System.out.println(booking.getClient());
        }else if (qName.equals("agency")){
            booking.setAgency(vector.getContent());
        }else if (qName.equals("price")){
            booking.setPrice(vector.getContent());
        }else if (qName.equals("room")){
            booking.setRoom(vector.getContent());
        }else if (qName.equals("hotel")){
            booking.setHotel(vector.getContent());
        }else if (qName.equals("check_in")){
            booking.setCheckIn(vector.getContent());
        }else if (qName.equals("room_nights")){
            booking.setRoomNights(vector.getContent());
        }
    }

    public void endElement(String url,
                           String localName,
                           String qName) throws SAXException
    {
        if (qName.equals("booking")){
            vector.getBookings().add(booking);
        }
    }

    public void characters(char ch[], int start, int length) throws SAXException
    {
        System.out.println(ch.toString());
        System.out.println(start);
        System.out.println(length);
        vector.setContent(new String(ch, start, length).trim());
    }

    public Vector getVector() {
        return vector;
    }

    public void setVector(Vector vector) {
        this.vector = vector;
    }

}
