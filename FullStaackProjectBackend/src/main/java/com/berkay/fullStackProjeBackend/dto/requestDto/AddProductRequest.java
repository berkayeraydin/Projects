package com.berkay.fullStackProjeBackend.dto.requestDto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddProductRequest {
    @NotBlank(message = "Ürün ismi boş olamaz.")
    private String productName;
    private int supplierId;
    private int categoryId;
    @Min(0)
    private int unitsInStock;
    @Min(0)
    private double unitPrice;
}
