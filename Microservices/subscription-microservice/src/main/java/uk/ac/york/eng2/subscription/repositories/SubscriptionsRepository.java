package uk.ac.york.eng2.subscription.repositories;

import java.util.Optional;
import java.util.List;

import javax.validation.constraints.NotNull;

import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.subscription.domain.Subscriptions;
import uk.ac.york.eng2.subscription.dto.SubscriptionsDTO;

@Repository
public interface SubscriptionsRepository extends CrudRepository<Subscriptions, Long> {

	@Override
	Optional<Subscriptions> findById(@NotNull Long id);
	Optional<Subscriptions> findByUsername(@NotNull String username);

	Optional<SubscriptionsDTO> findOne(long id);

}
