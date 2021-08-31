package com.project2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "Student_Table")
public class Student {
	 @Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int stuId;
	private String firstName;
	private String lastName;
	private String email;
	private long phno;
	private int grade;
	private String course;
	private String pass;

}
