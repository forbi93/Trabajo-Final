
package Controlador;

import Modelo.Mascota;
import ModeloDAO.MascotaDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 
 */
public class ControladorMascota extends HttpServlet {
    
    String listar="vistas/listar2.jsp";
    String add="vistas/add2.jsp";
    String edit="vistas/edit2.jsp";
    Mascota m=new Mascota();
    MascotaDAO dao=new MascotaDAO();
    String Codigo;

  
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
            String estado=request.getParameter("txtEstado");
            String nombre=request.getParameter("txtNombre");
            String raza=request.getParameter("txtRaza");
            String tamaño=request.getParameter("txtTamaño");
            String edad=request.getParameter("txtEdad");  
            String peso=request.getParameter("txtPeso");
            String color=request.getParameter("txtColor");
            String sexo=request.getParameter("txtSexo");
            String dispo=request.getParameter("txtDispo"); 
            m.setEstado(estado);
            m.setNombre(nombre);
            m.setRaza(raza);
            m.setTamaño(tamaño);
            m.setEdad(edad);
            m.setPeso(peso);
            m.setColor(color);
            m.setSexo(sexo);
            m.setDispo(dispo);
            dao.add(m);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("editar")){
            request.setAttribute("idma",request.getParameter("Codigo"));
            acceso=edit;
        }
        else if(action.equalsIgnoreCase("Actualizar")){
            Codigo=String.valueOf(request.getParameter("txtCodigo"));          
            
            String estado=request.getParameter("txtEstado");
            String nombre=request.getParameter("txtNombre");
            String raza=request.getParameter("txtRaza");
            String tamaño=request.getParameter("txtTamaño");
            String edad=request.getParameter("txtEdad");  
            String peso=request.getParameter("txtPeso");
            String color=request.getParameter("txtColor");
            String sexo=request.getParameter("txtSexo");
            String dispo=request.getParameter("txtDispo");
            m.setCodigo(Codigo);
            m.setEstado(estado);
            m.setNombre(nombre);
            m.setRaza(raza);
            m.setTamaño(tamaño);
            m.setEdad(edad);
            m.setPeso(peso);
            m.setColor(color);
            m.setSexo(sexo);
            m.setDispo(dispo);
            dao.edit(m);
            acceso=listar;
        }
        else if(action.equalsIgnoreCase("eliminar")){
            Codigo=String.valueOf(request.getParameter("txtCodigo"));
            
            m.setCodigo(Codigo);
            dao.eliminar(Codigo);
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
