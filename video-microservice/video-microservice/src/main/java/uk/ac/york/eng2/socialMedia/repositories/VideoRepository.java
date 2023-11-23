package uk.ac.york.eng2.socialMedia.repositories;

import uk.ac.york.eng2.socialMedia.domain.Video;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

@Repository
public interface VideoRepository extends CrudRepository<Video, Long> {
	
}
