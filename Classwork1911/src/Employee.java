/*Create an array of ten integers.
Create a class Employee with fields name, department number, salary. Create five objects of class Employee. Display
all employees of a certain department (enter department number in the console);
arrange workers by the field salary in descending order.*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    private String name;
    private int department;
    private int salary;

    public Employee(String name, int department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }



    public static void main(String[] args) throws IOException {
        Employee softwareDeveloper = new Employee("Achmetov", 3, 3200);
        Employee projectManager = new Employee("Poroshenko", 1, 2800);
        Employee hrManager = new Employee("Groysman", 2, 1500);
        Employee qcEngineer = new Employee("Avakov", 4, 1000);
        Employee accountant = new Employee("Gontareva", 5, 1300);
        Employee[] employees = {softwareDeveloper, projectManager, hrManager, qcEngineer, accountant};
        int tmp;
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = i + 1; j < employees.length; j++) {
                if (employees[i].getSalary() < employees[j].getSalary()) {
                    tmp = employees[i].getSalary();
                    employees[i].getSalary() = employees[j].getSalary();
                    employees[j].getSalary() = tmp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }




    }
    /*public static int inputDepartment() throws IOException {
        int[] department;
        department = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <department.length ; i++) {
            System.out.println("Enter number of department ");
            int number = Integer.parseInt(reader.readLine());

        }
        System.out.println();
    }*/

    }


