package com.example.SenlaOpenIT.controller;

import com.example.SenlaOpenIT.model.Product;
import com.example.SenlaOpenIT.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    private final ProductService productService;
    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    private List<Product> getAll() {
        return productService.getAll();
    }

    @PostMapping()
    public void saveProduct(@RequestBody Product product) {
        productService.save(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product) {
        product.setId(id);
        return (Product) productService.update(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable("id") Long id) {
        productService.delete(id);
    }
}
