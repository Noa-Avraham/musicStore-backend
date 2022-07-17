package com.example.demo.songs;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface SongsRepoInterface extends MongoRepository<Song,Integer> {
    
}
