public class SalariedEmployee extends  Employee implements salary {
    private int salary;
    private String socialSecurityNumber;
    public SalariedEmployee(String employeeId, String name,String socialSecurityNumber,  int salary) {
        super(employeeId, name);
        this.salary = salary;
        this.socialSecurityNumber=socialSecurityNumber;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getEmployeeId() {
        return super.getEmployeeId();
    }

    @Override
    public void setEmployeeId(String employeeId) {
        super.setEmployeeId(employeeId);
    }

    public int getSalary() {
        return salary;
    }
        @Override
    public int calculatePay() {
        return salary;
    }

    @Override
    public String toString() {
        return "SalariedEmployee: "+ getEmployeeId()+", social number: "+getSocialSecurityNumber()+", name:  "+getName()+", salary: "+getSalary();
    }
}
