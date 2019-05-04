package Controlador;

import Modelo.Playlist;
import java.io.*;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class LeerJSON {

    private static LeerJSON lector;
    
    public Playlist SeleccionarPlaylist(String file) {
        JSONParser parser = new JSONParser();
        try {
            JSONObject playlist = (JSONObject) parser.parse(new FileReader(file));
            JSONArray listaCanciones = (JSONArray) playlist.get("canciones");
            int[] canciones = new int [listaCanciones.size()];
            for (int i = 0; i < listaCanciones.size(); i++) {
                canciones[i] = Integer.parseInt(listaCanciones.get(i).toString()); 
            }
            Playlist seleccionada = new Playlist(playlist.get("nom").toString(), playlist.get("descripcio").toString(), canciones); 
            return seleccionada;

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
    
    public static LeerJSON getlJSONInstance(){
        if(lector == null){
            lector = new LeerJSON();
        }
        return lector;
    }
}
