package com.example.parkinonline.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

public class ParkingSpotDto {

    @NotBlank
    private String parkingSpotNumber;
    @NotBlank
    @Size(max = 7)
    private String licensePlateCar;
    @NotBlank
    private String brandCar;
    @NotBlank
    private String modelCar;
    @NotBlank
    private String colorCar;
    @NotBlank
    private String responsibleName;
    @NotBlank
    private String apartment;
    @NotBlank
    private String block;

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
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

    public ParkingSpotDto() {
    }

    public ParkingSpotDto(String parkingSpotNumber, String licensePlateCar, String brandCar, String modelCar, String colorCar, String responsibleName, String apartment, String block) {
        this.parkingSpotNumber = parkingSpotNumber;
        this.licensePlateCar = licensePlateCar;
        this.brandCar = brandCar;
        this.modelCar = modelCar;
        this.colorCar = colorCar;
        this.responsibleName = responsibleName;
        this.apartment = apartment;
        this.block = block;
    }

    @Override
    public String toString() {
        return "ParkingSpotDto{" +
                "Numero da vaga do estacionamento='" + parkingSpotNumber + '\'' +
                ", Placa do carro='" + licensePlateCar + '\'' +
                ", Marca do Carro='" + brandCar + '\'' +
                ", Modelo do Carro='" + modelCar + '\'' +
                ", Cor do Carro='" + colorCar + '\'' +
                ", Nome do responsavel='" + responsibleName + '\'' +
                ", Apartamento='" + apartment + '\'' +
                ", bloco='" + block + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ParkingSpotDto that)) return false;
        return Objects.equals(getParkingSpotNumber(), that.getParkingSpotNumber()) && Objects.equals(getLicensePlateCar(), that.getLicensePlateCar()) && Objects.equals(getBrandCar(), that.getBrandCar()) && Objects.equals(getModelCar(), that.getModelCar()) && Objects.equals(getColorCar(), that.getColorCar()) && Objects.equals(getResponsibleName(), that.getResponsibleName()) && Objects.equals(getApartment(), that.getApartment()) && Objects.equals(getBlock(), that.getBlock());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getParkingSpotNumber(), getLicensePlateCar(), getBrandCar(), getModelCar(), getColorCar(), getResponsibleName(), getApartment(), getBlock());
    }
}