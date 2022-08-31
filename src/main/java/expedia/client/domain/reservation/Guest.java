package expedia.client.domain.reservation;


public class Guest {
    private Long id;
    private String firstName;
    private String lastName;

    public static Guest create(String fname, String lname) {
        Guest guest = new Guest();
        guest.firstName = fname;
        guest.lastName = lname;
        return guest;
    }
}
