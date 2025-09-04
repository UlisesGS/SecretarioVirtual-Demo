package com.example.SecretarioVirtual_Demo.repositories;

import com.example.SecretarioVirtual_Demo.entities.professional.Professional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionalRepository extends JpaRepository<Professional,String> {
}
