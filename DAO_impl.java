package Task_1;

import java.util.Date;

public class DAO_impl implements DAO {

        @Override
    public Room save(Room room) {
        System.out.println("The " + room.toString()  + "successfully saved!");
            return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("The " + room.toString()  + "successfully deleted!");
        return true;
    }

    @Override
    public Room update(Room room) {
        System.out.println("The " + room.toString()  + "successfully updated!");
        return room;
    }

    @Override
    public Room findById(long id) {
        Room[] rooms = {new Room(1111, 480, 1, new Date(10,2,117), "Hilton", "Karlovu Varu"),
                new Room(1011,920, 4, new Date (2017,5,1), "Chreshatyk", "Kyiv"),
                new Room(1101,1200, 2, new Date(117,1,1), "Chreshatyk", "Kyiv"),
                new Room(1110,920, 4, new Date(117,1,1), "Bristol", "Wien")};
        Room requiredRoom = new Room();

        for (Room roomsArray: rooms){
            if (roomsArray.getId() == id){
                requiredRoom = roomsArray;
            }
        }
        System.out.println("The request room is " + requiredRoom.toString());
        return requiredRoom;
    }
}
