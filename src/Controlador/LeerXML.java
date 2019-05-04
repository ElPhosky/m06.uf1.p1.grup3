package Controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import Modelo.Audio;
import Modelo.Lista;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LeerXML {

    private Map<Integer, Audio> audios;
    private Map<Integer, Lista> listas;
    private static LeerXML lector;
    private String ubi = "audios/lista.xml";

    private LeerXML() {
        try {
            carga();
        } catch (IOException ex) {
            Logger.getLogger(LeerXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(LeerXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void carga() throws IOException, ParserConfigurationException {
        audios = new HashMap();
        carregarAudios();

        listas = new HashMap();
        carregarListas();
    }

    private void carregarAudios() throws FileNotFoundException, IOException, ParserConfigurationException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document;
        DocumentBuilder builder = factory.newDocumentBuilder();

        try {
            File f = new File(ubi);
            if (f.exists()) {
                System.out.println(f.exists());
                document = builder.parse(f);
                Element arrel = document.getDocumentElement();
                NodeList llistaAudios = arrel.getElementsByTagName("song");
                for (int i = 0; i < llistaAudios.getLength(); i++) {
                    Node node = llistaAudios.item(i);
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element audio = (Element) node;
                        int id = Integer.parseInt(audio.getAttribute("id"));
                        Element nom = (Element) audio.getElementsByTagName("name").item(0);
                        Element autor = (Element) audio.getElementsByTagName("author").item(0);
                        Element album = (Element) audio.getElementsByTagName("album").item(0);
                        Element durada = (Element) audio.getElementsByTagName("duration").item(0);
                        Element ruta = (Element) audio.getElementsByTagName("route").item(0);

                        Audio aud = new Audio(id,
                                nom.getChildNodes().item(0).getNodeValue(),
                                autor.getChildNodes().item(0).getNodeValue(),
                                album.getChildNodes().item(0).getNodeValue(),
                                durada.getChildNodes().item(0).getNodeValue(),
                                ruta.getChildNodes().item(0).getNodeValue());

                        audios.put(id, aud);
                    }
                }
            } else {
                System.out.println("Error! fichero no encontrado. Asegurate que el xml esta en " + ubi);
            }
        } catch (SAXException ex) {
            ex.printStackTrace();
        }
    }

    private void carregarListas() throws FileNotFoundException, IOException, ParserConfigurationException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document;
        DocumentBuilder builder = factory.newDocumentBuilder();

        try {

            document = builder.parse(new File(ubi));
            Element arrel = document.getDocumentElement();
            NodeList listaPlaylist = arrel.getElementsByTagName("playlist");

            for (int i = 0; i < listaPlaylist.getLength(); i++) {
                Node node = listaPlaylist.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element canciones = (Element) node;
                    int id = Integer.parseInt(canciones.getAttribute("id"));
                    Element nombre = (Element) canciones.getElementsByTagName("name").item(0);
                    Element ruta = (Element) canciones.getElementsByTagName("route").item(0);

                    Lista list = new Lista(id,
                            nombre.getChildNodes().item(0).getNodeValue(),
                            ruta.getChildNodes().item(0).getNodeValue());

                    listas.put(id, list);
                }
            }

        } catch (SAXException ex) {
            ex.printStackTrace();
        }
    }

    public Map<Integer, Audio> getAudios() {
        return audios;
    }
    
    public Map<Integer, Lista> getListas() {
        return listas;
    }

    public static LeerXML getLectorInstance() {
        if (lector == null) {
            lector = new LeerXML();
        }
        return lector;
    }

    public static void main(String[] args) {
        LeerXML lXML = LeerXML.getLectorInstance();
        Map<Integer, Audio> prueba = lXML.getAudios();
        System.out.println(prueba.size());
        System.out.println(prueba.toString());
    }
}
