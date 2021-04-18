package org.example.dao;

import org.example.controller.model.Influencer;
import org.springframework.data.repository.CrudRepository;

public interface InfluencerRepository extends CrudRepository<Influencer, Long> {
}
