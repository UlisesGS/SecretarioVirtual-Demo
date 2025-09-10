package com.example.SecretarioVirtual_Demo.mappers.professional;

import com.example.SecretarioVirtual_Demo.entities.professional.Professional;
import com.example.SecretarioVirtual_Demo.entities.professional.dto.RequestCreateProfessionalDto;
import com.example.SecretarioVirtual_Demo.entities.professional.dto.ResponseCreateProfessionalDto;

public interface ProfessionalMapper {


    Professional requestCreateProfessionalToProfessional(RequestCreateProfessionalDto requestCreateProfessionalDto);
    ResponseCreateProfessionalDto professionalToResponseCreateProfessional(Professional professional);

}
