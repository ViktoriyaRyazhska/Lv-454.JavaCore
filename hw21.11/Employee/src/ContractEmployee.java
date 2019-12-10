public class ContractEmployee extends Employee {
   public  String federalTaxIdmember;
   private int hourlyRate;
   private int numOfhours;
   public int getHourlyRate() {
      return hourlyRate;
   }

   public void setHourlyRate(int hourlyRate) {
      this.hourlyRate = hourlyRate;
   }

   public int getNumOfhours() {
      return numOfhours;
   }

   public void setNumOfhours(int numOfhours) {
      this.numOfhours = numOfhours;
   }


   public String getFederalTaxIdmember() {
      return federalTaxIdmember;
   }

   public void setFederalTaxIdmember(String federalTaxIdmember) {
      this.federalTaxIdmember = federalTaxIdmember;
   }

   @Override
   public String getName() {
      return super.getName();
   }

   @Override
   public void setName(String name) {
      super.setName(name);
   }

   public ContractEmployee(String employeeId, String name, int hourlyRate,
                           int numOfhours, String federalTaxIdMember) {
      super(employeeId, name);
      this.hourlyRate = hourlyRate;
      this.numOfhours = numOfhours;
      this.federalTaxIdmember= federalTaxIdMember;
   }


   @Override
   public int calculatePay() {
      int salary;
      salary= hourlyRate*numOfhours;
return salary;
   }
   @Override
   public String toString() {
      return "ContractEmployee:  "+getFederalTaxIdmember()+", name: "+getName()+", salary: "+calculatePay();
   }
}
