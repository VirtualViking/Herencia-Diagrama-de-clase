public class Limpieza extends Productos{
    private String componentes;
    private double litros;


    public Limpieza(String nombreProd, int precio, String componentes, double litros) {
        super(nombreProd, precio);
        this.componentes = componentes;
        this.litros = litros;
    }

    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }
}
