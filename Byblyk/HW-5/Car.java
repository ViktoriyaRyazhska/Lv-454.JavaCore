package task2;

import java.util.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Car {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] array;
		array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(br.readLine());
		}
		DisplayCar display1 = new DisplayCar();
		display1.setModel("Ford Mustang");
		display1.getModel();
		display1.setEngineCap(3.5);
		display1.getEngineCap();
		display1.setYearProd(array[0]);
		display1.getYearProd();

		DisplayCar display2 = new DisplayCar();
		display2.setModel("Lamborgini Aventador");
		display2.getModel();
		display2.setEngineCap(4.0);
		display2.getEngineCap();
		display2.setYearProd(array[1]);
		display2.getYearProd();

		DisplayCar display3 = new DisplayCar();
		display3.setModel("Porshe Macan");
		display3.getModel();
		display3.setEngineCap(3.0);
		display3.getEngineCap();
		display3.setYearProd(array[2]);
		display3.getYearProd();

		DisplayCar display4 = new DisplayCar();
		display4.setModel("Audi TT");
		display4.getModel();
		display4.setEngineCap(4.5);
		display4.getEngineCap();
		display4.setYearProd(array[3]);
		display4.getYearProd();

		DisplayCar display5 = new DisplayCar();
		display5.setModel("BMW M1");
		display5.getModel();
		display5.setEngineCap(2.8);
		display5.getEngineCap();
		display5.setYearProd(array[4]);
		display5.getYearProd();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

		}

		DisplayCar[] disCar = { display1, display2, display3, display4, display5 };
//		for(int i=0;i<disCar.length;i++) {
//			System.out.println(disCar[i]);
//		}
		sort(disCar);

	}

	static void sort(DisplayCar[] arr) {
		DisplayCar temp;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getYearProd() < arr[j].getYearProd()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}
}

class DisplayCar {
	private String model;
	private int yearProd;
	private double engineCap;

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearProd() {
		return yearProd;
	}

	public void setYearProd(int yearProd) {
		this.yearProd = yearProd;
	}

	public double getEngineCap() {
		return engineCap;
	}

	public void setEngineCap(double engineCap) {
		this.engineCap = engineCap;
	}

	@Override
	public String toString() {
		return "DisplayCar [model=" + model + ", yearProd=" + yearProd + ", engineCap=" + engineCap + "]";
	}
}