package org.example.bl;

import org.example.controller.model.Shop;
import org.example.dao.ShopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopRepository shopRepository;

    @Override
    public List<Shop> getAll() {
        return (List<Shop>) shopRepository.findAll();
    }

    @Override
    public Shop getById(Long id) {
        return shopRepository.findById(id).orElse(null);
    }

    @Override
    public Shop create(Shop object) {
        return shopRepository.save(object);
    }

    @Override
    public Shop update(Shop object) {
        return shopRepository.save(object);
    }

    @Override
    public void delete(Long id) {
        shopRepository.deleteById(id);
    }

}
