package homework.medicalCenter;

import java.util.Objects;

public class Doctor extends Person {

    private String email;
    private String phoneNumber;
    private String profession;

    public Doctor() {
    }

    public Doctor(String id, String name, String surname, String email, String phoneNumber, String profession) {
        super(id, name, surname);
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.profession = profession;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Doctor doctor = (Doctor) o;
        return Objects.equals(email, doctor.email) && Objects.equals(phoneNumber, doctor.phoneNumber) && Objects.equals(profession, doctor.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, phoneNumber, profession);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", profession='" + profession + '\'' +
                '}';
    }
}
