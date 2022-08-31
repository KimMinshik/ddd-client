package expedia.client.infrastructure;

import expedia.client.domain.reservation.Purchaser;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PurchaserRepositoryTest {

    @Test
    void findPurchaser() {
        PurchaserRepository repository = PurchaserRepository.getInstance();

        Purchaser purchaser = repository.findById(1L);

        assertThat(purchaser.getId()).isEqualTo(1L);
    }

}
