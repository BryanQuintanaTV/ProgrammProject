/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprogram;

/**
 * @author Bryan Alexis Quintana Juarez
 */
public class Lista {

    private Nodo inicio;
    private Nodo fin;
    private int cont;

    //Por default, la lista está vacía
    public Lista() {
        this.inicio = null; //No hay nodos en la lista
        this.fin = null;
        cont = 0;
    }

    public boolean listaVacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {
        if (listaVacia()) {
            System.out.println("LISTA VACÍA");
        } else {
            Nodo temp = inicio;
            //¿Cómo muevo a temp?
            while (temp != null) {
                System.out.print(temp.getTitle() + " - ");
                temp = temp.getSiguiente();
            }
            System.out.println("");
        }
    }

    //Agregar un nodo al final de la lista
    //Solución 1.- O👎
    public void agregar(String title, String album, String artist, String platform, String duration, String previewLink, String artistLink, String trackLink, String albumLink, String pictureLink) {
        Nodo nuevoNodo = new Nodo(title, album, artist, platform, duration, previewLink, artistLink, trackLink, albumLink, pictureLink);

        //Verificar si hay nodo sen la lista
        if (inicio == null) { //No hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else { //Hay nods en la lista
            //Hay que movernos por la lista Usando un nodo temporal hasta el último nodo de la lista
            /*Nodo temp = inicio;
            //¿Cómo muevo a temp?
            while(temp.getSiguiente() != null){
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);*/
            fin.setSiguiente(nuevoNodo);
            fin = nuevoNodo;
        }
        cont++;
    }

    public String get(int pos, int cont) {
        if (listaVacia()) {
            System.out.println("LISTA VACÍA");
        } else {
            Nodo temp = inicio;
            //¿Cómo muevo a temp?
            int contar = cont;
            int i = 0;
            while(i < cont){
                temp = temp.getSiguiente();
                i++;
            }
            if (pos == 1) {
                return temp.getPlatform();
            } else if (pos == 4) {
                return temp.getTitle();
            } else if (pos == 5) {
                return temp.getArtist();
            } else if (pos == 6) {
                return temp.getArtistLink();
            } else if (pos == 7) {
                return temp.getAlbum();
            } else if (pos == 8) {
                return temp.getAlbumLink();
            } else if (pos == 10) {
                return temp.getDuration();
            } else if (pos == 11) {
                return temp.getTrackLink();
            } else if (pos == 12) {
                return temp.getPreviewLink();
            } else if (pos == 13) {
                return temp.getPictureLink();
            }

            System.out.println("");
        }
        return "xd";
    }

    public int tamaLista() {
        return this.cont;
    }

    public void vaciarLista() {
        inicio = null;
        fin = null;
        this.cont = 0;
    }
}
