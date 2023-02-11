package homework.employee;

import java.util.Scanner;

public class EmployeeDemo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employee");
            System.out.println("Please input 3 for search employee by employee ID");
            System.out.println("Please input 4 for search employee by company name");

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
                    int salary = Integer.parseInt(salaryStr);
                    Employee employee = new Employee(name, surname, employeeID, salary, company, position);
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
                default:
                    System.out.println("Wrong command. Please try again");
            }
        }
    }
}
