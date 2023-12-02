package app.shopping.adapter;

import app.shopping.domain.Product;
import app.shopping.domain.ShoppingCart;
import app.shopping.dto.ProductDTO;
import app.shopping.dto.ShoppingCartDTO;

public class ShoppingCartAdapter {

    public static ProductDTO toDTO(Product product) {
        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        return productDTO;
    }

    public static Product toEntity(ProductDTO productDTO) {
        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setPrice(productDTO.getPrice());
        return product;
    }

    public static ShoppingCartDTO toDTO(ShoppingCart shoppingCart) {
        ShoppingCartDTO shoppingCartDTO = new ShoppingCartDTO();
        shoppingCartDTO.setId(shoppingCart.getId());
        shoppingCartDTO.setCustomerId(shoppingCart.getCustomerId());
        return shoppingCartDTO;
    }

    public static ShoppingCart toEntity(ShoppingCartDTO shoppingCartDTO) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.setId(shoppingCartDTO.getId());
        shoppingCart.setCustomerId(shoppingCartDTO.getCustomerId());
        return shoppingCart;
    }

}
