package com.example.listofcars;

public class Car {

    private String name;//название
    private String carDescription;//описание
    private String topSpeed;//макс скорость
    private int carResource;//идентификатор

    public Car(String name, String carDescription, String topSpeed, int carResource) {
        this.name = name;
        this.carDescription = carDescription;
        this.topSpeed = topSpeed;
        this.carResource = carResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarDescription() {
        return carDescription;
    }

    public void setCarDescription(String carDescription) {
        this.carDescription = carDescription;
    }

    public String getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(String topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getCarResource() {
        return carResource;
    }

    public void setCarResource(int carResource) {
        this.carResource = carResource;
    }
}
