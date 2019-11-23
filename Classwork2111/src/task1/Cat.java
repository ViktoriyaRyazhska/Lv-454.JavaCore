package task1;

public class Cat implements Animal {
    public static void main(String[] args) {

        Cat cat = new Cat();
        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
    }

    @Override
    public String voice() {
        return "Meow";
    }

    @Override
    public String feed() {
         return "Fish";
    }

    @Override
    public String toString() {
        return voice() + " " + feed();
    }
}
