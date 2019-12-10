public class Main {

    public static void main(String[] args) throws ArithmeticException {
Employee[] em=new Employee[4];
em[0]=new ContractEmployee("ID 100008","Maslov",
        10,30,"2773394050");
em[1]= new SalariedEmployee("ID 100000","Vasya","06543678t5",3070);
    em[2]=new ContractEmployee("ID 100004","Shepeljuk",
            120, 36,"2081235674");
    em[3]=new SalariedEmployee("ID 1000023","Nadya","02399789754",4500);
    for (int i=0;i<em.length;i++){
        System.out.println(em[i]);

    }
    }
}

