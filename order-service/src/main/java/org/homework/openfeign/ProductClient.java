package org.homework.openfeign;

import org.homework.dto.ProductDto;
import org.homework.dto.UserDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Developed by ChhornSeyha
 * Date: 31/08/2025
 */

@FeignClient(name = "product-service", url = "http://localhost:8081/api/v1/products/")
public interface ProductClient {
    @GetMapping("/{id}")
    ProductDto getProductByID(@PathVariable Long id);
}
