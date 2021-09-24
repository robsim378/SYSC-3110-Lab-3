public class BuddyInfo {

    private String name;
    private String address;
    private String phoneNumber;

    public static void main(String[] args) {
        BuddyInfo Isaac = new BuddyInfo("Isaac", "Isaac's house", "Isaac's phone number");
        System.out.println("Hello " + Isaac.getName());
    }

    /**
     * Constructor for a BuddyInfo. Takes the name, address, and phone number as parameters.
     * @param name Buddy's name as a String
     * @param address Buddy's address as a String
     * @param phoneNumber Buddy's phone number as a String
     */
    public BuddyInfo(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public BuddyInfo() {
        this.name = "NoName";
        this.address = "Homeless";
        this.phoneNumber = "";
    }

    /**
     * Getter for the buddy's name
     * @return Buddy's name as a String
     */
    public String getName() {
        return name;
    }

    /**
     * Getter for the buddy's address
     * @return Buddy's address as a String
     */
    public String getAddress() {
        return address;
    }

    /**
     * Getter for the buddy's phone number
     * @return Buddy's phone number as a String
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
