
package bienestarpersonal;
import java.util. Scanner;
class EvaluacionBienestar {
    public Persona persona;
    public Cuestionario dass21;
    public Cuestionario swls;
    public Cuestionario audit;

    public EvaluacionBienestar(Persona persona) {
        this.persona = persona;
        this.dass21 = new Dass21();
        this.swls = new SLWS();
        this.audit = new AUDIT();
    }

    public void aplicarEvaluacion(Scanner scanner) {
        dass21.aplicar(scanner);
        swls.aplicar(scanner);
        audit.aplicar(scanner);
    }

    public void mostrarPerfil() {
        int puntajeDASS21 = dass21.calcularPuntaje();
        int puntajeSWLS = swls.calcularPuntaje();
        int puntajeAUDIT = audit.calcularPuntaje();

        System.out.println("\n--- Resultados de " + persona.getNombre() + " ---");
        System.out.println("Puntaje DASS-21: " + puntajeDASS21);
        System.out.println("Puntaje SWLS: " + puntajeSWLS);
        System.out.println("Puntaje AUDIT: " + puntajeAUDIT);

        // Recomendaciones basadas en puntajes
        System.out.println("\n--- Recomendaciones ---");
        if (puntajeDASS21 >= 30) {
            System.out.println("- Considera consultar con un profesional de salud mental para el estrés o ansiedad.");
        }
        if (puntajeSWLS <= 15) {
            System.out.println("- Trabaja en mejorar tu bienestar emocional.");
        }
        if (puntajeAUDIT >= 8) {
            System.out.println("- Evalúa reducir el consumo de alcohol o consultar a un especialista.");
        }

        if (puntajeDASS21 < 15 && puntajeSWLS > 20 && puntajeAUDIT <= 5) {
            System.out.println("- ¡Muy bien! Tienes un perfil saludable en cuanto a estrés, satisfacción con la vida y consumo de alcohol.");
        }
    }
} 

