package com.example.demo.songs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class SongsServiceImp implements SongsService {
    @Autowired
    private SongsRepoInterface repository;

    @Override
    public void addSong(Song song) {
        repository.save(song);

    }

    @Override
    public void updateSong(int id, Song song) {
        repository.save(song);

    }

    @Override
    public List<Song> getAllSongs() {

        return repository.findAll();

    }

    @Override
    public List<Song> getAllOfArtist(String artist) {
    return repository.findAll().stream().filter(s->s.getArtist().equals(artist)).collect(Collectors.toList());
    }

    @Override
    public List<Song> getById(int id) {
    return repository.findAll().stream().filter(s->s.getId()==id).collect(Collectors.toList());

    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);

    }

}
