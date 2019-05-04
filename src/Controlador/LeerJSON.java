package Controlador;

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

    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("playlist.json"));
            JSONObject jsonObject = (JSONObject) obj;
            String name = (String) jsonObject.get("nombre");
            System.out.println("Nombre Playlist :  " + name);

            String location = (String) jsonObject.get("descripcion");
            System.out.println("Descripcion Playlist " + name + " :  " + location);
            
            JSONArray Audios = (JSONArray) jsonObject.get("audio");
            

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
