
package bienestarpersonal;

class SLWS extends Cuestionario {

    public SLWS() {
        super("SWLS - Satisfacción con la Vida");
    }

  

    @Override
    protected void cargarPregunta() {
        pregunta.add(new Pregunta("1. En la mayoría de aspectos, mi vida se acerca a mi ideal (1-7)"));
        pregunta.add(new Pregunta("2. Las condiciones de mi vida son excelentes (1-7)"));
        pregunta.add(new Pregunta("3. Estoy satisfecho/a con mi vida (1-7)"));
        pregunta.add(new Pregunta("4. He conseguido las cosas importantes que quiero (1-7)"));
        pregunta.add(new Pregunta("5. Si viviera de nuevo, cambiaría poco (1-7)"));
    }
}

