package io.felnyrius.mystore.films;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.util.Date;

@Entity
public class FilmDto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    int id;

    @Column(name = "name")
    String name;

    @Column(name = "description")
    String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/mm/yyyy")
    @Column(name = "releaseDate")
    Date releaseDate;


    public FilmDto(int id, String name, String description, Date releaseDate) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.releaseDate = releaseDate;
    }

    public FilmDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }
}
