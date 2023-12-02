package app.shopping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.shopping.dto.ShoppingCartDTO;
import app.shopping.service.ShoppingCartService;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {
    private final ShoppingCartService shoppingCartService;

    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    public void addProductToShoppingCart(ShoppingCartDTO shoppingDTO) {
        shoppingCartService.addProductToShoppingCart(shoppingDTO);
    }

    @GetMapping("/{id}")
    public ShoppingCartDTO getShoppingCart(@PathVariable("id") String id) {
        return shoppingCartService.getShoppingCart(id);
    }
}
