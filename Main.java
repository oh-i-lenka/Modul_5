package Task_1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Controller controller = new Controller();
//
//        Room user2Room[] = controller.requestRooms(1155, 3, "Hilton", "Budapest");
//          Room user1Room[] = controller.requestRooms(920, 1, "Sacher", "Wien");
//        Room user3Room[] =  controller.requestRooms(650, 2, "Santa-Maria", "Candolim");

//        Room[] repeatingRoomsGoogle_BC = controller.check(new GoogleAPI(), new BookingComAPI());
//       Room[] repeatingRoomsTA_BC = controller.check(new TripAdvisorAPI(), new BookingComAPI());
//        Room[] repeatingRoomsGoogle_TA = controller.check(new GoogleAPI(), new TripAdvisorAPI());

        DAO_impl dataBase = new DAO_impl();
        Room roomDAO = new Room(1011,920, 4, new Date(2017,5,1), "Chreshatyk", "Kyiv");
        dataBase.save(roomDAO);
        dataBase.delete(roomDAO);
        dataBase.update(roomDAO);
        dataBase.findById(1011);
    }
}
