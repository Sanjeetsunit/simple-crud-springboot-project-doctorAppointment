package com.viraj.sample.repository;

import com.viraj.sample.entity.Doctor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DoctorRepository extends   CrudRepository <Doctor,Long>{
}
