package com.myapplications.dogapp.controller;

import com.myapplications.dogapp.dto.DogDto;
import com.myapplications.dogapp.service.DogService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/dogs")
public class DogController {
    private DogService dogService;

    @PostMapping
    public ResponseEntity<DogDto> createDog(@RequestBody DogDto dogDto) {
        DogDto savedDog = dogService.createDog(dogDto);
        return new ResponseEntity<>(savedDog, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<DogDto> getDogById(@PathVariable("id") Long dogId) {
        DogDto dogDto = dogService.getDogById(dogId);
        return ResponseEntity.ok(dogDto);
    }

    @GetMapping
    public ResponseEntity<List<DogDto>> getAllDogs() {
        List<DogDto> dogs = dogService.getAllDogs();
        return ResponseEntity.ok(dogs);
    }

    @PutMapping("{id}")
    public ResponseEntity<DogDto> updateDog(@PathVariable("id") Long dogId, @RequestBody DogDto updatedDog) {
        DogDto dogDto = dogService.updateDog(dogId, updatedDog);
        return ResponseEntity.ok(dogDto);
    }

}
