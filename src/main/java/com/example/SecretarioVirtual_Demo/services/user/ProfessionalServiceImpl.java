package com.example.SecretarioVirtual_Demo.services.user;

import com.example.SecretarioVirtual_Demo.entities.professional.Professional;
import com.example.SecretarioVirtual_Demo.entities.professional.dto.RequestCreateProfessionalDto;
import com.example.SecretarioVirtual_Demo.entities.professional.dto.ResponseCreateProfessionalDto;
import com.example.SecretarioVirtual_Demo.mappers.professional.ProfessionalMapper;
import com.example.SecretarioVirtual_Demo.repositories.ProfessionalRepository;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProfessionalServiceImpl implements  ProfessionalService {

    private final ProfessionalRepository professionalRepository;
    private final ProfessionalMapper professionalMapper;

    @Override
    public ResponseCreateProfessionalDto register(@Valid RequestCreateProfessionalDto requestCreateProfessionalDto) {
        Professional professional = professionalMapper.requestCreateProfessionalToProfessional(requestCreateProfessionalDto);
        professionalRepository.save(professional);
        return professionalMapper.professionalToResponseCreateProfessional(professional);
    }
}
