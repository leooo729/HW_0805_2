package com.example.shoppingweb.controller;

import com.example.shoppingweb.model.Shop;
import com.example.shoppingweb.service.ShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {
    @Autowired
    ShopService shopService;

    @GetMapping()
    public List<Shop> getAllShops() {
        List<Shop> shopList = this.shopService.getAllShops();
        return shopList;
    }

    @GetMapping("/{name}")
    public Shop getShopByName(@PathVariable String name) {
        Shop shop  = this.shopService.getShopByName(name);
        return shop;
    }

    @PostMapping()
    public Shop createShop(@RequestBody Shop shop) {
        Shop createShop = this.shopService.createShop(shop);
        return createShop;
    }

    @PutMapping("/{name}")
    public Shop updateShop(@PathVariable String name, @RequestBody Shop shop) {
        Shop updateShop = this.shopService.updateShop(name, shop);
        return updateShop;
    }

    @DeleteMapping("/{name}")
    public Shop deleteShop(@PathVariable String name) {
        Shop deleteShop = this.shopService.deleteShop(name);
        return deleteShop;
    }


}
