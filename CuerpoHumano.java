public class CuerpoHumano {
    // Clase interna Corazon
    public static class Corazon {
        private int ritmoCardiaco;
        private boolean latiendo;
        private String tipo;

        public Corazon(int ritmoCardiaco, boolean latiendo, String tipo) {
            this.ritmoCardiaco = ritmoCardiaco;
            this.latiendo = latiendo;
            this.tipo = tipo;
        }

        // Setters y getters
        public int getRitmoCardiaco() {
            return ritmoCardiaco;
        }

        public void setRitmoCardiaco(int ritmoCardiaco) {
            this.ritmoCardiaco = ritmoCardiaco;
        }

        public boolean isLatiendo() {
            return latiendo;
        }

        public void setLatiendo(boolean latiendo) {
            this.latiendo = latiendo;
        }

        public String getTipo() {
            return tipo;
        }

        public void setTipo(String tipo) {
            this.tipo = tipo;
        }
    }

    // Clase interna Pulmon
    public static class Pulmon {
        private int capacidadRespiratoria;
        private boolean respirando;
        private String lado;

        public Pulmon(int capacidadRespiratoria, boolean respirando, String lado) {
            this.capacidadRespiratoria = capacidadRespiratoria;
            this.respirando = respirando;
            this.lado = lado;
        }

        // Setters y getters
        public int getCapacidadRespiratoria() {
            return capacidadRespiratoria;
        }

        public void setCapacidadRespiratoria(int capacidadRespiratoria) {
            this.capacidadRespiratoria = capacidadRespiratoria;
        }

        public boolean isRespirando() {
            return respirando;
        }

        public void setRespirando(boolean respirando) {
            this.respirando = respirando;
        }

        public String getLado() {
            return lado;
        }

        public void setLado(String lado) {
            this.lado = lado;
        }
    }

    // Clase interna Higado
    public static class Higado {
        private int nivelToxicidad;
        private boolean funcionando;
        private String color;

        public Higado(int nivelToxicidad, boolean funcionando, String color) {
            this.nivelToxicidad = nivelToxicidad;
            this.funcionando = funcionando;
            this.color = color;
        }

        // Setters y getters
        public int getNivelToxicidad() {
            return nivelToxicidad;
        }

        public void setNivelToxicidad(int nivelToxicidad) {
            this.nivelToxicidad = nivelToxicidad;
        }

        public boolean isFuncionando() {
            return funcionando;
        }

        public void setFuncionando(boolean funcionando) {
            this.funcionando = funcionando;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
    }

    // Clase interna Apendice
    public static class Apendice {
        private boolean inflamado;
        private boolean funcionando;
        private String lado;

        public Apendice(boolean inflamado, boolean funcionando, String lado) {
            this.inflamado = inflamado;
            this.funcionando = funcionando;
            this.lado = lado;
        }

        // Setters y getters
        public boolean isInflamado() {
            return inflamado;
        }

        public void setInflamado(boolean inflamado) {
            this.inflamado = inflamado;
        }

        public boolean isFuncionando() {
            return funcionando;
        }

        public void setFuncionando(boolean funcionando) {
            this.funcionando = funcionando;
        }

        public String getLado() {
            return lado;
        }

        public void setLado(String lado) {
            this.lado = lado;
        }
    }


}
