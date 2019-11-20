import javax.swing.*;

public class Dog {
    private String name;
    private int age;
    private Breed breed;
	private static boolean isTheSame;

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
        Dog schnauzer = new Dog("Remmy",7, Breed.SCHNAUZER);
        Dog bulldog = new Dog("Remmy",10,Breed.BULLDOG);
        Dog[]dogs = {bobtail,schnauzer,bulldog};
        Dog oldestDog = dogs[0];
        for(int i = 1; i< dogs.length; i++){
           if (dogs[i].getAge()>oldestDog.getAge())
              oldestDog = dogs[i];
        }
        System.out.println(oldestDog.getBreed()+ " " + oldestDog.getName() + " is the oldest dog");
        

        /* Варіант  другий:
        int i = 0;
        int j = 0;
        while(i< dogs.length) {
            Dog currentDog = dogs[i];
            j = i+1;
           while(j < dogs.length) {
                if (currentDog.getName().equals(dogs[j].getName())){
                    isTheSame = true;
                    break;
                } j++;
            }
            if(isTheSame == true){
                break;
            }
            i++;
        }
        System.out.println(isTheSame);
    }      Варіант третій лишаю робочим незакоментованим */

        if (bobtail.getName().equals(schnauzer.getName())||bobtail.getName().equals(bulldog.getName())){
            System.out.println (isTheSame=true);
        }else if(schnauzer.getName().equals(bulldog.getName()) ){
            System.out.println(isTheSame=true);
        }else{
            System.out.println(isTheSame=false);
        }
    }
}







