package bienestarpersonal;


class Dass21 extends Cuestionario {

    public Dass21() {
        super("DASS-21 - Estrés, Ansiedad y Depresión");
    }

    @Override
    protected void cargarPregunta() {
        pregunta.add(new Pregunta("1. Me siento nervioso/a o ansioso/a (1-7)"));
        pregunta.add(new Pregunta("2. Me siento triste o deprimido/a (1-7)"));
        pregunta.add(new Pregunta("3. Me siento irritable o molesto/a (1-7)"));
        pregunta.add(new Pregunta("4. Me siento sobrepasado/a (1-7)"));
        pregunta.add(new Pregunta("5. Me siento ansioso/a por cosas pequeñas (1-7)"));
        pregunta.add(new Pregunta("6. Tengo dificultad para relajarme (1-7)"));
        pregunta.add(new Pregunta("7. Me siento incapaz de lidiar con el estrés (1-7)"));
        // Se pueden agregar más preguntas según el cuestionario DASS-21
    }
}



