package travelu.travelu_backend.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import travelu.travelu_backend.domain.PersonalAccessTokens;


public interface PersonalAccessTokensRepository extends JpaRepository<PersonalAccessTokens, Long> {
}
