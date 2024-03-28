public class Main {
    public static void main(String[] args) {
        // Crear instancias de las clases internas
        Bicicleta.Rueda rueda = new Bicicleta.Rueda(26, "MTB", "Aluminio");
        Bicicleta.Cuadro cuadro = new Bicicleta.Cuadro("Aluminio", "MTB", 18);
        Bicicleta.Frenos frenos = new Bicicleta.Frenos("Disco", "Shimano", 160);

        // Crear una instancia de Bicicleta usando las instancias de las clases internas
        Bicicleta bicicleta = new Bicicleta(rueda, cuadro, frenos);

        // Mostrar información de la bicicleta y sus componentes
        System.out.println("Información de la bicicleta:");
        System.out.println("Rueda - Diámetro: " + rueda.getDiametro() + " pulgadas, Tipo: " + rueda.getTipo() + ", Material: " + rueda.getMaterial());
        System.out.println("Cuadro - Material: " + cuadro.getMaterial() + ", Tipo: " + cuadro.getTipo() + ", Tamaño: " + cuadro.getTamaño() + " pulgadas");
        System.out.println("Frenos - Tipo: " + frenos.getTipo() + ", Marca: " + frenos.getMarca() + ", Medida de rotores: " + frenos.getMedidaRotores() + " mm");
    }
}
