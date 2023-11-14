package com.myapplications.dogapp.service.impl;

import com.myapplications.dogapp.dto.DogDto;
import com.myapplications.dogapp.entity.Dog;
import com.myapplications.dogapp.exception.ResourceNotFoundException;
import com.myapplications.dogapp.mapper.DogMapper;
import com.myapplications.dogapp.repository.DogRepository;
import com.myapplications.dogapp.service.DogService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class DogServiceImpl implements DogService {

    private DogRepository dogRepository;
    @Override
    public DogDto createDog(DogDto dogDto) {
        Dog dog = DogMapper.mapToDog(dogDto);
        Dog savedDog = dogRepository.save(dog);
        return DogMapper.mapToDogDto(savedDog);
    }
    @Override
    public DogDto getDogById(Long dogId) {
        Dog dog = dogRepository.findById(dogId)
                .orElseThrow(() ->
                        new ResourceNotFoundException("Dog with the ID " + dogId + " does not exist")
                );
        return DogMapper.mapToDogDto(dog);
    }
}
