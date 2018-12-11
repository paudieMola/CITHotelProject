package controller;

import java.io.Serializable;
import java.util.Scanner;

import classes.*;
import exception.MyIntConversionException;
import list.RoomList;
import menus.*;
import storage.FileStorage;

public class HotelController implements Serializable{
	private RoomList rooms;
	static Scanner in;
	public HotelController() {
		rooms = new RoomList(15);
		in = new Scanner(System.in);
	}
	
	public void handleHomeMenu() {
		System.out.println("In home menu");
		Menu men = new HomeMenu();

		for(Object r:rooms.getList()) {
			System.out.println(r);
		}
		try {
			men.displayMenu(in);
		}catch(MyIntConversionException ex) {
			
		}
		new FileStorage().writeObject(this, "storage.ser");
	}
	
	public void setupRooms() {
		System.out.println("Loading rooms");
		for(int i = 0; i < 3; i++) {			
			rooms.add(new Suite());
		}
		
		for(int i = 0; i < 6; i++) {
			rooms.add(new DoubleRoom());
		}
		
		for(int i = 0; i < 6; i++) {
			rooms.add(new Single());
		}
		this.handleHomeMenu();
	}
}
