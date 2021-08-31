package com.project2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project2.entity.Student;
import com.project2.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
    private StudentRepository repository;
	
	
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public List<Student> saveStudents(List<Student> students) {
        return repository.saveAll(students);
    }

    public List<Student> getStudents() {
        return repository.findAll();
    }

    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }
    public Student getStudentByEmail(String email) {
        return repository.findByEmail(email);
    }

    public String deleteStudent(int id) {
        repository.deleteById(id);
        return "Student removed !! " + id;
    }

    public Student updateStudent(Student student) {
        Student existingStudent = repository.findByEmail(student.getEmail());
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setPhno(student.getPhno());
        existingStudent.setGrade(student.getGrade());
        //existingStudent.setCourse(student.getCourse());
        existingStudent.setPass(student.getPass());

        return repository.save(existingStudent);
    }
}
