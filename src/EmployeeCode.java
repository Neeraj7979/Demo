public class EmployeeCode {
    String employeeName;
    int employeeCode;
    double salary;
    String dob;
    int age;
    public double salaryHike(double hikePercentage){
      return salary=salary+(salary*hikePercentage)/100;
    }
   public void  employeeDetails(){
       System.out.println("employeeName = " + employeeName);
       System.out.println("employeeCode = " + employeeCode);
       System.out.println("dob = " + dob);
       System.out.println("age = " + age);
   }
}

