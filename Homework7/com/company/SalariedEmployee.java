package com.company;

public  class SalariedEmployee extends Employee implements Payable {
    private String socialSecurityNumber;

    public SalariedEmployee(String name ,String socialSecurityNumber, int hourlyRate, int hours) {
        this.socialSecurityNumber = socialSecurityNumber;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
        this.setName(name);
    }

    private int hourlyRate;
    private int hours;

    @Override
    public String toString() {
        return  getName()+

                " socialSecurityNumber=' " + socialSecurityNumber + '\'' +
                ", paymant=" + calculatePay() ;

    }

    @Override
    public int calculatePay() {
int salary = hourlyRate * hours;
return salary;
    }
}
