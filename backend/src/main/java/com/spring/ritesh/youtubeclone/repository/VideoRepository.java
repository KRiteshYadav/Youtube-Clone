package com.spring.ritesh.youtubeclone.repository;

import com.spring.ritesh.youtubeclone.model.Video;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface VideoRepository extends MongoRepository<Video, String> {

}
