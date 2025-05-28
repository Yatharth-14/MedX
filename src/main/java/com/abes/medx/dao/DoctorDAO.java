package com.abes.medx.dao;

import com.abes.medx.dto.Doctor;

import java.util.List;

public interface DoctorDAO {

    void addDoctor(Doctor doctor);
    Doctor getDoctorById(int id);
    List<Doctor> getAllDoctors();
    void updateDoctor(Doctor doctor);
    void deleteDoctor(int id);
}
