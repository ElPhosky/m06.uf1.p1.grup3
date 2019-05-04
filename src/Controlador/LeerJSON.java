package Controlador;

import Modelo.Playlist;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Kevin
 */
public class LeerJSON {

    public static Playlist SeleccionarPlaylist() {
        JSONParser parser = new JSONParser();
        try {
            JSONObject playlist = (JSONObject) parser.parse(new FileReader("audios/playlistAnimo.json"));
            JSONArray listaCanciones = (JSONArray) playlist.get(parser);
            int[] canciones = new int [listaCanciones.size()];
            for (int i = 0; i < listaCanciones.size(); i++) {
                canciones[i] = Integer.parseInt(listaCanciones.get(i).toString()); 
            }
            Playlist seleccionada = new Playlist(playlist.get("nom").toString(), playlist.get("descripcion").toString(), canciones);    

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void maino(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            JSONObject playlist = (JSONObject) parser.parse(new FileReader("playlist.json"));
            System.out.println(playlist.get("nombre"));
            JSONArray Audios = (JSONArray) playlist.get("Audio");
            for (Object r : Audios) {
                System.out.println(r);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
