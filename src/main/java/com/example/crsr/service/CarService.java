package com.example.crsr.service;

import com.example.crsr.entity.Cars;
import com.example.crsr.repository.CarsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CarService {
    @Autowired
    private CarsRepository carsRepository;

    @Autowired
    private FilterService filterService;

    public List<Cars> getAll() {
        return carsRepository.findAll(Sort.by(filterService.getFilters()));
    }

    public void delete(String id) {
        carsRepository.deleteById(id);
    }

    public void save(Cars car) {
        if (car.getId() == null) {
            car.setId(UUID.randomUUID().toString());
        }
        carsRepository.save(car);
    }
}
