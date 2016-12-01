package Task_1;

import java.util.Date;

public class GoogleAPI implements API{
    Room[] roomsFromG = {new Room(3333, 1155, 3, new Date(13,1,17), "Hilton", "Budapest"),
            new Room(3033,350, 2, new Date(10,3,117), "Hilton", "Budapest"),
            new Room(3303,480, 1,new Date(117,02,7), "Hilton", "Karlovu Varu"),
            new Room(3330,720, 3, new Date(117,1,1), "Ritz", "Madrid"),
            new Room(1001,920, 1, new Date(117,2,1), "Sacher", "Wien"),
            new Room(3003,650, 2, new Date(117,1,1), "Santa-Maria", "Candolim"),
            new Room(3300,650, 2, new Date(117,1,1), "Beach Resort", "Panaji")
    };

    public GoogleAPI() {
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        int j = 0;
        int countFoundedRooms=0;

        for ( int i = 0; i < roomsFromG.length; i++){
            if ((roomsFromG[i].getPrice() == price) && (roomsFromG[i].getCityName() == city) && (roomsFromG[i].getHotelName() == hotel)){
                countFoundedRooms++;
            }
        }
        Room[] roomsFoundedG = new Room[countFoundedRooms];

        for ( int i = 0; i < roomsFromG.length; i++){
            if ((roomsFromG[i].getPrice() == price) && (roomsFromG[i].getCityName() == city) && (roomsFromG[i].getHotelName() == hotel)){
                roomsFoundedG[j] = roomsFromG[i];
                j++;
            }
        }
        return roomsFoundedG;
    }
}
