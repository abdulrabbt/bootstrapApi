package com.example.bootstrap.service;

import com.example.bootstrap.entity.Location;
import com.example.bootstrap.repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.bootstrap.repository.LocationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImplements implements LocationService {
    @Autowired
    LocationRepository locationRepository;

    public List<Location> retrieveLocations() {
        return (List<Location>) locationRepository.findAll();
    }

}
