package com.fcs.myfarm.controller;

import com.fcs.myfarm.model.Animal;
import com.fcs.myfarm.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/animals")
public class AnimalController {

    @Autowired
    AnimalService animalService;

    @GetMapping("/")
    public List<Animal> findAll(){
        return animalService.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Animal> findByID(@PathVariable(value = "id") String id){
        return animalService.findById(id);
    }

}
