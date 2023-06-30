package com.api.NutriAcess.services;

import com.api.NutriAcess.dtos.FaleConoscoDtos;
import com.api.NutriAcess.models.FaleConoscoModel;
import com.api.NutriAcess.repositories.FaleConoscoRepository;
import jakarta.transaction.Transactional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class FaleConoscoService {

    //Injenção de dependencias
    private final FaleConoscoRepository faleConoscoRepository;

    public FaleConoscoService(FaleConoscoRepository faleConoscoRepository) {
        this.faleConoscoRepository = faleConoscoRepository;
    }

    @Transactional
    public FaleConoscoModel save(FaleConoscoModel faleConoscoModel) {
        return faleConoscoRepository.save(faleConoscoModel);
    }

    public Optional<FaleConoscoModel> findById(UUID id) {
        return faleConoscoRepository.findById(id);
    }
    @Transactional
    public void delete(FaleConoscoModel faleConoscoModel) {
        faleConoscoRepository.delete(faleConoscoModel);
    }

    public Page<FaleConoscoModel> findAll(Pageable pageable) {
        return faleConoscoRepository.findAll(pageable);
    }

    
    public ResponseEntity<Object> validarFaleConosco(FaleConoscoDtos faleConoscoDtos) {
        if (faleConoscoDtos.getAvaliacao() == null) {
        return ResponseEntity.badRequest().body("A opção de avaliação não pode ficar vazia.");
    }
        return null;
    }
}
