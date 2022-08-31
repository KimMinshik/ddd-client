package expedia.client.domain.reservation;


import expedia.client.application.data.request.BookingCreateRequest;
import expedia.client.infrastructure.PurchaserRepository;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BookingTest {

    @Test
    void create() {

        PurchaserRepository repository = PurchaserRepository.getInstance();
        Purchaser purchaser = repository.findById(1L);



        BookingCreateRequest request = new BookingCreateRequest();

        Booking.create()

    }
}
