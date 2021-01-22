package org.basecamp.mreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.basecamp.mreview.entity.Movie;
import org.basecamp.mreview.entity.Review;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review, Long>{

    List<Review> findByMovie(Movie movie);
}
