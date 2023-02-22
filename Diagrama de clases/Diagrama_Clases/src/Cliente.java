public class Cliente extends Persona{
    private String TipoCliente;
    private String CodigoCuenta;

    public Cliente(String nombre, String apellido, String id, String tipoCliente, String codigoCuenta) {
        super(nombre, apellido, id);
        TipoCliente = tipoCliente;
        CodigoCuenta = codigoCuenta;
    }

    public String getTipoCliente() {
        return TipoCliente;
    }

    public String getCodigoCuenta() {
        return CodigoCuenta;
    }
}
