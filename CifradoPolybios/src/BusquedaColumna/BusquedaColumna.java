/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusquedaColumna;

import Columnas.Columnas;

/**
 *
 * @author May May May
 */
public class BusquedaColumna {
        private CharSequence llave;
        private Columnas c = new Columnas();

    public CharSequence Busqueda(CharSequence a){
        
        c.Columnas();
        c.columna.forEach((key,value) ->{
                if (value.toString().contains(a)) {  
                    llave= key;}
        });
                return   llave;
    }
    
    
}
