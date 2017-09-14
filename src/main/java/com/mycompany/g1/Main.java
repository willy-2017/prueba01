package com.mycompany.g1;

public class Main {

 
    public static void main(String[] args) {
    Utilities a=new Utilities();
    String frase="Una ventana es azul aunque la cortina sea negra en la ventana"; 
    String texto="ventana";
    int cont=a.contarCoincidencias(frase, texto);
    System.out.println("cont="+cont);
    


    
    }
    
}
