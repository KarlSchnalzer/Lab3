
public class BuddyInfo {

	public String Name;
	public String Address;
	public int number;
	
	public BuddyInfo(String n, String a, int no){
		this.Name = n;
		this.Address=a;
		this.number=no;
	}
	
	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Karl","Carleton", 123);
		System.out.println("Hello " + buddy.getName());

	}

}
