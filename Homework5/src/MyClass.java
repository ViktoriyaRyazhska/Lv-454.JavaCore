public class MyClass {
    public static void main(String[] args) {
        Bird[] br = new Bird[4];
        br[0] = new Eagle("white", 5){};
        br[1] = new Swallow("blue", 10) {};
        br[2] = new Penguin("green", 13) {};
        br[3] = new Chicken("orange", 54) {};
        for (int i = 0; i < br.length; i++) {
            br[i].fly();
            
        }
        for (int i = 0; i < br.length; i++) {
            System.out.println(br[i]);
            
        }

    }
}
