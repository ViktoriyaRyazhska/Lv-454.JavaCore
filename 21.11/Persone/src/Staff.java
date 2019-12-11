public abstract class Staff extends Persone {
    private static final String TYPE_PERSONE="Saff";

    public Staff(String name, String TYPE_PERSONE) {
        super(name,TYPE_PERSONE);
    }

    @Override
    public String getTYPE_PERSONE() {
        return super.getTYPE_PERSONE();
    }

    @Override
    public void print() {
        System.out.print("I am a");
    }

        public abstract int salary();
}
