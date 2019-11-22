public class Dog implements Animal{
    public static void main(String[] args) {
           Dog dog = new Dog();
           Dog dog1 = new Dog();
           Dog dog2 = new Dog();
    }

    @Override
    public String voice() {
         return "Bow-wow";
    }
    @Override
    public String feed() {
         return "Meet";
    }
    @Override
    public String toString() {
        return voice() + " " + feed();
    }
}
