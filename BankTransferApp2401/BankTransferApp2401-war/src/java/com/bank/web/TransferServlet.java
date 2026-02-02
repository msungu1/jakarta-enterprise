/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package com.bank.web;

import com.bank.ejb.InsufficientFundsException;
import com.bank.ejb.TransferBean;
import jakarta.ejb.EJB;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author m.dossa
 */
public class TransferServlet extends HttpServlet {

    @EJB
    private TransferBean transferBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TransferServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TransferServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<head>");
            out.println("<title>ADSE 2401 Bank Transfer App - Account Balances</title>");
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>Account Balances Page</h1>");
            out.println("<ul>");
            out.println("<li>Account 1001: Kes." + transferBean.getAccountBalance("1001") + "</li>");
            out.println("<li>Account 1002: Kes." + transferBean.getAccountBalance("1002") + "</li>");
            out.println("<li>Account 1003: Kes." + transferBean.getAccountBalance("1003") + "</li>");
            out.println("<li>Account 1004: Kes." + transferBean.getAccountBalance("1004") + "</li>");
            out.println("<li>Account 1005: Kes." + transferBean.getAccountBalance("1005") + "</li>");
            out.println("</ul>");
            out.println("<a href='index.html'>Go to transfer form</a>");
            out.println("</html>");
            out.println("</body>");

        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html charset=UTF-8");
        String txtFromAccount = request.getParameter("txtFromAccount");
        String txtToAccount = request.getParameter("txtToAccount");
        double amount = Double.parseDouble(request.getParameter("amount"));

        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>ADSE 2401 Bank Transfer App - Funds Transfer Result</title>");
            out.println("<html>");
            out.println("<body>");
            out.println("<h1>Funds transfer results</h1>");
            try {
                transferBean.transferFunds(txtFromAccount, txtToAccount, amount);
                out.println("<p>Transfer successful!</p>");
                out.println("<p>Transferred Kes." + amount + " from account "
                        + txtFromAccount + " to account " + txtToAccount + "</p>");
                out.println("<p>New balances:</p>");
                out.println("<ul>");
                out.println("<li>Account " + txtFromAccount + ": Kes."
                        + transferBean.getAccountBalance(txtFromAccount) + "</li>");
                out.println("<li>Account " + txtToAccount + ": Kes."
                        + transferBean.getAccountBalance(txtToAccount) + "</li>");
                out.println("</ul>");
            } catch (InsufficientFundsException e) {
                out.println("<p style='color:red'>Transfer failed: " + e.getMessage() + "</p>");
            } catch (Exception e) {
                out.println("<p style='color:red'>Error: " + e.getMessage() + "</p>");
            }
            out.println("<a href='index.html>Back to transfer form</a>'");
            out.println("</html>");
            out.println("</body>");
        } catch (Exception e) {
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
