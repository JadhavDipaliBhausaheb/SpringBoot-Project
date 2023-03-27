package com.alumini_student_management_system;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alumini_student_management_system.entity.Alumini;
import com.alumini_student_management_system.repository.AluminiRepository;

@SpringBootApplication
public class AluminiManagementSystemApplication implements CommandLineRunner {
	
	@Autowired
	private AluminiRepository aluminiRepository;

	public static void main(String[] args) {
		SpringApplication.run(AluminiManagementSystemApplication.class, args);
	}
	
	@Override
	public void run(String... args ) throws Exception{
		
		
		Alumini a1 = Alumini.builder().name("Dipali").phone("9356596149").email("xyz@gmail.com").grdYear("2022").build();
		Alumini a2 = Alumini.builder().name("Pratik").phone("9356596178").email("acd@gmail.com").grdYear("2023").build();
		Alumini a3 = Alumini.builder().name("Pallavi").phone("9356589149").email("hjk@gmail.com").grdYear("2022").build();
		Alumini a4 = Alumini.builder().name("Moin").phone("9389596149").email("bnj@gmail.com").grdYear("2021").build();
		Alumini a5 = Alumini.builder().name("Akshay").phone("9356597949").email("jkl@gmail.com").grdYear("2023").build();
		
		aluminiRepository.save(a1);
		aluminiRepository.save(a2);
		aluminiRepository.save(a3);
		aluminiRepository.save(a4);
		aluminiRepository.save(a5);
		
		
		System.out.println("**********************All saved**********************");
	}

}
