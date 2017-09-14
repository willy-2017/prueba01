
package com.mycompany.g1;

public class Utilities {
//las primeras treinta letras(caracteres) del texto recibido  
public String getResume(String texto){
String modificar;
modificar=texto.substring(0,30);
texto=modificar;
return texto;
}

//El texto que se ha recibido con cada palabra capitalizada
public String Capitalizar(String texto){
       String salida = "";
        String modificado;
        int num;
        modificado = texto;
        num = texto.length();
        String[] key = new String[num];

//descomponiendo la frase
        for (int i = 0; i < num; i++) {
            modificado = texto.substring(i, num);
            key[i] = modificado.substring(0, 1);
        }

//convertir todo minusculas        
        for (int i = 0; i < num; i++) {
                key[i]=key[i].substring(0, 1).toLowerCase();
        }
//convertir despues de los espacios en mayusculas y la primera letra tambien        
           for (int i = 0; i < num; i++) {
   
            if (key[i].equals(" ")) {
                key[i + 1] = key[i + 1].substring(0, 1).toUpperCase();
            } 

            if (i == 0) {
                key[i] = key[i].substring(0, 1).toUpperCase();
            }

        }
//eliminar espacios dobles   
int cont=0;           
for (int i = 0; i < num; i++) {
   
            if (key[i].equals(" ")) {
            cont=cont+1;    
            } 
            else{
            cont=0;
            }
            if(cont<2){
            salida = salida + key[i];
            }
            
        }

texto=salida; 
    
return texto;    
}

//contar coincidencias en una frase de un texto buscado (ignore case)
public int contarCoincidencias(String frase,String texto){
int cont;    
cont=frase.indexOf(texto);    
return cont;
}





}
