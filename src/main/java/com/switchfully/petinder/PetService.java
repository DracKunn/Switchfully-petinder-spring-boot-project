package com.switchfully.petinder;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PetService {
    private final PetMapper petMapper;
    private PetRepository petRepository;

    public PetService(PetMapper petMapper, PetRepository petRepository) {
        this.petMapper = petMapper;
        this.petRepository = petRepository;
    }

    public List<PetDTO> getAllPets() {

        return petMapper.toDTO(PetRepository.getAllPets());
    }
}
