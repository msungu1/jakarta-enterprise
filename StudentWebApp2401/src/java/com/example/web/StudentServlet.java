package com.example.web;

import com.example.dao.StudentDAO;
import com.example.model.Student;
import jakarta.ejb.EJB;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;
import java.sql.Date;

/**
 *
 * @author m.dossa
 */
@WebServlet("/students")
public class StudentServlet extends HttpServlet {
    
    @EJB
    private StudentDAO dao;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        String keyword = req.getParameter("keyword");
        
        if ("edit".equals(action)) {
//            TODO MISSING FUNC IN PARENT CLASS
            Student student = dao.getStudent(req.getParameter("StudentNo"));
            req.setAttribute("student", student);
            req.getRequestDispatcher("form.jsp").forward(req, resp);
        } else {
            List<Student> students = (keyword != null ? dao.searchStudents(keyword) : dao.getAllStudents());
            req.setAttribute("students", students);
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String Student_No = req.getParameter("Student_No");
        String name = req.getParameter("Name");
        String gender = req.getParameter("Gender");
        Date birthDate = Date.valueOf(req.getParameter("Birthdate"));

        // Declare and instantiate a student object
        Student s = new Student();
        s.setStudentNo(Student_No);
        s.setName(name);
        s.setGender(gender);
        s.setBirthdate(birthDate);
        
        if (req.getParameter("update") != null) {
            dao.updateStudent(s);
        } else {
            dao.addStudent(s);
        }
        resp.sendRedirect("students");
    }
    
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String studentNo = req.getParameter("Student_No");
        dao.deleteStudent(studentNo);
        resp.sendRedirect("students");
    }
}
