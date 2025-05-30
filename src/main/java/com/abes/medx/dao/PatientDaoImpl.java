package com.abes.medx.dao;

import com.abes.medx.dto.PatientDTO;
import com.abes.medx.util.CollectionUtil;

public class PatientDaoImpl implements PatientDAO {

    // Logic to retrieve patient ID based on first and last name
    @Override
    public String showProfile(String firstName) {
        return CollectionUtil.patientMap.values().stream()
                .filter(patient -> patient.getFirstName().equalsIgnoreCase(firstName))
                .findFirst()
                .map(PatientDTO::toString)
                .orElse("Patient not found");
    }

    // Logic to book an appointment
    @Override
    public void bookAppointment(String patientId, String doctorId, String appointmentDate, String appointmentTime) {

    }

    // Logic to cancel an appointment
    @Override
    public void cancelAppointment(String patientId, String appointmentId) {
        
    }

    // Logic to retrieve appointment details
    @Override
    public String getAppointmentDetails(String patientId, String appointmentId) {
        return null;
    }

    // Logic to retrieve patient history
    @Override
    public String getPatientHistory(String patientId) {
        return null;
    }

    // Logic to process payment
    @Override
    public void makePayment(String patientId, String paymentMethod, double amount) {

    }
    
}
