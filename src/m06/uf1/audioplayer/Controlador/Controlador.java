package m06.uf1.audioplayer.Controlador;

import m06.uf1.audioplayer.Modelo.Audio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import m06.uf1.audioplayer.Vista.VistaReproductor;


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
