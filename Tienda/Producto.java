package Tienda;

public class Producto {
    
    // Atributos
    private String nombre;
    private double precio;
    private int stock;
    private String categoria;

    // Constructor con parámetros
    public Producto(String nombre, double precio, int stock, String categoria) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }    

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    // Método: mostrarInfo()
    public void mostrarInfo() {
        System.out.println("Producto: " + nombre);
        System.out.println("Categoría: " + categoria);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }

    // Método: aplicarDescuento(double porcentaje)
    public void aplicarDescuento(double porcentaje) {
        double montoDescontado = precio * (porcentaje / 100);
        double precioFinal = precio - montoDescontado;
        
        System.out.println("Descuento del " + porcentaje + "%: -$" + String.format("%.2f", montoDescontado));
        System.out.println("Precio con descuento: $" + String.format("%.2f", precioFinal));
    }

    // Método: verificarStock(int cantidad)
    public void verificarStock(int cantidad) {
        if (cantidad <= stock) {
            System.out.println("Disponible");
        } else {
            System.out.println("Stock insuficiente. Disponible: " + stock);
        }
    }
    
}
