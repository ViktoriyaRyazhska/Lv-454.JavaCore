
import java.util.Scanner;
public class Task3 {

    public static void execute(){
        double amountDollars;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Input cost of USD, ");
        double costOfUSD=scanner.nextDouble();
        System.out.println("Input sum of ukrainian gryvnas");
        double sumOfGryvna=scanner.nextDouble();
        if (costOfUSD != 0 && sumOfGryvna != 0) {
            amountDollars = sumOfGryvna / costOfUSD;
                System.out.println("If you have " + sumOfGryvna + " gryvnas, you can by " + amountDollars + " USD.");
        } scanner.close();
    }
}
