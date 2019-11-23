package task2;

public abstract class Staff extends Person {

    private static final String TYPE_PERSON = "STAFF";

    public static String getTypePerson() {
        return TYPE_PERSON;
    }

    @Override
    public void print() {
        System.out.println(getTypePerson() + " "+ getName()+ " "+ getSalary());
            }

    public Staff(String name,String TYPE_PERSON) {
        super(name,TYPE_PERSON);
    }
    public abstract int getSalary();

}
