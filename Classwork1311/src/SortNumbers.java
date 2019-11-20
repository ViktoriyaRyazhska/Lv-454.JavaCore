import java.util.Scanner;
public class SortNumbers {
    public static void main(String[] args){
        int numberOdd = 0;
        int numbers[]= new int[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  some three numbers, please");
        for (int i=0; i< numbers.length;i++ ){
            numbers [i] = sc.nextInt();
                if (numbers[i]%2==1){
                    numberOdd++;
                   
                } 
        }
        
        System.out.println(numberOdd);
        sc.close();
    }
}




