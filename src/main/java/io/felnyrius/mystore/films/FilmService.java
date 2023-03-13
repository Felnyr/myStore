package io.felnyrius.mystore.films;


public interface FilmService {
    Iterable<FilmDto> getFilms();

    String getFilmDescription(int id);

    FilmDto addFilms(FilmDto filmDto);
}
