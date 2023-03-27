package com.alumini_student_management_system.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alumini_student_management_system.entity.Alumini;

public interface AluminiRepository extends JpaRepository<Alumini,Integer> 
{
	List<Alumini> findByNameContaining(String name);
	List<Alumini> findBygrdYearContaining(String grdYear);
}