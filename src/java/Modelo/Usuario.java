
package Modelo;


public class Usuario {
     String Codigo;
     String roll;
     String contraseña;

    public Usuario() {
    }

    public Usuario(String Codigo, String roll, String contraseña) {
        this.Codigo = Codigo;
        this.roll = roll;
        this.contraseña = contraseña;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
     
     

    
    
}
