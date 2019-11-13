import java.util.ArrayList;

public class Employee {
    private static double totalSum;
    private String name;
    private int rate;
    private int hours;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;

    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }

    public Employee(String name, int rate) {
        this.name = name;
        this.rate = rate;
    }

    public Employee(String name, int rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    public Employee() {
    }
    public int getSalary(){
        return getRate()*getHours();
    }
    public double getSBonuses(){
        return getSalary()*0.1;
    }

    public void changeRate(int rate){
        this.rate=rate;
    }

    @Override
    public String toString() {
        return "name " + getName();
    }
    public static double getTotalSum(ArrayList<Employee>employees) {
        for (int i = 0; i<employees.size(); i++) {
            Employee.totalSum += employees.get(i).getSalary() + employees.get(i).getSBonuses();
        }
        return Employee.totalSum;
    }
       public static void main(String[] args) {
        Employee employee1 = new Employee("Stasjuk",5,40);
        Employee employee2 = new Employee("Vaskiv",5,35);
        Employee employee3 = new Employee("Kostiv",7,25);

        System.out.println(employee1);
        employee2.getSBonuses();
        System.out.println("Bonuses " + employee2.name + " is " + employee2.getSBonuses());
        employee3.getSalary();
        employee1.changeRate(7);
        System.out.println("Salary  " + employee1.getName() + " is " + employee1.getSalary());

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        System.out.println("The total amount paid to employees  " + Employee.getTotalSum(employees) + " USD");
    }
}
