package task2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter you surname name and patronymic, please");
        String[] fullName  = new String[3];
        fullName[0]=reader.readLine(); // surname
        fullName[1]=reader.readLine(); // name
        fullName[2]=reader.readLine(); // middlename

        getInitialsAndSurname(fullName);
        getName(fullName);
        getFirstMiddleLastName(fullName);
        }
        public static void getName(String[]arr){
           String name=arr[1];
            System.out.println(name);
        }
        public static void getFirstMiddleLastName(String[]arr){
            String different = arr[1] + " " +arr[2]+ " " + arr[0];
            System.out.println(different);
        }
        public static void getInitialsAndSurname(String[] fullname){
            String surname = fullname[0];
            String initials = fullname[1].charAt(0) + "." + fullname[2].charAt(0)+ " ";
            System.out.println(surname + " " + initials);
        }
}




