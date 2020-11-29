package com.fcs.myfarm.controller;

import com.fcs.myfarm.model.Animal;
import com.fcs.myfarm.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @GetMapping("/animal/{id}")
    public Optional<Animal> findByID(@PathVariable(value = "id") String id){
        return animalService.findById(id);
    }

    @GetMapping("/animal")
    public List<Animal> findAll(){
        return animalService.findAll();
    }

}
