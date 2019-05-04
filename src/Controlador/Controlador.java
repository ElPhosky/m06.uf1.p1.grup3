package Controlador;

import Modelo.Audio;
import Modelo.Playlist;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import Vista.VistaReproductor;


public class Controlador implements ActionListener {

    private VistaReproductor vista;
    private Audio audio;
    private Playlist listaActual;

    public Controlador() {
        vista = new VistaReproductor();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
