package homework.medicalCenter;

import java.util.Date;

public class PersonStorage {

    private Person[] array = new Person[10];
    private int size = 0;

    public void add(Person value) {
        if (size == array.length) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Person[] newArray = new Person[array.length + 10];
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

    public void printDoctors() {
        for (int i = 0; i < size; i++) {
            if (array[i] instanceof Doctor) {
                System.out.println(array[i] + " ");
            }
        }
    }

    public void searchDoctorByProfession(String profession) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] instanceof Doctor) {
                Doctor doctor = (Doctor) array[i];
                if (doctor.getProfession().equals(profession)) {
                    found = true;
                    System.out.println(doctor);
                }
            }
        }
        if (!found) {
            System.out.println("profession " + profession + " not found");
        }
    }

    public void deleteDoctorByID(String id) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i].getId().equals(id)) {
                found = true;
                array[i] = null;
            }
        }
        if (!found) {
            System.out.println("doctor by ID " + id + " not found");
        }
    }

    public void changeDoctorDataById(String id, String name, String surname, String email, String phoneNumber, String profession) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] instanceof Doctor) {
                Doctor doctor = (Doctor) array[i];
                if (doctor.getId().equals(id)) {
                    found = true;
                    Doctor newDoctor = new Doctor(id, name, surname, email, phoneNumber, profession);
                    array[i] = newDoctor;
                }
            }
        }
        if (!found) {
            System.out.println("Doctor by ID " + id + " not found");
        }
    }

    public boolean checkIfDateIsFree(String doctorId, Date date) {
        boolean free = true;
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] instanceof Patient) {
                Patient patient = (Patient) array[i];
                if (patient.getDoctor().equals(doctorId)) {
                    found = true;
                    if (patient.getRegisterDateTime().equals(date)) {
                        free = false;
                    }
                }
            }
        }
        if (!found) {
            System.out.println("Doctor by ID " + doctorId + " not found");
        }
        return free;
    }

    public void printAllPatientsByDoctor(String doctor) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (array[i] instanceof Patient) {
                Patient patient = (Patient) array[i];
                if (patient.getDoctor().equals(doctor)) {
                    found = true;
                    System.out.println(patient);
                }
            }
        }
        if (!found) {
            System.out.println("Patients of doctor by ID " + doctor + " not found");
        }
    }

    public void printTodaysPatients() {
        boolean found = false;
        Date today = new Date();
        for (int i = 0; i < size; i++) {
            if (array[i] instanceof Patient) {
                Patient patient = (Patient) array[i];
                if (patient.getRegisterDateTime().equals(today)) {
                    found = true;
                    System.out.println(patient);
                }
            }
        }
        if (!found) {
            System.out.println("Patients with register date today not found");
        }
    }

}

