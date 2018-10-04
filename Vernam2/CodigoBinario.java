
public class CodigoBinario {
    Letra letra;
    public String sumaBinarios, sumaBinariosSalida, binario5Elementos;

    /**
     * Constructor de la clase.
     * 
     * @param letra
     */
    public CodigoBinario(Letra letra) {
        this.letra = new Letra(letra.letra);
        sumaBinarios = "";
        sumaBinariosSalida = "";
        binario5Elementos = "";
    }

    /**
     * Método para obtener el número binario de una letra.
     */
    public String obtenerBinario(String letra) {
        return Integer.toBinaryString(letra.charAt(0));
    }

    public String sumarBinarios(String numeroBinario, String segundoNumeroBinario) {
        for (Integer i = 4; i >= 0; i--)
            if (numeroBinario.charAt(i) == '1' && segundoNumeroBinario.charAt(i) == '1'
            || numeroBinario.charAt(i) == '0' && segundoNumeroBinario.charAt(i) == '0')
                sumaBinarios += "0";
            else sumaBinarios += "1";
        for (Integer indice = 4; indice >= 0; indice--)
            sumaBinariosSalida += sumaBinarios.charAt(indice);
        return sumaBinariosSalida;
    }

    public String obtener5ElementosBinarios(String binario) {
        binario5Elementos = binario.substring(binario.length()-5, binario.length());
        return binario5Elementos;
    }

    /**
     * Main de pruebas.
     * 
     * @param args
     */
    //	 public static void main(String[] args) {
    // //10000110111
    // Letra l = new Letra("з");
    //		 Letra l = new Letra("y");
    //		 CodigoBinario cb = new CodigoBinario(l);
    // System.out.println(cb.obtenerBinario(l.letra));
    // System.out.println(cb.sumarBinarios("10100", "01101"));
    //		 String bin = cb.obtenerBinario(l.letra);
    //		 System.out.println(cb.obtener5ElementosBinarios(bin));
    //	 }
}
