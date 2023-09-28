package com.vrx.SpringMvcProject.controller;

import com.vrx.SpringMvcProject.model.Product;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static final Logger logger = LoggerFactory.getLogger(ProductController.class);

    @PostMapping("/add/{id}")
    public ResponseEntity<Product> addProduct(
            @PathVariable("id") int productId,
            @RequestParam("name") String productName,
            @RequestParam("rating") int rating
    ) {
        Product product = new Product();
        product.setId(productId);
        product.setName(productName);
        product.setRating(rating);
        logger.info("Product details: {}", product);
        return ResponseEntity.status(HttpStatus.OK).body(product);
    }
}
