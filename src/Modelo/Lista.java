/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Lista{
    private int id;
    private String nom,ruta;
    
    public Lista(int id, String nom, String ruta){
        this.id = id;
        this.nom = nom;
        this.ruta = ruta;
    }
    
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public String getRuta() {
        return ruta;
    }
}