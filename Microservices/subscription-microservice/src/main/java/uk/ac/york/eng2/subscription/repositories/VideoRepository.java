package uk.ac.york.eng2.subscription.repositories;

import uk.ac.york.eng2.subscription.domain.Video;
import uk.ac.york.eng2.subscription.dto.VideoDTO;

import java.util.Optional;

import javax.validation.constraints.NotNull;

import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {
	@Override
	Optional<Video> findById(@NotNull Long id);
	Optional <Video> findByTitle(@NotNull String title);
}
