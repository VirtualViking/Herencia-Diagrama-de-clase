package org.sebas;

public class EjemploHerencia   {
    public static void main(String[] args) {

        System.out.println(".... Creando instancia clase alumno...");
        Alumno alumno = new Alumno();
        alumno.setNombre("Sebastian");
        alumno.setApellido("Hoyos");
        alumno.setInstitucion("Von Humboldt");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        System.out.println(".... Creando instancia clase AlumnoInternacional...");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("John");
        alumnoInt.setApellido("Rooney");
        alumnoInt.setPais("Inglaterra");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("Von Humboldt");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        System.out.println(".... Creando instancia de profesor....");
        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Gomez");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre() + " " + alumno.getApellido()+ " " +alumno.getInstitucion());
        System.out.println(alumnoInt.getNombre()+ " " + alumnoInt.getApellido()+ " " + alumnoInt.getInstitucion()+ " " + alumnoInt.getPais());
        System.out.println("Profesor " + profesor.getAsignatura() + ": " + profesor.getNombre() + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while(clase.getSuperclass() != null);
        String hija = clase.getName();
        String padre = clase.getSuperclass().getName();
        System.out.println(hija + "es una clase hija de la casa padre " +padre);
        clase = clase.getSuperclass();


    }
}
