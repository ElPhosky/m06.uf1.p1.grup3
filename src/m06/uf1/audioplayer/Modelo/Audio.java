package m06.uf1.audioplayer.Modelo;

public class Audio {

    private int id;

    
    private String nom, autor, album, durada, ruta;

    public Audio(int id, String nom, String autor, String album, String durada, String ruta) {
        this.id = id;
        this.nom = nom;
        this.autor = autor;
        this.album = album;
        this.durada = durada;
        this.ruta = ruta;
    }
   
    @Override
    public String toString() {
        return "Audio{" + "id=" + id + ", nom=" + nom + ", autor=" + autor + ", album=" + album + ", durada=" + durada + ", ruta=" + ruta + '}';
    }
        
    //GETTERS    
    
    public int getId() {
        return id;
    }
    
    public String getNom() {
        return nom;
    }

    public String getAutor() {
        return autor;
    }

    public String getAlbum() {
        return album;
    }

    public String getDurada() {
        return durada;
    }

    public String getRuta() {
        return ruta;
    }
    
    
}
