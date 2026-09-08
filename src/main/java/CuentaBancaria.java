public class CuentaBancaria {

    private int identificador;
    private String nombre;
    private double balance;

    public CuentaBancaria(int identificador, String nombre, double balance) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.balance = balance;
    }

    public CuentaBancaria() {
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credito(double monto){
        this.balance += monto;
        return this.balance;
    }

    public double debito (double monto){
        if (monto > balance){
            System.out.println("Fondos insuficientes");
        } else {
            balance = balance - monto;
        }
        return balance;
    }

    @Override
    public String toString() {
        return "CuentaBancaria[id=" + identificador + ", nombre=" + nombre + ", balance=" + balance + "]";
    }

}