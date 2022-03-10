
package Controlador;

import Modelo.Solicitud;
import ModeloDAO.SolicitudDAO;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ControladorSolicitud extends HttpServlet{
    
    String listar="vistas/listarSoli.jsp";
    String add="vistas/addSoli.jsp";
    String edit="vistas/editSoli.jsp";
    Solicitud sol=new Solicitud();
    SolicitudDAO dao=new SolicitudDAO();
    String solicitudID;
    
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
            String solicitudID=request.getParameter("txtsolicitudID");
            String encargadoID=request.getParameter("txtencargadoID");
            String adoptanteID=request.getParameter("txtadoptanteID");
            String mensaje=request.getParameter("txtmensaje");
            String fecha=request.getParameter("txtfecha");              
            sol.setSolicitudID(solicitudID);
            sol.setEncargadoID(encargadoID);
            sol.setAdoptanteID(adoptanteID);
            sol.setMensaje(mensaje);
            sol.setFecha(fecha);            
            dao.add(sol);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idsol",request.getParameter("solicitudID"));
            acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            solicitudID=String.valueOf(request.getParameter("txtsolicitudID"));          
            
            
            String encargadoID=request.getParameter("txtencargadoID");
            String adoptanteID=request.getParameter("txtadoptanteID");
            String mensaje=request.getParameter("txtmensaje");
            String fecha=request.getParameter("txtfecha");  
            sol.setSolicitudID(solicitudID);
            sol.setEncargadoID(encargadoID);
            sol.setAdoptanteID(adoptanteID);
            sol.setMensaje(mensaje);
            sol.setFecha(fecha);            
            dao.add(sol);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            solicitudID=String.valueOf(request.getParameter("solicitudID"));
            
            sol.setSolicitudID(solicitudID);
            dao.eliminar(solicitudID);
            acceso=listar;
        }
        RequestDispatcher vista=request.getRequestDispatcher(acceso);
        vista.forward(request, response);        
    }
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
   
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
