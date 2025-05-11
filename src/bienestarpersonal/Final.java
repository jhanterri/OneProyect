
package bienestarpersonal;
import java.util. Scanner;
public class Final {
    public static void main(String[] args) {
        // Input del usuario
        try (Scanner leer = new Scanner(System.in)) {
            // Input del usuario
            System.out.print("Ingresa tu nombre: ");
            String nombre = leer.nextLine();
            System.out.print("Ingresa tu edad: ");
            int edad = leer.nextInt();
            
            Persona persona = new Persona(edad, nombre);
            EvaluacionBienestar evaluacion = new EvaluacionBienestar(persona);
            
            evaluacion.aplicarEvaluacion(leer);
            evaluacion.mostrarPerfil();
        }
    }
}
