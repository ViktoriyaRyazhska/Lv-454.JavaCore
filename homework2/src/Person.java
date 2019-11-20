
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;


public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getBirthYear() {
        return birthYear;
    }
    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Person() {}

    public void changeName(String firstName,String lastName){
    this.firstName = firstName;
    this.lastName = lastName;
    }

    public  int getAge(){
        int year = LocalDate.now().getYear();
        return year - this.birthYear;

    }
    public void input() throws IOException {
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter first name");
        this.firstName = br.readLine();
        System.out.println("Enter last name");
        this.lastName = br.readLine();
        System.out.println("Enter year your birth");
        this.birthYear = Integer.parseInt(br.readLine());
    }

    public void print() {
        System.out.println("Person " + firstName + " " +  lastName + " " + birthYear + " year of birth");
    }
    public static void main(String[] args) throws IOException {

        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person();

        person1.input();
        person1.print();
        person1.getAge();
        System.out.println("You are " + person1.getAge() + " years old");
        person1.changeName("Julia"," Gorova");
        person1.print();

        person2.input();
        person2.print();
        person2.getAge();
        System.out.println("You are " + person2.getAge() + " years old");
        person2.changeName("Orest", " Palamar");
        person2.print();

        person3.input();
        person3.getAge();
        person4.getAge();
        person5.getAge();
    }
}
