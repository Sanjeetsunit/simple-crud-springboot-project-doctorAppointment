package com.viraj.sample.service;

import com.viraj.sample.entity.Doctor;

import java.util.List;
import java.util.Optional;

public interface DoctorService {

    Doctor saveDoctor(Doctor doctor);
    Doctor updateDoctor(Doctor doctor);
    List<Doctor> getAllDoctor();
    Optional<Doctor> getDoctor(Long doctorId);
    void deleteDoctor(Long doctorId);
}
