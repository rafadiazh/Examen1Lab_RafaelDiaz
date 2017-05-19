/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1lab_rafaeldiaz;

/**
 *
 * @author Rafael
 */
public class Atexto extends Archivos{
    String texto;

    public Atexto(String texto) {
        this.texto = texto;
    }

    public Atexto() {
        super();
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Atexto{" + "texto=" + texto + '}';
    }
    
}
