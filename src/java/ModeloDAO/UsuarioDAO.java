
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD;
import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class UsuarioDAO implements CRUD{
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Usuario u=new Usuario();

    @Override
    public List listar() {
        ArrayList<Usuario>list=new ArrayList<>();
        String sql="select * from usuario";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Usuario usu=new Usuario();
                usu.setCodigo(rs.getString("UsuarioID"));
                usu.setRoll(rs.getString("RolID"));
                usu.setContraseña(rs.getString("Contraseña"));
                list.add(usu);
            }
        } catch (Exception e) {
        }
        return list;
    
    }

    @Override
    public Usuario list(String Codigo) {
         String sql="select * from usuario where UsuarioID="+Codigo;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                Usuario usu=new Usuario();
                u.setCodigo(rs.getString("UsuarioID"));
                u.setRoll(rs.getString("RolID"));
                u.setContraseña(rs.getString("Contraseña"));
                
            }
        } catch (Exception e) {
        }
        return u;
    
    }

    @Override
    public boolean add(Usuario usu) {
        String sql="insert into usuario(RolId, Contraseña,)values('"+usu.getRoll()+"','"+usu.getContraseña()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
   
    }

    @Override
    public boolean edit(Usuario usu) {
         String sql="update usuario set RolID='"+usu.getRoll()+"',Contraseña='"+usu.getContraseña()+"' where UsuarioID="+usu.getCodigo();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    
    }

    @Override
    public boolean eliminar(String Codigo) {
        String sql="delete from usuario where UsuarioID="+Codigo;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
     
    }
}
