package task3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrganizerOfNumbers {

    public static int[] initializeArray() throws IOException {
        int[] arr = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter five numbers, please  ");
        for (int i=0;i<arr.length;i++){
            arr[i]=Integer.parseInt(reader.readLine());
        }
        return arr;
    }
    public static void getMinimumOfNumbers(int[]arr){
    int min = arr[0];
    int indexMin = 0;
    int i = 0;
        while (i < arr.length) {
        if (arr[i] < min) {
            min = arr[i];
            indexMin = i;
        }
        i++;
    }
        System.out.print("Minimum = " + min);
        System.out.println(" is in " + (indexMin + 1) + " place");
    }
    public static void getPositionOfSecondPositiveNumber(int[]arr){
        boolean isSecondPositive = false;
        int counter = 0;
        int indexPositive = 0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>0){
                counter++;
                indexPositive = i;
            if (counter==2){
                isSecondPositive = true;
                System.out.println("Second positive number is in " + (indexPositive + 1) + " place");
                break;
                }
            }
        } if(!isSecondPositive){
            System.out.println("There are no second positive number in array");
        }
    }
    public static void main(String[] args) throws IOException {
        int[]myArray = initializeArray();
        getMinimumOfNumbers(myArray);
        getPositionOfSecondPositiveNumber(myArray);
    }
}
