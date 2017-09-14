
package com.mycompany.g1;

public class Utilities {
//las primeras treinta letras(caracteres) del texto recibido  
public String getResume(String texto){
String modificar;
modificar=texto.substring(0,30);
texto=modificar;
return texto;
}    
    
}
