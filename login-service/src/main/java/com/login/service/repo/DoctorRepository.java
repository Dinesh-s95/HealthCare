package com.login.service.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.login.service.entity.DoctorDetails;

public interface DoctorRepository extends JpaRepository<DoctorDetails, Integer>{

}
