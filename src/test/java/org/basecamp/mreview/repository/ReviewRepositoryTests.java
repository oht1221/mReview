package org.basecamp.mreview.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import org.basecamp.mreview.entity.Movie;
import org.basecamp.mreview.entity.Review;
import org.basecamp.mreview.entity.Member;

import java.util.stream.IntStream;

@SpringBootTest
public class ReviewRepositoryTests {

    @Autowired
    private ReviewRepository reviewRepository;

    @Test
    public void insertMovieReviews(){

        IntStream.rangeClosed(1, 200).forEach(i -> {

            Long mno = (long)(Math.random()*100) + 1;

            Long mid = ((long)(Math.random()*100 + 1));
            Member member = Member.builder().mid(mid).build();

            Review movieReview = Review.builder()
                    .member(member)
                    .movie(Movie.builder().mno(mno).build())
                    .grade((int)(Math.random() * 5 )+ 1)
                    .build();

            reviewRepository.save(movieReview);
        });
    }

}
