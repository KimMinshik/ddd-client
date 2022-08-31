package expedia.client.infrastructure;

import expedia.client.domain.reservation.Purchaser;

import java.util.Set;

public class PurchaserRepository {

    private static final Set<Purchaser> purchasers = Set.of(
            new Purchaser(1L), new Purchaser(2L), new Purchaser(3L)
    );;
    private static PurchaserRepository repository;

    public static PurchaserRepository getInstance() {
        if (repository == null) {
            repository = new PurchaserRepository();
        }
        return repository;
    }

    public Purchaser findById(Long id) {
        return purchasers.stream()
                .filter(it -> it.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("not found"));
    }
}
