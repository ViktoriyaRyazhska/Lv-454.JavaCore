import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {
        Scanner sc=new Scanner(System.in);
        int a,b,s;
      System.out.println("Enter two int numbers: ");
        a=sc.nextInt();
        b=sc.nextInt();

        try {
            squareRectangle(a, b);
        } catch (IOException e){
            System.err.println("a or b less than 0");
        }
        System.out.println("Area= "+a*b);
        }
        public static int squareRectangle(int a,int b) throws IOException {

            if (a<0||b<0){
                throw new IOException();
            }
            return a*b;
        }
}
