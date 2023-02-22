package org.sebas;

public class Profesor extends Persona {
    private String asignatura;

    public Profesor(){

        System.out.println("Profesor: iniciando constructor");
    }
    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }
    public Profesor(String nombre, String apellido, String asignatura){
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {

        this.asignatura = asignatura;
    }
}
