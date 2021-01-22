package org.basecamp.mreview.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.basecamp.mreview.entity.Review;


public interface ReviewRepository extends JpaRepository<Review, Long>{


}
