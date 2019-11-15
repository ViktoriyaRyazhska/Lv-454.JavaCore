import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Days {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number, please ");
        int day = Integer.parseInt(br.readLine());
        System.out.println(getDayName(day));
    }
        public static String getDayName(int day){
           String dayName = " ";
             switch (day){
                 case 1: dayName = "Понеділок, Monday, Montag"; break;
                 case 2: dayName = "Вівторок, Tuesday, Dienstag"; break;
                 case 3: dayName = "Середа, Wednesday, Mittwoch"; break;
                 case 4: dayName = " Четвер, Thursday, Donnerstag"; break;
                 case 5: dayName = "П'ятниця, Friday, Freitag"; break;
                 case 6: dayName = "Субота, Saturday, Samstag"; break;
                 case 7: dayName = "Неділя, Sunday, Sonntag"; break;
                 default:dayName = "Нема такого дня тижня! There is no such day of the week!" +
                         " Es gibt keinen solchen Wochentag! ";
             }
            return dayName;
        }
    }


