
public class Alfabeto {
    public String alfabeto;
    Letra letra[];

    //Construtor de la clase.
    public Alfabeto(String alfabeto) {
        this.alfabeto = new String(alfabeto);
        letra = new Letra[alfabeto.length()];
    }

    public Letra[] obtenerLetras() {
        for (int i = 0; i < alfabeto.length(); i++)
            letra[i] = new Letra(alfabeto.charAt(i)+"");
        return letra;
    }

    //	public static void main(String[] args) {
    //		Alfabeto a = new Alfabeto("abcdef");
    //		a.obtenerLetras();
    //		for (int i = 0; i < a.alfabeto.length(); i++) {
    //			System.out.println(a.letra[i].letra);
    //		}
    //	}
}
