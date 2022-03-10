
package Modelo;

public class Solicitud {    
    
    String solicitudID;
    String encargadoID;
    String adoptanteID;
    String mensaje;
    String fecha;
    
    public Solicitud(){  
    }

    public Solicitud(String solicitudID, String encargadoID, String adoptanteID, String mensaje, String fecha){        
        
        this.solicitudID = solicitudID;
        this.encargadoID = encargadoID;
        this.adoptanteID = adoptanteID;
        this.mensaje = mensaje;
        this.fecha = fecha;       
    }

    public String getSolicitudID() {
        return solicitudID;
    }

    public void setSolicitudID(String solicitudID) {
        this.solicitudID = solicitudID;
    }

    public String getEncargadoID() {
        return encargadoID;
    }

    public void setEncargadoID(String encargadoID) {
        this.encargadoID = encargadoID;
    }

    public String getAdoptanteID() {
        return adoptanteID;
    }

    public void setAdoptanteID(String adoptanteID) {
        this.adoptanteID = adoptanteID;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
    
}