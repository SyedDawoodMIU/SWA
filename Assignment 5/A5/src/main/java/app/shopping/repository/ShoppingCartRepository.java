package app.shopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import app.shopping.domain.ShoppingCart;

public interface ShoppingCartRepository extends MongoRepository<ShoppingCart, String> {

}
