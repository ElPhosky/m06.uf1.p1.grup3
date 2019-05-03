/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m06.uf1.audioplayer.Controlador;

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
import m06.uf1.audioplayer.Modelo.Audio;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class LeerXML {

    public Map<Integer, Audio> getAudios() {
        return audios;
    }
    
    private Map<Integer, Audio> audios;
    private static LeerXML lector;
    private String ubi = "audios/lista.xml";
        
    public static LeerXML getLectorInstance(){
        if(lector==null){
            lector = new LeerXML();
        }
        return lector;
    }
    
    private LeerXML(){
        try {
            carga(ubi);
        } catch (IOException ex) {
            Logger.getLogger(LeerXML.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(LeerXML.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void carga(String nomArxiu) throws IOException, ParserConfigurationException {
        audios = new HashMap();
        carregarAudios(nomArxiu);
    }

    public void carregarAudios(String arxiuAudios) throws FileNotFoundException, IOException, ParserConfigurationException {

        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        Document document;
        DocumentBuilder builder = factory.newDocumentBuilder();

        try {

            document = builder.parse(new File(arxiuAudios));
            Element arrel = document.getDocumentElement();
            NodeList llistaAudios = arrel.getChildNodes();
            for (int i = 0; i < llistaAudios.getLength(); i++) {
                Node node = llistaAudios.item(i);
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element audio = (Element) node;
                    int id = Integer.parseInt(audio.getAttribute("id"));
                    Element nom = (Element) audio.getElementsByTagName("nom").item(0);
                    Element autor = (Element) audio.getElementsByTagName("autor").item(0);
                    Element album = (Element) audio.getElementsByTagName("album").item(0);
                    Element durada = (Element) audio.getElementsByTagName("durada").item(0);
                    Element ruta = (Element) audio.getElementsByTagName("ruta").item(0);

                    Audio aud = new Audio(id,
                            nom.getChildNodes().item(0).getNodeValue(),
                            autor.getChildNodes().item(0).getNodeValue(),
                            album.getChildNodes().item(0).getNodeValue(),
                            durada.getChildNodes().item(0).getNodeValue(),
                            ruta.getChildNodes().item(0).getNodeValue());
                            
                    audios.put(id, aud);
                }
            }
        } catch (SAXException ex) {
            ex.printStackTrace();
        }
    }
}
