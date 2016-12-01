package Task_1;

public class Controller {

    API apis[] = {new GoogleAPI(), new BookingComAPI(), new TripAdvisorAPI()};

    public Room[] requestRooms(int price, int persons, String hotel, String city){

        int quantityOfRooms = 0;

        for (int countAPIs = 0; countAPIs < apis.length; countAPIs++) {

            quantityOfRooms += apis[countAPIs].findRooms(price, persons, city, hotel).length;
        }

        Room[] roomsAllAPI = new Room[quantityOfRooms];

        int countAllRooms = 0;
        for (int countAPIs = 0; countAPIs < apis.length; countAPIs++) {

            Room[] everyApiRooms = apis[countAPIs].findRooms(price, persons, city, hotel).clone();
            for (int countRooms = 0; countRooms < everyApiRooms.length; countRooms++){

                roomsAllAPI[countAllRooms] = everyApiRooms[countRooms];
                System.out.println(roomsAllAPI[countAllRooms].toString());
                countAllRooms++;
            }
        }
        return roomsAllAPI;
    }

    public Room[] check(API api1, API api2){
        Room api1Array[] = api1.findRooms(920, 1, "Wien", "Sacher");
        Room api2Array[] = api2.findRooms(920, 1, "Wien", "Sacher");
        int countSameRooms=0;

        for (int i = 0; i < api1Array.length; i++){
            for (int j=0; j < api2Array.length; j++){
                if (api1Array[i].equals(api2Array[j]) && api1Array[i].hashCode()== api2Array[j].hashCode()){
                    countSameRooms++;// здесь? нет, здесь я считаю длину массива, ну и здесь, в принципе тоже
                }
            }
        }

        Room[] resultingRooms = new Room[countSameRooms];
        int countResultingRooms = 0;
        for (int i = 0; i < api1Array.length; i++){
            for (int j=0; j < api2Array.length; j++){
                if (api1Array[i].equals(api2Array[j]) && api1Array[i].hashCode()== api2Array[j].hashCode()){
                    resultingRooms[countResultingRooms] = api1Array [i];//я забыла проставить итое
                    countResultingRooms++;
                }
            }
        }
        if (countResultingRooms == 0){
            System.out.println("There is no same rooms");
        } else {
            for (int i = 0; i < countSameRooms; i++){
                System.out.println("Same rooms " + resultingRooms[i].toString());
            }
        }
        return resultingRooms;
    }
}

