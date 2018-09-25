package Buddyinfo;

import java.util.ArrayList;

public class AddressBook {
	//String address_name;
	ArrayList<Buddyinfo> list;
	
	public AddressBook() {
		//address_name = name;
		list = new ArrayList<Buddyinfo>();
	}

	public void addBuddy(Buddyinfo buddy) {
		list.add(buddy);
	}
	
	
	public void addBuddy(String name, float phone, String address) {
		Buddyinfo buddy = new Buddyinfo(name,phone,address);
		this.list.add(buddy);
	}
	public void addBuddy(String name, float phone) {
		Buddyinfo buddy = new Buddyinfo(name,phone);
		this.list.add(buddy);
	}

	public void removeBuddy(String name) {
		for(int i=0;i < list.size();i++) {
			if (list.get(i).getName().equals(name)) {
				list.remove(i);
				break;
			}
		}
		System.out.print("There isn't BuddyInfo");
	}
	
	public void print_all() {
		for(int i=0;i < list.size();i++) {
			list.get(i).print_info();
		}
	}
	
	public static void main(String[] args) {
		Buddyinfo buddy1 = new Buddyinfo("Ahmad",6666,"home");
		Buddyinfo buddy2 = new Buddyinfo("AK", 7777 ,"Ottawa");
		Buddyinfo buddy3 = new Buddyinfo("Hun", 888 ,"ON");
		Buddyinfo buddy4 = new Buddyinfo("Jeffy", 9999,"my home");
		
		AddressBook list = new AddressBook();
		list.addBuddy(buddy1);
		list.addBuddy(buddy2);
		list.addBuddy(buddy3);
		list.addBuddy(buddy4);
	}
}
