package ModeloDAO;

import Config.Conexion;
import Intefaces.CRUDSOLI;
import Modelo.Contacto;
import Modelo.Solicitud;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SolicitudDAO implements CRUDSOLI {

    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Solicitud m = new Solicitud();

    @Override
    public List listar() {
        //To change body of generated methods, choose Tools | Templates.
        ArrayList<Solicitud> list = new ArrayList<>();
        String sql = "select * from solicitud";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Solicitud sol = new Solicitud();                
                sol.setEncargadoID(rs.getString("EncargadoID"));
                sol.setAdoptanteID(rs.getString("AdoptanteID"));
                sol.setMensaje(rs.getString("Mensaje"));
                sol.setFecha(rs.getString("Fecha"));
                list.add(sol);
            }
        } catch (Exception e) {
        }
        return list;
    }

    @Override
    public Solicitud list(String solicitudID) {
        //To change body of generated methods, choose Tools | Templates.
        String sql = "select * from solicitud where SolicitudID=" + solicitudID;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Solicitud sol = new Solicitud();                
                sol.setEncargadoID(rs.getString("EncargadoID"));
                sol.setAdoptanteID(rs.getString("AdoptanteID"));
                sol.setMensaje(rs.getString("Mensaje"));
                sol.setFecha(rs.getString("Fecha"));

            }
        } catch (Exception e) {
        }
        return m;
    }

    @Override
    public boolean add(Solicitud sol) {
        //To change body of generated methods, choose Tools | Templates.        
        String sql = "insert into solicitud (EncargadoID, AdoptanteID,  Mensaje,  Fecha)values('"+sol.getEncargadoID()+"','" + sol.getAdoptanteID()+ "','" + sol.getMensaje()+ "','" + sol.getFecha()+ "')";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate(); 
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean edit(Solicitud sol) {
        //To change body of generated methods, choose Tools | Templates.
        String sql = "update solicitud set AdoptanteID='" + sol.getAdoptanteID() + "',Mensaje='" + sol.getMensaje() + "',Fecha='" + sol.getFecha();
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

    @Override
    public boolean eliminar(String solicitudID) {
        //To change body of generated methods, choose Tools | Templates.
        String sql = "delete from solicitud where SolicitudID=" + solicitudID;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        return false;
    }

}
