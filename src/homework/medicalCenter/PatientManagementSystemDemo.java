package homework.medicalCenter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PatientManagementSystemDemo {
    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);
        PersonStorage personStorage = new PersonStorage();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        boolean isRun = true;
        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add doctor");
            System.out.println("Please input 2 for search doctor by profession");
            System.out.println("Please input 3 for delete doctor by id");
            System.out.println("Please input 4 for change doctor data by id");
            System.out.println("Please input 5 for add patient");
            System.out.println("Please input 6 for print all patients by doctor");
            System.out.println("Please input 7 for print today`s patients");

            String commandStr = scanner.nextLine();
            int command = Integer.parseInt(commandStr);
            switch (command) {
                case Commands.EXIT:
                    isRun = false;
                    break;
                case Commands.ADD_DOCTOR:
                    System.out.println("Please input id");
                    String id = scanner.nextLine();
                    System.out.println("Please input name");
                    String name = scanner.nextLine();
                    System.out.println("please input surname");
                    String surname = scanner.nextLine();
                    System.out.println("please input email");
                    String email = scanner.nextLine();
                    System.out.println("please input phone number");
                    String phoneNumber = scanner.nextLine();
                    System.out.println("please input profession");
                    String profession = scanner.nextLine();

                    Doctor doctor = new Doctor(id, name, surname, email, phoneNumber, profession);
                    personStorage.add(doctor);
                    System.out.println("doctor was add");
                    break;
                case Commands.SEARCH_DOCTOR_BY_PROFESSION:
                    System.out.println("please input profession");
                    String searchDoctorByProfession = scanner.nextLine();
                    personStorage.searchDoctorByProfession(searchDoctorByProfession);
                    break;
                case Commands.DELETE_DOCTOR_BY_ID:
                    System.out.println("please input ID");
                    String deleteDoctorId = scanner.nextLine();
                    personStorage.deleteDoctorByID(deleteDoctorId);
                    break;
                case Commands.CHANGE_DOCTOR_DATA_BY_ID:
                    personStorage.printDoctors();
                    System.out.println("Please select doctor's id");
                    String changeId = scanner.nextLine();
                    System.out.println("Please input name");
                    String newName = scanner.nextLine();
                    System.out.println("please input surname");
                    String newSurname = scanner.nextLine();
                    System.out.println("please input email");
                    String newEmail = scanner.nextLine();
                    System.out.println("please input phone number");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.println("please input profession");
                    String newProfession = scanner.nextLine();

                    personStorage.changeDoctorDataById(changeId, newName, newSurname, newEmail, newPhoneNumber, newProfession);
                    break;
                case Commands.ADD_PATIENT:
                    System.out.println("Please input id");
                    String patientId = scanner.nextLine();
                    System.out.println("Please input name");
                    String patientName = scanner.nextLine();
                    System.out.println("please input surname");
                    String patientSurname = scanner.nextLine();
                    System.out.println("please input phone number");
                    String patientPhone = scanner.nextLine();
                    personStorage.printDoctors();
                    System.out.println("please select doctor");
                    String patientDoctorId = scanner.nextLine();
                    System.out.println("please register date and time with format dd/MM/yyyy HH:mm:ss");
                    String patientRegisterDateTimeStr = scanner.nextLine();

                    Date registerDateTime = sdf.parse(patientRegisterDateTimeStr);
                    boolean freeDateTime = personStorage.checkIfDateIsFree(patientDoctorId, registerDateTime);
                    if (freeDateTime) {
                        Patient patient = new Patient(patientId, patientName, patientSurname, patientPhone, patientDoctorId, registerDateTime);
                        personStorage.add(patient);
                    } else {
                        System.out.println("Selected date time " + registerDateTime + " is not available.");
                    }
                    break;
                case Commands.PRINT_ALL_PATIENTS_BY_DOCTOR:
                    personStorage.printDoctors();
                    System.out.println("Please select doctor's id");
                    String printDoctorId = scanner.nextLine();
                    personStorage.printAllPatientsByDoctor(printDoctorId);
                    break;
                case Commands.PRINT_TODAYS_PATIENTS:
                    personStorage.printTodaysPatients();
                    break;
                default:
                    System.out.println("Wrong command. Please try again");
            }
        }
    }
}
