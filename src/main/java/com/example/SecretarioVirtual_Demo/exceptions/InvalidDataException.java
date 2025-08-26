package com.example.SecretarioVirtual_Demo.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class InvalidDataException extends RuntimeException {
    private String message;
}
