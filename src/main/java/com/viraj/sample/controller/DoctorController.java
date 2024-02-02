package com.viraj.sample.controller;

import com.viraj.sample.entity.Doctor;
import com.viraj.sample.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doctor/")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping(path = "/hello")
    public String getMessage() {
        return "Hello boot";
    }

    @PostMapping("/save")
    public Doctor saveDoctor(@RequestBody Doctor doctor) {

        return doctorService.saveDoctor(doctor);
    }

    @PutMapping("/update")
    public Doctor updateDoctor(@RequestBody Doctor doctor) {
        return doctorService.updateDoctor(doctor);
    }

    @GetMapping("/getall")
    public List<Doctor> getAllDoctor() {
        return doctorService.getAllDoctor();
    }

    @GetMapping("/getone/{doctorId}")
    public Optional<Doctor> getDoctor(@PathVariable(name = "doctorId") Long doctorId) {
        return doctorService.getDoctor(doctorId);
    }

    @DeleteMapping("/delete/{doctorId}")
    public String deleteDoctor(@PathVariable(name = "doctorId") Long doctorId) {
        doctorService.deleteDoctor(doctorId);
        return "Deleted Successfully";
    }
}
