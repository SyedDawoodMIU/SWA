package app.product.service;

import org.springframework.beans.factory.annotation.Autowired;

import app.product.adapter.ProductAdapter;
import app.product.domain.Product;
import app.product.dto.ProductDTO;
import app.product.repository.ProductRepository;

public class ProductService {
    @Autowired
    private ProductRepository repository;

    public void createProduct(ProductDTO dto) {
        repository.save(ProductAdapter.toEntity(dto));
    }

    public void updateProduct(ProductDTO dto) {
        repository.save(ProductAdapter.toEntity(dto));
    }

    public void deleteProduct(String productId) {
        Product product = repository.findById(productId).orElse(null);

        if (product != null) {
            repository.delete(product);

        }
    }

    public ProductDTO getProduct(String productId) {
        Product product = repository.findById(productId).orElse(null);

        if (product != null) {
            return ProductAdapter.toDTO(product);
        }
        return null;
    }
}
