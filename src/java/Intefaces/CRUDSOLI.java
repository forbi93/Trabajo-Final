
package Intefaces;

import Modelo.Solicitud;
import java.util.List;

public interface CRUDSOLI {
    public List listar();
    public Solicitud list(String solicitudID);
    public boolean add(Solicitud sol);
    public boolean edit(Solicitud sol);
    public boolean eliminar(String solicitudID);
}
