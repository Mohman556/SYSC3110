public class BuddyInfo {

    private String name;
    private String address;
    private String pNumber;

    public BuddyInfo(String name, String address, String pNumber){
        this.name = name;
        this.address = address;
        this.pNumber = pNumber;

    }

    public BuddyInfo(){
        name = "Homer";
    }

    public static void main(String[] args) {
        BuddyInfo b = new BuddyInfo("Homer", "Carleton", "613");
        System.out.println("Hello " + b.getName() + " " + b.getAddress() + " " + b.getNumber());
    }

    public String getName() {
        return name;
    }


    public String getAddress() {
        return address;
    }


    public String getNumber() {return pNumber;}

}


