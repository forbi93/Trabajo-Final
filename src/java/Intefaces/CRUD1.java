
package Intefaces;

import Modelo.Contacto;
import java.util.List;

public interface CRUD1 {
    public List listar();
    public Contacto list(String Codigo);
    public boolean add(Contacto cont);
    public boolean edit(Contacto cont);
    public boolean eliminar(String Codigo);
}
