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
    private static AudioPlayer audioPlayer;
    private static Playlist listaActual;
    private static LeerXML XML;
    public static boolean Reproduciendo;
    public static Audio cancion;

    public Controlador() {
        vista = new VistaReproductor();
        vista.setVisible(true);
        XML = LeerXML.getLectorInstance();
        listaActual = LeerJSON.getlJSONInstance().SeleccionarPlaylist("audios/todas.json");
        afegirListenerBotons();

    }

    public static void ReproducirCancionTabla(String ruta) throws BasicPlayerException {
        System.out.println(ruta);
        cancion = XML.getAudio(listaActual.getCancion());
        if (Reproduciendo) {
            audioPlayer.getPlayer().stop();
        }
        audioPlayer = new AudioPlayer(ruta);
        audioPlayer.getPlayer().play();
        Reproduciendo = true;

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

                 //reproduim l'àudio
                if (Reproduciendo) {
                    audioPlayer.getPlayer().resume();
                }else
                audioPlayer.getPlayer().play();

            } else if (gestorEsdeveniments.equals(vista.getStop())) {
                //Si hem pitjat el boto stop
                audioPlayer.getPlayer().stop(); //parem la reproducció de l'àudio
            } else if (gestorEsdeveniments.equals(vista.getAnterior())) {
                //Si hem pitjat el boto stop
                //pausem la reproducció de l'àudio
            } else if (gestorEsdeveniments.equals(vista.getPausa())) {
                audioPlayer.getPlayer().pause();

                //continuem la reproducció de l'àudio
            } else if (gestorEsdeveniments.equals(vista.getContinuar())) {
                //Si hem pitjat el boto stop
                audioPlayer.getPlayer().resume(); //continuem la reproducció de l'àudio
            } else if (gestorEsdeveniments.equals(vista.getPausa())) {
                //Si hem pitjat el boto stop
                audioPlayer.getPlayer().pause(); //continuem la reproducció de l'àudio
            } else if (gestorEsdeveniments.equals(vista.getTabla())) {

            }
        } catch (BasicPlayerException e) {
            e.printStackTrace();
        }
    }
}
