package task4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {
    private int yearOfProduction;
    private int engineCapacity;
    private String type;

    public Car(int yearOfProduction, int engineCapacity, String type) {
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.type = type;
    }

    public String getType() {return type; }

    public void setType(String type) {this.type = type; }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String toString() {
        return "Car type " +  type +
                " engineCapacity '" + engineCapacity + '\'' +
                ", year of production " + yearOfProduction ;
    }
    public static void main(String[] args) throws IOException{

        Car car = new Car(2015, 2000,"Crossover");
        Car car1 = new Car(2009, 1400,"Sedan");
        Car car2 = new Car(2009, 1600,"Hatchback");
        Car car3 = new Car(2011, 3000,"Coupe");
        Car[] cars = new Car[4];
        cars[0] = car;
        cars[1] = car1;
        cars[2] = car2;
        cars[3] = car3;
        Car tmp;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() < cars[j].getYearOfProduction()) {
                    tmp = cars[i];
                    cars[i] = cars[j];
                    cars[j] = tmp;
                }
            }
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
        input(cars);

    }
    public static void input(Car[] arr) throws IOException {
        System.out.println("Enter year of production car, please ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(reader.readLine());
        boolean isYear = false;
        for (int i = 0; i < arr.length; i++) {
            if (input == arr[i].getYearOfProduction()) {
                System.out.println("This car is " + arr[i]);
                isYear = true;
            }
        }
        if(!isYear){
            System.out.println("There are no cars with this year of production ");
        }
    }
}




