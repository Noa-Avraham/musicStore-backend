package com.example.demo.songs;

import java.util.List;

public interface SongsService {
    void addSong(Song song);

    public void updateSong(int id, Song song);

    public List<Song> getAllSongs();

    public List<Song> getAllOfArtist(String artist);

    public List<Song> getById(int id);

    public void deleteById(int id);
}
