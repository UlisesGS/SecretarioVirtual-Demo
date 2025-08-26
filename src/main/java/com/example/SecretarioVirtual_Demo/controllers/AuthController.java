package com.example.SecretarioVirtual_Demo.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/api/autenticacion")
@CrossOrigin(origins = "http://localhost:5173")
@RestController
public class AuthController {
}
