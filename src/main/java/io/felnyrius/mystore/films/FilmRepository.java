package io.felnyrius.mystore.films;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmRepository extends CrudRepository<FilmDto, Integer> {
}
