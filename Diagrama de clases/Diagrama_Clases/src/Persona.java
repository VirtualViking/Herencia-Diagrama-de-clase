public class Persona {
    private String Nombre;
    private String apellido;
     private String id;

    public Persona(String nombre, String apellido, String id) {
        Nombre = nombre;
        this.apellido = apellido;
        this.id = id;
    }

    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId() {
        return id;
    }
}
