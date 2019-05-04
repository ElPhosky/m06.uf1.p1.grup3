/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.io.File;
import javazoom.jlgui.basicplayer.BasicPlayer;
import javazoom.jlgui.basicplayer.BasicPlayerException;

public class Reproductor {
    
    BasicPlayer player;
    
    public Reproductor(String fitxerAudio) {
        player = new BasicPlayer();
        try {
            player.open(new File(fitxerAudio));
        } catch (BasicPlayerException e) {
            e.printStackTrace();
        }
    }

    public BasicPlayer getPlayer() {
        return player;
    }

    public void setPlayer(BasicPlayer player) {
        this.player = player;
    }

}

