package com.fcs.myfarm.service;

import com.fcs.myfarm.model.Animal;
import com.fcs.myfarm.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    @Autowired
    AnimalRepository animalRepository;

    public Optional<Animal> findById(String id){
        return animalRepository.findById(id);
    }

    public List<Animal> findAll(){
        return animalRepository.findAll();
    }

}
