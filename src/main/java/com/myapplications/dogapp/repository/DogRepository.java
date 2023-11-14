package com.myapplications.dogapp.repository;

import com.myapplications.dogapp.entity.Dog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DogRepository extends JpaRepository<Dog, Long> {
}
