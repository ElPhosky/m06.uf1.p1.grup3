package m06.uf1.audioplayer.Controlador;

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
            JSONObject playlist = (JSONObject) parser.parse(new FileReader("playlist.json"));
            System.out.println(playlist.get("especie"));
            JSONArray races = (JSONArray) playlist.get("races");
            for (Object r : races) {
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
