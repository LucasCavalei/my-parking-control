package com.api.parkingcontrol.repositories;

import com.api.parkingcontrol.models.ParkingSpotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
//UUID é o indentificador
@Repository
public class parkingSpotRepository extends JpaRepository<ParkingSpotModel, UUID> {

}
