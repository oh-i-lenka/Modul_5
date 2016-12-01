package Task_1;

import java.util.Date;
import java.util.GregorianCalendar;

public class BookingComAPI implements API {

    Room[] roomsFromBC = {new Room(1111, 480, 1, new Date(10,2,117), "Hilton", "Karlovu Varu"),
            new Room(1011,920, 4, new Date (2017,5,1), "Chreshatyk", "Kyiv"),
            new Room(1101,1200, 2, new Date(117,1,1), "Chreshatyk", "Kyiv"),
            new Room(1110,920, 4, new Date(117,1,1), "Bristol", "Wien"),
            new Room(1001,920, 1, new Date(117,1,1), "Sacher", "Wien"),
            new Room(1100,720, 3, new Date(117,1,1), "Ritz", "Madrid")
    };

    public BookingComAPI() {
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        int j = 0;
        int countFoundedRooms=0;

        for ( int i = 0; i < roomsFromBC.length; i++){
            if ((roomsFromBC[i].getPrice() == price) && (roomsFromBC[i].getCityName() == city) && (roomsFromBC[i].getHotelName() == hotel)){
                countFoundedRooms++;
            }
        }

        Room[] roomsFounded = new Room[countFoundedRooms];

        for ( int i = 0; i < roomsFromBC.length; i++){
            if ((roomsFromBC[i].getPrice() == price) && (roomsFromBC[i].getCityName() == city) && (roomsFromBC[i].getHotelName() == hotel)){
                roomsFounded[j] = roomsFromBC[i];
                j++;
            }
        }
        return roomsFounded;
    }
}
