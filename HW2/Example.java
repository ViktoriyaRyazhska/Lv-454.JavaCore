package edu.com;

import java.io.*;

public class Example {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your num");

        int num1, num2, sum;


        num1 = Integer.parseInt(br.readLine());
        num2 = Integer.parseInt(br.readLine());
        sum = (num1 + num2) * 2;


        System.out.println("P = " + sum);







    }
}
