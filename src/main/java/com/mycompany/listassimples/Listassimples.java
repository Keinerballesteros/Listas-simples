

package com.mycompany.listassimples;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Listassimples {

    Nodo inicio;
    Listassimples(){
        inicio = null;
    }
    
    public void insertarInicio(String nombre, int edad, float promedio){
        
        Nodo nuevo = new Nodo();
        
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        
        if(inicio == null){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            inicio = nuevo;
        }
        else{
            nuevo.setEnlace(inicio);
            inicio = nuevo;
        }   
    }
    
    //que el primero sea el inicio
    
    public void insertarFinal(String nombre, int edad, float promedio){
        
        Nodo nuevo = new Nodo();
        
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(promedio);
        nuevo.setEnlace(null);
        
        if(inicio == null){
            JOptionPane.showMessageDialog(null, "La lista está vacía");
            inicio = nuevo;
        }
        else{
            Nodo temporal = inicio;
            while(temporal.getEnlace() != null){
                temporal = temporal.getEnlace();
            }
            temporal.setEnlace(nuevo);
        }   
    }
    
    //Agregar un nodo por posición adelante de uno dado
    public void insertarEnPosicion(String nombre, int edad, float promedio, int posicion) {
    Nodo nuevo = new Nodo();
    nuevo.setNombre(nombre);
    nuevo.setEdad(edad);
    nuevo.setPromedio(promedio);

    if (posicion == 1) {
        nuevo.setEnlace(inicio);
        inicio = nuevo;
    } else {
        Nodo temporal = inicio;
        int contador = 1;
        while (temporal != null && contador < posicion) {
            temporal = temporal.getEnlace();
            contador++;
        }
        if (temporal != null) {
            nuevo.setEnlace(temporal.getEnlace());
            temporal.setEnlace(nuevo);
        } else {
            JOptionPane.showMessageDialog(null, "La posición especificada no existe.");
        }
    }
}

    //Agregar un nodo por dato adelante de uno dado
    
    public void insertarAntesDeDato(String nombre, int edad, float promedio, String datoBuscado) {
    Nodo nuevo = new Nodo();
    nuevo.setNombre(nombre);
    nuevo.setEdad(edad);
    nuevo.setPromedio(promedio);

    if (inicio == null) {
        JOptionPane.showMessageDialog(null, "La lista está vacía.");
        return;
    }

    if (inicio.getNombre().equals(datoBuscado)) {
        nuevo.setEnlace(inicio);
        inicio = nuevo;
        return;
    }

    Nodo temporal = inicio;
    while (temporal.getEnlace() != null && !temporal.getEnlace().getNombre().equals(datoBuscado)) {
        temporal = temporal.getEnlace();
    }

    if (temporal.getEnlace() != null) {
        nuevo.setEnlace(temporal.getEnlace());
        temporal.setEnlace(nuevo);
    } else {
        JOptionPane.showMessageDialog(null, "El dato buscado no se encuentra en la lista.");
    }
}

    
    //Agregar un nodo por dato delante de uno dado
    
    public void insertarDespuesDeDato(String nombre, int edad, float promedio, String datoBuscado) {
    Nodo nuevo = new Nodo();
    nuevo.setNombre(nombre);
    nuevo.setEdad(edad);
    nuevo.setPromedio(promedio);

    if (inicio == null) {
        JOptionPane.showMessageDialog(null, "La lista está vacía.");
        return;
    }

    Nodo temporal = inicio;
    while (temporal != null && !temporal.getNombre().equals(datoBuscado)) {
        temporal = temporal.getEnlace();
    }

    if (temporal != null) {
        nuevo.setEnlace(temporal.getEnlace());
        temporal.setEnlace(nuevo);
    } else {
        JOptionPane.showMessageDialog(null, "El dato buscado no se encuentra en la lista.");
    }
}


    
    public void consultar(){
        Nodo temporal = inicio;
        if(inicio == null){
           JOptionPane.showMessageDialog(null, "La lista está vacía");
        }
        else{
        while (temporal != null) { 
            JOptionPane.showMessageDialog(null, "Nombre: " + temporal.getNombre() + " Edad: " + temporal.getEdad() + " Promedio: " + temporal.getPromedio());
            temporal = temporal.getEnlace(); // Avanzamos al siguiente nodo
        }
        }
    }
    public void obtener(int index){
        int contador = 0;
        Nodo temporal = inicio;
        while(contador<index){
            temporal = temporal.getEnlace();
            contador++;
        }
        JOptionPane.showMessageDialog(null,"Nombre: " +temporal.getNombre() + " Edad:"+ temporal.getEdad() +" Promedio:" +temporal.getPromedio());
    }
    
    public void eliminar(int posicion){
        if (inicio == null) {
        JOptionPane.showMessageDialog(null, "La lista está vacía.");
        return;
        }

    if (posicion == 1) {
        inicio = inicio.getEnlace();
        return;
    }
        Nodo temporal = inicio;
        int contador = 1;
        while (temporal != null && contador < posicion) {
            temporal = temporal.getEnlace();
            contador++;
        }
        if (temporal == null) {
        JOptionPane.showMessageDialog(null, "La posición especificada no existe.");
        } else {
            temporal.setEnlace(temporal.getEnlace().getEnlace());
        }
    }
    
    public void eliminarPorDato(String datoBuscado){
       
        if (inicio == null) {
        JOptionPane.showMessageDialog(null, "La lista está vacía.");
        return;
        }
        if(inicio.getNombre().equalsIgnoreCase(datoBuscado)){
          inicio = inicio.getEnlace();
        return;
        }
        Nodo temporal = inicio;
        while(temporal.getEnlace() != null && !datoBuscado.equalsIgnoreCase(temporal.getNombre())){
            temporal = temporal.getEnlace();
        }
        if (temporal == null) {
        JOptionPane.showMessageDialog(null, "La posición especificada no existe.");
        } else {
            temporal.setEnlace(temporal.getEnlace().getEnlace());
        }
        
    }
    
    
    //Hacer un metodo para ordenar la lista por el nombre de la a la z
    public void ordenarPorNombre() {
    if (inicio == null || inicio.getEnlace() == null) {
        JOptionPane.showMessageDialog(null, "La lista no tiene suficientes elementos para ordenar");
        return;
    }

    boolean huboCambio;
    do {
         
        //actual: para rastrear el nodo que estamos comparando.
        //siguiente: es el nodo siguiente al que se está comparando.
        //anterior: rastrea el nodo anterior en caso de que necesitemos intercambiar nodos.
        //huboCambio: se utiliza para verificar si hubo intercambios en cada pasada del ciclo.
        
        Nodo actual = inicio;
        Nodo siguiente = inicio.getEnlace();
        Nodo anterior = null;
        huboCambio = false;
        
        
        //Usamos un ciclo while para recorrer toda la lista. Si el nombre del nodo actual es mayor (alfabéticamente) que el del nodo siguiente, entonces intercambiamos ambos nodos.
        while (siguiente != null) {
            if (actual.getNombre().compareToIgnoreCase(siguiente.getNombre()) > 0) {
                
                // Intercambiar nodos
                huboCambio = true;
                if (anterior == null) {
                    // Cambiar el inicio de la lista
                    inicio = siguiente;
                } else {
                    anterior.setEnlace(siguiente);
                }
                
                actual.setEnlace(siguiente.getEnlace());
                siguiente.setEnlace(actual);
                
                // Actualizar punteros
                anterior = siguiente;
                siguiente = actual.getEnlace();
            } else {
                anterior = actual;
                actual = siguiente;
                siguiente = siguiente.getEnlace();
            }
        }
    } while (huboCambio);

    JOptionPane.showMessageDialog(null, "Lista ordenada alfabéticamente por nombre");
}
    //Ordenar por Edad
    public void ordenarPorEdad() {
    if (inicio == null || inicio.getEnlace() == null) {
        JOptionPane.showMessageDialog(null, "La lista está vacía o solo tiene un nodo.");
        return;
    }

    
    boolean huboIntercambio;
    do {
        huboIntercambio = false;
        Nodo actual = inicio;
        Nodo siguiente = inicio.getEnlace();

        while (siguiente != null) {
            if (actual.getEdad() > siguiente.getEdad()) {
                // Intercambiamos los nodos.
                Nodo temp = siguiente;
                siguiente = actual;
                actual = temp;

                // Actualizamos los enlaces:
                
                if (actual == inicio) {
                    inicio = siguiente;
                } else {
                    Nodo anterior = inicio;
                    while (anterior.getEnlace() != actual) {
                        anterior = anterior.getEnlace();
                    }
                    anterior.setEnlace(siguiente);
                }
                siguiente = siguiente.getEnlace();
                huboIntercambio = true;
            } else {
                actual = siguiente;
                siguiente = siguiente.getEnlace();
            }
        }
    } while (huboIntercambio);

    JOptionPane.showMessageDialog(null, "La lista se ha ordenado por edad (de menor a mayor).");
}
    
    // Crear un algoritmo que me genero n nombres de forma aleatorio
    
    
    
    
}

