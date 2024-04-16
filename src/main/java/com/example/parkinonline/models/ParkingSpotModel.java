package com.example.parkinonline.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "TB_PARKING_SPOT")
@Getter
@Setter
public class ParkingSpotModel implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String parkingSpotNumber;
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlateCar;
    @Column(nullable = false, length = 70)
    private String brandCar;
    @Column(nullable = false, length = 70)
    private String modelCar;
    @Column(nullable = false, length = 70)
    private String colorCar;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 130)
    private String responsibleName;
    @Column(nullable = false, length = 30)
    private String apartment;
    @Column(nullable = false, length = 30)
    private String block;

    public ParkingSpotModel(UUID id, String parkingSpotNumber, String licensePlateCar, String brandCar, String modelCar, String colorCar, LocalDateTime registrationDate, String responsibleName, String apartment, String block) {
        this.id = id;
        this.parkingSpotNumber = parkingSpotNumber;
        this.licensePlateCar = licensePlateCar;
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.registrationDate = registrationDate;
        this.responsibleName = responsibleName;
        this.apartment = apartment;
        this.block = block;
    }

    public ParkingSpotModel() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParkingSpotModel that)) return false;
        return Objects.equals(getId(), that.getId()) && Objects.equals(getParkingSpotNumber(), that.getParkingSpotNumber()) && Objects.equals(getLicensePlateCar(), that.getLicensePlateCar()) && Objects.equals(getBrandCar(), that.getBrandCar()) && Objects.equals(getModelCar(), that.getModelCar()) && Objects.equals(getColorCar(), that.getColorCar()) && Objects.equals(getRegistrationDate(), that.getRegistrationDate()) && Objects.equals(getResponsibleName(), that.getResponsibleName()) && Objects.equals(getApartment(), that.getApartment()) && Objects.equals(getBlock(), that.getBlock());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getParkingSpotNumber(), getLicensePlateCar(), getBrandCar(), getModelCar(), getColorCar(), getRegistrationDate(), getResponsibleName(), getApartment(), getBlock());
    }

    @Override
    public String toString() {
        return "ParkingSpotModel{" +
                "id=" + id +
                ", parkingSpotNumber='" + parkingSpotNumber + '\'' +
                ", licensePlateCar='" + licensePlateCar + '\'' +
                ", brandCar='" + brandCar + '\'' +
                ", modelCar='" + modelCar + '\'' +
                ", colorCar='" + colorCar + '\'' +
                ", registrationDate=" + registrationDate +
                ", responsibleName='" + responsibleName + '\'' +
                ", apartment='" + apartment + '\'' +
                ", block='" + block + '\'' +
                '}';
    }
}
