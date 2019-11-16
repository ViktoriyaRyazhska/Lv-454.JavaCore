import javax.swing.*;

public class Dog {
    private String name;
    private int age;
    Breed breed;

    public Dog(String name, int age, Breed breed ) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }
    public Dog() { }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Breed getBreed() {
        return breed;
    }
    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", breed=" + breed +
                '}';
    }
    public static void main(String[] args) {
        Dog bobtail = new Dog("Lora",1, Breed.BOBTAIL);
        Dog schnauzer = new Dog("Remy",7, Breed.SCHNAUZER);
        Dog bulldog = new Dog("Lora",3,Breed.BULLDOG);
        Dog[]dogs = {bobtail,schnauzer,bulldog};
        Dog oldestDog = dogs[0];
        for(int i = 1; i< dogs.length; i++){
           if (dogs[i].getAge()>oldestDog.getAge())
              oldestDog = dogs[i];
        }
        System.out.println(oldestDog.getBreed()+ " " + oldestDog.getName() + " is the oldest dog");
        boolean isTheSame = false;
        for(int i = 0; i< dogs.length; i++) {
            Dog currentDog = dogs[i];
            for (int j = i + 1; j < dogs.length; j++) {
                if (currentDog.getName().equals(dogs[j].getName())){
                    isTheSame = true;
                    break;
                }
            }
        }
        System.out.println(isTheSame);
    }
}







