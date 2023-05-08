package tunght.gr.alertservice.repository;

import org.springframework.data.r2dbc.repository.R2dbcRepository;
import tunght.gr.alertservice.domain.Authority;

/**
 * Spring Data R2DBC repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends R2dbcRepository<Authority, String> {}
