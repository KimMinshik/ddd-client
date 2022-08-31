package expedia.client.domain.reservation;

import expedia.client.application.data.request.BookingCreateRequest;

import java.util.Set;
import java.util.UUID;

public class Booking extends BaseEntity{
    private Long id;

    private Set<Room> rooms;
    private BookingStatus bookingStatus;


    private Purchaser purchaser;
    private String phone;
    private String email;

    private Booking() {
    }

    // behavior - create booking
    private void create(Purchaser purchaser, Set<Room> rooms, BookingCreateRequest bookingReq) {
        this.purchaser = purchaser;
        this.rooms = rooms;
        setBookingHoldStatus(); // set hold
    }

    public static Booking create(Purchaser purchaser, BookingCreateRequest bookingCreateRequest) {

        // create room
        Guest guest = Guest.create(bookingCreateRequest.getGuestFirstName(), bookingCreateRequest.getGuestLastName());
        Room room = Room.create(UUID.randomUUID().toString(), guest, UUID.randomUUID().toString());
        Set<Room> rooms = Set.of(room);

        Booking booking = new Booking();

        return new Booking();
    }

    // behavior - resume booking
    public void resume() {
        /**
         * booking status -> : hold -> resume
         *
         */
    }



    // behavior - cancel booking
    private void setBookingHoldStatus() {
        assert this.bookingStatus == null;
        this.bookingStatus = BookingStatus.HOLD;
    }
}
