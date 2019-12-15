package task2;

public class Appl {

    public static void main(String[] args) {
        Thread thread = new MyFirstThread();
        Thread thread1 = new MySecondThread();
        thread.start();
        thread1.start();
        try {
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("My name is Oksana");
    }
}
