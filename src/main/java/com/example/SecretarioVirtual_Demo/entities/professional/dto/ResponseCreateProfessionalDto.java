package com.example.SecretarioVirtual_Demo.entities.professional.dto;

import java.time.LocalDate;

public record ResponseCreateProfessionalDto(
        String id,
        String name,
        String lastName,
        String email,
        String phone,
        LocalDate dateOfBirth
) {

}
