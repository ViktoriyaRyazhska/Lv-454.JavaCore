import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;



public class MyClass {



    public static void main (String[] args)throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input 3 number: ");
        float a = Float.parseFloat(br.readLine());
        float b = Float.parseFloat(br.readLine());
        float c = Float.parseFloat(br.readLine());

        if (-5 < a && a < 5) {
            System.out.println(a);
        }
        if (-5 < b && b < 5) {
            System.out.println(b);
        }
        if (-5 < c && c < 5) {
            System.out.println(c);
        }
        System.out.println("Size array = ");
        int size = Integer.parseInt(br.readLine());
        int array[] = new int [size];
        System.out.println("Input 3 number: ");
        for(int i = 0; i < size; i++){
            array[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(array);
        int min = array[0];
        System.out.println("min = " + min);
        int max = array[array.length-1];
        System.out.println("max = " + max);


        System.out.println("Введіть номер помилки: ");
        String number = br.readLine();
        switch (number){
            case "400":
                System.out.println("Error 400");
                break;
            case "401":
                System.out.println("Error 401");
                break;
            case "402":
                System.out.println("Error 402");
                break;
            case "403":
                System.out.println("Error 403");
                break;
                default:
                    System.out.println("Error error");

        }

        System.out.println("Name dog: ");
        String name = br.readLine();

        switch(name){
            case "Rex":
                System.out.println("Порода собаки: " + feild.Vivcharka);
                break;
            case "Max":
                System.out.println("Порода собаки: " + feild.Pikines);
                break;
            case "Oliver":
                System.out.println("Порода собаки: " + feild.Taksa);
                break;
                default:
                    System.out.println("Error");

        }




    }



    public enum feild{
        Vivcharka, Pikines, Taksa
    }

}
