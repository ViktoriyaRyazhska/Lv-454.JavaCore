import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter year car: ");
        int year = Integer.parseInt(br.readLine());
        Car[] car = {new Car("Jeep", 2015, 2),
                new Car("Light", 2015, 2),
                new Car("Picup", 2013, 2),
        new Car("Universal", 2014,2)};
        for( int i = 0; i < car.length; i++ ){
            if(car[i].getYear() == year){
                System.out.println(car[i]);
            }
        }
        System.out.println("");
        sort(car);
        for(int i = 0; i < car.length; i++){
            System.out.println(car[i]);
        }



        int counter = 0;
        int sum = 0;
        int arr[] = {31, 30, 29, 30, 28, 30, 31, 31, 30, 29, 30, 31};
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Write number month: ");
        int number = Integer.parseInt(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            if (number == i) {
                number = i;
                System.out.println(arr[i]);
            }
        }
        System.out.println("Write array length: ");
        int size = Integer.parseInt(br.readLine());
        int numbers[] = new int[size];
        System.out.println("Insert array elements:");
        for (int j = 0; j < size; j++) {
            numbers[j] = Integer.parseInt(br.readLine());
        }
        System.out.println("Inserted array elements: ");
        for (int j = 0; j < size; j++) {
            System.out.println(numbers[j]);

        }
        for ( int j = 0; j < 5; j++){
            sum += numbers[j];

        }
        System.out.println("Sum = " + sum);

        System.out.println("Write 5 number: ");
        int size2 = Integer.parseInt(br.readLine());
        int numbers2[] = new int[size2];
        System.out.println("Insert array element: " );
        for (int i = 0; i < size2; i++){
            numbers2[i] = Integer.parseInt(br.readLine());
        }
        System.out.println("Inserted array element: ");
        for (int j = 0; j < numbers2.length; j++) {
            int min = numbers2[0];

            if(numbers2[j] > 0){
                counter++;
                if(counter == 2){
                    System.out.println(j);

                }


            }


        }



    }

    public static void sort (Car[] emp){
        Car tmp;
        for(int i = 0; i < emp.length-1; i++){
            for(int j = 0; j < emp.length; j++){
                if(emp[i].getYear() < emp[j].getYear()){
                    tmp = emp[i];
                    emp[i] = emp[j];
                    emp[j] = tmp;
                }
            }
        }
    }
}
