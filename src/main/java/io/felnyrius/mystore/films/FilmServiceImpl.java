package io.felnyrius.mystore.films;

import org.springframework.stereotype.Component;

import java.util.List;

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
    public String getFilmDescription(Long id) {
        return null;
    }
}
