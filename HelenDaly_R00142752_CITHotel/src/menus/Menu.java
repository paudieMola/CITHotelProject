package menus;

import java.util.Scanner;
import exception.MyIntConversionException;

public abstract class Menu {
	
	private String menuText;
	private int menuChoice;
	
	public Menu(String menuText) {
		this.menuText = menuText;
	}
	
	//public int getMenuChoice() {return menuChoice;}//maybe these should be created in the method
	//public void setMenuChoice(int menuChoice) {this.menuChoice = menuChoice;}//maybe these should be created in the method

	public void displayMenu(Scanner in) throws MyIntConversionException{
		System.out.println(this.menuText);
	}
	
	public abstract int HandleMenuOption(Scanner in);

}

