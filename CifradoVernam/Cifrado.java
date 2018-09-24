import java.lang.Math; 


public class Cifrado
{
    // instance variables - replace the example below with your own
   private Mensaje mensaje;
    public Cifrado(Mensaje mensaje)
    {
        this.mensaje=mensaje;
    }
    
    public String Vernam(){
        int salida=0; mensajeCifrado
        for(int indice=0;indice<mensaje.tamanio();indice++){
            
            salida=(int)mensaje.toString().charAt(indice);
            
            
            
        }
        
    }
    
    private String conversionBinario(int decimal){
         String binario = Integer.toBinaryString(decimal);
         return binario;
    }
    
    private void secuenciaAleatoria()
    {
        
    }

  
}
