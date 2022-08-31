package expedia.client.domain.reservation;

import java.time.LocalDateTime;

public class BaseEntity {
    private final LocalDateTime createAt = LocalDateTime.now();
    private LocalDateTime updateAt;

    public void setUpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }
}
