package org.example.dao;

import org.example.controller.model.Review;
import org.springframework.data.repository.CrudRepository;

public interface ReviewRepository  extends CrudRepository<Review, Long> {
}
