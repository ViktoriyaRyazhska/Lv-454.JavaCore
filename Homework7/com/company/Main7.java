package com.company;

public class Main7 {

    public static void main(String[] args) {
        Bird [] bird  = new Bird[5] ;
        bird[0] = new Chicken();
        bird[1]= new Eagle();
        bird[2] = new Penguin();
        bird[3] = new Swallow();
        bird[4] = new Penguin();

        for(Bird b:bird)b.fly();

        Employee [] employees = new Employee[5];
        employees[0]= new SalariedEmployee("Petro","s888",400,5);
        employees[1]= new ContractEmployee("Ivan","t888",4000);
        employees[2]= new SalariedEmployee("Saha","s8887",500,6);
        employees[3]= new ContractEmployee("Pavlo","t8883",5000);
        employees[4]= new SalariedEmployee("Tolik","s8886",600,7);

        Employee tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (((Payable)employees[i]).calculatePay() < ((Payable)employees[j]).calculatePay()) {
                    tmp = employees[i];
                    employees[i] = employees[j];
                    employees[j] = tmp;
                }
            }
        }
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]);
        }






    }



}
