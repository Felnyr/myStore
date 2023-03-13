package io.felnyrius.mystore.films;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/films")
public class FilmController {

    @Autowired
    private final FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }


    @GetMapping()
    Iterable<FilmDto> getFilms() {
        return filmService.getFilms();
    }

    @PostMapping()
    ResponseEntity<FilmDto> addFilm(@RequestBody FilmDto filmDto) {
        filmService.addFilms(filmDto);
        return new ResponseEntity<>(filmDto, HttpStatus.CREATED);
    }

}
