/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.dao;

import com.example.model.Student;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

/**
 *
 * @author m.dossa
 */
@Stateless
public class StudentDAO {

    @PersistenceContext(unitName = "StudentPU")
    private EntityManager em;

    public void addStudent(Student s) {
        em.persist(s);
    }

    public void updateStudent(Student s) {
        em.merge(s);
    }

    ;
    
    public Student getStudent(String Student_No) {
        return em.find(Student.class, Student_No);
    }

    public void deleteStudent(String Student_No) {
        Student s = em.find(Student.class, Student_No);
        if (s != null) {
            em.remove(s);
        }
    }

    public Student findStudent(String Student_No) {
        Student s = em.find(Student.class, Student_No);
        return s;
    }

    public List<Student> searchStudents(String keyword) {
        return em.createQuery("SELECT s FROM Student WHERE s.Student_No like : kw or s.Name like : kw", Student.class).setParameter("kw", "%" + keyword + "%").getResultList();
    }

    public List<Student> getAllStudents() {
        return em.createQuery("SELECT s FROM Student s", Student.class).getResultList();
    }

}
