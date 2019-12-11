public class Student extends Persone {
    public final String TYPE_PERSONE="";
public Student(String name,String TYPE_PERSONE){
    super(name,TYPE_PERSONE);
}
    public String getTYPE_PERSONE() {
        return TYPE_PERSONE;
    }

    @Override
    public void print() {
System.out.println("I am a student");
    }

}
