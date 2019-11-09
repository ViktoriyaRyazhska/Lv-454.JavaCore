import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HomeWork {
    public static void main (String []args) throws IOException {
        int result, result1, result2, result3;
        double l, S;
        double p = 3.14;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("Введіть радіус = ");
        int r = Integer.parseInt(br.readLine());
        l = 2*p*r;
        System.out.println("Периметер кола = " + l);
        S = p*(r*r);
        System.out.println("Площа кола = " + S);

        System.out.println("What is your name");
        String name = br.readLine();
        System.out.println("Where are you live, " + name + "?");
        String city = br.readLine();

        BufferedReader Br = new BufferedReader(new InputStreamReader(System.in));
        int c1 = Integer.parseInt(Br.readLine());
        int c2 = Integer.parseInt(Br.readLine());
        int c3 = Integer.parseInt(Br.readLine());
        int t1 = Integer.parseInt(Br.readLine());
        int t2 = Integer.parseInt(Br.readLine());
        int t3 = Integer.parseInt(Br.readLine());
        System.out.println("c1 = " + c1 + " c2 = " + c2 + " c3 = " + c3 + " t1 = " + t1 +" t2 = " + t2 +" t3 = "+ t3);
        result1 = c1*t1;
        System.out.println("c1*t1 = " + result1);
        result2 = c2*t2;
        System.out.println("c2*t2 = " + result2);
        result3 = c3*t3;
        System.out.println("c3*t3 = " + result3);
        result = (c1 * t1) + (c2 * t2) + (c3 * t3);
        System.out.println("suma = " + result);
    }
}
