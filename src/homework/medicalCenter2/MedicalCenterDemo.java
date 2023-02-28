package homework.medicalCenter2;

import homework.medicalCenter2.model.Doctor;
import homework.medicalCenter2.model.Patient;
import homework.medicalCenter2.model.Profession;
import homework.medicalCenter2.storage.PersonStorage;
import homework.medicalCenter2.util.DateUtil;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MedicalCenterDemo implements Commands {

    private static Scanner scanner = new Scanner(System.in);
    private static PersonStorage personStorage = new PersonStorage();

    public static void main(String[] args) {

        boolean isRun = true;

        while (isRun) {
            Commands.printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    deleteDoctorById();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printAllPatientsByDoctor();
                    break;
                case PRINT_TODAYS_PATIENTS:
                    personStorage.printTodaysPatients();
                    break;
                default:
                    System.out.println("Wrong command! ");
            }
        }
    }

    private static void printAllPatientsByDoctor() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.printAllPatientsByDoctor(doctorById);
        } else {
            System.out.println("doctor with " + doctorId + " does not exists!");
        }
    }

    private static void addPatient() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input id, name, surname, phone, registerDateTime(22-03-2023 14:00)");
            String patientDataStr = scanner.nextLine();
            String[] patientData = patientDataStr.split(",");
            try {
                Date registerDateTime = DateUtil.stringToDateTime(patientData[4]);
                if (personStorage.isDoctorAvailable(doctorById, registerDateTime)) {
                    Patient patient = new Patient();
                    patient.setId(patientData[0]);
                    patient.setName(patientData[1]);
                    patient.setSurname(patientData[2]);
                    patient.setPhoneNumber(patientData[3]);
                    patient.setDoctor(doctorById);
                    patient.setRegisterDateTime(registerDateTime);
                    personStorage.add(patient);
                    System.out.println("patient registered!");
                } else {
                    System.out.println("doctor is unavailable, please choose another time");
                }
            } catch (ParseException e) {
                System.out.println("Incorrect date time format, please try again!");
            }
        } else {
            System.out.println("doctor with " + doctorId + " does not exists!");
        }

    }

    private static void changeDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            System.out.println("Please input name, surname, phone, email, profession (" +
                    Arrays.toString(Profession.values()) + ")");
            String doctorDataStr = scanner.nextLine();
            String[] doctorData = doctorDataStr.split(",");
            doctorById.setName(doctorData[0].trim());
            doctorById.setSurname(doctorData[1].trim());
            doctorById.setPhoneNumber(doctorData[2].trim());
            doctorById.setEmail(doctorData[3].trim());
            try {
                Profession profession = Profession.valueOf(doctorData[4].trim());
                doctorById.setProfession(profession);
                System.out.println("Doctor changed!");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid value for profession");
            }
        } else {
            System.out.println("Doctor with " + doctorId + " does not exist!");
        }
    }

    private static void deleteDoctorById() {
        personStorage.printDoctors();
        System.out.println("Please choose doctor id");
        String doctorId = scanner.nextLine();
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById != null) {
            personStorage.deleteDoctorById(doctorId);
        } else {
            System.out.println("Doctor with " + doctorId + " does not exist!");
        }
    }

    private static void searchDoctorByProfession() {
        System.out.println("Please input profession");
        String profession = scanner.nextLine();
        personStorage.searchDoctorByProfession(profession);
    }

    private static void addDoctor() {

        System.out.println("Please input id, name, surname, phone, email, profession ("
                + Arrays.toString(Profession.values()) + ")");
        String doctorDataStr = scanner.nextLine();
        String[] doctorData = doctorDataStr.split(",");
        String doctorId = doctorData[0];
        Doctor doctorById = personStorage.getDoctorById(doctorId);
        if (doctorById == null) {
            Doctor doctor = new Doctor();
            doctor.setId(doctorId);
            doctor.setName(doctorData[1].trim());
            doctor.setSurname(doctorData[2].trim());
            doctor.setPhoneNumber(doctorData[3].trim());
            doctor.setEmail(doctorData[4].trim());
            try {
                Profession profession = Profession.valueOf(doctorData[5].trim());
                doctor.setProfession(profession);
                personStorage.add(doctor);
                System.out.println("Doctor added");
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid value for profession");
            }
        } else {
            System.out.println("doctor with " + doctorId + " already exists");
        }
    }


}
