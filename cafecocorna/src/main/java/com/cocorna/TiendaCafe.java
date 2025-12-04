package com.cocorna;

public class TiendaCafe {
    public static void main(String[] args) {
        System.out.println("=== CAFÉ COCORNA - TIENDA DE CAFÉ COLOMBIANO ===");

        Cafe cafe1 = new Cafe("Café Cocorna Nariño", "Nariño", 35000, 50.5f);
        Cafe cafe2 = new Cafe("Café Cocorna Antioquia", "Antioquia", 32000, 75.2f);
        Cafe cafe3 = new Cafe("Café Cocorna Eje Cafetero", "Caldas", 38000, 42.8f);

        System.out.println("\n--- Información de los Cafés ---");
        cafe1.mostrarInformacion();
        cafe2.mostrarInformacion();
        cafe3.mostrarInformacion();

        System.out.println("--- Precios Totales ---");
        System.out.println("Total Café Nariño: $" + cafe1.calcularPrecioTotal() + " COP");
        System.out.println("Total Café Antioquia: $" + cafe2.calcularPrecioTotal() + " COP");
        System.out.println("Total Café Eje Cafetero: $" + cafe3.calcularPrecioTotal() + " COP");

        System.out.println("\n--- Actualizando Cantidad ---");
        cafe1.actualizarCantidad(40.0f);

        // ========== NUEVO EN RAMA MEJORAS ==========
        System.out.println("\n--- Aplicando Descuentos ---");
        System.out.println("Aplicando 15% de descuento al Café Cocorna Antioquia:");
        cafe2.aplicarDescuento(15);

        System.out.println("\nAplicando 10% de descuento al Café Cocorna Eje Cafetero:");
        cafe3.aplicarDescuento(10);
        // ========== FIN NUEVO ==========

        System.out.println("\n--- Información Actualizada ---");
        cafe1.mostrarInformacion();
        cafe2.mostrarInformacion();
        cafe3.mostrarInformacion();
    }
}