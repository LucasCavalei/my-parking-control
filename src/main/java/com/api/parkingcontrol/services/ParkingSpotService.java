package com.api.parkingcontrol.services;
import com.api.parkingcontrol.repositories.ParkingSpotRepository;
import com.api.parkingcontrol.models.ParkingSpotModel;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;

//import javax.transactional.Transaction;
//import org.springframework.transaction.annotation.Transactional;

@Service
public class ParkingSpotService {
    final ParkingSpotRepository parkingSpotRepository;
    public ParkingSpotService(ParkingSpotRepository parkingSpotRepository){
        this.parkingSpotRepository = parkingSpotRepository;
    }
    @Transactional
    public ParkingSpotModel save(ParkingSpotModel parkingSpotModel) {
    return parkingSpotRepository.save(parkingSpotModel);
    }
    public boolean existsByLicensePlateCar(String licensePlateCar){
        return parkingSpotRepository.existsByLicensePlateCar(licensePlateCar);
    }
    public boolean existsByParkingSpotNumber(String parkingSpotNumber){
     return parkingSpotRepository.existsByParkingSpotNumber(parkingSpotNumber);
    }
    public boolean existsByApartmentAndBlock(String apartment, String block){
        return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

}
