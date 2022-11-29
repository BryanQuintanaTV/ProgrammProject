/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprogram;

/**
 *
 * @author bryan
 */
public class NodoStack {

    private int valor;
    private NodoStack siguiente;
    private NodoStack previo;
    
    /*Por default, un nuevo nodo va al final de la lista
      El final de la lista se indica con null
      Por eso */
    public NodoStack() {
        this.siguiente = null;
        this.previo = null;
    }

    public NodoStack(int valor) {
        this.valor = valor;
        this.siguiente = null;
        this.previo = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public NodoStack getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoStack siguiente) {
        this.siguiente = siguiente;
    }

    public NodoStack getPrevio() {
        return previo;
    }

    public void setPrevio(NodoStack previo) {
        this.previo = previo;
    }
     
    
}