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

}
