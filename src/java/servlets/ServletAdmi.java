
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
import beans.admi;

@WebServlet(name = "ServletAdmi", urlPatterns = {"/ServletAdmi"})
public class ServletAdmi extends HttpServlet {

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
        HttpSession sesionOk = request.getSession();
        sesionOk.invalidate();
        request.setAttribute("msg", "Se cerró la sesión");
        request.getRequestDispatcher("admi.jsp").forward(request, response);
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

        if (op.equals("admi")) {
            String usu = request.getParameter("txtUsuario");
            String pas = request.getParameter("txtPas");
            try {
                PreparedStatement psta = ConexionBD.getConexion()
                        .prepareStatement("select * from usuario where UsuarioID=? and Contraseña=?  and RolID=1");
                psta.setString(1, usu);
                psta.setString(2, pas);
                ResultSet rs = psta.executeQuery();

                if (rs.next()) {
                    HttpSession sesionOk = request.getSession();
                    sesionOk.setAttribute("usuario", rs.getString(1));
                    sesionOk.setAttribute("contraseña", rs.getString(2));
                    request.getRequestDispatcher("persona.jsp").forward(request, response);
                } else {
                    request.setAttribute("msg", "Error de usuario o password");
                    request.getRequestDispatcher("admi.jsp").forward(request, response);
                }
            } catch (Exception e) {

                System.out.println("Error 2: " + e);
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
