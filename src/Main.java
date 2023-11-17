import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args)  {
        try{
            File bookingFile = new File("bookings.xml");
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();
            XMLSaxHandler bookingHandler = new XMLSaxHandler();
            saxParser.parse(bookingFile, bookingHandler);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}