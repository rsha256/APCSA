package guidance;

public class HotelTester {
	public static void main(String[] args) {
		Hotel hilton = new Hotel(10);

//		hilton.reserveRoom("Jones", 99);
//		hilton.reserveRoom("Patel", 94.99);
//		hilton.reserveRoom("Garcia", 94.99);
//		hilton.reserveRoom("Chen", 94.99);
//		hilton.reserveRoom("Hallockson", 94.99, 7);
		hilton.display();
		System.out.println("Reserved Rooms: " + hilton.reservedRoomCount());
		System.out.println("Average Reservation: " + hilton.averageRoomRate());
	}
}
