package expedia.client.application.data.request;

public class BookingCreateRequest {


    private Long hotelId;
    private Long roomId;
    private Long rateId;
    private String phone;

    private String guestFirstName;
    private String guestLastName;

    public Long getHotelId() {
        return hotelId;
    }

    public Long getRoomId() {
        return roomId;
    }

    public Long getRateId() {
        return rateId;
    }

    public String getPhone() {
        return phone;
    }

    public String getGuestFirstName() {
        return guestFirstName;
    }

    public String getGuestLastName() {
        return guestLastName;
    }
}
