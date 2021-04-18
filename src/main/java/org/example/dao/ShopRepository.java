package org.example.dao;

import org.example.controller.model.Shop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopRepository  extends JpaRepository<Shop, Long> {
}
