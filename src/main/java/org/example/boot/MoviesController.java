package org.example.boot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.example.client.rest.api.MoviesApiClient;
import org.example.client.rest.model.MovieDTO;

/**
 * @author <a href="vladc@ext.inditex.com">VLADC</a>
 */
@RestController
@RequestMapping("/movies")
public class MoviesController {

    @Autowired
    private MoviesApiClient moviesApiClient;

    @GetMapping
    public ResponseEntity<List<MovieDTO>> findAllMovies() {
        return moviesApiClient.getMovies();
    }


}
