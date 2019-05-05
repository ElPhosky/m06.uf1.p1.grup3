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
    private LeerXML XML;
    private boolean Reproduciendo;
    public Audio cancion;

    public Controlador() {
        vista = new VistaReproductor();
        vista.setVisible(true);
        XML = LeerXML.getLectorInstance();
        listaActual = LeerJSON.getlJSONInstance().SeleccionarPlaylist("audios/todas.json");
        afegirListenerBotons();
        
        
    }
    
    public void ReproducirCancionTabla(String ruta){
        System.out.println(ruta);
        cancion = XML.getAudio(listaActual.getCancion());
        audioPlayer = new AudioPlayer(ruta);
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
                vista.CancionSeleccionadaEnLayout(XML.getAudio(listaActual.getCancion()));
                audioPlayer.getPlayer().play(); //reproduim l'àudio
                Reproduciendo = true;
                
            } else if (gestorEsdeveniments.equals(vista.getStop())) {
                //Si hem pitjat el boto stop
                audioPlayer.getPlayer().stop(); //parem la reproducció de l'àudio
            } else if (gestorEsdeveniments.equals(vista.getAnterior())) {
                //Si hem pitjat el boto stop
                audioPlayer.getPlayer().pause(); //pausem la reproducció de l'àudio
            } else if (gestorEsdeveniments.equals(vista.getPausa())) {
                //Si hem pitjat el boto stop
                audioPlayer.getPlayer().resume(); //continuem la reproducció de l'àudio
            }else if (gestorEsdeveniments.equals(vista.getContinuar())) {
                //Si hem pitjat el boto stop
                audioPlayer.getPlayer().resume(); //continuem la reproducció de l'àudio
            }else if (gestorEsdeveniments.equals(vista.getPausa())) {
                //Si hem pitjat el boto stop
                audioPlayer.getPlayer().pause(); //continuem la reproducció de l'àudio
            }else if (gestorEsdeveniments.equals(vista.getTabla())){
                
            }
        } catch (BasicPlayerException e) {
            e.printStackTrace();
        }
    }
}
