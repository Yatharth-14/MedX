package com.abes.medx.dto;

import java.util.Objects;

public class DoctorDTO {

    private int id;
    private String name;
    private String specialization;
    private int yearsOfExperience;

    public DoctorDTO(int id, String name, String specialization, int yearsOfExperience) {
        getId();
        getName();
        getSpecialization();
        getYearsOfExperience();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DoctorDTO doctorDTO = (DoctorDTO) o;
        return id == doctorDTO.id && yearsOfExperience == doctorDTO.yearsOfExperience && Objects.equals(name, doctorDTO.name) && Objects.equals(specialization, doctorDTO.specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, specialization, yearsOfExperience);
    }

    @Override
    public String toString() {
        return "DoctorDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialization='" + specialization + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
