package com.myapplications.dogapp.service;

import com.myapplications.dogapp.dto.DogDto;

import java.util.List;

public interface DogService {
    DogDto createDog(DogDto dogDto);
    DogDto getDogById(Long dogId);
    List<DogDto> getAllDogs();
}
