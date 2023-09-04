package DIAGNOSTICO;

public class Main{
    public static void main(String[] args) {
        EstudianteUniversitario est1 = new EstudianteUniversitario("LEOTACO", 20, 422008, "SISTEMAS");
        EstudianteUniversitario est2 = new EstudianteUniversitario("JUANA", 19, 422007, "RENOVABLES");

        est1.mostrarInformacion();
        est2.mostrarInformacion();
    }
}
