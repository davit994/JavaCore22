package homework.medicalCenter;

import java.util.Date;
import java.util.Objects;

public class Patient extends Person {

    private String phone;
    private String doctor;
    private Date registerDateTime;

    public Patient() {
    }

    public Patient(String id, String name, String surname, String phone, String doctor, Date registerDateTime) {
        super(id, name, surname);
        this.phone = phone;
        this.doctor = doctor;
        this.registerDateTime = registerDateTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public Date getRegisterDateTime() {
        return registerDateTime;
    }

    public void setRegisterDateTime(Date registerDateTime) {
        this.registerDateTime = registerDateTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Patient patient = (Patient) o;
        return Objects.equals(phone, patient.phone) && Objects.equals(doctor, patient.doctor) && Objects.equals(registerDateTime, patient.registerDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phone, doctor, registerDateTime);
    }

    @Override
    public String toString() {
        return "Patient{" +
                "phone='" + phone + '\'' +
                ", doctor=" + doctor +
                ", registerDateTime=" + registerDateTime +
                '}';
    }
}
