package com.myapplications.dogapp.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DogDto {
    private Long id;
    private String name;
    private String owner;
    private String breed;
    private Date birthday;
}