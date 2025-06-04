import java.util.ArrayList;

public class EmployeePayrollFunction{

static ArrayList <String> payroll = new ArrayList <String>();

public static ArrayList addEmployee(String name, int hours, double payrate, double ftaxRate, double staxRate){


String username = name;
int workHours = hours;
double pay = payrate;
double fed = ftaxRate / 100;
double state = staxRate / 100;

double grosspay = workHours * pay;

double federalWithholding = grosspay * fed;
double withholding = grosspay * state;
double totalDeduction = federalWithholding + withholding;
double netPay = grosspay - totalDeduction;



payroll.add(username);
payroll.add(Integer.toString(workHours));
payroll.add(Double.toString(pay));
payroll.add(Double.toString(grosspay));
payroll.add(Double.toString(federalWithholding));
payroll.add(Double.toString(withholding));
payroll.add(Double.toString(totalDeduction));
payroll.add(Double.toString(netPay));

return payroll;

}

public static ArrayList viewEmployee(){
//for(int counter = 0; counter <= 0; counter++){
//for(int count = 0; count < payroll.size(); count++){
System.out.println("Employee name: "+payroll.get(0));
System.out.println("Hours worked: "+payroll.get(1));
System.out.println("Pay Rate: "+payroll.get(2));
System.out.println("Gross Pay: "+payroll.get(3));
System.out.println("federalWithholding: "+payroll.get(4));
System.out.println("withholding: "+payroll.get(5));
System.out.println("total Deduction: "+payroll.get(6));
System.out.println("net Pay: "+payroll.get(7));


//}
//}
return payroll;
}

public static ArrayList updateEmployee(){


}



}