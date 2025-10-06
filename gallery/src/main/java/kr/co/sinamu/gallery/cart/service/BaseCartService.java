package kr.co.sinamu.gallery.cart.service;

import kr.co.sinamu.gallery.cart.dto.CartRead;
import kr.co.sinamu.gallery.cart.entity.Cart;

import java.util.List;

public class BaseCartService implements CartService {
    @Override
    public List<CartRead> findAll(Integer memberId) {
        return List.of();
    }

    @Override
    public CartRead find(Integer memberId, Integer itemId) {
        return null;
    }

    @Override
    public void removeAll(Integer memberId) {

    }

    @Override
    public void remove(Integer memberId, Integer itemId) {

    }

    @Override
    public void save(Cart cart) {

    }
}
