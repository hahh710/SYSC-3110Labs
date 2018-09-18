package Buddyinfo;

public class Buddyinfo {
	private String name;
	private float phonenumber;
	private String address;

	public Buddyinfo(String name, float phone, String add) {
		this.name = name;
		this.address = add;
		this.phonenumber = phone;
	}
	public Buddyinfo(String name, float phone) {
		this.name = name;
		this.address = "";
		this.phonenumber = phone;
	}
	public Buddyinfo(float phone) {
		System.out.println("put name of your buddy");
	}

	public float getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(float phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void print_info() {
		System.out.println(getName());
		System.out.println(getPhonenumber() );
		System.out.println(getAddress());
		System.out.println("--------------------------");
	}

	
}