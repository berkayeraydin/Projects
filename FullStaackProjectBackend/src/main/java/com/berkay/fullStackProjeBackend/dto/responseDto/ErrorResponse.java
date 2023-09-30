package com.berkay.fullStackProjeBackend.dto.responseDto;

import lombok.Data;

@Data
public class ErrorResponse {
    private int code;
    private String message;
}
