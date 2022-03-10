/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD3;
import Modelo.Adoptante;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class AdoptanteDAO implements CRUD3 {
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Adoptante a=new Adoptante();

    @Override
    public List listar() {
         ArrayList<Adoptante>list=new ArrayList<>();
        String sql="select * from adoptante";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Adoptante ado=new Adoptante();
                ado.setCodigo(rs.getInt("AdoptanteID"));
                ado.setIdusuario(rs.getString("UsuarioID"));
                ado.setNombre(rs.getString("Nombres"));
                ado.setApellido(rs.getString("Apellidos"));
                ado.setEdad(rs.getString("Edad"));
                ado.setSexo(rs.getString("Sexo"));
                ado.setCategoria(rs.getString("Categoria"));
                ado.setSueldo(rs.getString("Sueldo"));
                ado.setIddistrito(rs.getString("DistritoID"));
                ado.setDni(rs.getString("DNI"));
                list.add(ado);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Adoptante list(int Codigo) {
        String sql="select * from adoptante where AdoptanteID="+Codigo;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                Adoptante ado=new Adoptante();
                a.setCodigo(rs.getInt("AdoptanteID"));
                a.setIdusuario(rs.getString("UsuarioID"));
                a.setNombre(rs.getString("Nombres"));
                a.setApellido(rs.getString("Apellidos"));
                a.setEdad(rs.getString("Edad"));
                a.setSexo(rs.getString("Sexo"));
                a.setCategoria(rs.getString("Categoria"));
                a.setSueldo(rs.getString("Sueldo"));
                a.setIddistrito(rs.getString("DistritoID"));
                a.setDni(rs.getString("DNI"));
                
            }
        } catch (Exception e) {
        }
        return a;}

    @Override
    public boolean add(Adoptante ado) {
         String sql="insert into adoptante(UsuarioID,  Nombres,  Apellidos,  Edad,  Sexo,  Categoria,  Sueldo,  DistritoID,  DNI)values('"+ado.getIdusuario()+"','"+ado.getNombre()+"','"+ado.getApellido()+"','"+ado.getEdad()+"','"+ado.getSexo()+"''"+ado.getCategoria()+"''"+ado.getSueldo()+"''"+ado.getIddistrito()+"''"+ado.getDni()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
   }

    @Override
    public boolean edit(Adoptante ado) {
         String sql="update adoptante set UsuarioID='"+ado.getIdusuario()+"',Nombres='"+ado.getNombre()+"',Apellidos='"+ado.getApellido()+"',Edad='"+ado.getEdad()+"',Sexo='"+ado.getSexo()+"',Categoria='"+ado.getCategoria()+"',Sueldo='"+ado.getSueldo()+"',DistritoID='"+ado.getIddistrito()+"',DNI='"+ado.getDni()+"' where AdoptanteID="+ado.getCodigo();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;}

    @Override
    public boolean eliminar(int Codigo) {
          String sql="delete from adoptante where AdoptanteID="+Codigo;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false; }
    
}
