package io.felnyrius.mystore.films;

import org.springframework.stereotype.Component;


@Component
public class FilmServiceImpl implements FilmService{

    public FilmServiceImpl(FilmRepository filmRepo) {
        this.filmRepo = filmRepo;
    }

    private final FilmRepository filmRepo;

    @Override
    public Iterable<FilmDto> getFilms() {
        return filmRepo.findAll();
    }

    @Override
    public String getFilmDescription(int id) {
        return null;
    }

    @Override
    public FilmDto addFilms(FilmDto filmDto) {
        return filmRepo.save(filmDto);
    }
}
