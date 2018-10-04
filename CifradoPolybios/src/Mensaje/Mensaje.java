/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mensaje;

import Busqueda.Busqueda;

/**
 *
 * @author May May May
 */
public class Mensaje {
    private CharSequence salida="";
    Busqueda b= new Busqueda();
    
    public CharSequence recorre(CharSequence a){
        if(a.length()==0){
            return salida;
        }else{
            salida=salida.toString()+b.Busqueda(""+a.charAt(0));
            return recorre(a.subSequence(1, a.length()));
        }
        
            
    }
    
}
