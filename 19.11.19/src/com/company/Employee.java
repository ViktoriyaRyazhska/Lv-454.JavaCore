package com.company;

public class Employee {
    private String name;
    private double salary;
    private int depnum;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDepnum() {
        return depnum;
    }

    public void setDepnum(int depnum) {
        this.depnum = depnum;
    }

    Employee() {};

    void Emlpoyee(String name, double salary, int depnum) {
        this.name = name;
        this.salary = salary;
        this.depnum = depnum;
    }

    @Override
    public String toString() {

        return " Employee [ Name: " + getName() + ", Departament number: " + getDepnum() + ", Salary: " + getSalary()
                + "]";
    }

    public static void printEm(int dep, Employee[] em) {
        System.out.println("Employees from dep 2");
        for (int i = 0; i < em.length; i++) {
            if (em[i].getDepnum() == dep) {
                System.out.println(em[i]);
            }
        }
    }
    public static void Salary(Employee[] em) {
        System.out.println("Arrange workers by the field salary in descending order:");
        double tmp;
        for(int i=0;i<em.length;i++) {
            for(int j=i+1;j<em.length-1;j++) {
                double ii=em[i].getSalary();
                double jj=em[j].getSalary();
                if(em[i].getSalary()>em[j].getSalary()) {
                    tmp=ii;
                    ii=jj;
                    jj=tmp;

                }
            }
        }
        for(int i=em.length-1;i>=0;i--) {
            System.out.println(em[i]);
        }
    }
}
