package task2;

public abstract class Person {
    private String name;
    public Person(String name,String TYPE_PERSON) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public  abstract void print();

    public static String getTypePerson() {
        return TYPE_PERSON;
    }

    private static final String TYPE_PERSON = "PERSON";

    public static void main(String[] args) {

    Person[] listOfPersons = new Person[8];

    listOfPersons[0]= new Student("Chaika", "STUDENT");
    listOfPersons[1]= new Student("Antoniv","STUDENT");
    listOfPersons[2]= new Student("Boyko","STUDENT");
    listOfPersons[3]= new Teacher("Sarahman","TEACHER");
    listOfPersons[4] = new Teacher("Vernikov","TEACHER");
    listOfPersons[5] = new Teacher("Kulibin","TEACHER");
    listOfPersons[6] = new Cleaner("Sereda","CLEANER");
    listOfPersons[7] = new Cleaner("Stasiuk","CLEANER");

    for (int i = 0; i < listOfPersons.length; i++) {
            listOfPersons[i].print();
        }
        boolean b;
        for (int i = 0; i < listOfPersons.length; i++) {

        if ( listOfPersons[i] instanceof Staff ){
            b = true;
        }else{
            b = false;
        }
        System.out.println(  b + " " + listOfPersons[i].getName()+ " "+ listOfPersons[i].getClass());
        }
        Staff staff = (Staff) new Teacher("Sarahman","TEACHER");
        Staff staff1 = (Staff) new Teacher ("Vernikov", "TEACHER");
        Staff staff2 = (Staff) new Teacher("Kulibin", "TEACHER");
        Staff staff3 = (Staff) new Cleaner("Sereda","CLEANER");
        Staff staff4 = (Staff) new Cleaner("Stasiuk","CLEANER");
        Staff[] listOfStaff = new Staff[5];
        System.arraycopy(listOfPersons,3, listOfStaff,0,5 );
        for (int i = 0; i < listOfStaff.length; i++) {
            listOfStaff[i].getSalary();
            System.out.println(listOfStaff[i].getTypePerson() + " " + listOfStaff[i].getName() +  " "
                    + listOfStaff[i].getSalary());
        }
        }
    }


