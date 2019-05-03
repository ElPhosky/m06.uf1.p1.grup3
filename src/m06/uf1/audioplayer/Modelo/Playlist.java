/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf1.audioplayer.Modelo;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Playlist {
    private String nombre, descripcion;
    private ArrayList<Audio> lista;

    public Playlist(String nombre, String descripcion, ArrayList<Audio> lista) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Playlist{" + "nombre=" + nombre + ", descripcion=" + descripcion + ", lista=" + lista + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public ArrayList<Audio> getLista() {
        return lista;
    } 
}
