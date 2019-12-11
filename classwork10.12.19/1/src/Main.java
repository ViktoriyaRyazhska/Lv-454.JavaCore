import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        try{ Plant pl = new Plant("roses", "red", 5);
            System.out.println(pl);
        } catch (ColorException | TypeException e) {
            System.err.println(e.getMessage() + "\n");
        }
    }
}
