public class App {

    public static void main(String[] args) throws Exception {
        // Crear 5 vuelos con distinta capacidad
        Vuelo vuelo1 = new Vuelo("IB123", "Madrid", "Barcelona", 5);
        Vuelo vuelo2 = new Vuelo("AV456", "Bogotá", "Miami", 4);
        Vuelo vuelo3 = new Vuelo("LA789", "Lima", "Buenos Aires", 6);
        Vuelo vuelo4 = new Vuelo("AF321", "París", "Roma", 3);
        Vuelo vuelo5 = new Vuelo("UX654", "Cancún", "Panamá", 5);

        // VUELO 1
        System.out.println("VUELO 1");
        vuelo1.mostrarInfo();
        System.out.println("\nEmbarcando pasajeros en vuelo IB123...");
        vuelo1.embarcar("A1");
        vuelo1.embarcar("A2");
        vuelo1.embarcar("A3");
        System.out.println("\nIntentando embarcar en asiento ocupado (A1)...");
        vuelo1.embarcar("A1");
        System.out.println("\nEstado de asientos:");
        vuelo1.mostrarAsientos();
        System.out.println("\nLiberando asiento A2...");
        vuelo1.desembarcar("A2");
        System.out.println("\nEstado final de asientos:");
        vuelo1.mostrarAsientos();

        // VUELO 2
        System.out.println("\nVUELO 2");
        vuelo2.mostrarInfo();
        System.out.println("\nEmbarcando pasajeros en vuelo AV456...");
        vuelo2.embarcar("A1");
        vuelo2.embarcar("A2");
        vuelo2.embarcar("A3");
        System.out.println("\nIntentando embarcar en asiento ocupado (A3)...");
        vuelo2.embarcar("A3");
        System.out.println("\nEstado de asientos:");
        vuelo2.mostrarAsientos();
        System.out.println("\nLiberando asiento A1...");
        vuelo2.desembarcar("A1");
        System.out.println("\nEstado final de asientos:");
        vuelo2.mostrarAsientos();

        // VUELO 3
        System.out.println("\nVUELO 3");
        vuelo3.mostrarInfo();
        System.out.println("\nEmbarcando pasajeros en vuelo LA789...");
        vuelo3.embarcar("A4");
        vuelo3.embarcar("A5");
        vuelo3.embarcar("A6");
        System.out.println("\nIntentando embarcar en asiento ocupado (A5)...");
        vuelo3.embarcar("A5");
        System.out.println("\nEstado de asientos:");
        vuelo3.mostrarAsientos();
        System.out.println("\nLiberando asiento A6...");
        vuelo3.desembarcar("A6");
        System.out.println("\nEstado final de asientos:");
        vuelo3.mostrarAsientos();

        // VUELO 4
        System.out.println("\nVUELO 4");
        vuelo4.mostrarInfo();
        System.out.println("\nEmbarcando pasajeros en vuelo AF321...");
        vuelo4.embarcar("A1");
        vuelo4.embarcar("A2");
        System.out.println("\nIntentando embarcar en asiento ocupado (A2)...");
        vuelo4.embarcar("A2");
        System.out.println("\nEstado de asientos:");
        vuelo4.mostrarAsientos();
        System.out.println("\nLiberando asiento A1...");
        vuelo4.desembarcar("A1");
        System.out.println("\nEstado final de asientos:");
        vuelo4.mostrarAsientos();

        // VUELO 5
        System.out.println("VUELO 5");
        vuelo5.mostrarInfo();
        System.out.println("\nEmbarcando pasajeros en vuelo UX654...");
        vuelo5.embarcar("A1");
        vuelo5.embarcar("A2");
        vuelo5.embarcar("A3");
        vuelo5.embarcar("A4");
        System.out.println("\nIntentando embarcar en asiento ocupado (A4)...");
        vuelo5.embarcar("A4");
        System.out.println("\nEstado de asientos:");
        vuelo5.mostrarAsientos();
        System.out.println("\nLiberando asiento A3...");
        vuelo5.desembarcar("A3");
        System.out.println("\nEstado final de asientos:");
        vuelo5.mostrarAsientos();
    }
}