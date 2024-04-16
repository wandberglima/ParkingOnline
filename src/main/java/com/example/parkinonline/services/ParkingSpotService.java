package com.example.parkinonline.services;

import com.example.parkinonline.dtos.ParkingSpotDto;
import com.example.parkinonline.models.ParkingSpotModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;
import java.util.UUID;

public interface ParkingSpotService {

    ParkingSpotModel save(ParkingSpotModel parkingSpotModel);
    boolean existsByLicensePlateCar(String licensePlateCar);
    boolean existsByParkingSpotNumber(String parkingSpotNumber);
    boolean existsByApartmentAndBlock(String apartment, String block);
    Page<ParkingSpotModel> findAll(Pageable pageable);
    Optional<ParkingSpotModel> findById(UUID id);
    void delete(ParkingSpotModel parkingSpotModel);
}
