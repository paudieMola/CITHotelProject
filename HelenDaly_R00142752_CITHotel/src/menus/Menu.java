package menus;

import java.util.Scanner;
import exception.MyIntConversionException;

public abstract class Menu {
	
	private String menuText;
	private int menuChoice;
	
	public Menu(String menuText) {
		this.menuText = menuText;
	}
	
	public String getMenuText() {return menuText;}
	public int getMenuChoice() {return menuChoice;}//maybe these should be created in the method
	public void setMenuChoice(int menuChoice) {this.menuChoice = menuChoice;}//maybe these should be created in the method

	public int displayMenu(Scanner in) throws MyIntConversionException{
		System.out.println(this.menuText);
		
		this.menuChoice = -1;
		boolean input = true;
		do {
			try {
				setMenuChoice(in.nextInt());
				input = false;
			}catch(MyIntConversionException e) {
				in.nextLine();
				input = true;
			}
		}
		while(input);
		return menuChoice;
	}
	
	public abstract int HandleMenuOption(Scanner in);

}

