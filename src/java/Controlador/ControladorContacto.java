/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Contacto;
import ModeloDAO.ContactoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author User
 */
public class ControladorContacto extends HttpServlet{
    String listar="vistas/listar1.jsp";
    String add="vistas/add1.jsp";
    String edit="vistas/edit1.jsp";
    Contacto c=new Contacto();
    ContactoDAO dao=new ContactoDAO();
    String Codigo;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Controlador</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controlador at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }


    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String acceso="";
        String action=request.getParameter("accion");
        if(action.equalsIgnoreCase("listar")){
            acceso=listar;          
            
        }else if(action.equalsIgnoreCase("add")){
            acceso=add;
        }
        else if(action.equalsIgnoreCase("Agregar")){          
            String idadoptante=request.getParameter("txtAdoptante");
            String idencargado=request.getParameter("txtEncargado");
            String celular=request.getParameter("txtTelefono");
            String correo=request.getParameter("txtCorreo");
            String mensaje=request.getParameter("txtMensaje");            
            c.setIdadoptante(idadoptante);
            c.setIdencargado(idencargado);
            c.setCelular(celular);
            c.setCorreo(correo);
            c.setMensaje(mensaje);
            dao.add(c);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idcont",request.getParameter("Codigo"));
            acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            Codigo=String.valueOf(request.getParameter("txtCodigo"));
            String idadoptante=request.getParameter("txtAdoptante");
            String idencargado=request.getParameter("txtEncargado");
            String celular=request.getParameter("txtTelefono");
            String correo=request.getParameter("txtCorreo");
            String mensaje=request.getParameter("txtMensaje");
            c.setCodigo(Codigo);
            c.setIdadoptante(idadoptante);
            c.setIdencargado(idencargado);
            c.setCelular(celular);
            c.setCorreo(correo);
            c.setMensaje(mensaje);
            dao.edit(c);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            Codigo=String.valueOf(request.getParameter("Codigo"));
            c.setCodigo(Codigo);
            dao.eliminar(Codigo);
            acceso=listar;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);
    }

    
 @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    
}
