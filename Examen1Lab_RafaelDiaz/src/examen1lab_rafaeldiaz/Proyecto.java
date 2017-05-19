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
public class Proyecto {
    String nombre;
    ArrayList<Archivos> archivos = new ArrayList();
    ArrayList<Usuarios> usuarios = new ArrayList();
    int commits;

    public Proyecto(String nombre, int commits) {
        this.nombre = nombre;
        this.commits = commits;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Archivos> getArchivos() {
        return archivos;
    }

    public void setArchivos(ArrayList<Archivos> archivos) {
        this.archivos = archivos;
    }

    public ArrayList<Usuarios> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuarios> usuarios) {
        this.usuarios = usuarios;
    }

    public int getCommits() {
        return commits;
    }

    public void setCommits(int commits) {
        this.commits = commits;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "nombre=" + nombre + ", archivos=" + archivos + ", usuarios=" + usuarios + ", commits=" + commits + '}';
    }
    
}
