
    public class SistemaArmas {
        public static void main(String[] args) {
            // Crear policías
            Policia policia1 = new Policia("Juan", "Pérez", 1234);
            Policia policia2 = new Policia("María", "Gómez", 5678);

            // Crear armas
            ArmaCorta armaCorta1 = new ArmaCorta(policia1, 15, 250, "Glock", 9.5, "EN USO", true);
            ArmaLarga armaLarga1 = new ArmaLarga(policia2, 30, 1000, "Remington", 12.0, "EN USO", true, "Uso táctico", 4);
            ArmaLarga armaLarga2 = new ArmaLarga(policia1, 25, 800, "Winchester", 11.0, "EN MANTENIMIENTO", false, "Caza", 3);

            // Verificar condiciones de uso
            System.out.println(armaCorta1);
            System.out.println("¿Arma corta en condiciones? " + armaCorta1.estaEnCondiciones());
            System.out.println("¿Puede disparar a más de 200m? " + armaCorta1.puedeDispararMasDe200Metros());

            System.out.println("\n" + armaLarga1);
            System.out.println("¿Arma larga en condiciones? " + armaLarga1.estaEnCondiciones());

            // Comparar armas largas
            System.out.println("\n" + armaLarga2);
            System.out.println("¿Arma larga 1 es mayor que arma larga 2? " + armaLarga1.esMayorQue(armaLarga2));
        }
    }


