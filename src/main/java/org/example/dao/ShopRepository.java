package org.example.dao;

import org.example.controller.model.Shop;
import org.springframework.data.repository.CrudRepository;

public interface ShopRepository  extends CrudRepository<Shop, Long> {
}
