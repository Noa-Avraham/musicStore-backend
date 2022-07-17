package com.example.demo.songs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.*;
// ●	Add song
// ●	Update song
// ●	Get all songs
// ●	Get all songs of a specific artist
// ●	Get specific song by id
// ●	Delete song by id

public class SongsRepository {

    private List<Song> songList = new ArrayList<>();

    public void addSong(Song song) {
        songList.add(song);
        System.out.println("added successfully");

    }

    public void updateSong(int id, Song song) {

    }

    public List<Song> getAllSongs() {

        return songList;

    }

    public List<Song> getAllOfArtist(String artist) {
        return songList.stream().filter(s -> s.getArtist().equals(artist)).collect(Collectors.toList());

    }

    public Song getById(int id) {
        for (Song s : songList) {
            if (s.getId() == id)
                return s;

        }
        return null;

    }

    public void deleteById(int id) {

        songList.remove(getById(id));
        System.out.println("removed successfully");

    }
}
