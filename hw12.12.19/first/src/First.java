
public class First extends Thread {
    public void run()  { for (int i=0;i<5;i++){
        System.out.println("Hello ");
        try {
        sleep(200);
    }catch (InterruptedException e){

    }
        System.out.println("world");
    }
    }
}
