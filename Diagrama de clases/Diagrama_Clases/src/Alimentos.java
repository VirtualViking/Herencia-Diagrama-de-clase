public class Alimentos extends Productos{
    private double peso;
    private String calorias;

    public Alimentos(String nombreProd, int precio, double peso, String calorias) {
        super(nombreProd, precio);
        this.peso = peso;
        this.calorias = calorias;
    }

    public Alimentos(){

    }

    public double getPeso() {
        return peso;
    }

    public String getCalorias() {
        return calorias;
    }
}
