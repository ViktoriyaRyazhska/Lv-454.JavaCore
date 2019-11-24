package Task2;
public class SalariedEmployee extends Employee implements Calculable {

    private String socialSecurityNumber;
    private int salary;

    public SalariedEmployee(String employeeId, String name, String socialSecurityNumber, int salary) {
        super(employeeId, name);
        this.socialSecurityNumber = socialSecurityNumber;
        this.salary = salary;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int calculatePay() {
        return getSalary();
    }

    public SalariedEmployee(String employeeId, String name) {
        super(employeeId, name);
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

    @Override
    public String toString() {
        return  getEmployeeId() + ", " + getName() +
                ", " + "salary = " + calculatePay() +
                '}';
    }
    public static void main(String[] args) {
       SalariedEmployee cleaner = new SalariedEmployee
               ("ID 100011 ","Smirnov", "SSN 23012345", 400);
       SalariedEmployee teacher = new SalariedEmployee("ID 100010","Vaculenko",
               " SSN 24509876",1000 );
       SalariedEmployee accountant = new SalariedEmployee("ID 100009","Pyrig",
               "SSN 34234567",1200);
       SalariedEmployee hrManager = new SalariedEmployee("ID 100003","Vaskovska",
               "SSN 231785634",1300);
       SalariedEmployee projectManager = new SalariedEmployee("ID 100002", "Pavlyk",
               "SSN 564123654",1500);
       SalariedEmployee director = new SalariedEmployee("ID 100001","Gorovyj",
               "SSN 45378903 ", 5000);
       SalariedEmployee[] salariedEmployees = new SalariedEmployee[]{cleaner,teacher,accountant,
               hrManager,projectManager,director};
    }
}
