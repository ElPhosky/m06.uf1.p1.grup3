package Controlador;

import Modelo.Audio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import Vista.VistaReproductor;


public class Controlador implements ActionListener {

    private VistaReproductor vista;
    private Audio audio;

    public Controlador() {
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
