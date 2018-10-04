/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busqueda;

import BusquedaColumna.BusquedaColumna;
import Filas.Filas;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author May May May
 */
public class Busqueda {
    private CharSequence llave;
    Filas f= new Filas();
    BusquedaColumna bc = new BusquedaColumna();
    
    public CharSequence Busqueda(CharSequence a){
        
       f.Filas();
        f.fila.forEach((key,value) ->{
                if (value.toString().contains(a)) {  
                    llave= key;}
        });
                return  llave.toString()+bc.Busqueda(a);
    }
       
        
    
    
}
