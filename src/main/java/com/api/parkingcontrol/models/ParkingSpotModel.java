package com.api.parkingcontrol.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;

import java.io.Serializable;

@Entity
public class ParkingSpotModel {
@Table(name = "TB_PARKING_SPOT")
 public class ParkingSpotModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @generatedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique=true, lenght=10)
    private String parkingSpotNumber;
    @Column(nullable = false, unique=true, lenght=7)
    private String licencePlateCar;
    @Column (nullable = false, unique= true, length=70)
    private String BrandCar;
    @Column (nullable = false, unique= true, length=70)
    private String modelCar;
    @Column (nullable = false, unique= true, length=70)
    private String colorCar;
    @Column (nullable = false)
    private LocalDateTime registrationDate;
    @Column (nullable = false, lenght=130)
    private String responsibleName;
    @Column (nullable = false, lenght=30)
    private String apartment;
    @Column (nullable = false, lenght=30)
    private String block;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicencePlateCar() {
        return licencePlateCar;
    }

    public void setLicencePlateCar(String licencePlateCar) {
        this.licencePlateCar = licencePlateCar;
    }

    public String getBrandCar() {
        return BrandCar;
    }

    public void setBrandCar(String brandCar) {
        BrandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
}
