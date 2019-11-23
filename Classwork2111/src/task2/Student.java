package task2;

public class Student extends Person {

    private static final String TYPE_PERSON = "STUDENT";

    public static void main(String[] args) {
       Student student = new Student("Chaika", "STUDENT");
       Student student1 = new Student("Antoniv","STUDENT");
       Student student2 = new Student("Boyko","STUDENT");
    }

    public Student(String name,String TYPE_PERSON) {
        super(name,TYPE_PERSON);
    }

    public static String getTypePerson() {
        return TYPE_PERSON;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public void print() {
        System.out.println(getTypePerson() + " "+" "+getName());
    }
}
