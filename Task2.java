import java.util.Scanner;
public class Task2 {
	
 public static void main (String[] args)  {


        Scanner sc = new Scanner(System.in);
	 
        System.out.println("Input 3 number: ");
        float a = Float.parseFloat(sc.readline());
        float b = Float.parseFloat(sc.readline());
        float c = Float.parseFloat(sc.readline());

        if (-5 < a && a < 5) {
            System.out.println(a);
        }
        if (-5 < b && b < 5) {
            System.out.println(b);
        }
        if (-5 < c && c < 5) {
            System.out.println(c);
        }
     }
 }

        

        
