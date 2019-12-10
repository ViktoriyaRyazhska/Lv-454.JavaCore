public class Main {

    public static void main(String[] args) {
Student st=new Student("Andriy","Student");
Teacher tch=new Teacher("Nadiya","Teacher");
Cleaner cl=new Cleaner("Galya","Cleaner");
Persone[]arr={st,tch,cl};
for (int i=0;i<arr.length;i++){
arr[i].print();

}
    }
}
