import java.util.Scanner;
public class Application {
    public static void main(String[] args) {
        float[]input = new float[3];
        System.out.println("Enter floating point number");
        for (int i = 0; i < input.length; i++) {
            input[i] = new Scanner(System.in).nextFloat();
        }
        for (int i=0; i< input.length;i++ ){
            if (-5<= input[i] && input[i]<=5){
                System.out.println(true);
            }else{
                System.out.println (false);
            }
        }
    }
}

