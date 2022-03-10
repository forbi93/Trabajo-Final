/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import beans.solicitud;
import utils.ConexionBD;
import java.util.ArrayList;
import java.sql.ResultSet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Usuario
 */
@WebServlet(name = "Servletadop", urlPatterns = {"/Servletadop"})
public class ServletAdop extends HttpServlet {

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
        processRequest(request, response);

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
        processRequest(request, response);
        String op = request.getParameter("op");
        if (op.equals("registrar")) {

            int sol = Integer.parseInt(request.getParameter("SoliID"));
            int enc = Integer.parseInt(request.getParameter("EncarID"));
            int ado = Integer.parseInt(request.getParameter("AdopID"));
            String can = request.getParameter("Perros");
            String men = request.getParameter("Mensaje");
            String fech = request.getParameter("Fecha");
            try {
                PreparedStatement psta = ConexionBD.getConexion().prepareStatement("insert into solicitud values(?,?,?,?,?,?)");
                psta.setInt(1, sol);
                psta.setInt(2, enc);
                psta.setInt(3, ado);
                psta.setString(4, can);
                psta.setString(5, men);
                psta.setString(6, fech);
                psta.executeUpdate();
                request.getRequestDispatcher("solicitud.jsp").forward(request, response);
            } catch (Exception e) {
            }

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
