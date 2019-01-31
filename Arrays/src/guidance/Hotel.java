package guidance;

public class Hotel {
	// list[] stores reservations for each room. The index is the room number.
	// All elements are null at the beginning
	private Reservation[] list;

	public Hotel(int numbRooms) {
		list = new Reservation[numbRooms];
	}

	// Displays room numbers and reservation information.
	public void display() {
		for (Reservation x : list) {
			x.toString();
		}

	}

	// returns true if room is occupied
	public boolean isOccupied(int room) {
		return list[room].getName().equals("");
	}

	// Assigns a new Reservation to the first available room.
	// Print out reservation with room number or indicate that hotel is full
	public void reserveRoom(String name, double rate) {
		int count = 0;
		for (Reservation x : list) {
			if (x.getName().equals("")) {
				list[count] = new Reservation(name, rate);
				System.out.println("Room " + count + " is reserved by " + x.getName());
				return;
			}
			count++;
			if (count == list.length) {
				System.out.println("Hotel is occupied");
				return;
			}
		}
	}

	// Assigns a new Reservation to an inputted room.
	// if room is occupied, find the first available room in the array
	// Print out reservation with room number or indicate that hotel is full
	public void reserveRoom(String name, double rate, int room) {
		if (list[room].getName().equals(""))
			list[room] = new Reservation(name, rate);
		else
			reserveRoom(name, rate);
	}

	// Find and return number of rooms with a reservation
	public int reservedRoomCount() {
		int count = 0;
		for (Reservation reservation : list) {
			if (!reservation.getName().equals("")) {
				count++;
			}
		}
		return count;
	}

	// find and return the average room rate of the occupied rooms.
	public double averageRoomRate() {
		double aRate = 0;
		for (Reservation reservation : list) {
			aRate += reservation.getRate();
		}
		return aRate / list.length;
	}
}
