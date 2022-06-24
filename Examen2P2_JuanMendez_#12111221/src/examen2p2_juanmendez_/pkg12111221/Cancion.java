/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2p2_juanmendez_.pkg12111221;

import java.io.Serializable;

/**
 *
 * @author Juan Carlos Mendez
 */
public class Cancion implements Serializable {

    String nombre, categoria;
    private static final long SerialVersionUID = 777L;

    public Cancion(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Cancion{" + "nombre=" + nombre + '}';
    }

}
