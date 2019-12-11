public class Cleaner extends Staff {
    public final String TYPE_PERSONE="Cleaner";
    public Cleaner(String name, String TYPE_PERSONE){
        super(name,TYPE_PERSONE);
    }

    public String getTYPE_PERSONE() {
        return TYPE_PERSONE;
    }

    @Override
    public void print() {
        super.print();
        System.out.println(" cleaner.");
    }

    @Override
    public int salary() {
        System.out.print("I have salary ");
        return 1500;
    }
}
