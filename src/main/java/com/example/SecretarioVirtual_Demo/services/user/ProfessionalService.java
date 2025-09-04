package com.example.SecretarioVirtual_Demo.services.user;

import com.example.SecretarioVirtual_Demo.entities.professional.dto.RequestCreateProfessionalDto;
import com.example.SecretarioVirtual_Demo.entities.professional.dto.ResponseCreateProfessionalDto;

public interface ProfessionalService {

    ResponseCreateProfessionalDto register(RequestCreateProfessionalDto requestCreateProfessionalDto);
}
