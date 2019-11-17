import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Error {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number of HTTP error, please");
        int input = Integer.parseInt(bufferedReader.readLine());
        switch (input) {
            case 400:
                System.out.println("HTTP Error name is " + HTTPError.BAD_REQUEST); break;
            case 401:
                System.out.println("HTTP Error name is " + HTTPError.UNAUTHORIZED); break;
            case 402:
                System.out.println("HTTP Error name is " + HTTPError.PAYMENT_REQUIRED); break;
            case 403:
                System.out.println("HTTP Error name is " + HTTPError.FORBIDDEN); break;
            case 404:
                System.out.println("HTTP Error name is " + HTTPError.NOT_FOUND); break;
            case 405:
                System.out.println("HTTP Error name is " + HTTPError.METHOD_NOT_ALLOWED); break;
            case 406:
                System.out.println("HTTP Error name is " + HTTPError.NOT_ACCEPTABLE); break;
            case 407:
                System.out.println("HTTP Error name is " + HTTPError.PROXY_AUTHENTICATION_REQUIRED); break;
            case 408:
                System.out.println("HTTP Error name is " + HTTPError.REQUEST_TIMEOUT); break;
            case 409:
                System.out.println("HTTP Error name is " + HTTPError.CONFLICT); break;
            case 410:
                System.out.println("HTTP Error name is " + HTTPError.GONE); break;
            default:
                System.out.println("You entered invalid number! ");
        }
        }

    }