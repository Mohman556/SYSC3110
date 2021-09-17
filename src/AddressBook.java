import java.util.ArrayList;
import java.util.Iterator;

public class AddressBook {
    public ArrayList<BuddyInfo> contactList;

    public AddressBook(){
        contactList = new ArrayList<BuddyInfo>();
    }

    public static void main(String[] args){
        System.out.println("Address Book: ");

    }

    public void addBuddy(BuddyInfo Buddy){
        if (Buddy != null){
            contactList.add(Buddy);
            System.out.println("Added " + Buddy.getName() + " To Address book");
        }
    }

    public void removeBuddy(BuddyInfo Buddy){
        if (!contactList.isEmpty()) {
            for (Iterator<BuddyInfo> iter = contactList.iterator(); iter.hasNext();) {
                BuddyInfo buddy = iter.next();
                if (buddy.equals(Buddy)) {
                    iter.remove();
                    System.out.println("Removed " + Buddy.getName() + " From Address Book");
                }
            }
        }
    }

}
