
public class Clave
{
   private String salida;
   private int longitud;
    public Clave( )
    {
       // this.longitud=longitud;
        salida="";
    }

   
     public String secuenciaAleatoria(int longitud)
    {
        int numero; int longitudCadena=longitud;
        for(int indice=0;indice<longitudCadena;indice++){

            numero = (int) (Math.random() * 0) + 1;
            salida+=String.valueOf(numero);
        }
        return salida;

    }
}
