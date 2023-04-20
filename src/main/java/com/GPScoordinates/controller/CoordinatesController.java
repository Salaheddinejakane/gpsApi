package com.GPScoordinates.controller;

import com.GPScoordinates.repository.CoordinatesRepository;
import com.GPScoordinates.entity.Coordinates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/coordinates")
public class CoordinatesController {
    @Autowired
    private CoordinatesRepository coordinatesRepository;

    @GetMapping
    public List<Coordinates> getCoordinates() {
        return coordinatesRepository.findAll();
    }
}
