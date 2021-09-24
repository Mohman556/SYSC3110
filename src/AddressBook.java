import java.util.ArrayList;


public class AddressBook {
    public ArrayList<BuddyInfo> contactList;

    public AddressBook(){
        contactList = new ArrayList<BuddyInfo>();
    }

    public static void main(String[] args){
        System.out.println("Address Book: Your Contact are Printed Below");
        BuddyInfo Buddy = new BuddyInfo("Lanks", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(Buddy);
        addressBook.removeBuddy(Buddy);


    }

    public void addBuddy(BuddyInfo Buddy){
        if (Buddy != null){
            contactList.add(Buddy);
            System.out.println("Added " + Buddy.getName() + " To Address book");

        }
    }

    public void removeBuddy(BuddyInfo Buddy){
        contactList.remove(Buddy);
        System.out.println("Removed " + Buddy.getName() + " From Address Book");


    }
    public void editBuddy(String name, String address, String number, BuddyInfo buddy){
        System.out.println("Editing Contact: " + name + "...");
        buddy.setName(name);
        buddy.setAddress(address);
        buddy.setpNumber(number);
        System.out.println("New Info: " + name + " " + number + " " + number);


    }


}
