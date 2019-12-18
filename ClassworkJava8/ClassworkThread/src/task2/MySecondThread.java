package task2;

public class MySecondThread extends Thread {
    @Override
    public void run() {

        for (int i = 0; i <5 ; i++) {
            System.out.println("Peace in the peace");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
  }

