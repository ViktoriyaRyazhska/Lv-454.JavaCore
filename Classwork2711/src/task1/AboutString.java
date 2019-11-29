package task1;

public class AboutString {
    public static void main(String[] args) {
        String str = "IT ACADEMY";
        String str1 = "IT";
        boolean result;
        if (str.contains(str1)) {
            result = true;
        }else{ result = false;
        }
        System.out.println(result);
    }
}
