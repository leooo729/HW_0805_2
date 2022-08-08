package com.example.shoppingweb.service;

import com.example.shoppingweb.model.Shop;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopService {

    private List<Shop> shopList;

    public ShopService() {
        this.shopList = new ArrayList<>();
        this.shopList.add(new Shop("T-shirt", 500, 10, "it is oversized"));
        this.shopList.add(new Shop("shoes", 1299, 15, "it is low barrel"));

    }

    public List<Shop> getAllShops() {
        return this.shopList;
    }

    public Shop getShopByName(String name) {
        for (Shop shop : this.shopList) {
            if (name.equals(shop.getName())) {
                return shop;
            }
        }
        return null;
    }


    public Shop createShop(Shop shop) {
        this.shopList.add(shop);
        return shop;
    }

    public Shop updateShop(String name, Shop shop) {
        for (Shop updatedShop : this.shopList) {
            if (name.equals(updatedShop.getName())) {
                updatedShop.setPrice(shop.getPrice());
                updatedShop.setStock(shop.getStock());
                updatedShop.setDescription(shop.getDescription());
                return updatedShop;
            }
        }
        return null;
    }

    public Shop deleteShop(String name) {
        for (Shop deleteShop : this.shopList) {
            if (name.equals(deleteShop.getName())) {
                this.shopList.remove(deleteShop);
                return deleteShop;
            }
        }
        return null;
    }

}
