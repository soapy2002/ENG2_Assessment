package uk.ac.york.eng2.videos.repositories;

import java.util.Optional;

import javax.validation.constraints.NotNull;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.videos.domain.User;
import uk.ac.york.eng2.videos.domain.Video;
import uk.ac.york.eng2.videos.dto.UserDTO;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	Optional <User> findByUsername(@NotNull String username);

	Optional<UserDTO> findOne(long id);

}
