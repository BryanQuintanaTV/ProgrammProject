/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectprogram;

/**
 *
 * @author bryan
 */
public class MyStack {

    private NodoStack inicio;
    private NodoStack fin;
    private int cont;

    //Por default, la lista está vacía
    public MyStack() {
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
            NodoStack temp = inicio;
            //¿Cómo muevo a temp?
            while (temp != null) {
                System.out.print(temp.getValor() + " - ");
                temp = temp.getSiguiente();
            }
            System.out.println("");
        }
    }

    public int tamaLista() {
        return this.cont;
    }

    public void agregar(int valor) {
        NodoStack nuevoNodo = new NodoStack(valor);

        //Verificar si hay nodo sen la lista
        if (inicio == null) { //No hay nodos en la lista
            inicio = nuevoNodo;
            fin = nuevoNodo;
        } else { //Hay nods en la lista
            //Hay que movernos por la lista Usando un nodo temporal hasta el último nodo de la lista
            
            fin.setSiguiente(nuevoNodo);
            nuevoNodo.setPrevio(fin);
            fin = nuevoNodo;
        }
        cont++;
    }
    
    public void push(int valor){
        agregar(valor);
    }
    
    public Integer peek(){
        //Verificar si la lista está vacía
        //Sí no está vacía, regresar el valor
        if(listaVacia()){
            return null;
        }else{
            return fin.getValor();
        }
        
    }
    
        public Integer pop() throws Exception{
        //Verificar si la lista está vacía
        //Sí no está vacía, regresar el valor
        if(listaVacia()){
            return null;
        }else{
            int valor = fin.getValor();
            //borrar la cima de la pila
           borrarEn(tamaLista()-1);
            return valor;
        }
        
    }
    
    
    
    
    public void insertarEn(int valor, int pos) throws Exception {
        int cantNodos = tamaLista();
        //¿Qué debemos validar?
        //Insertar en una posición no válida
        if (pos < 0) { //Posiciónes negativas
            throw new Exception("No puede inserarse un nodo en una posición negativa");
        } else if (pos >= cantNodos) {//Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " No es una posición válida en la lista");
        } else {
            NodoStack nuevoNodo = new NodoStack(valor);
            if (pos == 0) { //Insertar al inicio de la lista
                nuevoNodo.setSiguiente(inicio);
                inicio.setPrevio(nuevoNodo);
                inicio = nuevoNodo;
            } else {
                NodoStack temp = inicio;
                //¿Cómo muevo a temp?    
                int cont = 0;

                while (cont < pos) {
                    temp = temp.getSiguiente();
                    cont++;
                }
                nuevoNodo.setSiguiente(temp);
                nuevoNodo.setPrevio(temp.getPrevio());
                temp.getPrevio().setSiguiente(nuevoNodo);
                temp.setPrevio(nuevoNodo);
                

            }
            this.cont++;
        }
    }
    //HACER BORRAR EN
    public void borrarEn(int pos) throws Exception {
        int cantNodos = tamaLista();
        //¿Qué debemos validar?
        //Insertar en una posición no válida
        if (pos < 0) { //Posiciónes negativas
            throw new Exception("No puede inserarse un nodo en una posición negativa");
        } else if (pos >= cantNodos) { //Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " No es una posición válida en la lista");
        } else {
            if (cantNodos == 1) {
                vaciarLista();
            } else {
                //Borrar el primer nodo
                //Borrar nodo intermedio
                //Borrar el último nodo
                if (pos == 0) {
                    inicio = inicio.getSiguiente();
                } else {
                    NodoStack temp = inicio;
                    int cont = 0;

                    while (cont < pos) {
                        temp = temp.getSiguiente();
                        cont++;
                    }
                    //Ya estoy en el nodo previo
                    NodoStack objSig = temp.getSiguiente();
                    temp.setSiguiente(objSig.getSiguiente());
                    if (pos == (cantNodos)) {
                        fin = temp;
                    }
                }
            }
            this.cont--;
        }
    }
    
    public void vaciarLista() {
        inicio = null;
        fin = null;
        this.cont = 0;
    }

    public int obtenValorEn(int pos) throws Exception {
        int cantNodos = tamaLista();
        int valor = 0;
        //¿Qué debemos validar?
        //Insertar en una posición no válida
        if (pos < 0) { //Posiciónes negativas
            throw new Exception("No puede inserarse un nodo en una posición negativa");
        } else if (pos >= cantNodos) { //Posiciones mayores a la cantidad de elementos
            throw new Exception(pos + " No es una posición válida en la lista");
        } else {
            NodoStack temp = inicio;
            int cont = 0;

            while (cont < pos) {
                temp = temp.getSiguiente();
                cont++;
            }
            valor = temp.getValor();
        }
        return valor;
    }
}