
import java.util.ArrayList;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	double one,two;
	int start=1,end=10 ;
        System.out.println("Enter two double numbers, example 2,5: ");
        one=sc.nextDouble();
        two=sc.nextDouble();
        try {
            div(one, two);
        }catch (Exception e){
            System.err.println("Numbers should to be more than 0!");
        }
        try {
            readNumber(start, end,  sc);
        }catch (Exception e){
            System.err.println("This number doesn't equal to range from "+start+" to "+end+" !!");
        }
try {
    main(sc);
}catch (Exception e){
    System.err.println("Error");
}
    }
    public static void div(double one,double two) throws Exception {
double div=(one/two);
if (one<=0||two<=0){
    throw new Exception();
}
        System.out.println("Dividing= "+div);
    }
    public static int readNumber(int start,int end,Scanner sc) throws Exception{
     int numb;
        System.out.println("Enter integer number from "+start+" to "+end+" :");
        numb=sc.nextInt();
        if (numb>=start&&numb<=end){
            System.out.println(" Great: "+numb);
            return numb;
        }
        throw new Exception();

    }
public static void main(Scanner sc)throws Exception {
    int numb;
   ArrayList<Integer>s=new ArrayList<>();
    System.out.println("Enter 10 integer number: ");
    for (int i = 0; i < 10; i++) {
        numb = sc.nextInt();
       s.add(numb);
    }
    for (int i=1;i<s.size();++i) {
            if (s.get(i) <= s.get(i -1)) {
                throw new Exception();
            }
    }
}
}





