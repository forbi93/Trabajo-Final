/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import java.sql.*;
import beans.*;
import utils.ConexionBD;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;


@WebServlet(name = "ServletUser", urlPatterns = {"/ServletUser"})
public class ServletUser extends HttpServlet {

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


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
         processRequest(request, response);
        HttpSession sesionOk=request.getSession();
        sesionOk.invalidate();
        request.setAttribute("msg", "Se cerró la sesión");
        request.getRequestDispatcher("login.jsp").forward(request, response);
        
      
        
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

        if (op.equals("login")) {
            String usu = request.getParameter("txtUsuario");
            String pas = request.getParameter("txtPas");
            try {
                PreparedStatement psta = ConexionBD.getConexion()
                        .prepareStatement("select * from usuario where UsuarioID=? and RolID=2  and Contraseña=? ");
                psta.setString(1, usu);
                psta.setString(2, pas);
                ResultSet rs = psta.executeQuery();

                if (rs.next()) {
                    HttpSession sesionOk = request.getSession();
                    sesionOk.setAttribute("usuario", rs.getString(1));
                    sesionOk.setAttribute("contraseña", rs.getString(2));
                    request.getRequestDispatcher("solicitud.jsp").forward(request, response);
                } else {
                    request.setAttribute("msg", "Error de usuario o password");
                    request.getRequestDispatcher("login.jsp").forward(request, response);
                }
            } catch (Exception e) {

                System.out.println("Error 2: " + e);
            }
             }else if(op.equals("nuevo")){
            
            String usu=request.getParameter("txtUsu");
            String pas=request.getParameter("txtPas");
            try{
                PreparedStatement psta=ConexionBD.getConexion()
                        .prepareStatement("insert into usuario values(?,?,?)");
                psta.setString(1, usu);
                psta.setString(2, "2");
                psta.setString(3, pas);
                psta.executeUpdate();
                
                request.setAttribute("msg", "Usuario Registrado con Exito");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }catch(Exception e){       }
        }else if (op.equals("registrar")) {

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
