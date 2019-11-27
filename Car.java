package Car;

import java.io.IOException;


public class Car {
    private int yearOfProduction;
    private int engineCapacity;
    private String type;
	
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Car(int yearOfProduction, int engineCapacity, String type) {
		super();
		this.yearOfProduction = yearOfProduction;
		this.engineCapacity = engineCapacity;
		this.type = type;
	}
	@Override
	public String toString() {
		return "Car [yearOfProduction=" + yearOfProduction + ", "
				+ "engineCapacity=" + engineCapacity + ","
						+ " type=" + type
				+ "]";
	}
	public static void main(String[] args) throws IOException{

        Car car = new Car(2019, 2400,"Honda Crossover");
        Car car1 = new Car(2009, 1400,"Hyundai Sedan");
        Car car2 = new Car(2009, 3300,"Toyota Hatchback");
        Car car3 = new Car(2011, 2000,"Mazda Coupe");
        Car[] cars = new Car[4];
        cars[0] = car;
        cars[1] = car1;
        cars[2] = car2;
        cars[3] = car3;
        Car car4;
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getYearOfProduction() < cars[j].getYearOfProduction()) {
                    car1 = cars[i];
                    cars[i] = cars[j];
                    cars[j] = car1;
                }
            }
        }
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
	
	
	}
}