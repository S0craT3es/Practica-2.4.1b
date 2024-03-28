public class Main2 {
    public static void main(String[] args) {
        // Crear instancias de las clases internas
        CuerpoHumano.Corazon corazon = new CuerpoHumano.Corazon(75, true, "Normal");
        CuerpoHumano.Pulmon pulmonIzquierdo = new CuerpoHumano.Pulmon(3000, true, "Izquierdo");
        CuerpoHumano.Pulmon pulmonDerecho = new CuerpoHumano.Pulmon(3000, true, "Derecho");
        CuerpoHumano.Higado higado = new CuerpoHumano.Higado(20, true, "Marrón");
        CuerpoHumano.Apendice apendice = new CuerpoHumano.Apendice(false, true, "Derecho");

        // Crear una instancia de CuerpoHumano usando las instancias de las clases internas
        CuerpoHumano cuerpoHumano = new CuerpoHumano();

        // Mostrar información del cuerpo humano y sus partes
        System.out.println("Información del cuerpo humano:");
        System.out.println("Corazón - Ritmo cardiaco: " + corazon.getRitmoCardiaco() + " bpm, Latido: " + (corazon.isLatiendo() ? "Sí" : "No") + ", Tipo: " + corazon.getTipo());
        System.out.println("Pulmón Izquierdo - Capacidad respiratoria: " + pulmonIzquierdo.getCapacidadRespiratoria() + " ml, Respirando: " + (pulmonIzquierdo.isRespirando() ? "Sí" : "No") + ", Lado: " + pulmonIzquierdo.getLado());
        System.out.println("Pulmón Derecho - Capacidad respiratoria: " + pulmonDerecho.getCapacidadRespiratoria() + " ml, Respirando: " + (pulmonDerecho.isRespirando() ? "Sí" : "No") + ", Lado: " + pulmonDerecho.getLado());
        System.out.println("Hígado - Nivel de toxicidad: " + higado.getNivelToxicidad() + ", Funcionando: " + (higado.isFuncionando() ? "Sí" : "No") + ", Color: " + higado.getColor());
        System.out.println("Apendice - Inflamado: " + (apendice.isInflamado() ? "Sí" : "No") + ", Funcionando: " + (apendice.isFuncionando() ? "Sí" : "No") + ", Lado: " + apendice.getLado());
    }
}
