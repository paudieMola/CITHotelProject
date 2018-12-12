package menus;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import controller.HotelController;
import exception.MyIntConversionException;

public class HomeMenu extends Menu{
	
	private int maxChoice = 4;//here I want to control input by putting a maximum int that you can enter. 

	public HomeMenu() {
		super("\nWelcome to CIT Hotel\n"
				+ "**** **** ****\n"
				+ "1) Display Available Rooms\n"
				+ "2) Display Guests\n"
				+ "3) Process Reservation\n"
				+ "4) Process Payment\n"
				+ "0) Exit");
	}	

	@Override
	public int HandleMenuOption(Scanner in) {	
		int menuChoice = -1;
		boolean input = true;
		do {
			try {
				menuChoice = in.nextInt();
				if(menuChoice>this.maxChoice) {
					System.out.println("Please choose a number from the menu");
					menuChoice = in.nextInt();	
					}			
				input = false;
			}catch(InputMismatchException e) {//try to fix this and change to MyIntConversionException
				in.nextLine();
				input = true;
			}
		}
		while(input);
		return menuChoice;
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