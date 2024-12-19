
package com.mycompany.efrenalisson.clases;

public class Lista {
   public Nodo cabeza;

    public Lista() {
        this.cabeza = null;
    }
    
public void agregar(int dato ){
    Nodo nuevoNodo = new  Nodo(dato);
    if (cabeza==null){
        cabeza=nuevoNodo;  
    }
    
    Nodo actual= cabeza;
    while (actual.siguiente!=null){
        actual=actual.siguiente;
}  
    actual.siguiente= nuevoNodo;
 }

public void mostrar(){
    Nodo actual= cabeza;
    while (actual!= null){
        System.out.println(actual.dato+ " ");
        actual= actual.siguiente;
    }
    System.out.println();

}
}
