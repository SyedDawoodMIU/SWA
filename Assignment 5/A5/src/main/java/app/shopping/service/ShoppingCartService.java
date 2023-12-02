package app.shopping.service;

import app.shopping.adapter.ShoppingCartAdapter;
import app.shopping.domain.ShoppingCart;
import app.shopping.dto.ShoppingCartDTO;
import app.shopping.repository.ShoppingCartRepository;

public class ShoppingCartService {
    private ShoppingCartRepository shoppingCartRepository;

    public void addProductToShoppingCart(ShoppingCartDTO shoppingDTO) {

        ShoppingCart shoppingCart = ShoppingCartAdapter.toEntity(shoppingDTO);
        shoppingCartRepository.save(shoppingCart);

    }

    public ShoppingCartDTO getShoppingCart(String id) {
        ShoppingCart shoppingCart = shoppingCartRepository.findById(id).orElse(null);
        return ShoppingCartAdapter.toDTO(shoppingCart);
    }
}
