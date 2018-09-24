
public class Mensaje
{
    // instance variables - replace the example below with your own
    private int longitud;
    private String contenido;

    public Mensaje(String contenido)
    {
        this.contenido=contenido;
        this.longitud=contenido.length();
    }

    public String toString()
    {
        return this.contenido;
    }
    
    
}
