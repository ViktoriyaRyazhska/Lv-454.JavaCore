public abstract class Persone {
    public String name;
    public final String TYPE_PERSONE="PERSONE";


    public String getTYPE_PERSONE() {
        return TYPE_PERSONE;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Persone(String name, String TYPE_PERSONE){
        this.name=name;
    }
    public abstract void print();

}
