package Tienda;

public class main {
    public static void main(String[] args) {
        System.out.println("===== Bienvenido a la Tienda Digital =====");
        System.out.println();

        Producto producto1 = new Producto("Laptop Lenovo IdeaPad", 899.99, 15, "Electrónica");
        producto1.mostrarInfo();
        System.out.println();

        producto1.aplicarDescuento(10);
        System.out.println();

        producto1.verificarStock(5);
        producto1.verificarStock(20);
        System.out.println();

        Cliente cliente1 = new Cliente("María García", "maria.garcia@email.com", 1500.00);
        cliente1.mostrarPerfil();
        System.out.println();

        cliente1.realizarCompra(350.00);
        System.out.println();

        cliente1.realizarCompra(1300.00);
        System.out.println();

        cliente1.mostrarSaldo();
        System.out.println();

        Carrito carrito = new Carrito("María García");

        carrito.agregarProducto("Laptop Lenovo IdeaPad", 899.99);
        carrito.agregarProducto("Mouse Inalámbrico Logitech", 29.99);
        carrito.agregarProducto("Teclado Mecánico Redragon", 65.00);
        System.out.println();

        carrito.calcularTotal();
        System.out.println();

        carrito.mostrarResumen();
        System.out.println();

        System.out.println("===== Fin del programa =====");
    }
}