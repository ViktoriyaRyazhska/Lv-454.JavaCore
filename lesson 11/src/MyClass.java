import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//4,6
public class MyClass {
    public static void main(String[] args) throws IOException {
        MyClass myclass = new MyClass();
        System.out.println(myclass.text());
    }

    private int text() throws IOException {
        int count = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ведіть речення: ");
        String k = br.readLine();
        Pattern pattern = Pattern.compile("[аиюйеуі]", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(k);
        while (matcher.find()){
//        for (int i = 0; i < k.length() ; i++) {


            count++;
        }

        return count;
    }


//    public int text(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Ведіть речення: ");
//        int k = Integer.parseInt(br.readLine());
//        String[] arr = new String[k];
//        char[] mass = {'а','е','у','ю','й','и'};
//
//        int index = 0;
//        for(int i = 0; i < k; i++)
//            arr[i] = br.readLine();
//
//        for (int x = 0; x < k ; x++) {
//            for (int z = 0; z < arr[x].length() ; z++) {
//                for (int y = 0; y < mass.length ; y++) {
//                    if(mass[y] == arr[x].charAt(z)){
//                        index++;
//                    }
//                }
//                System.out.println(index + " ");
//                index = 0;
//            }
//        }
//        return index;
//    }

}
