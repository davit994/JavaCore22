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
}
