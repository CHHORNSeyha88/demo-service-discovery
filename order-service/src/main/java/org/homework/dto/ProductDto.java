package org.homework.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * Developed by ChhornSeyha
 * Date: 09/09/2025
 */

@Setter
@Getter
public class ProductDto {
    private Long id;
    private String productName;
    private BigDecimal price;


}
