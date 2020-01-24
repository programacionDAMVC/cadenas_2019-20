public class PalabraLeida {

    private String valor;

    public PalabraLeida(String valor) {
        if (valor.toLowerCase().matches("^[a-záéíóúñü]+$")) //debe ser una palabra
            this.valor = valor;
        else
            this.valor ="";
    }

    public String getValor() {
        return valor;
    }

    public int obtenerNumeroLetras() {
        return valor.length();
    }
    public boolean comienzaPorVocal() {
        return valor.toLowerCase().matches("^[aeiouáéíóú].*$");
    }
    public boolean acabaEnVocal() {
        return valor.toLowerCase().matches("^.*[aeiouáéíóú]$");
    }
    public int obtenerNumeroVocales() {
        int contadorVocales = 0;
        for (int i = 0; i < valor.length(); i++) {
            char cLetra = valor.charAt(i);
            //   String sLetra = cLetra + "";      otra posibilidad 
            String sLetra = Character.toString(cLetra);
            if ( sLetra.toLowerCase().matches("[aeiouáéíóúü]") )
                contadorVocales++;
        }
        return contadorVocales;
    }
    public boolean contieneH(){
        return valor.toLowerCase().contains("h");
    }
    public boolean esPalindromo(){
       // StringBuilder sbValor = new StringBuilder();
       // sbValor.append(valor);     de otra forma:
        StringBuilder sbValor = new StringBuilder(valor);
        StringBuilder sbBalorAlReves = sbValor.reverse();
        String SvalorAlReves = sbBalorAlReves.toString();
        return valor.equalsIgnoreCase(SvalorAlReves);
    }
    public boolean sonIguales(String palabra){
        return valor.equalsIgnoreCase(palabra);
    }
}
