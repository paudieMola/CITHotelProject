package menus;

import java.util.Scanner;

public class PaymentMenu extends Menu{
	
	public PaymentMenu() {
		super("\nWelcome to Payments Menu\n"
				+ "**** **** ****\n"
				+ "1) Make a payment\n"
				+ "2) Show all payments for a room\n"
				+ "3) Show outstanding payments\n"
				+ "4) Return\n");
	}

	@Override
	public int HandleMenuOption(Scanner in) {
		// TODO Auto-generated method stub
		return 0;
	}

}
