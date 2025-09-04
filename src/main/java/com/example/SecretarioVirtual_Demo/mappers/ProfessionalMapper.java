package com.example.SecretarioVirtual_Demo.mappers;

import com.example.SecretarioVirtual_Demo.entities.professional.Professional;
import com.example.SecretarioVirtual_Demo.entities.professional.dto.RequestCreateProfessionalDto;
import com.example.SecretarioVirtual_Demo.entities.professional.dto.ResponseCreateProfessionalDto;

public interface ProfessionalMapper {

    //register despues se para a security
    Professional requestCreateProfessionalToProfessional(RequestCreateProfessionalDto requestCreateProfessionalDto);
    ResponseCreateProfessionalDto professionalToResponseCreateProfessional(Professional professional);

}
