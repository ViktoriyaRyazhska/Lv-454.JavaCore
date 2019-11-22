public class Teacher extends Staff {
    private static final String TYPE_PERSON = "TEACHER";

    public static void main(String[] args) {
        Teacher teacher = new Teacher("Sarahman","TEACHER");
        Teacher teacher1 = new Teacher("Vernikov","TEACHER");
        Teacher teacher2 = new Teacher("Kulibin","TEACHER");
        teacher2.print();
    }
    public Teacher(String name,String TYPE_PERSON) {
        super(name,TYPE_PERSON);
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }
    public static String getTypePerson() {
        return TYPE_PERSON;
    }
    @Override
    public int getSalary() {
        return 1000;
    }
    @Override
    public void print() {
        //System.out.println(getName()+" " + getTypePerson() + " "+ getSalary());
        System.out.println(getTypePerson() + " "+" "+getName());
    }
}
