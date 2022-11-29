/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprogram;

/**
 * @author Usuario
 */
public class Nodo {
    
    private String title;
    private String album;
    private String artist;
    private String platform;
    private String duration;
    private String previewLink;
    private String artistLink;
    private String trackLink;
    private String albumLink;
    private String pictureLink;
    private Nodo siguiente;
    
    /*Por default, un nuevo nodo va al final de la lista
      El final de la lista se indica con null
      Por eso */
    public Nodo() {
        this.siguiente = null; 
    }

    public Nodo(String title, String album, String artist, String platform, String duration, String previewLink, String artistLink, String trackLink, String albumLink, String pictureLink) {
        this.title = title;
        this.album = album;
        this.artist = artist;
        this.platform = platform;
        this.duration = duration;
        this.previewLink = previewLink;
        this.artistLink = artistLink;
        this.trackLink = trackLink;
        this.albumLink = albumLink;
        this.pictureLink = pictureLink;
        this.siguiente = null;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPreviewLink() {
        return previewLink;
    }

    public void setPreviewLink(String previewLink) {
        this.previewLink = previewLink;
    }

    public String getArtistLink() {
        return artistLink;
    }

    public void setArtistLink(String artistLink) {
        this.artistLink = artistLink;
    }

    public String getTrackLink() {
        return trackLink;
    }

    public void setTrackLink(String trackLink) {
        this.trackLink = trackLink;
    }

    public String getAlbumLink() {
        return albumLink;
    }

    public void setAlbumLink(String albumLink) {
        this.albumLink = albumLink;
    }

    public String getPictureLink() {
        return pictureLink;
    }

    public void setPictureLink(String pictureLink) {
        this.pictureLink = pictureLink;
    }

    

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

}
