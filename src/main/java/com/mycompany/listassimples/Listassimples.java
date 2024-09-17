

package com.mycompany.listassimples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;


public class Listassimples {

    Nodo inicio;
    Listassimples(){
        inicio = null;
    }
    
    Random random = new Random();
    
    public void insertar(){
        String arreglo[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","x","y","z"};
        String nombre = "";
        for (int i = 0; i < 5; i++) {
            int numeroAleatorio = random.nextInt(25) + 1;
            String letra = arreglo[numeroAleatorio];
            nombre += letra;
        }
        int edad = 12;
        float nota = 45;
        Nodo nuevo = new Nodo();
        nuevo.setNombre(nombre);
        nuevo.setEdad(edad);
        nuevo.setPromedio(nota);
        nuevo.setEnlace(null);
        if (inicio == null) {
            JOptionPane.showMessageDialog(null, "La lista està vacia");
            inicio = nuevo;
        }
        else {
            
            Nodo temporal = inicio;
            while(temporal.getEnlace()!=null) {
                temporal = temporal.getEnlace();
            }
            temporal.setEnlace(nuevo);
        }
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
            
            //Con el .getEnlace() cambio el nodo inicio al siguiente nodo
          inicio = inicio.getEnlace();
        return;
        }
        Nodo temporal = inicio;
        //debemos iterar un nodo antes al nodo que queremos eliminar
        while(temporal.getEnlace() != null){
            if(temporal.getEnlace().getNombre().equalsIgnoreCase(datoBuscado)){
                temporal.setEnlace(temporal.getEnlace().getEnlace()); 
            }
            temporal = temporal.getEnlace();   
        }
        if (temporal == null) {
        JOptionPane.showMessageDialog(null, "La posición especificada no existe.");

        
    }
    }
    //Hacer un metodo para ordenar la lista por el nombre de la a la z
    public void ordenarPorNombre() {
        
    if (inicio == null || inicio.getEnlace() == null) {
        // La lista está vacía o tiene solo un nodo, no es necesario ordenar.
        return;
    }

    boolean intercambio;
    do {
        intercambio = false;
        Nodo actual = inicio;
        Nodo siguiente = inicio.getEnlace();

        while (siguiente != null) {
            // Comparamos los nombres de los nodos actual y siguiente.
            if (actual.getNombre().compareToIgnoreCase(siguiente.getNombre()) > 0) {
                // Si el nombre del nodo actual es mayor que el del siguiente, intercambiamos los nodos.
                Nodo temp = actual;
                actual = siguiente;
                siguiente = temp;

                // Actualizamos los enlaces.
                if (actual == inicio) {
                    inicio = siguiente;
                } else {
                    Nodo anterior = inicio;
                    while (anterior.getEnlace() != actual) {
                        anterior = anterior.getEnlace();
                    }
                    anterior.setEnlace(siguiente);
                }
                temp = siguiente.getEnlace();
                siguiente.setEnlace(actual);
                actual.setEnlace(temp);

                intercambio = true;
            }

            actual = siguiente;
            siguiente = siguiente.getEnlace();
        }
    } while (intercambio);
}
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

                // Actualizamos los enlaces.
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
// Codigo para revisar
//    public void ordenarEnOrden() {
//                    
//        if (inicio == null) {
//            JOptionPane.showMessageDialog(null, "La lista està vacia");
//            return;
//        }
//        
//        // Recorrer los nodos        
//        Nodo inicial = inicio;
//        int cantidadNodos = getLongitud();
//        int posicion = 0;
//        String[] arrayNombres = new String[cantidadNodos];
//        while(inicial!=null) {
//            arrayNombres[posicion] = inicial.getName();
//            inicial = inicial.getEnlace();
//            posicion++;
//        }
//        
//        // Tengo los nodos ordenados
//        Arrays.sort(arrayNombres);
//        JOptionPane.showMessageDialog(null, Arrays.toString(arrayNombres));
//        
//        // Algoritmo de busqueda
//        // if inicio = arrayNombres[0]
//        
//        
//        //Encontrar el primer nodo según el nombre
//        String nombreInicio = arrayNombres[0];
//        Nodo nuevoInicio = null;
//        inicial = inicio;
//        posicion = 1;
//        while(inicial!=null) {
//            if (inicial.getName().equals(nombreInicio)) {
//                nuevoInicio = inicial;
//                eliminarIndice(posicion);
//                break;
//            }
//            inicial = inicial.getEnlace();
//            posicion++;
//        }        
//        
//        // Cicla cantidad de nodos veces - 1
//        for (int i = 1; i < cantidadNodos; i++) {
//            inicial = inicio;
//            // Cicla hasta encontrar el nodo
//            posicion = 1;
//            while(inicial!=null) {
//                if (inicial.getName().equals(arrayNombres[i])) {
//                    Nodo temporal = nuevoInicio;
//                    // Llega a la posición necesaria para establecer el enlace
//                    for (int j = 1; j < i; j++) {
//                        temporal = temporal.getEnlace();                        
//                    }
//                    temporal.setEnlace(inicial);
//                    // Elimina al nodo de la lista original para
//                    // no confundir nombres repetidos
//                    eliminarIndice(posicion);
//                    break;
//                }
//                posicion++;
//                inicial = inicial.getEnlace();
//            }
//        }        
//        inicio = nuevoInicio;
    }


