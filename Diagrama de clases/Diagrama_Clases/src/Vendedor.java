public class Vendedor extends Persona{
    private int Salario;
    private int numeroVentas;

    public Vendedor(String nombre, String apellido, String id, int salario, int numeroVentas) {
        super(nombre, apellido, id);
        Salario = salario;
        this.numeroVentas = numeroVentas;
    }

    public int getSalario() {
        return Salario;
    }

    public int getNumeroVentas() {
        return numeroVentas;
    }
}
