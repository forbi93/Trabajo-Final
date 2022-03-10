
package Modelo;


public class Contacto {
    String Codigo;
    String idadoptante;
    String idencargado;
    String celular;
    String correo;
    String mensaje;

    public Contacto() {
    }

    public Contacto(String Codigo, String idadoptante, String idencargado, String celular, String correo, String mensaje) {
        this.Codigo = Codigo;
        this.idadoptante = idadoptante;
        this.idencargado = idencargado;
        this.celular = celular;
        this.correo = correo;
        this.mensaje = mensaje;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getIdadoptante() {
        return idadoptante;
    }

    public void setIdadoptante(String idadoptante) {
        this.idadoptante = idadoptante;
    }

    public String getIdencargado() {
        return idencargado;
    }

    public void setIdencargado(String idencargado) {
        this.idencargado = idencargado;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    
    
}
