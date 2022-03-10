
package Intefaces;

import Modelo.Mascota;
import java.util.List;


public interface CRUD2 {
    public List listar();
    public Mascota list(String Codigo);
    public boolean add(Mascota mas);
    public boolean edit(Mascota mas);
    public boolean eliminar(String Codigo);
}
