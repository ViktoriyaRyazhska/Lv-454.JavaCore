package com.company;

public class Car {
    private String type;
    private int year;

    private double engine;

    public double getEngine() {
        return engine;
    }

    public Car(String type, int year, double engine) {
        this.type = type;
        this.year = year;
        this.engine = engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }



    public String getType(String type) {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "type='" + type + '\'' +
                ", year=" + year +
                ", engine=" + engine +
                '}';
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
