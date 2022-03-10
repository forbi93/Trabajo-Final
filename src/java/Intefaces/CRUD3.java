/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Intefaces;

import Modelo.Adoptante;
import java.util.List;

/**
 *
 * @author User
 */
public interface CRUD3 {
    public List listar();
    public Adoptante list(int Codigo);
    public boolean add(Adoptante ado);
    public boolean edit(Adoptante ado);
    public boolean eliminar(int Codigo);
}
