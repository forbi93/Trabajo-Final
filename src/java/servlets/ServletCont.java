/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import beans.Contactos;
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





@WebServlet(name = "ServletCont", urlPatterns = {"/ServletCont"})
public class ServletCont extends HttpServlet {

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
        
        
        String op=request.getParameter("op");
        
        if (op.equals("nuevo")) {
            String CON=request.getParameter("ContactoID");
            String ADO=request.getParameter("AdoptanteID");
            String EN=request.getParameter("EncargadoID");
            String CEL=request.getParameter("Celular");
            String Em=request.getParameter("Email");
            String men=request.getParameter("Mensaje");
            
            try {
                PreparedStatement psta=ConexionBD.getConexion().prepareStatement("insert into contacto values (?,?,?,?,?,?)");
                psta.setString(1,CON);
                psta.setString(2,ADO);
                psta.setString(3,EN);
                psta.setString(4,CEL);
                psta.setString(5,Em);
                psta.setString(6,men);
                psta.executeUpdate();
                   
                request.getRequestDispatcher("inicio.html").forward(request, response);
            }catch(Exception e){
            
            
            }
            
        }
        
        
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
