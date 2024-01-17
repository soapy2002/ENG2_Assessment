package uk.ac.york.eng2.trending.repositories;

import java.util.Optional;
import java.util.List;

import javax.validation.constraints.NotNull;

import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;
import uk.ac.york.eng2.trending.domain.Trending;
import uk.ac.york.eng2.trending.dto.TrendingDTO;

@Repository
public interface TrendingRepository extends CrudRepository<Trending, Long> {

	@Override
	Optional<Trending> findById(@NotNull Long id);
	Optional<Trending> findByHashtag(@NotNull String hashtag);

	List<Trending> findTop10OrderByLikesDesc();

	Optional<TrendingDTO> findOne(long id);

}
