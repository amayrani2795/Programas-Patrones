import java.lang.Math; 

public class Cifrado
{
    // instance variables - replace the example below with your own
    private Mensaje mensaje;
    private Clave clave;
    String salida="";
    public Cifrado(Mensaje mensaje,Clave clave)
    {
        this.mensaje=mensaje;
        this.clave=clave;
    }

    public String Vernam(){
        int valorAscii=0;   MensajeCifrado mensajecifrado;
        for(int indice=0;indice<mensaje.tamanio();indice++){

            valorAscii=(int)mensaje.toString().charAt(indice);
            salida+=conversionBinario(valorAscii);

        }
        mensajecifrado= new MensajeCifrado(orExclusiva(salida));

        return salida;
    }

    private String conversionBinario(int decimal){
        String binario = Integer.toBinaryString(decimal);
        return binario;

    }

   /* private String secuenciaAleatoria(int longitudCadena)
    {
        int numero;String salida="";
        for(int indice=0;indice<longitudCadena;indice++){

            numero = (int) (Math.random() * 0) + 1;
            salida+=String.valueOf(numero);
        }
        return salida;

    }*/
    
    private String orExclusiva(String cadenaenBinario){
       // Clave clave= new Clave(mensaje);
        String secuencia= clave.secuenciaAleatoria(salida.length()); String mensajeFinal="";
          for(int indice=0;indice<cadenaenBinario.length()-1;indice++){
              if(cadenaenBinario.charAt(indice)==secuencia.charAt(indice))
                mensajeFinal+=0;
                else
                    mensajeFinal+=1;
                
              
            }
        return mensajeFinal;
    }

}
