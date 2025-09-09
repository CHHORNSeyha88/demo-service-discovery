package org.homework.dto;

import lombok.Builder;
import lombok.Data;

/**
 * Developed by ChhornSeyha
 * Date: 09/09/2025
 */
@Data
@Builder
public class OrderResponse {
    private Long orderId;
    private UserDto user;
    private ProductDto product;
    private Integer quantity;
}
