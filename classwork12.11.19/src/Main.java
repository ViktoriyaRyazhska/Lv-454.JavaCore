

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

import static java.lang.Thread.sleep;

public class Main {

    public static void main(String[] args)throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. ");
  First();
        System.out.println("2. ");
   Second();
    }
    public static void First()throws Exception{
        for (int i=0;i<10;i++){
            System.out.println("I study Java");
            sleep(1000);
        }
    }
    public static void Second()throws Exception {
        for (int i = 0; i < 10; i++) {

            try {
                sleep(200);
            } catch (InterruptedException e) {
            }
            System.out.println("Hello world");
            try {
                sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Peace in the  peace");
        }
        System.out.println("My name is..");
    }

}

