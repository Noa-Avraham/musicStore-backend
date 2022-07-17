package com.example.demo.songs;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

enum Gener {
    ROCK, POP, RAP, CLASSICAL
}


@NoArgsConstructor
@AllArgsConstructor
@Data
@Document(collection = "songs")

public class Song {
    @Id
    private int id;
    private String title;
    private String artist;
    private int length;
    private float price;
    private Gener gener;
}
