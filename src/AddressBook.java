import java.util.ArrayList;

public class AddressBook {

    private ArrayList<BuddyInfo> Buddies;

    public AddressBook() {
        Buddies = new ArrayList<>();
    }

    /**
     * Adds a buddy to the AddressBook
     * @param buddy The buddy to be added, stored as a BuddyInfo
     */
    public void addBuddy(BuddyInfo buddy) {
        Buddies.add(buddy);
    }

    /**
     * Removes a buddy from the AddressBook
     * @param buddy The buddy to be removed, stored as a BuddyInfo
     */
    public void removeBuddy(BuddyInfo buddy) {
        Buddies.remove(buddy);
    }

    public static void main(String[] args) {
        BuddyInfo buddy = new BuddyInfo("Isaac", "Isaac's house", "Isaac's phone number");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
