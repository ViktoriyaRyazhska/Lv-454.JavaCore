package com.company;

public class Car {
    private int year;
    private double capacity;
    private String model;
    public int getYear(){return this.year;}
    public double getCapacity(){return this.capacity;}
    public String getModel(){return this.model;}
    public void setCapacity(double capacity) { this.capacity = capacity; }
    public void setModel(String model) { this.model = model; }
    public void setYear(int year) { this.year = year; }

    @Override
    public String toString() {
        return "Model "+getModel()+". "+getYear()+" year. Engine capacity "+getCapacity();
    }
}
