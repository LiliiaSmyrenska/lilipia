package org.example.bl;

import org.example.controller.model.Influencer;
import org.example.dao.InfluencerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfluencerServiceImpl implements InfluencerService{

    @Autowired
    private InfluencerRepository influencerRepository;

    @Override
    public List<Influencer> getAll() {
        return (List<Influencer>) influencerRepository.findAll();
    }

    @Override
    public Influencer getById(Long id) {
        return influencerRepository.findById(id).orElse(null);
    }

    @Override
    public Influencer create(Influencer object) {
        return influencerRepository.save(object);
    }

    @Override
    public Influencer update(Influencer object) {
        return influencerRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        influencerRepository.deleteById(id);
    }


}
