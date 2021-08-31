package com.project2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project2.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher,Integer>{
	Teacher findByEmail(String email);
}
