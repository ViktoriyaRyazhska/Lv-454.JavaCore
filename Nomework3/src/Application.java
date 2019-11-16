import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        float[]input = new float[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter floating point number");
        for (int i = 0; i < input.length; i++) {
            input[i] = scanner.nextFloat();
        }
        boolean isBelong = true;
        for (int i=0; i< input.length;i++ ){
            if (-5<= input[i] && input[i]<=5){
                System.out.println(isBelong);
            }else{
                System.out.println (isBelong = false);
            }
        }
    }
}

