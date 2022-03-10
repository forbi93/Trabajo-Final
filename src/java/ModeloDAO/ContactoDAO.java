
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD1;
import Modelo.Contacto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ContactoDAO implements CRUD1{
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Contacto c=new Contacto();

    @Override
    public List listar() {
        ArrayList<Contacto>list=new ArrayList<>();
        String sql="select * from contacto";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Contacto cont=new Contacto();
                cont.setCodigo(rs.getString("ContactoID"));
                cont.setIdadoptante(rs.getString("AdoptanteID"));
                cont.setIdencargado(rs.getString("EncargadoID"));
                cont.setCelular(rs.getString("Celular"));
                cont.setCorreo(rs.getString("Email"));
                cont.setMensaje(rs.getString("Mensaje"));
                list.add(cont);
            }
        } catch (Exception e) {
        }
        return list;
    
    }

    @Override
    public Contacto list(String idcontacto) {
        String sql="select * from contacto where ContactoID="+idcontacto;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                Contacto cont=new Contacto();
                c.setCodigo(rs.getString("ContactoID"));
                c.setIdadoptante(rs.getString("AdoptanteID"));
                c.setIdencargado(rs.getString("EncargadoID"));
                c.setCelular(rs.getString("Celular"));
                c.setCorreo(rs.getString("Email"));
                c.setMensaje(rs.getString("Mensaje"));
                
            }
        } catch (Exception e) {
        }
        return c;
    
    }

    @Override
    public boolean add(Contacto cont) {
        String sql="insert into contacto(AdoptanteID, EncargadoID, Celular,  Email,  Mensaje)values('"+cont.getIdadoptante()+"','"+cont.getIdencargado()+"','"+cont.getCelular()+"','"+cont.getCorreo()+"','"+cont.getMensaje()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
   
    }

    @Override
    public boolean edit(Contacto cont) {
        String sql="update contacto set AdoptanteID='"+cont.getIdadoptante()+"',EncargadoID='"+cont.getIdencargado()+"',Celular='"+cont.getCelular()+"',Email='"+cont.getCorreo()+"',Mensaje='"+cont.getMensaje()+"' where ContactoID="+cont.getCodigo();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    
    }

    @Override
    public boolean eliminar(String idcontacto) {
        String sql="delete from contacto where ContactoID="+idcontacto;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    
       
    }
    
}
