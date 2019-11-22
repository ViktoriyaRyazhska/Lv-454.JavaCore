public class Cleaner extends Staff {
    private static final String TYPE_PERSON = "CLEANER";

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
    public void print() {
        System.out.println(getTypePerson() + " "+" "+getName());
    }
    public Cleaner(String name, String TYPE_PERSON) {
        super(name,TYPE_PERSON);
    }
    @Override
    public int getSalary() {
        return 400;
    }
    public static void main(String[] args) {
        Cleaner cleaner = new Cleaner("Sereda","CLEANER");
        Cleaner cleaner1 = new Cleaner("Stasiuk","CLEANER");
    }
}
