import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MyClass {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        Person p1 = new Person("Vasya", 1985);

        Person p2 = new Person("Vlad", 1986);

        Person p3 = new Person("Olga", 1990);

        Person p4 = new Person("Oleg", 1978);

        Person p5 = new Person("Dasha", 1976);


        System.out.println(p1);
        String Information1 = br.readLine();
        System.out.println(Information1);
        System.out.println(p2);
        String Information2 = br.readLine();
        System.out.println(Information2);
        System.out.println(p3);
        String Information3 = br.readLine();
        System.out.println(Information3);
        System.out.println(p4);
        String Information4 = br.readLine();
        System.out.println(Information4);
        System.out.println(p5);
        String Information5 = br.readLine();
        System.out.println(Information5);
    }
}
