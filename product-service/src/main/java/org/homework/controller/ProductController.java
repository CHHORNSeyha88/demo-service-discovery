package org.homework.controller;

import org.homework.model.Product;
import org.homework.service.ProductServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

/**
 * Developed by ChhornSeyha
 * Date: 09/09/2025
 */

@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private final ProductServiceImpl productService;

    public ProductController(ProductServiceImpl productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    ResponseEntity<Product> create(Product req){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.create(req));
    }
    @GetMapping("/{id}")
    ResponseEntity<Product> getById (@PathVariable Long id){
        return ResponseEntity.status(HttpStatus.OK).body(productService.getById(id));
    }
}
