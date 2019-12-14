package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input first number ");
        double first = 0;
        try {
            first = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Input second number ");
        double second = 0;
        try {
            second = Double.parseDouble(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        div(first, second);

    }
    public static double div(double a,double b) {
        double c=0;
        try{
             c = a/b;
            System.out.println("The result of division = " + c);
        }catch (ArithmeticException|NumberFormatException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return c;
    }
}


