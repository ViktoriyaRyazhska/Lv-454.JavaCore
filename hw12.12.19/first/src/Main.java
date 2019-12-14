public class Main {

    public static void main(String[] args) throws InterruptedException {
Thread t1= new First();
Thread t2= new Second();
t1.start();
t1.join();
t2.start();    }
}
