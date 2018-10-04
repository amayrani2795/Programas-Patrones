
public class CifradoVernam {
    Alfabeto alfabeto;
    CodigoBinario codigoBinarioAlfabeto[], auxiliarBinario, codigoBinarioClave[];
    String binarios5ElementosAlfabeto[], binarios5ElementosClave[], sumaBinarios[];
    Clave clave, elementosClave[];
    MensajeCifrado mensajeCifrado;
    Letra letraAlfabeto[], letraClave[];
    //	MensajeDescifrado mensajeDescrifado;

    //	public CifradoVernam(Alfabeto alfabeto, CodigoBinario codigoBinario, Clave clave) {
    public CifradoVernam(Alfabeto alfabeto, Clave clave) {
        this.alfabeto = new Alfabeto(alfabeto.alfabeto);
        this.clave = new Clave(clave.clave);
        codigoBinarioAlfabeto = new CodigoBinario[alfabeto.alfabeto.length()];
        codigoBinarioClave = new CodigoBinario[clave.clave.length()];
        elementosClave = new Clave[clave.clave.length()];
        letraAlfabeto = alfabeto.obtenerLetras();
        letraClave = clave.obtenerLetras();
        sumaBinarios = new String[binarios5ElementosAlfabeto.length];
        //		this.codigoBinario = new CodigoBinario();
    }

    public MensajeCifrado cifrarMensaje() {
        for (int i = 0; i < codigoBinarioAlfabeto.length; i++) {
            codigoBinarioAlfabeto[i] = new CodigoBinario(letraAlfabeto[i]);
            codigoBinarioClave[i] = new CodigoBinario(letraClave[i]);
            binarios5ElementosAlfabeto[i] = auxiliarBinario.obtener5ElementosBinarios(auxiliarBinario.obtenerBinario(letraAlfabeto[i].letra));
            binarios5ElementosClave[i] = auxiliarBinario.obtener5ElementosBinarios(auxiliarBinario.obtenerBinario(letraClave[i].letra));
        }		

        for (int i = 0; i < binarios5ElementosAlfabeto.length; i++) {
            sumaBinarios[i] = auxiliarBinario.sumarBinarios(binarios5ElementosAlfabeto[i], binarios5ElementosClave[i]);
        }

        mensajeCifrado.mensajecifrado = sumaBinarios;
        return mensajeCifrado;
    }

    public static void main(String[] args) {
        Alfabeto alfabeto = new Alfabeto("abcdef");
        Clave clave = new Clave("");
        CifradoVernam cv = new CifradoVernam(alfabeto, clave);
        MensajeCifrado mensajeFinal = cv.cifrarMensaje();
    }
}
