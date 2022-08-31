package expedia.client.domain.reservation;

public class Room {
    private Long id;
    private String managedId;
    private Guest guest;
    private String confirmationId;

    private Room() {
    }

    public static Room create(String managedId, Guest guest, String confirmationId) {
        Room room = new Room();
        room.confirmationId = confirmationId;
        room.guest = guest;
        room.managedId = managedId;
        return room;
    }
}
