
public class Main
{
  public static void main(String []args){
      Mensaje m= new Mensaje("erik Pérez372");
      Desplazamiento d= new Desplazamiento(3);
      Alfabeto a= new Alfabeto("Espaniol");
      Cifrado c= new Cifrado(m,d,a);
      System.out.print(c.cesar().toString());
    }
}
