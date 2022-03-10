
package Intefaces;

import Modelo.Usuario;
import java.util.List;


public interface CRUD {
    public List listar();
    public Usuario list(String Codigo);
    public boolean add(Usuario usu);
    public boolean edit(Usuario usu);
    public boolean eliminar(String Codigo);
}
