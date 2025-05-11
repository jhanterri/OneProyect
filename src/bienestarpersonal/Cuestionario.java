
package bienestarpersonal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


    abstract class Cuestionario {
    private String nombre;
    protected List<Pregunta> pregunta;

    public Cuestionario(String nombre) {
        this.nombre = nombre;
        this.pregunta = new ArrayList<>();
        cargarPregunta();
    }

   
    protected abstract void cargarPregunta();

 
    public void aplicar(Scanner scanner) {
        System.out.println("\n--- " + nombre + " ---");
        for (Pregunta p : pregunta) {
            p.respuesta(scanner);
        }
    }

    public int calcularPuntaje() {
        int total = 0;
        for (Pregunta p : pregunta) {
            total += p.getRespuesta();
        }
        return total;
    }

    public String getNombre() {
        return nombre;
    }
}

