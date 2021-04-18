package org.example.bl;

import org.example.controller.model.Review;
import org.example.dao.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewServiceImpl implements ReviewService{

    @Autowired
    private ReviewRepository reviewRepository;

    @Override
    public List<Review> getAll() {
        return (List<Review>) reviewRepository.findAll();
    }

    @Override
    public Review getById(Long id) {
        return reviewRepository.findById(id).orElse(null);
    }

    @Override
    public Review create(Review object) {
        return reviewRepository.save(object);
    }

    @Override
    public Review update(Review object) {
        return reviewRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        reviewRepository.deleteById(id);
    }

}
