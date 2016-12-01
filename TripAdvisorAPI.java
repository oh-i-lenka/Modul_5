package Task_1;

import java.util.Date;

public class TripAdvisorAPI implements API {

    Room[] roomsFromTA = {new Room(2022,1255, 2, new Date(117,1,7), "Hilton", "Wien"),
            new Room(2122, 1155, 3, new Date(113,1,17), "Hilton", "Budapest"),
            new Room(1001,920, 1, new Date(117,1,1), "Sacher", "Wien"),
            new Room(2222,1655, 1, new Date(117,1,2), "Hilton", "Wien"),
            new Room(2202,1155, 3, new Date(117,1,27), "Hilton", "Budapest"),
            new Room(2220, 920, 1, new Date(117,1,1), "Sacher", "Wien"),
            new Room(2002,720, 3, new Date(117,1,1), "Ritz", "Madrid"),
            new Room(2200,650, 2, new Date(117,1,1), "Santa-Maria", "Candolim")
    };

    public TripAdvisorAPI() {
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

        int j = 0;
        int countFoundedRooms=0;

        for ( int i = 0; i < roomsFromTA.length; i++){
            if ((roomsFromTA[i].getPrice() == price) && (roomsFromTA[i].getCityName() == city) && (roomsFromTA[i].getHotelName() == hotel)){
                countFoundedRooms++;
            }
        }

        Room[] roomsFoundedTA = new Room[countFoundedRooms];

        for ( int i = 0; i < roomsFromTA.length; i++){
            if ((roomsFromTA[i].getPrice() == price) && (roomsFromTA[i].getCityName() == city) && (roomsFromTA[i].getHotelName() == hotel)){
                roomsFoundedTA[j] = roomsFromTA[i];
                j++;
            }
        }
        return roomsFoundedTA;
    }
}
