
    public abstract class Arma {
        protected Policia policia;
        protected int municiones;
        protected int alcance;
        protected String marca;
        protected double calibre;
        protected String estado; // NUEVA, EN MANTENIMIENTO, EN USO

        // Constructor
        public Arma(Policia policia, int municiones, int alcance, String marca, double calibre, String estado) {
            this.policia = policia;
            this.municiones = municiones;
            this.alcance = alcance;
            this.marca = marca;
            this.calibre = calibre;
            this.estado = estado;
        }

        // Método para verificar si el arma está en condiciones
        public boolean estaEnCondiciones() {
            return "EN USO".equalsIgnoreCase(estado) && calibre >= 9;
        }

        @Override
        public String toString() {
            return "Arma [Marca: " + marca + ", Calibre: " + calibre + ", Estado: " + estado + ", Policía Asignado: " + policia + "]";
        }
    }


