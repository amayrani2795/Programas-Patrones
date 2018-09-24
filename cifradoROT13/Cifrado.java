
public class Cifrado
{
    private Mensaje mensaje;
    private Desplazamiento desplazamiento;
    private Alfabeto alfabeto;
    private Alfabeto alfabetoNumerico=new Alfabeto("Numerico");

    public Cifrado(Mensaje mensaje,Desplazamiento desplazamiento,Alfabeto alfabeto)
    {
        this.mensaje=mensaje;
        this.desplazamiento=desplazamiento;
        this.alfabeto=alfabeto;

    }

    public MensajeCifrado cesar() //método para recorrer el mensaje
    {
        String mensajeSalida="";
        for(int i=0;i<mensaje.toString().length();i++){
            mensajeSalida+=ubicaCaracter(mensaje.toString().charAt(i));
        }
        MensajeCifrado mc= new MensajeCifrado(mensajeSalida);
        return mc;
    }

    private char ubicaCaracter(char letra){  //método para identificar el caracter a reemplazar
        String letraABuscar = String.valueOf(letra);
        int index = alfabeto.toString().indexOf(letraABuscar);
        if (index==-1){
            return compruebaEsMayuscula(letra);
        }
        else{
            return aplicaDesplazamiento(index+desplazamiento.getValor(),alfabeto);
        }
    }

    private char aplicaDesplazamiento (int index,Alfabeto alfabeto) //método para aplicar el desplazamiento en base al alfabeto
    {

        if(index>(alfabeto.tamanio()-1)){
            return  alfabeto.toString().charAt(index-alfabeto.tamanio());
        }
        if(index<0){
            return  alfabeto.toString().charAt(index+alfabeto.tamanio());
        }
        return alfabeto.toString().charAt(index);
    }

    private char compruebaEsMayuscula(char letra){ //método para regresar una letra en  mayuscula
        if( Character.isUpperCase(letra)){
            return  Character.toUpperCase( ubicaCaracter(Character.toLowerCase(letra))); //devuelve 
        }
        else{
            return compruebaEsNumero(letra);
        } 
    }

    private char compruebaEsNumero(char caracter){

        if(Character.isDigit(caracter)){
            int index = alfabetoNumerico.toString().indexOf(String.valueOf(caracter));
            return aplicaDesplazamiento(index+desplazamiento.getValor(),alfabetoNumerico);
        }
        else{
            return caracter;
        }

    }
}
