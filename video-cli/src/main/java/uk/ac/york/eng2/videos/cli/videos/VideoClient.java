package uk.ac.york.eng2.videos.cli.videos;

import io.micronaut.http.client.annotation.Client;

@Client("${videos.url:`http://localhost:8080/videos`}")
public interface VideoClient {
    
    
}
