package menus;

import java.util.Scanner;

public class ReservationsMenu extends Menu{
	
	public ReservationsMenu() {
		super("\nWelcome to the Reservations Menu\n"
				+ "**** **** ****\n"
				+ "1) New reservation\n"
				+ "2) View Lecturers reservations\n"
				+ "3) View Students reservations"
				+ "4) Cancel a reservation\n"
				+ "5) Return\n");
	}

	@Override
	public int HandleMenuOption(Scanner in) {
		return 0;
	}

}
