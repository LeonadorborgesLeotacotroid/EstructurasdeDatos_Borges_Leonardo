package DIAGNOSTICO;

public class Estudiante{
    private String nombre;
    private int edad;
    private int numeroEstudiante;

    public Estudiante(String nombre, int edad, int numeroEstudiante) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroEstudiante = numeroEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroEstudiante() {
        return numeroEstudiante;
    }

    public void setNumeroEstudiante(int numeroEstudiante) {
        this.numeroEstudiante = numeroEstudiante;
    }

    public void mostrarInformacion() {
        System.out.println("---------------------------------------- " );
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Número de estudiante: " + numeroEstudiante);

    }
}

class EstudianteUniversitario extends Estudiante {
    private String carrera;

    public EstudianteUniversitario(String nombre, int edad, int numeroEstudiante, String carrera) {
        super(nombre, edad, numeroEstudiante);
        this.carrera = carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Carrera: " + carrera);
        System.out.println("---------------------------------------- " );
    }
}

