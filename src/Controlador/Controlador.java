package Controlador;

import Modelo.Audio;
import Modelo.AudioPlayer;
import Modelo.Lista;
import Modelo.Playlist;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayerException;
import Vista.VistaReproductor;
import java.util.Map;
import javax.swing.JSlider;

public class Controlador implements ActionListener {

    private VistaReproductor vista;
    public static AudioPlayer audioPlayer;
    public static Playlist listaActual;
    public static LeerXML XML;
    public static boolean Reproduciendo = false;
    public static Audio cancion;
    public static String ultimaSeleccionada;
    public static JSlider slider;

    public Controlador() {
        vista = new VistaReproductor();
        vista.setVisible(true);
        XML = LeerXML.getLectorInstance();
        listaActual = LeerJSON.getlJSONInstance().SeleccionarPlaylist("audios/todas.json");
        afegirListenerBotons();

    }

    public static void ReproducirCancionTabla(String ruta) throws BasicPlayerException {
        System.out.println(ruta);
        ultimaSeleccionada = ruta;

        //cancion = XML.getAudio(listaActual.getCancion());
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

            if (gestorEsdeveniments.equals(vista.getPlay())) {

                //reproduim l'àudio
                if (Reproduciendo) {
                    audioPlayer.getPlayer().resume();
                } else {

                    audioPlayer.getPlayer().play();
                    int pos=0;
                    Map<Integer, Audio> audios = LeerXML.getLectorInstance().getAudios();
                    for (Map.Entry<Integer, Audio> entry : audios.entrySet()) {
                        if (entry.getValue().getRuta()==ultimaSeleccionada) {
                            pos=entry.getKey();
//                            System.out.println(pos);
                        }
                    }
                    listaActual.SetSonando(pos);
                }

            } else if (gestorEsdeveniments.equals(vista.getStop())) {

                audioPlayer.getPlayer().stop();
            } else if (gestorEsdeveniments.equals(vista.getAnterior())) {
                int i = listaActual.anteriorcancion();
                System.out.println(i);
                String ruta = LeerXML.getLectorInstance().getAudio(i).getRuta();
                ReproducirCancionTabla(ruta);
            } else if (gestorEsdeveniments.equals(vista.getPausa())) {
                audioPlayer.getPlayer().pause();
            } else if (gestorEsdeveniments.equals(vista.getSiguiente())) {
                int i = listaActual.siguientecancion();
                System.out.println(i);
                String ruta = LeerXML.getLectorInstance().getAudio(i).getRuta();
                ReproducirCancionTabla(ruta);
                //pendiente
            } else if (gestorEsdeveniments.equals(vista.getPausa())) {
                audioPlayer.getPlayer().pause();
            } else if (gestorEsdeveniments.equals(vista.getContinuar())) {
                if (Reproduciendo) {
                    audioPlayer.getPlayer().resume();
                }

            }
        } catch (BasicPlayerException e) {
            e.printStackTrace();
        }
    }
}
