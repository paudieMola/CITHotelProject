package menus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import controller.HotelController;

public class HomeMenu extends Menu{

	public HomeMenu() {
		super("\nWelcome to CIT Hotel\n"
				+ "**** **** ****\n"
				+ "1) Display Available Rooms\n"
				+ "2) Display Guests\n"
				+ "3) Process Reservation\n"
				+ "4) Process Payment\n"
				+ "5) Exit");
	}	

	@Override
	public int HandleMenuOption(Scanner in) {	
		return 0;
	}
	
/*	public int print(String menuText, Scanner in) {
		int menuChoice = -1;
		boolean input = true;
		do {
			try {
				System.out.println(menuText);
				selection  = in.nextInt();
				
				input = false;
			}catch(InputMismatchException e) {
				in.nextLine();
				input = true;
			}
		}
		while(input);
		return menuChoice;
	}*/
}