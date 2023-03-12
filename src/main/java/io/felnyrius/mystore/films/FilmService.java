package io.felnyrius.mystore.films;

import java.util.List;

public interface FilmService {
    Iterable<FilmDto> getFilms();

    String getFilmDescription(Long id);
}
