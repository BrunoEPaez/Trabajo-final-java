
    public class ArmaCorta extends Arma {
        private boolean automatica;

        // Constructor
        public ArmaCorta(Policia policia, int municiones, int alcance, String marca, double calibre, String estado, boolean automatica) {
            super(policia, municiones, alcance, marca, calibre, estado);
            this.automatica = automatica;
        }

        // Verificar si puede disparar a más de 200m
        public boolean puedeDispararMasDe200Metros() {
            return alcance > 200;
        }

        @Override
        public String toString() {
            return super.toString() + ", Automática: " + (automatica ? "Sí" : "No");
        }
    }


