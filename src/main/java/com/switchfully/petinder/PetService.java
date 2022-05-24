package com.switchfully.petinder;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PetService {
    private PetMapper petMapper;

    public PetService(PetMapper petMapper) {
        this.petMapper = petMapper;
    }

    public List<PetDTO> getAllPets() {

        return petMapper.toDTO(PetRepository.getAllPets());
    }
}
