/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.stack;

/**
 *
 * @author User
 */
public class Stack {

    public static void main(String[] args) {
        Stackp pila1 = new Stackp();
        pila1.push(5);
        pila1.push(7);
        pila1.push(1);
         System.out.println("Pop: " + pila1.pop());    
        System.out.println("Peek: " + pila1.peek());   
        System.out.println("Esta vacia: " + pila1.isEmpty());
        System.out.println("Elementos de la pila:");
        pila1.mostrarElementos();  
    }
}
