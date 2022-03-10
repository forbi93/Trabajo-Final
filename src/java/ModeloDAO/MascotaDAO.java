
package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUD2;
import Modelo.Mascota;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class MascotaDAO implements CRUD2{
    
    Conexion cn=new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Mascota m=new Mascota();

    @Override
    public List listar() {
        ArrayList<Mascota>list=new ArrayList<>();
        String sql="select * from perro";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){
                Mascota mas=new Mascota();
                mas.setCodigo(rs.getString("PerroID"));
                mas.setEstado(rs.getString("Estado_SaludID"));
                mas.setNombre(rs.getString("Nombre"));
                mas.setRaza(rs.getString("Raza"));
                mas.setTamaño(rs.getString("Tamaño"));
                mas.setEdad(rs.getString("Edad"));
                mas.setPeso(rs.getString("Peso"));
                mas.setColor(rs.getString("Color"));
                mas.setSexo(rs.getString("Sexo"));
                mas.setDispo(rs.getString("Disponibilidad_Adopcion"));
                list.add(mas);
            }
        } catch (Exception e) {
        }
        return list;
     }

    @Override
    public Mascota list(String Codigo) {
        String sql="select * from perro where PerroID="+Codigo;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while(rs.next()){                
                Mascota mas=new Mascota();
                m.setCodigo(rs.getString("PerroID"));
                m.setEstado(rs.getString("Estado_SaludID"));
                m.setNombre(rs.getString("Nombre"));
                m.setRaza(rs.getString("Raza"));
                m.setTamaño(rs.getString("Tamaño"));
                m.setEdad(rs.getString("Edad"));
                m.setPeso(rs.getString("Peso"));
                m.setColor(rs.getString("Color"));
                m.setSexo(rs.getString("Sexo"));
                m.setDispo(rs.getString("Disponibilidad_Adopcion"));
                
            }
        } catch (Exception e) {
        }
        return m;
    }

    @Override
    public boolean add(Mascota mas) {
        String sql="insert into perro(Estado_SaludID, Nombre, Raza, Tamaño,  Edad,  Peso,  Color, Sexo,  Disponibilidad_Adopcion)values('"+mas.getEstado()+"','"+mas.getNombre()+"','"+mas.getRaza()+"','"+mas.getTamaño()+"')";
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
       return false;
      }

    @Override
    public boolean edit(Mascota mas) {
        String sql="update perro set Estado_SaludID='"+mas.getEstado()+"',Nombre='"+mas.getNombre()+"',Raza='"+mas.getRaza()+"',Tamaño='"+mas.getTamaño()+"',Edad='"+mas.getEdad()+"'Peso='"+mas.getPeso()+"'Color='"+mas.getColor()+"'Sexo='"+mas.getSexo()+"'Disponibilidad_Adopcion='"+mas.getDispo()+"' where PerroID="+mas.getCodigo();
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        return false;
    
    }
    

    @Override
    public boolean eliminar(String Codigo) {
        String sql="delete from perro where PerroID="+Codigo;
        try {
            con=cn.getConnection();
            ps=con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
      }
    
}
