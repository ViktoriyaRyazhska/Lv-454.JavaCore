package task1;

public class Appl1 {
    public static void main(String[] args) {
        Animal[] an = new Animal[4];
        an[0] = new Cat();
        an[1] = new Dog();
        an[2]= new Cat();
        an[3]= new Dog();
        for (int i = 0; i < an.length; i++) {
         System.out.println(an[i].feed());
         System.out.println(an[i].voice());
            //System.out.println(an[i]);
        }
       // System.out.println(Arrays.toString(an));
    }
}
