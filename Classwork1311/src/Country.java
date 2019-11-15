import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Country {
        public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the country name, please");
        String input = bufferedReader.readLine();

        switch (input.toLowerCase()){
            case"poland":case"spain": case"syprus": case "ukraine":
                System.out.println(Continent.EUROPE); break;
            case "egypt": case "uganda": case "morocco": case "madagascar":
                System.out.println(Continent.AFRICA);break;
            case "bangladesh": case "mongolia": case" taiwan": case" india":
                System.out.println(Continent.ASIA);break;
            case "panama": case "canada":case "usa":case "mexico":
                System.out.println(Continent.NORTHAMERICA);break;
            case "uruguay":case "сhile":case "brazil":case "peru":
                System.out.println(Continent.SOUTHAMERICA);break;
            case "micronesia":    case "australia":case "fiji":case "samoa":
                System.out.println(Continent.AUSTRALIA);break;
            default:
                System.out.println("You entered an incorrect country name");
         }
    }
}
