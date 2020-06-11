package com.patterns.pattern.decorator.cartuning.car;

public class CarDefault implements Car {

    private String vinCode;
    private String model;
    private int year;

    public CarDefault(String vinCode, String model, int year) {
        this.vinCode = vinCode;
        this.model = model;
        this.year = year;
    }

    @Override
    public String getVinCode() {
        return "AA123456789";
    }

    @Override
    public String getModel() {
        return "M745, year 2010";
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car {" +
                "vinCode='" + vinCode + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
