package omar.cursos.practicas;

public class Apartamento extends Casa {

    private short numeroIntero;

    public Apartamento(String calle, char seccion, short numero, int precio, long fechaConstruccion,
                       float impuesto, double metrosCubicos, boolean hipotecada, short numeroIntero) {
        super(calle, seccion, numero, precio, fechaConstruccion, impuesto, metrosCubicos, hipotecada);
        this.numeroIntero = numeroIntero;
    }


    public short getNumeroIntero() {
        return numeroIntero;
    }

    public void setNumeroIntero(short numeroIntero) {
        this.numeroIntero = numeroIntero;
    }
}
