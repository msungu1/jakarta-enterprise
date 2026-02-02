/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author m.dossa
 */
@Entity
@Table(name = "Student")
public class Student implements Serializable {

    @Id
    @Column(name = "Student_No", nullable = false, length = 20)
    private String studentNo;

    @Column(name = "Name", nullable = false, length = 80)
    private String name;

    @Column(name = "Birthdate", nullable = false)
    private Date birthdate;

    @Column(name = "Gender", nullable = false, length = 1)
    private String gender;

    // No-argument constructor(required constuctor for JPA)
    public Student() {
    }

    /**
     * @return the Student_No
     */
    public String getStudentNo() {
        return studentNo;
    }

    /**
     * @param Student_No the Student_No to set
     */
    public void setStudentNo(String Student_No) {
        this.studentNo = Student_No;
    }

    /**
     * @return the Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.name = Name;
    }

    /**
     * @return the Gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param Gender the Gender to set
     */
    public void setGender(String Gender) {
        this.gender = Gender;
    }

    /**
     * @return the Birthdate
     */
    public Date getBirthdate() {
        return birthdate;
    }

    /**
     * @param Birthdate the Birthdate to set
     */
    public void setBirthdate(Date Birthdate) {
        this.birthdate = Birthdate;
    }

    @Override
    public String toString() {
        return String.format(
           "Student Number: %s\n"
            + "Student Name: %s\n"
            + "Student Gender: %s\n"
            + "Student Date of birth: %s\n",
          this.getStudentNo(), this.getName(), this.getGender().equalsIgnoreCase("M") ? "Male" : "Female",
          this.getBirthdate().toString());
    }

}
