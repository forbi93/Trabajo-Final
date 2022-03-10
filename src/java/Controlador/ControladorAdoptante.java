/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.Adoptante;
import ModeloDAO.AdoptanteDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet(name = "ControladorAdoptante", urlPatterns = {"/ControladorAdoptante"})
public class ControladorAdoptante extends HttpServlet {
    
    String listar="vistas/listar3.jsp";
    String add="vistas/add3.jsp";
    String edit="vistas/edit3.jsp";
    Adoptante a=new Adoptante();
    AdoptanteDAO dao=new AdoptanteDAO();
    int Codigo;

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso=listar;            
        }else if(action.equalsIgnoreCase("add")){
            acceso=add;
        }
        else if(action.equalsIgnoreCase("Agregar")){
            String idusuarioi=request.getParameter("txtUsuario");
            String nombre=request.getParameter("txtNombre");
            String apellido=request.getParameter("txtApellido");
            String edad=request.getParameter("txtEdad");
            String sexo=request.getParameter("txtSexo");
            String categoria=request.getParameter("txtCate");
            String sueldo=request.getParameter("txtSueldor");
            String iddistrito=request.getParameter("txtDistri");
            String dni=request.getParameter("txtDni");
          
            a.setIdusuario(idusuarioi);
            a.setNombre(nombre);
            a.setApellido(apellido);
            a.setEdad(edad);
            a.setSexo(sexo);
            a.setCategoria(categoria);
            a.setSueldo(sueldo);
            a.setIddistrito(iddistrito);
            a.setDni(dni);
            
            dao.add(a);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idado",request.getParameter("Codigo"));
            acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            Codigo=Integer.parseInt(request.getParameter("txtCodigo"));
            String idusuarioi=request.getParameter("txtUsuario");
            String nombre=request.getParameter("txtNombre");
            String apellido=request.getParameter("txtApellido");
            String edad=request.getParameter("txtEdad");
            String sexo=request.getParameter("txtSexo");
            String categoria=request.getParameter("txtCate");
            String sueldo=request.getParameter("txtSueldor");
            String iddistrito=request.getParameter("txtDistri");
            String dni=request.getParameter("txtDni");
            a.setCodigo(Codigo);
            a.setIdusuario(idusuarioi);
            a.setNombre(nombre);
            a.setApellido(apellido);
            a.setEdad(edad);
            a.setSexo(sexo);
            a.setCategoria(categoria);
            a.setSueldo(sueldo);
            a.setIddistrito(iddistrito);
            a.setDni(dni);
            dao.edit(a);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            Codigo=Integer.parseInt(request.getParameter("Codigo"));
            a.setCodigo(Codigo);
            dao.eliminar(Codigo);
            acceso=listar;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
       
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

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
