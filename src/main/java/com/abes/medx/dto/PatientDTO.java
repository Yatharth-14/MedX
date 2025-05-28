package com.abes.medx.dto;

import java.util.Objects;

public class PatientDTO extends UserDTO{
    String patientId;

    public PatientDTO(String firstName, String lastName, String email, String phoneNumber, String age, String patientId) {
        super(firstName, lastName, email, phoneNumber, age);
        getPatientId();
    }

    public String getPatientId() {
        return patientId;
    }
    public void setPatientId(String patientId) {
        this.patientId = patientId;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId='" + patientId + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", age='" + getAge() + '\'' +
                '}';
    }

    
@Override
public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof PatientDTO)) return false;
    if (!super.equals(o)) return false; // Check superclass fields

    PatientDTO that = (PatientDTO) o;
    return Objects.equals(getPatientId(), that.getPatientId()) &&
            Objects.equals(getFirstName(), that.getFirstName()) &&
            Objects.equals(getLastName(), that.getLastName()) &&
            Objects.equals(getEmail(), that.getEmail()) &&
            Objects.equals(getPhoneNumber(), that.getPhoneNumber()) &&
            Objects.equals(getAge(), that.getAge());
}

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (patientId != null ? patientId.hashCode() : 0);
        return result;
    }

}
