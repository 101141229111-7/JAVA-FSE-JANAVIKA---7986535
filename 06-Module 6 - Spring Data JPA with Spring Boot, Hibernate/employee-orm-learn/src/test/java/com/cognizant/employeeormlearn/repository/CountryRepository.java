package com.cognizant.employeeormlearn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.cognizant.employeeormlearn.model.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {
}
