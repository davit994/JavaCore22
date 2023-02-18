package homework.employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please input 3 for search employee by employee ID");
            System.out.println("Please input 4 for search employee by company name");
            System.out.println("Please input 5 for search employee by salary range");
            System.out.println("Please input 6 for change employee position by id");
            System.out.println("Please input 7 for print only active employees");
            System.out.println("Please input 8 for inactive employee by id");
            System.out.println("Please input 9 for activate employee by id");

            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    System.out.println("Please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("please input ID");
                    String employeeID = scanner.nextLine();
                    System.out.println("please input salary");
                    String salaryStr = scanner.nextLine();
                    System.out.println("please input company name");
                    String company = scanner.nextLine();
                    System.out.println("please input position");
                    String position = scanner.nextLine();
                    System.out.println("Please input date of birth in format dd/MM/yyyy");
                    String dobStr = scanner.nextLine();

                    int salary = Integer.parseInt(salaryStr);
                    Date dateOfBirth = sdf.parse(dobStr);
                    Date date = new Date();
                    Employee employee = new Employee(name, surname, employeeID, salary, company, position, date, dateOfBirth);
                    employee.setActive(true);
                    employeeStorage.add(employee);
                    System.out.println("employee was add");
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input employee ID");
                    String empID = scanner.nextLine();
                    employeeStorage.searchByID(empID);
                    break;
                case "4":
                    System.out.println("please input company name");
                    String compName = scanner.nextLine();
                    employeeStorage.searchByCompanyName(compName);
                    break;
                case "5":
                    System.out.println("please input salary range start");
                    String salaryRange1Str = scanner.nextLine();
                    System.out.println("please input salary range end");
                    String salaryRange2Str = scanner.nextLine();
                    double salaryRange1 = Double.parseDouble(salaryRange1Str);
                    double salaryRange2 = Double.parseDouble(salaryRange2Str);
                    employeeStorage.searchBySalaryRange(salaryRange1, salaryRange2);
                    break;
                case "6":
                    System.out.println("please input employee id");
                    String employeeId = scanner.nextLine();
                    System.out.println("please input employee position");
                    String newPosition = scanner.nextLine();
                    employeeStorage.changeEmployeePositionByID(employeeId, newPosition);
                    break;
                case "7":
                    employeeStorage.printActiveEmployee();
                    break;
                case "8":
                    System.out.println("please input ID");
                    String checkID = scanner.nextLine();
                    employeeStorage.inactiveEmployeeByID(checkID);
                    break;
                case "9":
                    System.out.println("please input ID");
                    String searchID = scanner.nextLine();
                    employeeStorage.activateEmployeeByID(searchID);
                    break;
                default:
                    System.out.println("Wrong command. Please try again");
            }
        }
    }
}
