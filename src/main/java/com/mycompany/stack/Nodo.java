/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack;

/**
 *
 * @author User
 */
public class Nodo {
    private int dato;
    public Nodo siguiente;
    
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
    }
    public int getDato(){
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
    
}
