public static void main(String[] args) {

    System.out.println("===== Book My Stay - Room Availability =====");

    Room single = new SingleRoom();
    Room doubleRoom = new DoubleRoom();
    Room suite = new SuiteRoom();

    int singleAvailable = 5;
    int doubleAvailable = 3;
    int suiteAvailable = 2;

    System.out.println("\n--- Room Details ---\n");

    single.displayRoomDetails();
    System.out.println("Available Rooms: " + singleAvailable);
    System.out.println();

    doubleRoom.displayRoomDetails();
    System.out.println("Available Rooms: " + doubleAvailable);
    System.out.println();

    suite.displayRoomDetails();
    System.out.println("Available Rooms: " + suiteAvailable);
}