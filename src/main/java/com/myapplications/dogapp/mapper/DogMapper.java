package com.myapplications.dogapp.mapper;

import com.myapplications.dogapp.dto.DogDto;
import com.myapplications.dogapp.entity.Dog;


public class DogMapper {

    public static DogDto mapToDogDto(Dog dog) {
        return new DogDto(
                dog.getId(),
                dog.getName(),
                dog.getBreed(),
                dog.getBirthday(),
                dog.getOwner()
        );
    }

    public static Dog mapToDog(DogDto dogDto) {
        return new Dog(
                dogDto.getId(),
                dogDto.getName(),
                dogDto.getBreed(),
                dogDto.getBirthday(),
                dogDto.getOwner()
        );
    }

}
