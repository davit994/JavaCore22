package homework.employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[10];
    private int size = 0;

    public void add(Employee value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Employee[] newArray = new Employee[array.length + 10];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public void searchByID(String empID) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().contains(empID)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("employee ID " + empID + " not found");
        }
    }

    public void searchByCompanyName(String compName) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getCompany().contains(compName)) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("company " + compName + " not found");
        }
    }


    public void searchBySalaryRange(double salaryRange1, double salaryRange2) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getSalary() >= salaryRange1 && employee.getSalary() <= salaryRange2) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("salary from " + salaryRange1 + "to" + salaryRange2 + " not found");
        }
    }

    public void changeEmployeePositionByID(String employeeId, String newPosition) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().contains(employeeId)) {
                found = true;
                employee.setPosition(newPosition);
            }
        }
        if (!found) {
            System.out.println("employee ID " + employeeId + " not found");
        }
    }

    public void printActiveEmployee() {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.isActive()) {
                found = true;
                System.out.println(employee);
            }
        }
        if (!found) {
            System.out.println("there is no active employee");
        }
    }

    public void inactiveEmployeeByID(String checkID) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().equals(checkID)) {
                employee.setActive(false);
                found = true;
            }
        }
        if (!found) {
            System.out.println("employee ID " + checkID + " not found");
        }
    }

    public void activateEmployeeByID(String searchID) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getEmployeeID().equals(searchID) && !employee.isActive()) {
                employee.setActive(true);
                found = true;
            }
        }
        if (!found) {
            System.out.println("employee ID " + searchID + " not found");
        }
    }


}