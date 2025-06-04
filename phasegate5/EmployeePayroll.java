import java.util.Scanner;

public class EmployeePayrollCopy{
public static void main(String[] args){

Scanner input = new Scanner(System.in);


while(true){
String message = """
Welcome to Semicolon Employee Payroll

press 1 to Add Employee Payroll
press 2 to View Employee Payroll
press 3 to Update Employee Payroll
press 4 to exit
""";

System.out.print(message);
int choice = input.nextInt();

switch(choice){
case 1:
message = """
Add Employee's Information
""";

System.out.print(message);
System.out.print("Enter employee's name: ");
String name = input.next();

System.out.print("Number of hours work in a week: ");
int hours = input.nextInt();

System.out.print("Enter hourly pay rate: ");
double payRate = input.nextDouble();

System.out.print("Enter federal tax withholding rate: ");
double ftaxRate = input.nextDouble();

System.out.println("Enter state tax withholding rate: ");
double staxRate = input.nextDouble();
EmployeePayrollFunction.addEmployee(name, hours, payRate, ftaxRate, staxRate);
break;

case 2:
message = """
View Employee's Information
""";

System.out.print(message);
EmployeePayrollFunction.viewEmployee();
break;

case 3:
message = """
Update Employee's Information

input a name to search for an employee
""";

System.out.print(message);
String name = input.next();
EmployeePayrollFunction.updateEmployee(name);




case 4:
message = """
Thank you... goodbye
""";

System.out.print(message);
break;

default:
System.out.println("invalid input");
}
}


}
}