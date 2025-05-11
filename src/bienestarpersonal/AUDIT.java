
package bienestarpersonal;

class AUDIT extends Cuestionario {
    

    public AUDIT() {
        super("AUDIT - Consumo de Alcohol");
    }

    @Override
    protected void cargarPregunta() {
        pregunta.add(new Pregunta("1. ¿Con qué frecuencia consumes alcohol? (0-4)"));
        pregunta.add(new Pregunta("2. ¿Cuántas bebidas tomas en un día típico? (0-4)"));
        pregunta.add(new Pregunta("3. ¿Con qué frecuencia tomas 6 o más bebidas en una ocasión? (0-4)"));
        pregunta.add(new Pregunta("4. ¿Te sientes culpable por tu consumo de alcohol? (0-4)"));
        pregunta.add(new Pregunta("5. ¿Te has sentido mal físicamente debido al alcohol? (0-4)"));
    }
}
