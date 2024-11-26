
    public class ArmaLarga extends Arma {
        private boolean tieneSelloRENAR;
        private String descripcionUso;
        private int nivel; // Nivel de 1 a 5

        // Constructor
        public ArmaLarga(Policia policia, int municiones, int alcance, String marca, double calibre, String estado, boolean tieneSelloRENAR, String descripcionUso, int nivel) {
            super(policia, municiones, alcance, marca, calibre, estado);
            this.tieneSelloRENAR = tieneSelloRENAR;
            this.descripcionUso = descripcionUso;
            this.nivel = nivel;
        }

        // Comparar armas largas por nivel
        public boolean esMayorQue(ArmaLarga otra) {
            return this.nivel > otra.nivel;
        }

        @Override
        public String toString() {
            return super.toString() + ", Sello RENAR: " + (tieneSelloRENAR ? "Sí" : "No") + ", Nivel: " + nivel;
        }
    }


