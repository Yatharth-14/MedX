package com.abes.medx.dao;

public interface PatientDAO {
    /**
     * Retrieves the patient data based on the first name
     * @param firstName The first name of the patient.
     * @return The patient details if found, otherwise null.
     */
    public String showProfile(String firstName);

    
    public void bookAppointment(String patientId, String doctorId, String appointmentDate, String appointmentTime);

    public void cancelAppointment(String patientId, String appointmentId);

    public String getAppointmentDetails(String patientId, String appointmentId);

    public String getPatientHistory(String patientId);

    public void makePayment(String patientId, String paymentMethod, double amount);

}


