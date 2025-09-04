package com.example.SecretarioVirtual_Demo.controllers;

import com.example.SecretarioVirtual_Demo.entities.professional.dto.RequestCreateProfessionalDto;
import com.example.SecretarioVirtual_Demo.entities.professional.dto.ResponseCreateProfessionalDto;
import com.example.SecretarioVirtual_Demo.services.user.ProfessionalService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/professional")
@CrossOrigin(origins = "http://localhost:5173")
@RequiredArgsConstructor
public class ProfessionalController {

    private final ProfessionalService professionalService;

    @PostMapping
    public ResponseEntity<ResponseCreateProfessionalDto> register(@RequestBody RequestCreateProfessionalDto requestCreateProfessionalDto) {
        ResponseCreateProfessionalDto responseCreateProfessionalDto =  professionalService.register(requestCreateProfessionalDto);
        return ResponseEntity.ok(responseCreateProfessionalDto);
    }
}
