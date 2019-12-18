package Task2;

public class Appl {
    public static void main(String[] args) {
        Employee[] listAllEmployees = new Employee[11];
        listAllEmployees[0] = new SalariedEmployee ("ID 100011 ","Smirnov",
                "SSN 23012345", 400);
        listAllEmployees[1] = new SalariedEmployee("ID 100010","Vaculenko",
                " SSN 24509876",1000 );
        listAllEmployees[2] = new SalariedEmployee("ID 100009","Pyrig",
                "SSN 34234567",1200);
        listAllEmployees[3] = new SalariedEmployee("ID 100003","Vaskovska",
                "SSN 231785634",1300);
        listAllEmployees[4] = new SalariedEmployee("ID 100002", "Pavlyk",
                "SSN 564123654",1500);
        listAllEmployees[5] = new SalariedEmployee("ID 100001","Gorovyj",
                "SSN 45378903 ", 5000);
        listAllEmployees[6] = new ContractEmployee("ID 100008","Maslov",
                10,30,"2773394050");
        listAllEmployees[7] = new ContractEmployee("ID 100007","Levytskyi",
                10,35,"3723394068");
        listAllEmployees[8] = new ContractEmployee("ID 100006","Dukanov",40,
                40,"3234567890");
        listAllEmployees[9] = new ContractEmployee("ID 100005","Petrenko",45,
                36,"2074578901");
        listAllEmployees[10]= new ContractEmployee("ID 100004","Shepeljuk",
                120, 36,"2081235674");

//        boolean b;
//        for (int i = 0; i < listAllEmployees.length; i++) {
//
//            if (listAllEmployees[i] instanceof Calculable) {
//                b = true;
//            } else {
//                b = false;
//            }
//        }
        Employee tmp;
        for (int i = 0; i < listAllEmployees.length - 1; i++) {
            for (int j = i + 1; j < listAllEmployees.length; j++) {
                if (((Calculable)listAllEmployees[i]).calculatePay() < listAllEmployees[j].calculatePay()) {
                    tmp = listAllEmployees[i];
                    listAllEmployees[i] = listAllEmployees[j];
                    listAllEmployees[j] = tmp;
                }
            }
        }
        for (int i = 0; i <listAllEmployees.length ; i++) {
            System.out.println(listAllEmployees[i]);
        }

    }

}
