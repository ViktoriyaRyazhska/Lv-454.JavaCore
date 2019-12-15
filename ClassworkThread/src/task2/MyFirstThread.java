package task2;

public class MyFirstThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello, world");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
  }

