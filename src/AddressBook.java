import java.util.*;

public class AddressBook {
	private List<BuddyInfo> buddyInfo;
	
	public AddressBook(){
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}
	
	public void addBuddy(BuddyInfo b){
		if(b != null){
			buddyInfo.add(b);
		}
	}
	
	public BuddyInfo removeBuddy(int index){
		if(index >= 0 && index < buddyInfo.size()){
			return buddyInfo.remove(index);
		}
		return null;
	}
	
	public static void main(String args[]){
		BuddyInfo buddy = new BuddyInfo("Karl","Carleton", 123);
		AddressBook ab = new AddressBook();
		ab.addBuddy(buddy);
		ab.removeBuddy(0);
	}
}
