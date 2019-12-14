public class Second extends Thread {
    public void run(){
        for (int i=0;i<5;i++){
            try {
                sleep(200);
            }catch (InterruptedException e){}
            System.out.println(" !!!");
        }
    }
}
