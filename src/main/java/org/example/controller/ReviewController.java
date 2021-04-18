package org.example.controller;

import org.example.bl.ReviewService;
import org.example.controller.model.Review;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/shops")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @GetMapping("")
    public List<Review> getAll() {
        return reviewService.getAll();
    }

    @GetMapping("/{reviewId}")
    public Review getById(@PathVariable(name = "reviewId") Long reviewId) {
        return reviewService.getById(reviewId);
    }

    @PostMapping("/")
    public Review createReview(@RequestBody Review review) {
        return reviewService.create(review);
    }

    @PutMapping("/{reviewId}")
    public Review updateReview(@RequestBody Review review, @PathVariable(name = "reviewId") Long reviewId) {
        review.setId(reviewId);
        return reviewService.update(review);
    }

    @DeleteMapping("/{reviewId}")
    public ResponseEntity<Object> deleteReview(@PathVariable(name = "reviewId") Long reviewId) {
        reviewService.delete(reviewId);
        return ResponseEntity.noContent().build();
    }
}
