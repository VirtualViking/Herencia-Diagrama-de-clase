public class Perecedero extends Alimentos{

    private int fechaVencimiento;

    public Perecedero(String nombreProd, int precio, double peso, String calorias, int fechaVencimiento) {
        super(nombreProd, precio, peso, calorias);
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getFechaVencimiento() {
        return fechaVencimiento;
    }
}
