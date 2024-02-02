package com.viraj.sample.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Doctor_appoint")
public class Doctor {
    @Id
    @Column(name = "doc_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long doctorId;

    @Column(name = "doc_NAME")
    private String doctorName;

    @Column(name = "doc_DESCRIPTION")
    private String doctorDescription;

    @Column(name = "doc_SALARY")
    private int doctorSalary;
    public Doctor() {
    }
    public Doctor(String doctorName, String doctorDescription, int doctorSalary) {
        this.doctorName = doctorName;
        this.doctorDescription = doctorDescription;
        this.doctorSalary = doctorSalary;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getDoctorDescription() {
        return doctorDescription;
    }

    public void setDoctorDescription(String doctorDescription) {
        this.doctorDescription = doctorDescription;
    }

    public int getDoctorSalary() {
        return doctorSalary;
    }

    public void setDoctorSalary(int doctorSalary) {
        this.doctorSalary = doctorSalary;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", doctorDescription='" + doctorDescription + '\'' +
                ", doctorSalary=" + doctorSalary +
                '}';
    }
}
