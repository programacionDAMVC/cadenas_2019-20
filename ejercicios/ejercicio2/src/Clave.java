public class Clave {
    //atributo
    private String clave ;
    //constructores
    public Clave() {}
    public Clave(String clave) {
        this.clave = clave;
    }
    //setter
    public void setClave(String clave) {
        this.clave = clave;
    }
    public boolean esClaveSegura(){
        return  tieneMasSieteCaracteres() && tieneLetraMinuscula()
                && tieneLetraMayuscula() && tieneCaracterNoAlfaNumerico()
                && tieneNumero();
    }

    private boolean tieneNumero() {
        return clave.matches("^.*[0-9].*$");
    }

    private boolean tieneCaracterNoAlfaNumerico() {
        return clave.matches("^.*[.?!\\\\;|@\"·#$%&¬/()=¿*^\\[\\]{}'`\\-_:,;<>+].*$");
    }

    private boolean tieneLetraMayuscula() {
        return clave.matches("^.*[A-ZÑÁÉÍÓÚÜ].*$");
    }

    private boolean tieneLetraMinuscula() {
        return clave.matches("^.*[a-zñáéíóúü].*$");
    }

    private boolean tieneMasSieteCaracteres() {
        return clave.length() > 7;
    }

    @Override
    public String toString() {
        return clave;
    }

   /* public static void main(String[] args) {
        Clave clave = new Clave("€1Ñaaaaa");
        System.out.printf("%s ¿es segura? %b%n", clave, clave.esClaveSegura());
    }*/
}
