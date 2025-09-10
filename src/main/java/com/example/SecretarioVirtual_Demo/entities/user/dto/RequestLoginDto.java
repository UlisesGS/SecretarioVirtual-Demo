package com.example.SecretarioVirtual_Demo.entities.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class RequestLoginDto {

    @NotBlank()
    @Email()
    private String email;

    @NotBlank()
    @Size()
    private String password;

    @NotBlank()
    private String confirmPassword;
}
