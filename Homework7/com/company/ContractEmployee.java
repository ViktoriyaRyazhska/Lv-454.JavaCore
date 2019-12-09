package com.company;

public  class ContractEmployee extends com.company.Employee implements com.company.Payable {
    private String federalTaxIdmember;
    private int paymant ;

    @Override
    public String toString() {
        return   getName()+

                " federalTaxIdmember=' " + federalTaxIdmember + '\'' +
                ", paymant=" + calculatePay() ;

    }

    public ContractEmployee(String name ,String federalTaxIdmember, int paymant) {
        this.federalTaxIdmember = federalTaxIdmember;
        this.paymant = paymant;
        this.setName(name);
    }

    @Override
    public int calculatePay() {
        int salary = paymant;
        return salary;
    }
}
