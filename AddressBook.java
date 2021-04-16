public class AddressBook {
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    String zip;
    String phoneNumber;
    String email;

    //parameterized constructor
    public AddressBook(String firstName, String lastName, String address, String city, String state, String zip, String phoneNumber, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
	
    //method to display
    public void display(){
    	 System.out.println(firstName+lastName+address+city+state+zip+phoneNumber+email);
    }

    //main method
    public static void main(String args[]){
        AddressBook personDetail=new AddressBook("Ritika","\nTiwari","\nAir Force Station","\nAllahabad","\nUP",
                "\n123456","\n123456789","\nwewewe@sdsda.com");

        personDetail.display();


    }
}
