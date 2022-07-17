package com.example.demo.songs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("songs")
public class SongsController {
    @Autowired
    private SongsService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addSong(@RequestBody Song song) {

        service.addSong(song);

    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public void updateSong(@PathVariable int id, @RequestBody Song song) {
service.updateSong(id,song);
    }

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Song> getAllSongs() {

        return service.getAllSongs();

    }

    @RequestMapping(value = "/getAllOfArtist/{artist}", method = RequestMethod.GET)
    public List<Song> getAllOfArtist(@PathVariable String artist) {
        return service.getAllOfArtist(artist);
    }

    @RequestMapping(value = "/getById/{id}", method = RequestMethod.GET)
    public List<Song> getById(@PathVariable int id) {
        return service.getById(id);

    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable int id) {
        service.deleteById(id);

    }
}
