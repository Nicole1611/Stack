/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stack;

public class Stackp {
    private Nodo cima;
    private int tamaño;
    
    public Stackp(){
        this.cima = null;
        this.tamaño = 0;
    }

    public void push(int dato){
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = cima;
        cima = nuevoNodo;
        tamaño++;
    }
    
    public int pop(){
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía");
        }
        int dato = cima.getDato();
        cima = cima.siguiente;
        tamaño--;
        return dato;
    }
    
    public int peek(){
        if(isEmpty()){
            throw new IllegalStateException("La pila vacía");            
        }
        return cima.getDato();
    }

    public boolean isEmpty(){
        return cima == null;
    }
    
    public void mostrarElementos(){
        Nodo actual = cima;
        if(actual == null){
            System.out.println("Pila vacía");
            return;
        }
        while(actual != null){
            System.out.println(actual.getDato());
            actual = actual.siguiente;
        }
    }
}

