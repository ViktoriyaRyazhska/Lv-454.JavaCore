package edu.com;

import java.io.*;

public class Example2 {

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = br.readLine();

        System.out.println("Where are you live?");
        String region = br.readLine();


        System.out.println("Your information" + "  " + region + "  " + name);







    }
}
