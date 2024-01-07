package uk.ac.york.eng2.videos.repositories;

import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.VideoDTO;

import java.util.Optional;

import javax.validation.constraints.NotNull;

import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {
	@Join(value = "viewers", type = Join.Type.LEFT_FETCH)
	@Override
	Optional<Video> findById(@NotNull Long id);
	Optional<Video> findByTitle(@NotNull String title);

	Optional<VideoDTO> findOne(long id);
}
