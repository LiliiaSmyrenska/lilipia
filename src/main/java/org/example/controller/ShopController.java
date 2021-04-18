package org.example.controller;

import org.example.bl.ShopService;
import org.example.controller.model.Shop;
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
public class ShopController {

    @Autowired
    ShopService shopService;

    @GetMapping("")
    public List<Shop> getAll() {
        return shopService.getAll();
    }

    @GetMapping("/{shopId}")
    public Shop getById(@PathVariable(name = "shopId") Long shopId) {
        return shopService.getById(shopId);
    }

    @PostMapping("/")
    public Shop createShop(@RequestBody Shop shop) {
        return shopService.create(shop);
    }

    @PutMapping("/{shopId}")
    public Shop updateShop(@RequestBody Shop shop, @PathVariable(name = "shopId") Long shopId) {
        shop.setId(shopId);
        return shopService.update(shop);
    }

    @DeleteMapping("/{shopId}")
    public ResponseEntity<Object> deleteShop(@PathVariable(name = "shopId") Long shopId) {
        shopService.delete(shopId);
        return ResponseEntity.noContent().build();
    }
    
}
