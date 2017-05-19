/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab_rafaeldiaz;

import java.util.ArrayList;

/**
 *
 * @author Rafael
 */
public class Carpetas extends Archivos{
    ArrayList<Archivos> archivos = new ArrayList();

    public Carpetas() {
    }

    public ArrayList<Archivos> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivos> archivos) {
        this.archivos = archivos;
    }

    @Override
    public String toString() {
        return "Carpetas{" + "archivos=" + archivos + '}';
    }
    
}
