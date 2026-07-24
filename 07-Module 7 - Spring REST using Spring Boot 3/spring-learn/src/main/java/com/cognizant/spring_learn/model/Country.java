package com.cognizant.spring_learn.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class Country {

    @NotBlank(message = "Code is mandatory")
    @Size(min = 2, max = 2, message = "Code must be 2 characters")
    private String code;

    @NotBlank(message = "Name is mandatory")
    private String name;

    // Getters and Setters
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
