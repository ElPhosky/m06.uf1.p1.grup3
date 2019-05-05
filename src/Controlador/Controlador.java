package Controlador;

import Modelo.Audio;
import Modelo.AudioPlayer;
import Modelo.Playlist;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import Vista.VistaReproductor;


public class Controlador implements ActionListener {

    private VistaReproductor vista;
    private AudioPlayer audioPlayer;
    private Playlist listaActual;

    public Controlador() {
        vista.inicio();
        
    }
    
     public void afegirListenerBotons() {
        vista.getPlay().addActionListener(this);
        vista.getStop().addActionListener(this);
        vista.getAnterior().addActionListener(this);
        vista.getSiguiente().addActionListener(this);
        vista.getPausa().addActionListener(this);
        vista.getContinuar().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent esdeveniment) {
        //Declarem el gestor d'esdeveniments
        Object gestorEsdeveniments = esdeveniment.getSource();
        try {
            if (gestorEsdeveniments.equals(vista.getPlay())) { //Si hem pitjat el boto play
                audioPlayer.getPlayer().play(); //reproduim l'àudio
            } else if (gestorEsdeveniments.equals(vista.getStop())) {
                //Si hem pitjat el boto stop
                audioPlayer.getPlayer().stop(); //parem la reproducció de l'àudio
            } else if (gestorEsdeveniments.equals(vista.getAnterior())) {
                //Si hem pitjat el boto stop
                audioPlayer.getPlayer().pause(); //pausem la reproducció de l'àudio
            } else if (gestorEsdeveniments.equals(vista.getSiguiente())) {
                //Si hem pitjat el boto stop
                audioPlayer.getPlayer().resume(); //continuem la reproducció de l'àudio
            }else if (gestorEsdeveniments.equals(vista.getContinuar())) {
                //Si hem pitjat el boto stop
                audioPlayer.getPlayer().resume(); //continuem la reproducció de l'àudio
            }else if (gestorEsdeveniments.equals(vista.getPausa())) {
                //Si hem pitjat el boto stop
                audioPlayer.getPlayer().pause(); //continuem la reproducció de l'àudio
            }
        } catch (BasicPlayerException e) {
            e.printStackTrace();
        }
    }
}
