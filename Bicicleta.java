public class Bicicleta {
    private Rueda rueda;
    private Cuadro cuadro;
    private Frenos freno;

    public Bicicleta(Rueda rueda, Cuadro cuadro, Frenos freno) {
        this.rueda = rueda;
        this.cuadro = cuadro;
        this.freno = freno;
    }

    // Clase interna Rueda
    public static class Rueda {
        private int diametro;
        private String tipo;
        private String material;

        public Rueda(int diametro, String tipo, String material) {
            this.diametro = diametro;
            this.tipo = tipo;
            this.material = material;
        }

        public int getDiametro() {
            return diametro;
        }

        public void setDiametro(int diametro) {
            this.diametro = diametro;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }
    }

    // Clase interna Cuadro
    public static class Cuadro {
        private String material;
        private String tipo;
        private int tamaño;

        public Cuadro(String material, String tipo, int tamaño) {
            this.material = material;
            this.tipo = tipo;
            this.tamaño = tamaño;
        }

        public String getMaterial() {
            return material;
        }

        public void setMaterial(String material) {
            this.material = material;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public int getTamaño() {
            return tamaño;
        }

        public void setTamaño(int tamaño) {
            this.tamaño = tamaño;
        }
    }

    // Clase interna Frenos
    public static class Frenos {
        private String tipo;
        private String marca;
        private int medidaRotores;

        public Frenos(String tipo, String marca, int medidaRotores) {
            this.tipo = tipo;
            this.marca = marca;
            this.medidaRotores = medidaRotores;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public int getMedidaRotores() {
            return medidaRotores;
        }

        public void setMedidaRotores(int medidaRotores) {
            this.medidaRotores = medidaRotores;
        }
    }
}
