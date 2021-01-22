package org.basecamp.mreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.basecamp.mreview.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
