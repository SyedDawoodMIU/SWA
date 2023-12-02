package app.product.controller;

import app.product.dto.ProductDTO;
import app.product.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public void addProduct(@RequestBody ProductDTO product) {
        productService.createProduct(product);
    }

    @GetMapping("/{id}")
    public ProductDTO getProduct(@PathVariable("id") String id) {
        return productService.getProduct(id);
    }
}
