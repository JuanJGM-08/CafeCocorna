package com.cocorna;

public class Cafe {
    private String nombre;
    private String region;
    private double precioPorKilo;
    private float cantidadEnKilos;

    public Cafe(String nombre, String region, double precioPorKilo, float cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Región: " + this.region);
        System.out.println("Precio por kilo: $" + this.precioPorKilo + " COP");
        System.out.println("Cantidad: " + this.cantidadEnKilos + " kg");
        System.out.println("-----------------------");
    }

    public double calcularPrecioTotal() {
        return this.precioPorKilo * this.cantidadEnKilos;
    }

    public void actualizarCantidad(float nuevaCantidad) {
        this.cantidadEnKilos = nuevaCantidad;
        System.out.println("Cantidad actualizada a: " + this.cantidadEnKilos + " kg");
    }

    // ========== MÉTODO NUEVO EN RAMA MEJORAS ==========
    public void aplicarDescuento(double porcentaje) {
        if (porcentaje < 0 || porcentaje > 100) {
            System.out.println("Error: El porcentaje debe estar entre 0 y 100");
            return;
        }

        double descuento = this.precioPorKilo * (porcentaje / 100);
        double nuevoPrecio = this.precioPorKilo - descuento;

        System.out.println("Descuento aplicado: " + porcentaje + "%");
        System.out.println("Nuevo precio: $" + nuevoPrecio + " COP");

        this.precioPorKilo = nuevoPrecio;
    }
    // ========== FIN MÉTODO NUEVO ==========

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getRegion() { return region; }
    public void setRegion(String region) { this.region = region; }
    public double getPrecioPorKilo() { return precioPorKilo; }
    public void setPrecioPorKilo(double precioPorKilo) { this.precioPorKilo = precioPorKilo; }
    public float getCantidadEnKilos() { return cantidadEnKilos; }
    public void setCantidadEnKilos(float cantidadEnKilos) { this.cantidadEnKilos = cantidadEnKilos; }
}