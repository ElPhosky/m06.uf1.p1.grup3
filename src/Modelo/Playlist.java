/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Kevin
 */
public class Playlist {

    private String nombre, descripcion;
    private static int[] playlist;
    //private int sonando = playlist.length-1;

    public Playlist(String nombre, String descripcion, int[] playlist) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.playlist = playlist;
    }
    
    public Playlist(){
        
    }

    public int[] getPlaylist() {
        return playlist;
    }

    @Override
    public String toString() {
        String aMostrar = "";
        for (int i = 0; i < playlist.length; i++) {
            int p = playlist[i];
            aMostrar += " , " + p;
        }
        return "Playlist{" + "\nNombre = " + nombre + "\nDescripcion=" + descripcion + "\nLista= {" + aMostrar.substring(1) + "}}";
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

}
