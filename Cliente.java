public class Cliente {

     // Atributos
    private String nombre;
    private String correo;
    private double saldo;
    private int totalCompras;

    // Constructor
    public Cliente(String nombre, String correo, double saldo) {
        this.nombre = nombre;
        this.correo = correo;
        this.saldo = saldo;
        this.totalCompras = 0;
    }

    // Método mostrarPerfil
    public void mostrarPerfil() {
        System.out.println("Cliente: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Compras realizadas: " + totalCompras);
    }


    
}
