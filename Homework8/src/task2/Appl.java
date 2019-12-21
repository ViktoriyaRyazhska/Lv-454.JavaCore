package task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Appl {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int start = 1;
        int end = 100;
        for (int i = 0; i < 10; i++) {
            int num = readNumber(start, end, reader);
            start = num;
        }
    }

    public static int readNumber(int start, int end, BufferedReader reader) {
        int number;
        System.out.println("Input number please ");
        try {
            number = Integer.parseInt(reader.readLine());
            if (number > start && number < end) {
                return number;
            } else {
                throw new MyException();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return 0-;
    }
}




