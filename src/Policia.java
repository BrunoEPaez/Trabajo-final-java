
    public class Policia {
        private String nombre;
        private String apellido;
        private int legajo;

        // Constructor
        public Policia(String nombre, String apellido, int legajo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.legajo = legajo;
        }

        // Getters
        public String getNombre() {
            return nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public int getLegajo() {
            return legajo;
        }

        @Override
        public String toString() {
            return "Policía: " + nombre + " " + apellido + " (Legajo: " + legajo + ")";
        }
    }


