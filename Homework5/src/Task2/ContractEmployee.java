package Task2;
public class ContractEmployee extends Employee implements Calculable {

    private  int  hourlyRate;
    private int numberOfHours;
    private String federalTaxIdMember;

    public ContractEmployee(String employeeId, String name, int hourlyRate,
                            int numberOfHours, String federalTaxIdMember) {
        super(employeeId, name);
        this.hourlyRate = hourlyRate;
        this.numberOfHours = numberOfHours;
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public String getEmployeeId() {
        return super.getEmployeeId();
    }

    @Override
    public void setEmployeeId(String employeeId) {
        super.setEmployeeId(employeeId);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

    public void setFederalTaxIdMember(String federalTaxIdMember) {
        this.federalTaxIdMember = federalTaxIdMember;
    }

    @Override
    public int calculatePay() {
    int salary;
    salary = hourlyRate*numberOfHours;
    return salary;
    }
    @Override
    public String toString() {
        return  getEmployeeId() + ", " + getName() +
                ", " + "salary = " + calculatePay() +
                '}';
    }
//    public static void main(String[] args) {
//         ContractEmployee juniorJavaDeveloper = new ContractEmployee("ID 100008","Maslov",
//                 10,30,"2773394050");
//         ContractEmployee juniorJavaDeveloper1 = new ContractEmployee("ID 100007","Levytskyi",
//                10,35,"3723394068");
//         ContractEmployee middleJavaDeveloper = new ContractEmployee("ID 100006","Dukanov",40,
//                 40,"3234567890");
//         ContractEmployee middleJavaDeveloper2 = new ContractEmployee("ID 100005","Petrenko",45,
//                36,"2074578901");
//         ContractEmployee seniorJavaDeveloper = new ContractEmployee("ID 100004","Shepeljuk",
//                 120, 36,"2081235674");
//         Employee[] contractEmployees = new Employee[]{juniorJavaDeveloper,juniorJavaDeveloper1,middleJavaDeveloper,
//                middleJavaDeveloper2,seniorJavaDeveloper};
//    }
}
