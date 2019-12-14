import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println(enterText());
        System.out.println("------------------------------------------------------");
        EnterSur();
        System.out.println("------------------------------------------------------");
    }
    public static boolean enterText(){
        String text1="IT";
        String text2="IT Academy";
        Pattern p = Pattern.compile(text1);
        Matcher m=p.matcher(text2);
        while(m.find()){
            return true;
        }
        return false;
    }
    public static String[] EnterSur(){
        String pattern[] ;
        String text="Ivanishyn Roman Petrovich";
       pattern=  text.split(" ");
        System.out.println("Surename and initials: "+text);
        System.out.println("Surename: "+pattern[0]);
        System.out.println("Name: "+pattern[1]);
        System.out.println("Middle name: "+pattern[2]);
       return  pattern;
    }
public static void UsName(Scanner sc){
        String name="Vasya";

}
}
