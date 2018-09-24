

public class Alfabeto
{
    private int tamanio;
    private String contenido;
    private String nombre;
    private String alfabetoRuso="aбвгдеёжзийклмoпpcтyфxцчшщЫЬЭЮЯ";
    private String alfabetoFrances="abcdefghijklmnopqrstuvwxyz";
    private String alfabetoEspaniol="abcdefghijklmnñopqrstuvwxyz";
    private String alfabetoNumerico="0123456789";
    
    
    public Alfabeto(String nombre)
    {
        this.nombre=nombre;
        this.tamanio=retornaContenido(nombre).length();
        this.contenido=retornaContenido(nombre);
        
    }
    
    private String retornaContenido(String nombre )
    {
        String salida="";
        switch(nombre)
        {
            case "Espaniol":
            salida= alfabetoEspaniol;
            break;
            case "Frances":
            salida= alfabetoFrances;
            break;
            case "Ruso":
            salida= alfabetoRuso;
            break;
            case "Numerico":
            salida= alfabetoNumerico;
            break;
            default:
            salida= alfabetoEspaniol;
            break;
            
        }
        return salida;
    }
    public int tamanio()
    {
        return tamanio;
    }
    
    public String toString()
    {
        return this.contenido;
    }
    
    
    

}
