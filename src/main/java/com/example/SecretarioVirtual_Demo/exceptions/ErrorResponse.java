package com.example.SecretarioVirtual_Demo.exceptions;

public record ErrorResponse(
        int statusCode,
        String message
) {
}
