public class NoPerecedero extends Alimentos{
    private String Empaquetado;

    public NoPerecedero(String nombreProd, int precio, double peso, String calorias, String empaquetado) {
        super(nombreProd, precio, peso, calorias);
        Empaquetado = empaquetado;
    }

    public String getEmpaquetado() {
        return Empaquetado;
    }
}
