package task1;

public class StudyJava  {
    public static class MyThread extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 10 ; i++) {
             System.out.println("I study java");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
      public static void main(String []args){
        Thread thread = new MyThread();
        thread.start();
    }
   }
}
