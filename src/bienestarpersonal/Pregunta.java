
package bienestarpersonal;

import java.util. Scanner;

public class Pregunta {
   public String texto;
   public int respuesta;

    public Pregunta(String texto) {
        this.texto = texto;
    }
   
    public void respuesta (Scanner leer) {
        System.out.println(texto);
        System.out.print("Respuesta (1-7): ");
        this.respuesta = leer.nextInt();
    }

    public int getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(int respuesta) {
        this.respuesta = respuesta;
    }

    public String getTexto() {
        return texto;
    }
   
}
